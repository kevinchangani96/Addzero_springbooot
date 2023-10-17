package com.sale.Campaign.Repository;

import com.sale.Campaign.Model.SaleCampaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepo extends JpaRepository<SaleCampaign,Long> {
    @Query(value = "select * from sale_campaign where end_date<=:currentDate ",nativeQuery = true)
    List<SaleCampaign> findActiveCampaigns(String currentDate);
}
