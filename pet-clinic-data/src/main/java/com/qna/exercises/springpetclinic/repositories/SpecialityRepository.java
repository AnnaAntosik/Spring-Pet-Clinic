package com.qna.exercises.springpetclinic.repositories;

import com.qna.exercises.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
