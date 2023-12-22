package com.garagoz.dto;

import com.garagoz.model.Address;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class PersonDto {
    public Long id;

    public String name;
    public String lastname;

    public List<Address> addressList;
}
