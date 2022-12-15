package com.globallogic.service;

import com.globallogic.model.Account;

public class BankService {

	private Account account;

	public BankService(Account account) {
		super();
		this.account = account;
	}

	/*
	 * @Description : To withdraw amount from particular bank account
	 * 
	 * @Param : It takes amount to be withdrawn as parameter
	 * 
	 * @return : It returns balance available after withdrawn
	 */
	public double withdraw(double amount) {
		double currentBalance = account.getBalance();
		if (amount > currentBalance) {
			return -1;
		}
		System.out.println("Amount Debited : " + amount);
		account.setBalance(currentBalance - amount);
		return account.getBalance();
	}

	/*
	 * @Description : To deposit amount from particular bank account
	 * 
	 * @Param : It takes amount to be deposited as parameter
	 * 
	 * @return : It returns balance available after deposit
	 */
	public double deposit(double amount) {

		double currentBalance = account.getBalance();

		System.out.println("Amount credited : " + amount);

		account.setBalance(currentBalance + amount);

		return account.getBalance();
	}

	/*
	 * @Description : To calculate rate of interest
	 * 
	 * @Param : It takes rate of interest as parameter
	 * 
	 * @return : It returns interest amount
	 */
	public double rateOfInterest(int percentage) {

		double interestAmount = (account.getBalance() * 1 * percentage) / 100;
		return interestAmount;

	}

	/*
	 * @Description : To withdraw amount from particular bank account
	 * 
	 * @Param : It takes account as parameter
	 * 
	 * @return : It returns balance available after adding interest amount
	 */
	public double getAvailableBalance(Account account) {

		account.setBalance((rateOfInterest(account.getRateOfInterest())) + account.getBalance());
		return account.getBalance();
	}

}
