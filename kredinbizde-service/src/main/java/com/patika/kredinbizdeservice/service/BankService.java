package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService implements IBankService{


    @Override
    public List<CreditCard> listAllCreditCard(Bank bank) {
        List<CreditCard> creditcards = bank.getCreditCards();
        for (CreditCard creditCard : creditcards) {
            List<Campaign> campaigns = creditCard.getCampaignList();
        }

        return creditcards;
    }

}
