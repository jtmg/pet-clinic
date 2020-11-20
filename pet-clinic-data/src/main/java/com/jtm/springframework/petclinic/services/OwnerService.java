package com.jtm.springframework.petclinic.services;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String aLastName);

	Owner findById(Long aId);

	Owner save(Owner aOwner);

	Set<Owner> findAll();
}
