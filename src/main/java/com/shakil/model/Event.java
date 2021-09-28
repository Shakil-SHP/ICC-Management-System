package com.shakil.model;


import com.shakil.enums.EventType;
import lombok.*;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event extends BaseModel{

//    private Squad team1;
//    private Squad team2;
//    private List<User> umpires;

    private String name;
    private Date startDateTime;
    private Date endDateTime;
    private EventType eventType;


}