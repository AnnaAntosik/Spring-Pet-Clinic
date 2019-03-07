package com.qna.exercises.springpetclinic.repositories;

import com.qna.exercises.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
