package com.housing.kevin.Services;

import com.housing.kevin.Model.AvgDTO;
import com.housing.kevin.Model.Housing;
import com.housing.kevin.Repository.HousingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingService {
    @Autowired
    private HousingRepo  housingRepo;

    public List<Housing> addhouse(List<Housing> housing) {
        return  housingRepo.saveAll(housing);
    }

    public AvgDTO avgHouse() {
        AvgDTO avgDTO =new AvgDTO();
        Integer avg= housingRepo.getAvgprice();
        avgDTO.setAvgprice(avg);
        avgDTO.setMessege("hello this is avg price");
        return  avgDTO;
    }

    public List<Object> avgByLocation() {
        return housingRepo.findByLocation();
    }

    public List<Object> maxsaleprice() {
        return housingRepo.maxsaleprice();
    }

    public List<Object> minsaleprice() {
        return  housingRepo.minsaleprice();
    }
}
