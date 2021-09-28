package com.shakil.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class Role extends BaseModel {
    private String name;

}