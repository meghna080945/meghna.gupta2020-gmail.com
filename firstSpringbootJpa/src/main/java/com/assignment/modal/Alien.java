package com.assignment.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
private int aid;
private String apass;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}


public String getApass() {
	return apass;
}
public void setApass(String apass) {
	this.apass = apass;
}
public Alien(int aid, String apass) {
	super();
	this.aid = aid;
	this.apass = apass;
}
public Alien() {
	super();
}


@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + apass + "]";
}


}
