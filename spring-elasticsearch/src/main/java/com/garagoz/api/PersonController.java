package com.garagoz.api;

import com.garagoz.model.Person;
import com.garagoz.repository.PersonRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void init() {
        Person person = new Person();
        person.id = 1;
        person.name = "Arslan";
        person.lastname = "Torayew";
        person.dateofbirth = Calendar.getInstance().getTime();
        personRepository.save(person);

    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> persons = personRepository.getByCustomQuery(search);

        return ResponseEntity.ok(persons);
    }
}
