package com.cg.flatregistration_162322.service;

import java.util.ArrayList;

import com.cg.flatregistration_162322.bean.FlatRegistration;
import com.cg.flatregistration_162322.dao.DaoImp;
import com.cg.flatregistration_162322.dao.Idao;

public class SeviceImp implements Iservice {
	boolean isvalid=false;
Idao di=new DaoImp();
	@Override
	public FlatRegistration registerFlat(FlatRegistration fr) {
		
		return di.registerFlat(fr);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		
		return di.getAllOwnerIds();
	}

	@Override
	public boolean isValidation(FlatRegistration fr) 
	{
		System.out.println(fr.getOwnerid());
		if((fr.getOwnerid()>=1) && (fr.getOwnerid()<=3))
		{
			System.out.println("getown done");
			if((fr.getFlattype()==1) || (fr.getFlattype()==2))
			{
				System.out.println("flat typee done");
				if((fr.getFlatarea()<=1000) && (fr.getFlatarea()>=420))
				{
					System.out.println("getflatarea done");
					if(fr.getRent()>=5000)
					{
						System.out.println("flat rent");
						if((fr.getDeposit())>(fr.getRent()))
						{
							double d=Math.random()*10000;
							int flatid=(int)d;
							System.out.println("flat id : "+flatid);
							fr.setFlatid(flatid);
							isvalid=true;
						}
						else
							System.out.println("Deposit amount should be greater than rent");
					}
					else
						System.out.println("Enter rent amount greater than 5000");
				}
				else
					System.err.println("Enter correct flat area");
			}
			else
				System.err.println("Flat type mis match");
		}
		else
			System.err.println("owner does not exists");
		
		return isvalid;
	}

}
