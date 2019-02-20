package com.qna.exercises.springpetclinic.bootstrap;

import com.qna.exercises.springpetclinic.model.Owner;
import com.qna.exercises.springpetclinic.model.Vet;
import com.qna.exercises.springpetclinic.services.OwnerService;
import com.qna.exercises.springpetclinic.services.VetService;
import com.qna.exercises.springpetclinic.services.map.OwnerServiceMap;
import com.qna.exercises.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mike");
        owner1.setLastName("First");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Lisa");
        owner2.setLastName("Second");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Ein");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ben");
        vet2.setLastName("Zwei");
        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
