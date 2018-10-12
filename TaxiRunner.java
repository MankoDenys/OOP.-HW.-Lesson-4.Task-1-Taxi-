package com.gmail.manjko;

public class TaxiRunner {

	public static void main(String[] args) {

		Tariff st = new StandardTariff();
		Tariff ft = new StandardTariff();

		Ride r1 = new Ride(1, 5, 10, st);
		Ride r2 = new Ride(3, 10, 20, st);
		Ride r3 = new Ride(2, 15, 30, st);
		Ride r4 = new Ride(4, 7, 11, ft);
		Ride r5 = new Ride(3, 11, 16, ft);
		Ride r6 = new Ride(4, 12, 25, ft);

		RidesHistory rh = new RidesHistory();
		
		rh.addRide(r6);
		rh.addRide(r5);
		rh.addRide(r4);

		System.out.println(st.calculatePrice(r1) + " grn.");
		System.out.println(ft.calculatePrice(r6) + " grn.");
		System.out.println(rh.getTotalPrice() + " grn.");
	}
}
