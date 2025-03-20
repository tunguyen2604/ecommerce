#include <stdio.h>
#include <stdlib.h>

// Node structure for Red-Black Tree
typedef struct Node {
    int data;
    char color; // 'R' for Red, 'B' for Black
    struct Node *left, *right, *parent;
} Node;

// Function prototypes
Node* createNode(int data);
Node* insert(Node* root, Node* node);
void fixViolation(Node** root, Node* node);
Node* search(Node* root, int key);
void inorderTraversal(Node* root);

// Helper functions for Red-Black Tree
void rotateLeft(Node** root, Node* node);
void rotateRight(Node** root, Node* node);

// Main function
int main() {
    Node* root = NULL;
    int arr[1000];
    int i, key;
    printf("hello world \n");

    // Generate 1000 random integers and insert into Red-Black Tree
    for (i = 0; i < 1000; i++) {
        arr[i] = rand() % 1000; // Random numbers between 0 and 9999
        root = insert(root, createNode(arr[i]));
    }

    // Input the number to search
    printf("Enter the number to search: ");
    scanf("%d", &key);

    // Search the number in the Red-Black Tree
    Node* result = search(root, key);
    if (result != NULL) {
        printf("Number %d found in the tree.\n", key);
    } else {
        printf("Number %d not found in the tree.\n", key);
    }

    return 0;
}

// Function to create a new Red-Black Tree node
Node* createNode(int data) {
    Node* node = (Node*)malloc(sizeof(Node));
    node->data = data;
    node->color = 'R'; // New nodes are always red initially
    node->left = node->right = node->parent = NULL;
    return node;
}

// Function to perform BST insertion and return the root
Node* insert(Node* root, Node* node) {
    if (root == NULL) {
        node->color = 'B'; // Root is always black
        return node;
    }

    if (node->data < root->data) {
        root->left = insert(root->left, node);
        root->left->parent = root;
    } else if (node->data > root->data) {
        root->right = insert(root->right, node);
        root->right->parent = root;
    }

    fixViolation(&root, node);
    return root;
}

// Function to fix Red-Black Tree violations after insertion
void fixViolation(Node** root, Node* node) {
    Node* parent = NULL;
    Node* grandparent = NULL;

    while ((node != *root) && (node->color != 'B') && (node->parent->color == 'R')) {
        parent = node->parent;
        grandparent = parent->parent;

        if (parent == grandparent->left) {
            Node* uncle = grandparent->right;

            if (uncle != NULL && uncle->color == 'R') {
                grandparent->color = 'R';
                parent->color = 'B';
                uncle->color = 'B';
                node = grandparent;
            } else {
                if (node == parent->right) {
                    rotateLeft(root, parent);
                    node = parent;
                    parent = node->parent;
                }

                rotateRight(root, grandparent);
                char temp = parent->color;
                parent->color = grandparent->color;
                grandparent->color = temp;
                node = parent;
            }
        } else {
            Node* uncle = grandparent->left;

            if (uncle != NULL && uncle->color == 'R') {
                grandparent->color = 'R';
                parent->color = 'B';
                uncle->color = 'B';
                node = grandparent;
            } else {
                if (node == parent->left) {
                    rotateRight(root, parent);
                    node = parent;
                    parent = node->parent;
                }

                rotateLeft(root, grandparent);
                char temp = parent->color;
                parent->color = grandparent->color;
                grandparent->color = temp;
                node = parent;
            }
        }
    }

    (*root)->color = 'B';
}

// Function to perform left rotation
void rotateLeft(Node** root, Node* node) {
    Node* rightChild = node->right;
    node->right = rightChild->left;

    if (node->right != NULL) {
        node->right->parent = node;
    }

    rightChild->parent = node->parent;

    if (node->parent == NULL) {
        *root = rightChild;
    } else if (node == node->parent->left) {
        node->parent->left = rightChild;
    } else {
        node->parent->right = rightChild;
    }

    rightChild->left = node;
    node->parent = rightChild;
}

// Function to perform right rotation
void rotateRight(Node** root, Node* node) {
    Node* leftChild = node->left;
    node->left = leftChild->right;

    if (node->left != NULL) {
        node->left->parent = node;
    }

    leftChild->parent = node->parent;

    if (node->parent == NULL) {
        *root = leftChild;
    } else if (node == node->parent->left) {
        node->parent->left = leftChild;
    } else {
        node->parent->right = leftChild;
    }

    leftChild->right = node;
    node->parent = leftChild;
}

// Function to search a key in the Red-Black Tree
Node* search(Node* root, int key) {
    if (root == NULL || root->data == key) {
        return root; // Return the node if found or NULL if not found
    }

    if (key < root->data) {
        return search(root->left, key); // Search in the left subtree
    } else {
        return search(root->right, key); // Search in the right subtree
    }
}