package com.housing.kevin.Repository;

import com.housing.kevin.Model.AvgDTO;
import com.housing.kevin.Model.Housing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousingRepo extends JpaRepository<Housing, Long> {
    //    @Query(value = "SELECT AVG(sale_price) FROM housing",nativeQuery = true)
//    AvgDTO avgHouse();
    @Query(value = "SELECT AVG(sale_price) FROM housing", nativeQuery = true)
    Integer getAvgprice();

    @Query(value = "SELECT location,AVG(sale_price) FROM housing group by location", nativeQuery = true)
    List<Object> findByLocation();

    @Query(value = "SELECT id, sale_price FROM housing WHERE sale_price = (SELECT MAX(sale_price) FROM housing)", nativeQuery = true)
    List<Object> maxsaleprice();

    @Query(value = "SELECT id, sale_price FROM housing WHERE sale_price = (SELECT MIN(sale_price) FROM housing)", nativeQuery = true)
    List<Object> minsaleprice();
}
