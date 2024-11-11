package com.codegnan.Interfaces;

import com.codegnan.customException.InsufficientBalanceException;
import com.codegnan.customException.InsufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;

public interface IATMService {
	
	//to get the user type where the type is operator or normal user
	
	
	public abstract String getUserType() throws NotAOperatorException;
	
	
	// to withdraw amount 
	// 1.will throw invalid amount exception if the amount is not a valid denomination 
	// 2.will throw insufficient balance exception if the customer has insufficient in his/her account
	// 3.will throw insufficient machine balance exception if the machine has sufficient cash
	
	
	public abstract double withdrawAmount(double withAmount) throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException;
	
	
	//to deposit amount 
	
	public abstract void depositAmount(double dptAmount)throws InvalidAmountException;
	
	//to check balance
	
	public abstract double checkAccountBalance();
	
	//to change pin number
	
	 public abstract void changePinNumber(int pinNumber);
	 
	 //to get the pin number
	 
	 public abstract int getPinNumber();
	 
	 //to get User Name
	 
	 public abstract String getUserName();
	 
	 //to decrease the number of chances while enter the wrong pin number 
	 
	 public abstract void  decreasechances();
	 
	 //to get the chances of pin number 
	 
	 public abstract int getChances();
	 
	 //to reset the pin number chances by the bank operator
	 
	 public abstract void resetPinChances();
	 
	 //to get miniStatement of an account
	 
	 public abstract void generateMiniStatement();
	 

}
