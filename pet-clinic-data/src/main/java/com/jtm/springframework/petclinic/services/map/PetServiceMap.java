package com.jtm.springframework.petclinic.services.map;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Pet;
import com.jtm.springframework.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {

		return super.findAll();
	}

	@Override
	public Pet findById(Long aId) {

		return super.findById(aId);
	}

	@Override
	public Pet save(Pet aObject) {

		return super.save(aObject.getId(), aObject);
	}

	@Override
	public void delete(Pet aObject) {
		super.delete(aObject);
	}

	@Override
	public void deleteById(Long aId) {
		super.deleteById(aId);
	}

}
