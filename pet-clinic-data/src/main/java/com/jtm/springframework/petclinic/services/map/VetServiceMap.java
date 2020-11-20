package com.jtm.springframework.petclinic.services.map;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Vet;
import com.jtm.springframework.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Set<Vet> findAll() {

		return super.findAll();
	}

	@Override
	public Vet findById(Long aId) {

		return super.findById(aId);
	}

	@Override
	public Vet save(Vet aObject) {

		return super.save(aObject.getId(), aObject);
	}

	@Override
	public void delete(Vet aObject) {
		super.delete(aObject);
	}

	@Override
	public void deleteById(Long aId) {
		super.deleteById(aId);
	}

}
