package com.capg.practice.util;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<String, String> transportDetails = new HashMap<>();

	public static Map<String, String> getTransportDetails() {
		transportDetails.put("f-01", "Flight");
		transportDetails.put("t-02", "Train");
		transportDetails.put("ta-01", "Taxi");
		return transportDetails;
	}

}
