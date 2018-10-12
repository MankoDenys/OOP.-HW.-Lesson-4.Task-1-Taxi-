package com.gmail.manjko;

public class FamilyTariff implements Tariff {

	public long calculatePrice(Ride ride) {
		return 50 + 20 * ride.getDistance() / ride.getPassengers();
	}
}
