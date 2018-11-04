package com.cg.aditi.dao;

import java.util.Map;

import com.cg.aditi.bean.TransportBean;
import com.cg.aditi.exception.TransportException;

public interface ITransportDAO {

	Map<String, String> gettransportDetails() throws TransportException;
	void addTransport(TransportBean bean) throws TransportException;
	Map<Integer, TransportBean> displayTransportDetails() throws TransportException;
	void deleteBooking(int choiceDelete);
	

}
