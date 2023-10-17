package com.sale.Campaign.Controller;

import com.sale.Campaign.Model.SaleCampaign;
import com.sale.Campaign.Model.dto.CampaignDto;
import com.sale.Campaign.Services.CampaignService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("Campaigns")
@Tag(name = "Campaigns", description = "Endpoints for Campaigns Apis")
public class CampaignController {
    @Autowired
    private CampaignService campaignService;

    @PostMapping("/addCampaign")
    public SaleCampaign addCampaign(@RequestBody CampaignDto campaignDto) throws ParseException {
        return campaignService.addCampaign(campaignDto);
    }

}
