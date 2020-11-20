package com.jtm.springframework.petclinic.services;

import java.util.Set;

import com.jtm.springframework.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long aId);

	Vet save(Vet aOwner);

	Set<Vet> findAll();

}
