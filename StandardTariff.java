package com.gmail.manjko;

public class StandardTariff implements Tariff {

	public long calculatePrice(Ride ride) {

		return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
	}
}
