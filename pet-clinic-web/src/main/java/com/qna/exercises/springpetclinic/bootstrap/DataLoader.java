package com.qna.exercises.springpetclinic.bootstrap;

import com.qna.exercises.springpetclinic.model.Owner;
import com.qna.exercises.springpetclinic.model.Pet;
import com.qna.exercises.springpetclinic.model.PetType;
import com.qna.exercises.springpetclinic.model.Vet;
import com.qna.exercises.springpetclinic.services.OwnerService;
import com.qna.exercises.springpetclinic.services.PetTypeService;
import com.qna.exercises.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("123 AddresOwner1");
        owner1.setCity("CityOwner1");
        owner1.setPhone("1234567");

        Pet owner1Pet = new Pet();
        owner1Pet.setName("Yoyo");
        owner1Pet.setPetType(savedDogPetType);
        owner1Pet.setOwner(owner1);
        owner1Pet.setBirthDate(LocalDate.now());
        owner1.getPets().add(owner1Pet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Lisa");
        owner2.setLastName("Second");
        owner2.setAddress("456 AddresOwner2");
        owner2.setCity("CityOwner2");
        owner2.setPhone("888888");

        Pet owner2Pet = new Pet();
        owner2Pet.setName("Fifi");
        owner2Pet.setPetType(savedCatPetType);
        owner2Pet.setOwner(owner2);
        owner2Pet.setBirthDate(LocalDate.now());
        owner2.getPets().add(owner2Pet);

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
