package com.garagoz.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="person_address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Address implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_person_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_person_address", strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(length = 500, name="address")
    public String address;

    @Enumerated
    public AddressType addressType;

    @Column(name = "active")
    public Boolean active;

    public enum AddressType {
        HOME_ADDRESS,
        WORK_ADDRESS,
        OTHER
    }

    @ManyToOne
    @JoinColumn(name = "person_address_id")
    public Person person;
}
