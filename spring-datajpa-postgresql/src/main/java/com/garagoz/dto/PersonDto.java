package com.garagoz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonDto {
    public Long id;
    public String name;

    public String lastname;

    public List<String> addresses;
}
