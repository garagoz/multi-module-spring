package com.garagoz.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name="person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Person {
    @Id
    @SequenceGenerator(name = "seq_person", allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(length = 100, name="name")
    public String name;

    @Column(length = 100, name="lastname")
    public String lastname;

    @OneToMany
    @JoinColumn(name = "person_address_id")
    public List<Address> addressList;
}
