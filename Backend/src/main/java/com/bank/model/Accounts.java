package com.bank.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bankaccount")
public class Accounts {
	@Id
	private Long accno;
	private String ifsc;
	private String name;
	private Integer balance;
	
	public Accounts(Long accno, String ifsc, String name, Integer balance) {
		super();
		this.accno = accno;
		this.ifsc = ifsc;
		this.name = name;
		this.balance = balance;
	}

	public Accounts() {
		super();
	}

	public Long getAccno() {
		return accno;
	}

	public void setAccno(Long accno) {
		this.accno = accno;
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

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accno);
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
		return Objects.equals(accno, other.accno);
	}

	@Override
	public String toString() {
		return "Accounts [accno=" + accno + ", ifsc=" + ifsc + ", name=" + name + ", balance=" + balance + "]";
	}

}
