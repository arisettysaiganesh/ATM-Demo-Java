package com.codegnan.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.Interfaces.IATMService;
import com.codegnan.customException.InsufficientBalanceException;
import com.codegnan.customException.InsufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;

public class AxisDebitCard implements IATMService {
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type="User";
	int chances;
	private int wthAmount;
	
	public AxisDebitCard(long debitCardNumber,String name, double accountBalance,int pinNumber) {
		chances=3;
		this.name=name;
		this.accountBalance=accountBalance;
		this.pinNumber=pinNumber;
		statement=new ArrayList<>();
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
	if(wthAmount<=0) {
		throw new InvalidAmountException("You can Enter Zero Rupees Amount to Withdraw Amount please enter a valid amount");
	} else  if(wthAmount%10!=0) {
		throw new InsufficientBalanceException ("Please withdraw Multiples of 100");
	} else if(wthAmount>accountBalance) {
		throw new InsufficientBalanceException("You dont have sufficient funds to withdraw Pleasce check your Balance");
	} else {
		accountBalance=accountBalance-wthAmount;
		statement.add("Debited : " + wthAmount);
	
		return wthAmount;
	   }
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		if(dptAmount<=0||dptAmount%10!=0) {
			throw new InvalidAmountException("Please deposit multiples of 100");
			
		} else {
			accountBalance=accountBalance + dptAmount;
			statement.add("Creadited : " + dptAmount);
		}
		
	}

	@Override
	public double checkAccountBalance() {
	
		return accountBalance;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		
		
	}

	@Override
	public int getPinNumber() {
		
		return pinNumber;
	}

	@Override
	public String getUserName() {
		
		return name;
	}

	@Override
	public void decreasechances() {
		--chances;
		
	}

	@Override
	public int getChances() {
	
		return chances;
	}

	@Override
	public void resetPinChances() {

       chances=3;
	}

	@Override
	public void generateMiniStatement() {
		int count=5;
		if(statement.size()==0) {
			System.out.println("There are No Transcation Happened");
			return;
		}
		System.out.println("================Last 5 Transcation=======================");
		Collections.reverse(statement);
		for(String trans : statement) {
			if(count == 0) {
				break;
			}
			System.out.println(trans);
			count --;
		}
		Collections.reverse(statement);
	}

}
