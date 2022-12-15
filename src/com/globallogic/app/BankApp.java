package com.globallogic.app;

import com.globallogic.model.Account;
import com.globallogic.service.BankService;

public class BankApp {

	public static void main(String[] args) {

		Account account = new Account(12345, "kumar", 100000, "BANK000123", 10);
		BankService bankService = new BankService(account);

		bankService.withdraw(10000);
		System.out.println("Balance : " + account.getBalance());

		bankService.deposit(10000);
		System.out.println("Balance : " + account.getBalance());

		bankService.getAvailableBalance(account);
		System.out.println("Balance after adding interest : " + account.getBalance());

	}

}
