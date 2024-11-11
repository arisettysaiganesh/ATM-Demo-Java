package com.codegnan.cards;

import com.codegnan.Interfaces.IATMService;
import com.codegnan.customException.InsufficientBalanceException;
import com.codegnan.customException.InsufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;

public class OperatorCard implements IATMService {
	private int pinNumber;
	private long id;
	private static String name;
	private final String type="operator";
	public OperatorCard(long id,int pin,String name) {
		id = id;
		pinNumber=pin;
		this.name=name;
	}
	

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		
		
	}

	@Override
	public double checkAccountBalance() {
		
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		
	}

	@Override
	public int getPinNumber() {
	
		return pinNumber;
	}

	public String getUserName() {
		
		return name;
	}

	@Override
	public void decreasechances() {
		
	}

	@Override
	public int getChances() {
		
		return 0;
	}

	@Override
	public void resetPinChances() {
		
		
	}

	@Override
	public void generateMiniStatement() {
		
		
	}

}
