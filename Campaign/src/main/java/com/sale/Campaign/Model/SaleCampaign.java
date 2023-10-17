package com.sale.Campaign.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SaleCampaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String startDate;
    private String endDate;
    private String title;
    private Long productId;
    private Double discount;
    private Double oldPrice;
    private String formattedTime;
    @PrePersist
    private void prePersist() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Define your desired date/time format
        this.formattedTime = sdf.format(new Date( System.currentTimeMillis()));
    }

}
