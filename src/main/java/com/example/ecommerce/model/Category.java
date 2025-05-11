package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    int categoryid;
    String categoryname;
}
