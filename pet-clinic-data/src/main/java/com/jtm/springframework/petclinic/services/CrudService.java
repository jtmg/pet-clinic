package com.jtm.springframework.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID aId);

	T save(T aObject);

	void delete(T aObject);

	void deleteById(ID aId);
}
