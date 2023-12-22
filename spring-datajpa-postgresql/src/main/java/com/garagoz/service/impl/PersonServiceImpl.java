package com.garagoz.service.impl;

import com.garagoz.dto.PersonDto;
import com.garagoz.model.Address;
import com.garagoz.model.Person;
import com.garagoz.repo.AddressRepository;
import com.garagoz.repo.PersonRepository;
import com.garagoz.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    @Transactional
    public PersonDto save(PersonDto personDto) {

        Assert.isNull(personDto.name, "name is required");

        Person person = new Person();
        person.name = personDto.name;
        person.lastname = personDto.lastname;
        final Person persondb = personRepository.save(person);
        List<Address> list = new ArrayList<>();
        personDto.addressList.forEach(item->{
            Address address = new Address();
            address.address = item;
            address.addressType = Address.AddressType.OTHER;
            address.active = true;
            address.person = persondb;
            list.add(address);

        });
        addressRepository.saveAll(list);
        personDto.id = persondb.id;
        return personDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PersonDto> getAll() {
        List<Person> personList =  personRepository.findAll();
        List<PersonDto> personDtoList = new ArrayList<>();
        personList.forEach(item->{
            PersonDto personDto1 = new PersonDto();
            personDto1.id = item.id;
            personDto1.name = item.name;
            personDto1.lastname = item.lastname;
            ///personDto1.addressList(item.addressList.stream().map(address -> ));
            personDtoList.add(personDto1);
        });

        return personDtoList;
    }

//    @Override
//    public Page<PersonDto> getAll(Pageable pageable) {
//        return null;
//    }
}
