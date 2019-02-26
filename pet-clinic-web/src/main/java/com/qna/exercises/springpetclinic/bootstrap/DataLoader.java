package com.qna.exercises.springpetclinic.bootstrap;

import com.qna.exercises.springpetclinic.model.Owner;
import com.qna.exercises.springpetclinic.model.PetType;
import com.qna.exercises.springpetclinic.model.Vet;
import com.qna.exercises.springpetclinic.services.OwnerService;
import com.qna.exercises.springpetclinic.services.PetTypeService;
import com.qna.exercises.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mike");
        owner1.setLastName("First");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Lisa");
        owner2.setLastName("Second");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Ein");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ben");
        vet2.setLastName("Zwei");
        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
