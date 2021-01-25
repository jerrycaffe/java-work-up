package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullFields;

import java.util.UUID;

public class Person {

    private final UUID id;
//    we dont want the name to be blank so as not to insert empty data
    @NonNull
    private final String name;


//the json property must match with the fields being expected from the user
    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
