package com.sociopool.Sociopool.travel;

import java.sql.Timestamp;

import org.springframework.lang.NonNull;

public class TravelRequestDto {
	
	@NonNull
	private int userId;
	@NonNull
	private double distance;
	
	private Timestamp dateTime;
	
	private double timeTaken;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public double getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

	
}
