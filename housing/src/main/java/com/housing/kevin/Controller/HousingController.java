package com.housing.kevin.Controller;

import com.housing.kevin.Model.AvgDTO;
import com.housing.kevin.Model.Housing;
import com.housing.kevin.Services.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("housing")
public class HousingController {
    @Autowired
    private HousingService housingService;

    @PostMapping("/addhouse")
    public List<Housing> addhouse(@RequestBody List<Housing> housing) {
        return housingService.addhouse(housing);
    }

    @GetMapping("/avg")
    public AvgDTO avgHouse() {
        return housingService.avgHouse();
    }

    @GetMapping("/avgByLocation")
    public List<Object> avgByLocation() {
        return housingService.avgByLocation();
    }

    @GetMapping("/maxsaleprice")
    public List<Object> maxsaleprice() {
        return housingService.maxsaleprice();
    }

    @GetMapping("/minsaleprice")
    public List<Object> minsaleprice() {
        return housingService.minsaleprice();
    }


}
