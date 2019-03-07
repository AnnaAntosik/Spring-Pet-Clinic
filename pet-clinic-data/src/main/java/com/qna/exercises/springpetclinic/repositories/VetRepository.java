package com.qna.exercises.springpetclinic.repositories;

import com.qna.exercises.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
