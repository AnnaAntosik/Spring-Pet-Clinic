package com.qna.exercises.springpetclinic.repositories;

import com.qna.exercises.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
