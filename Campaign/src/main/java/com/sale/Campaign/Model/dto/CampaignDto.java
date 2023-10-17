package com.sale.Campaign.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignDto {
    String startDate;
    String endDate;
    String title;
    List<ProductSale> campaignDiscount;
}
