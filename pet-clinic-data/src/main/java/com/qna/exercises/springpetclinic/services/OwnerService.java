package com.qna.exercises.springpetclinic.services;

import com.qna.exercises.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
