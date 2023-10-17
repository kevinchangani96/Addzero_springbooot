package com.sale.Campaign.Model.dto;

import com.sale.Campaign.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private List<Product> product;
    private Integer page;
    private Integer pageSize;
    private Integer totalPage;


}
