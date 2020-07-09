package com.sociopool.Sociopool.travel;

import java.sql.Timestamp;

import org.springframework.lang.NonNull;

public class TravelTotalDto {
	@NonNull
	private int userId;
	@NonNull
	private Timestamp startdateTime;
	@NonNull
	private Timestamp enddateTime;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Timestamp getStartdateTime() {
		return startdateTime;
	}
	public void setStartdateTime(Timestamp startdateTime) {
		this.startdateTime = startdateTime;
	}
	public Timestamp getEnddateTime() {
		return enddateTime;
	}
	public void setEnddateTime(Timestamp enddateTime) {
		this.enddateTime = enddateTime;
	}
	
}
