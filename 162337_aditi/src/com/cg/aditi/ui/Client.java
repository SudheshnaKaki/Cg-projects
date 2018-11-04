package com.cg.aditi.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.aditi.bean.TransportBean;
import com.cg.aditi.exception.TransportException;
import com.cg.aditi.service.ITranportService;
import com.cg.aditi.service.TransportServiceImpl;

public class Client {

	public static void main(String[] args) {
		ITranportService service = new TransportServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("****Menu****");
				System.out.println("1.Add Booking Details");
				System.out.println("2.Display Booking Details");
				System.out.println("3.Delete booking of your choice");
				System.out.println("4.Exit");
				int ch = scanner.nextInt();
				switch (ch) {
				case 1:
		TransportBean bean = new TransportBean();
		Map<String, String> transportDetails = service.gettransportDetails();
		System.out.println("Mode of transport");
		int count =1;
		for(Map.Entry<String, String> entrySet:transportDetails.entrySet()) {
			System.out.println(count+ "."+entrySet.getValue());
			
			count++;
		}
		System.out.println("Enter option");
		int choice = scanner.nextInt();
		int count1 =1;
		for(Map.Entry<String, String> entrySet:transportDetails.entrySet()) {
			if(choice == count1) {
				bean.setTransportCategoryId(entrySet.getKey());
			}
				count1++;
		}
				
			
			int id = (int)(Math.random()*1000);
			bean.setId(id);
			System.out.println("Enter reason");
			scanner.nextLine();
			String reason = scanner.nextLine();
			bean.setReason(reason);
			System.out.println("When\n"+"1."+"2."+"3.");
			int whenChoice = scanner.nextInt();
			if( whenChoice == 1) {
				bean.setWhen("a");
			}
				if( whenChoice == 2) {
					bean.setWhen("b");
				}
					if( whenChoice == 3) {
						bean.setWhen("c");
					}
					
					service.addTransport(bean);
					LocalDateTime ldt = LocalDateTime.now();
					DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM YYY hh:mm:a" );
					System.out.println("Booked with id"+bean.getId()+"on"+ldt.format(f));
					break;
					
					
			
		
				case 2:
					Map<Integer,TransportBean> transportdetails= service.displayTransportDetails();
			for(Entry<Integer, TransportBean> entrySet:transportdetails.entrySet()) {
				System.out.println("key:"+entrySet.getKey()+"\n value:"+entrySet.getValue());
			}
			break;
			
				case 3:
					System.out.println("Enter the id to delete");
					int choiceDelete = scanner.nextInt();
					service.deleteBooking(choiceDelete);
					break;
				case 4:
					System.exit(0);
				}
			}
		}

			
			catch(TransportException ticketException) {
				System.out.println("Error in fetching the details and adding data");
			}
		catch (Exception e) {
			System.out.println("Internal error");
		}
	
	
}
}