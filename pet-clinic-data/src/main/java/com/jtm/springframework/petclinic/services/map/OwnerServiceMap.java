package com.jtm.springframework.petclinic.services.map;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Owner;
import com.jtm.springframework.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {

		return super.findAll();
	}

	@Override
	public Owner findById(Long aId) {

		return super.findById(aId);
	}

	@Override
	public Owner save(Owner aObject) {

		return super.save(aObject.getId(), aObject);
	}

	@Override
	public void delete(Owner aObject) {

		super.delete(aObject);
	}

	@Override
	public void deleteById(Long aId) {

		super.deleteById(aId);
	}

}
