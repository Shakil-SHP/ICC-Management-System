package com.shakil.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Captain")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Captain extends BaseModel{
    private String name;
    private Date startDate;
    private Date endDate;

    //private Country country;

}
