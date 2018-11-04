package com.cg.flatregistration_162322.dao;

import java.util.ArrayList;

import com.cg.flatregistration_162322.bean.FlatRegistration;

public class DaoImp implements Idao {
	
static ArrayList<Integer> ownerid=new ArrayList<Integer>();
		
ArrayList<FlatRegistration> reg=new ArrayList<FlatRegistration>();
public DaoImp(){
	ownerid.add(1);
	ownerid.add(2);
	ownerid.add(3);
	
}

	@Override
	public FlatRegistration registerFlat(FlatRegistration fr) {
		
		reg.add(fr);
		return fr;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return ownerid;
	}

}
