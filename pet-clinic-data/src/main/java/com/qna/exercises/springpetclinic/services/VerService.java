package com.qna.exercises.springpetclinic.services;

import com.qna.exercises.springpetclinic.model.Vet;

import java.util.Set;

public interface VerService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
