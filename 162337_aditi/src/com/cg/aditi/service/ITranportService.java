package com.cg.aditi.service;

import java.util.Map;

import com.cg.aditi.bean.TransportBean;
import com.cg.aditi.exception.TransportException;

public interface ITranportService {

	Map<String, String> gettransportDetails() throws TransportException;

	Map<Integer, TransportBean> displayTransportDetails() throws TransportException;

	void deleteBooking(int choiceDelete);

	void addTransport(TransportBean bean) throws TransportException;

}
