package com.bank.model;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bankaccount")
public class Accounts {
	@Id
	Integer accNo;
	String ifsc;
	String name;
	Integer balance;

	public Accounts() {
		super();
	}

	public Accounts(int accNo, String ifsc, String name, int balance) {
		super();
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getIfsc() {
		return ifsc;
	}
	
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		return accNo == other.accNo;
	}
	
	@Override
	public String toString() {
		return "Accounts [accNo=" + accNo + ", ifsc=" + ifsc + ", name=" + name + ", balance=" + balance + "]";
	}

}