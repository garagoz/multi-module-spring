package com.garagoz.controller;

import com.garagoz.dto.PersonDto;
import com.garagoz.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping
    public ResponseEntity<PersonDto> add(@RequestBody PersonDto personDto) {
        System.out.println(personDto.name);
        return ResponseEntity.ok(personService.save(personDto));
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> listAll() {
        return ResponseEntity.ok(personService.getAll());
    }
}
