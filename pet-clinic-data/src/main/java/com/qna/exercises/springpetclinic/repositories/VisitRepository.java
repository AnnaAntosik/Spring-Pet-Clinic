package com.qna.exercises.springpetclinic.repositories;

import com.qna.exercises.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
