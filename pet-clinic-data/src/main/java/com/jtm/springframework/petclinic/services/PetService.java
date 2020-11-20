package com.jtm.springframework.petclinic.services;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long aId);

	Pet save(Pet aOwner);

	Set<Pet> findAll();
}
