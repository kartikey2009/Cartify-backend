package com.example.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
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
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private Integer price;
    private String category;

  //  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private Integer stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;
}
