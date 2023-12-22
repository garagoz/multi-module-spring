package com.garagoz.service;

import com.garagoz.dto.PersonDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface PersonService {
    PersonDto save(PersonDto personDto);
    void delete(Long id);
    PersonDto getAll(PersonDto personDto);
    Page<PersonDto> getAll(Pageable pageable);
}
