package com.jtm.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID aId) {
		return map.get(aId);
	}

	T save(ID aId, T aObject) {
		map.put(aId, aObject);

		return aObject;
	}

	void deleteById(ID aId) {
		map.remove(aId);
	}

	void delete(T aObject) {

		map.entrySet().removeIf(entry -> entry.getValue().equals(aObject));
	}

}
