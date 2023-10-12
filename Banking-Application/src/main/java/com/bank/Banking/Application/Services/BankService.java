package com.bank.Banking.Application.Services;

import com.bank.Banking.Application.Model.Bank;
import com.bank.Banking.Application.Model.TransferDTO;
import com.bank.Banking.Application.Repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepo bankRepo;

    public List<Bank> openingAccount(List<Bank> bank) {
        return bankRepo.saveAll(bank);
    }

    public Bank deposit(String acNumber,double deposit) {
        Bank bank = new Bank();
        bank = bankRepo.findByacNumber(acNumber);
        bank.setBalance(bank.getBalance()+deposit);
        return bankRepo.save(bank);

    }

    public Bank withdraw(String acNumber, double withdraw) {
        Bank bank = new Bank();
        bank = bankRepo.findByacNumber(acNumber);
        if (bank.getBalance()< withdraw){
            return bank;
        }
        bank.setBalance(bank.getBalance()-withdraw);
        return bankRepo.save(bank);
    }

    public TransferDTO transfer(String sender, String reciver, double amount) {
        TransferDTO dto = new TransferDTO();


        Bank senderdetails = new Bank();
        senderdetails =bankRepo.findByacNumber(sender);
        senderdetails.setBalance(senderdetails.getBalance()-amount);
        bankRepo.save(senderdetails);
        Bank reciverdetails = new Bank();
        reciverdetails =bankRepo.findByacNumber(reciver);
        reciverdetails.setBalance(reciverdetails.getBalance()+amount);
        bankRepo.save(reciverdetails);

        dto.setSenderName(senderdetails.getName());
        dto.setSenderAcBalance(senderdetails.getBalance());
        dto.setReciverName(reciverdetails.getName());
        dto.setReciverAcBalance(reciverdetails.getBalance());
        return  dto;

    }

    public List<Bank> getAll() {
        return bankRepo.findAll();
    }

    public Bank getByAcNumber(String acNumber) {
        return bankRepo.findByacNumber(acNumber);
    }
}
