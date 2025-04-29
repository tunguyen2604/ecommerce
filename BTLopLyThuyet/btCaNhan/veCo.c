#include <stdio.h>
#include <math.h>

#define WIDTH 128
#define HEIGHT 128
#define PI 3.14159265358979323846

void drawStar(char canvas[HEIGHT][WIDTH], int centerX, int centerY, int radius) {
    double angleStep = 4 * PI / 5; // Góc giữa các đỉnh của ngôi sao
    double startAngle = -PI / 2;  // Bắt đầu từ đỉnh trên cùng

    int points[10][2]; // Lưu tọa độ 10 điểm (5 đỉnh và 5 điểm giữa)

    // Tính tọa độ các điểm
    for (int i = 0; i < 10; i++) {
        double angle = startAngle + i * angleStep / 2;
        int r = (i % 2 == 0) ? radius : radius / 2; // Đỉnh ngoài và trong
        points[i][0] = centerX + (int)(r * cos(angle));
        points[i][1] = centerY + (int)(r * sin(angle));
    }

    // Nối các điểm để tạo ngôi sao
    for (int i = 0; i < 10; i++) {
        int x1 = points[i][0];
        int y1 = points[i][1];
        int x2 = points[(i + 2) % 10][0];
        int y2 = points[(i + 2) % 10][1];

        // Vẽ đường thẳng giữa hai điểm
        int dx = abs(x2 - x1), sx = x1 < x2 ? 1 : -1;
        int dy = abs(y2 - y1), sy = y1 < y2 ? 1 : -1;
        int err = (dx > dy ? dx : -dy) / 2, e2;

        while (1) {
            if (x1 >= 0 && x1 < WIDTH && y1 >= 0 && y1 < HEIGHT) {
                canvas[y1][x1] = '*';
            }
            if (x1 == x2 && y1 == y2) break;
            e2 = err;
            if (e2 > -dx) { err -= dy; x1 += sx; }
            if (e2 < dy) { err += dx; y1 += sy; }
        }
    }
}

void drawCircle(char canvas[HEIGHT][WIDTH], int centerX, int centerY, int radius) {
    for (int angle = 0; angle < 360; angle++) {
        double rad = angle * PI / 180.0;
        int x = centerX + (int)(radius * cos(rad));
        int y = centerY + (int)(radius * sin(rad));
        if (x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT) {
            canvas[y][x] = '*';
        }
    }
}

void printCanvas(char canvas[HEIGHT][WIDTH]) {
    for (int y = 0; y < HEIGHT; y++) {
        for (int x = 0; x < WIDTH; x++) {
            putchar(canvas[y][x]);
        }
        putchar('\n');
    }
}

int main() {
    char canvas[HEIGHT][WIDTH];

    // Khởi tạo canvas với khoảng trắng
    for (int y = 0; y < HEIGHT; y++) {
        for (int x = 0; x < WIDTH; x++) {
            canvas[y][x] = ' ';
        }
    }

    // Vẽ hình tròn chứa ngôi sao
    drawCircle(canvas, WIDTH / 2, HEIGHT / 2, 64);

    // Vẽ ngôi sao bên trong hình tròn
    drawStar(canvas, WIDTH / 2, HEIGHT / 2, 64);

    // In canvas ra màn hình
    printCanvas(canvas);

    return 0;
}