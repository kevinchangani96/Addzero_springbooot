package com.housing.kevin.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Housing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private int bedrooms;
    private int bathrooms;
    private int squareFootage;
    private String location;
    private int salePrice;
}
