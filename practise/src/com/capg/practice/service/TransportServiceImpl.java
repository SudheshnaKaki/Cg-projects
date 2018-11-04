package com.capg.practice.service;

import java.util.Map;

import com.capg.practice.bean.TicketBean;
import com.capg.practice.dao.ITransportDao;
import com.capg.practice.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {
	ITransportDao dao = new TransportDaoImpl(); 
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransportTicket(TicketBean bean) {
		dao.addTransportDetails();
		
	}

}
