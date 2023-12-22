package com.garagoz.service;

import com.garagoz.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface PersonService {
    PersonDto save(PersonDto personDto);
    void delete(Long id);
    List<PersonDto> getAll();
    //Page<PersonDto> getAll(Pageable pageable);
}
