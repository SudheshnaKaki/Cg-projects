package com.cg.aditi.dao;

import java.util.Map;

import com.cg.aditi.bean.TransportBean;
import com.cg.aditi.exception.TransportException;
import com.cg.aditi.util.DataBase;

public class TransportDAOImpl implements ITransportDAO {

	@Override
	public Map<String, String> gettransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return DataBase.gettransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) throws TransportException {
		DataBase.addTransport(bean);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, TransportBean> displayTransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return DataBase.displayTransportDetails();
	}

	@Override
	public void deleteBooking(int choiceDelete) {
		DataBase.deleteBooking(choiceDelete);
		// TODO Auto-generated method stub
		
	}

}
