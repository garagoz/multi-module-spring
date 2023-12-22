package com.garagoz.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonDto {
    public Long id;

    public String name;
    public String lastname;

    public List<String> addressList;
}
