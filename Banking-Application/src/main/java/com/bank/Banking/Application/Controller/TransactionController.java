package com.bank.Banking.Application.Controller;

import com.bank.Banking.Application.Model.TransactionHistory;
import com.bank.Banking.Application.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bankpassbook")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @GetMapping("/statement")
    public List<TransactionHistory> statment(@RequestParam String acNumber) {
        return transactionService.statment(acNumber);

    }

}
