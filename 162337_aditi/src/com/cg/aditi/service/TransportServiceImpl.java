package com.cg.aditi.service;

import java.util.Map;

import com.cg.aditi.bean.TransportBean;
import com.cg.aditi.dao.ITransportDAO;
import com.cg.aditi.dao.TransportDAOImpl;
import com.cg.aditi.exception.TransportException;

public class TransportServiceImpl implements ITranportService {
	ITransportDAO dao = new TransportDAOImpl();
	

	@Override
	public Map<String, String> gettransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return dao.gettransportDetails();
	}

	@Override
	public Map<Integer, TransportBean> displayTransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return dao.displayTransportDetails();
	}

	@Override
	public void deleteBooking(int choiceDelete) {
		dao.deleteBooking(choiceDelete);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTransport(TransportBean bean) throws TransportException {
		dao.addTransport(bean);
		// TODO Auto-generated method stub
		
	}

}
