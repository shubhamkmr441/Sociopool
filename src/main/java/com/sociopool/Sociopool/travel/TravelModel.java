package com.sociopool.Sociopool.travel;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="daily_travel")
public class TravelModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "travel_id", nullable = false)
	private int travelId;
	
	@Column(name = "user_id", nullable = false)
	private int userId;
	
	@Column(name = "distance", nullable = false)
	private double distance;
	
	@Column(name = "datetime")
	private Timestamp dateTime;

	@Column(name = "timetaken")
	private double timeTaken;

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}

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

	public TravelModel(){};
	public TravelModel(int userId, double distance, Timestamp dateTime, double timeTaken) {
		super();
		this.userId = userId;
		this.distance = distance;
		this.dateTime = dateTime;
		this.timeTaken = timeTaken;
	}
	
	
}
