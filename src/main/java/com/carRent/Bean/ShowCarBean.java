package com.carRent.Bean;

import java.sql.Date;

public class ShowCarBean
{
	private String carid;
	private String personName;
	private long AadharNo;
	private Date bookingDate;
	private Date dropingDate;
	public ShowCarBean(String carid, String personName, long aadharNo, Date bookingDate, Date dropingDate) {
		super();
		this.carid = carid;
		this.personName = personName;
		AadharNo = aadharNo;
		this.bookingDate = bookingDate;
		this.dropingDate = dropingDate;
	}
	
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String carName) {
		this.personName = carName;
	}
	public long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(long aadharNo) {
		AadharNo = aadharNo;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getDropingDate() {
		return dropingDate;
	}
	public void setDropingDate(Date dropingDate) {
		this.dropingDate = dropingDate;
	}
	

}
