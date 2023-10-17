package com.sale.Campaign.Repository;

import com.sale.Campaign.Model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceHistoryRepo extends JpaRepository<PriceHistory,Long> {
}
