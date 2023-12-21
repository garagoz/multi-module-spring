package com.garagoz.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "persons")
public class Person {
    @Id
    public int id;
    @Field(name = "name", type = FieldType.Text)
    public String name;
    @Field(name = "lastname", type = FieldType.Text)
    public String lastname;
    @Field(name = "address", type = FieldType.Text)
    public String address;
    @Field(name = "dateofbirth", type = FieldType.Date)
    public Date dateofbirth;
}
