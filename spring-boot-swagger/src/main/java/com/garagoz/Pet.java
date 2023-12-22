package com.garagoz;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Data
@ToString
@ApiModel(value = "API Pet model")
public class Pet {
    public Pet(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @ApiModelProperty(value = "id")
    public int id;

    @ApiModelProperty(value = "name")
    public String name;

    @ApiModelProperty(value = "date")
    public Date date;
}
