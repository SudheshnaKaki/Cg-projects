package com.capg.practice.service;

import java.util.Map;

import com.capg.practice.bean.TicketBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransportTicket(TicketBean bean);

}
