package com.damian3111.SpringBatch.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    //id,firstName,lastName,email,gender,contactNo,country,dob
    @SequenceGenerator(name = "sequence_generator", sequenceName = "customer_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String contactNo;
    private String country;
    private String dob;


}
