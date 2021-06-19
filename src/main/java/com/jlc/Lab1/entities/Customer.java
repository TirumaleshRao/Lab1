package com.jlc.Lab1.entities;
import javax.persistence.*;

@Entity
@Table(name="customers1")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custid;
	private String cname;
	
	@Column(name="email",unique=true)
	private String email;
	
	public Customer() {
		
	}

	public Customer(String cname, String email) {
		super();
		this.cname = cname;
		this.email = email;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", cname=" + cname + ", email=" + email + "]";
	}
	
	
}
