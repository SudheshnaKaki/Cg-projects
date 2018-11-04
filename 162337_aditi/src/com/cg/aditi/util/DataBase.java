package com.cg.aditi.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.aditi.bean.TransportBean;

public class DataBase {
	private static Map<String, String> transportDetails = new HashMap<String,String>();
	private static Map<Integer,TransportBean>bookTransport=new HashMap<Integer,TransportBean>();
	public static Map<String, String> gettransportDetails() {
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-2", "train");
		transportDetails.put("ta-1", "taxi");
		return transportDetails;
	}
	public static void addTransport(TransportBean bean) {
		bookTransport.put(bean.getId(),bean);
	}
	public static Map<Integer, TransportBean> displayTransportDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		
	}
	}
