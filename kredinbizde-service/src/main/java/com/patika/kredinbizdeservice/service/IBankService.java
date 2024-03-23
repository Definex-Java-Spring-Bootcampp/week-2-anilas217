package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;

import java.util.List;

public interface IBankService {


    List<CreditCard> listAllCreditCard(Bank bank);
}
