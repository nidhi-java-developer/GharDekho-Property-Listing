package com.univ.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int cid;
int status;
String cname,aadharno,email,mob,unm,pw;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int status, String cname, String aadharno, String email, String mob, String unm, String pw) {
	super();
	this.status = status;
	this.cname = cname;
	this.aadharno = aadharno;
	this.email = email;
	this.mob = mob;
	this.unm = unm;
	this.pw = pw;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getAadharno() {
	return aadharno;
}

public void setAadharno(String aadharno) {
	this.aadharno = aadharno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

public String getUnm() {
	return unm;
}

public void setUnm(String unm) {
	this.unm = unm;
}

public String getPw() {
	return pw;
}

public void setPw(String pw) {
	this.pw = pw;
}




}
