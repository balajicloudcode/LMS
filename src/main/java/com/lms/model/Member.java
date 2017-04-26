package com.lms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author nitrawat
 *
 */

@Entity
@Table(name = "Member")
public class Member implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Memb_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long membiD;
	
	public long getMembiD() {
		return membiD;
	}

	public void setMembiD(long membiD) {
		this.membiD = membiD;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMembtype() {
		return membtype;
	}

	public void setMembtype(String membtype) {
		this.membtype = membtype;
	}

	public String getMembdate() {
		return membdate;
	}

	public void setMembdate(String membdate) {
		this.membdate = membdate;
	}

	@Column(name = "Expiry_date")
	private String expirydate;
	
	@NotNull
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@NotNull
	@Column(name = "Memb_type")
	private String membtype;
	
	@NotNull
	@Column(name = "Memb_date")
	private String membdate;
	
	
}
