package com.capg.practice.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.capg.practice.bean.TicketBean;
import com.capg.practice.exception.TicketException;
import com.capg.practice.service.ITransportService;
import com.capg.practice.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) throws TicketException {
		try {
			Scanner scanner = new Scanner(System.in);
			ITransportService service = new TransportServiceImpl();
			TicketBean bean = new TicketBean();
			Map<String, String> transportDetails = service.getTransportDetails();
			System.out.println("Mode of Transport");
			//generate id
			int id = (int) (Math.random() * 10000);
			bean.setId(id);
			//generate Transport category id
			int count = 1;
			for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
				System.out.println(count + " . " + entrySet.getValue());
				count++;
			}
			System.out.println("Enter mode of transport");
			int value = scanner.nextInt();
			int count1 = 1;
			for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
				if (count1 == value) {
					bean.setTransportCategoryId(entrySet.getKey());

				}
				count1++;
			}
			//generate reason
			System.out.println("Enter Reason");
			scanner.nextLine();
			String reason = scanner.nextLine();
			bean.setReason(reason);
			System.out.println("When\n");
			System.out.println("1. This Week\n2. Next Week\n3. Next month");
			int whenChoice = scanner.nextInt();
			if (whenChoice == 1) {
				bean.setWhen("this week");
			}
			if (whenChoice == 2) {
				bean.setWhen("Next week");
			}
			if (whenChoice == 3) {
				bean.setWhen("Next month");
			}
			service.addTransportTicket(bean);
			LocalDateTime dateTime = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy hh: mm a");
			System.out.println("Booked on with id" + bean.getId() + " on " + dateTime.format(format));
		} catch (Exception e) {
			System.out.println("Internal error.");
		}
	}

}
