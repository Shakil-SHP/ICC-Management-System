package com.shakil.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Data
@ToString
@AllArgsConstructor
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private Date createdAt;
    private Date updatedAt;

    public BaseModel() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

}