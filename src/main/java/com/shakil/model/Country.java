package com.shakil.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country extends BaseModel{

    private String countryName;
    private String countryCode;

}