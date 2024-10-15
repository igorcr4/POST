package controllers;

import models.Volunteers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CharityRepository;

import java.util.List;

@Service
public class CharityServices {

    @Autowired
    private CharityRepository repository;
    private Volunteers volunteers;

    public List<Volunteers> findAll(){
        return repository.findAll();
    }

    public Volunteers searchByName(String fullName){
        return repository.findByFullName(fullName);
    }

    public Volunteers addVolunteer(Volunteers voluntar){
        if (volunteers.getPhoneNumber().length() == 10){
            return repository.save(voluntar);  //am adaugat un exemplu de validare
        }
        return null;
    }

    public void deleteVolunteer(String fullName){
         repository.deleteByFullName(fullName);
    }
}
