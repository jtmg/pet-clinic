package com.jtm.springframework.petclinic.services;

import com.jtm.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String aLastName);
}
