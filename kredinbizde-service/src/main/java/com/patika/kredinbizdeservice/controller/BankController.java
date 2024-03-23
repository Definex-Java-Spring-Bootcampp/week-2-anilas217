package com.patika.kredinbizdeservice.controller;


import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    //Injection service
    @Autowired
    private IBankService bankService;


    //Injection controller
    @Autowired
    public BankController(IBankService bankService){
        this.bankService = bankService;
    }

    @GetMapping
    public List<CreditCard> listAllCreditCard(Bank bank) {
        return bankService.listAllCreditCard(bank);
    }


}
