package com.example.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity                     //creating table
@Data
@AllArgsConstructor      //importing lombok here
@NoArgsConstructor

public class Product {

    @Id//creating table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String Brand;
    private int price;
    private String Category;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean Available;
    private int Quantity;
}
