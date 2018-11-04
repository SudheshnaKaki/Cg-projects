package com.cg.flatregistration_162322.dao;

import java.util.ArrayList;

import com.cg.flatregistration_162322.bean.FlatRegistration;

public interface Idao {

	public FlatRegistration registerFlat (FlatRegistration fr);
	public ArrayList<Integer> getAllOwnerIds();
}
