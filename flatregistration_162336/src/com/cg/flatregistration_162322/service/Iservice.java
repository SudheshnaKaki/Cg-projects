package com.cg.flatregistration_162322.service;

import java.util.ArrayList;

import com.cg.flatregistration_162322.bean.FlatRegistration;

public interface Iservice {

	public FlatRegistration registerFlat (FlatRegistration fr);
	public ArrayList<Integer> getAllOwnerIds();
	public boolean isValidation(FlatRegistration fr);
}
