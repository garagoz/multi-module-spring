package com.garagoz.service.impl;

import com.garagoz.dto.PersonDto;
import com.garagoz.service.PersonService;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public class PersonServiceImpl implements PersonService {
    @Override
    public PersonDto save(PersonDto personDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PersonDto getAll(PersonDto personDto) {
        return null;
    }

    @Override
    public Page<PersonDto> getAll(Pageable pageable) {
        return null;
    }
}
