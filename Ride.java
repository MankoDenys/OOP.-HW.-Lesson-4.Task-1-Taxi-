package com.gmail.manjko;

public class Ride {
	private final int passengers;
	private final int distance;
	private final int duration;
	private final Tariff tariff;

	public Ride(int passengers, int distance, int duration, Tariff tariff) {
		super();
		this.passengers = passengers;
		this.distance = distance;
		this.duration = duration;
		this.tariff = tariff;
	}

	public int getPassengers() {
		return passengers;
	}

	public int getDistance() {
		return distance;
	}

	public int getDuration() {
		return duration;
	}

	public long getPrice() {
		return tariff.calculatePrice(this);
	}

	public String toString() {
		return "Ride [passengers=" + passengers + ", distance=" + distance
				+ ", duration=" + duration + "]";
	}
}
