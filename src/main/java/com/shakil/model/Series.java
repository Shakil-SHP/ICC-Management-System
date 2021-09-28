package com.shakil.model;


import com.shakil.enums.SeriesType;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Series extends BaseModel{

    private String name;
    private SeriesType seriesType;

//    private List<Event> eventList;
//    private List<Squad> participantTeams;
    private LocalDateTime seriesEndDate;
    private LocalDateTime seriesStartDate;

}