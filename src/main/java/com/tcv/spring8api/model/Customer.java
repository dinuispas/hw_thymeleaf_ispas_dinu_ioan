package com.tcv.spring8api.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer{


    @Transient
    public static final Sort SORT_BY_CREATED_AT_DESC =
            Sort.by(Sort.Direction.DESC, "username","city","country");

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String username;

    @NotNull
    private String name;

    @NotNull
    private String city;

    @NotNull
    private String country;


}

