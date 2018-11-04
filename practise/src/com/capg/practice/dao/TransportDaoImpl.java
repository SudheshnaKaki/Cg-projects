package com.capg.practice.dao;

import java.util.Map;

import com.capg.practice.util.Database;

public class TransportDaoImpl implements ITransportDao {
	
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return Database.getTransportDetails();
	}

	@Override
	public void addTransportDetails() {
		// TODO Auto-generated method stub
		
	}

}
