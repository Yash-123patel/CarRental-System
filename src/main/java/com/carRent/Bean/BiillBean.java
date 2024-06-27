package com.carRent.Bean;

public class BiillBean
{
	private String name;
    private long aadharNo;
    private String licenseNo;
	private String carId;
	private String carName;
	private double perDayCharge;
	private int totalDays;
	private int extraDays;
	
	public BiillBean(String name, long aadharNo, String licenseNo,  String carId, String carName,
			double perDayCharge, int totalDays, int extraDays) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.licenseNo = licenseNo;
		this.carId = carId;
		this.carName = carName;
		this.perDayCharge = perDayCharge;
		this.totalDays = totalDays;
		this.extraDays = extraDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(double perHourCharge) {
		this.perDayCharge = perHourCharge;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public int getExtraDays() {
		return extraDays;
	}
	public void setExtraDays(int extraDays) {
		this.extraDays = extraDays;
	}
	
	
	
}
