package com.gmail.manjko;

import java.util.ArrayList;
import java.util.List;

public class RidesHistory {
	private final List<Ride> rides = new ArrayList<>();

	public void addRide(Ride ride) {
		rides.add(ride);
	}

	public long getTotalPrice() {
		long totalPrice = 0;
		for (Ride elem : rides) {
			totalPrice += elem.getPrice();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		return "RidesHistory [rides=" + rides + "]";
	}
}
