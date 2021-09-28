package com.shakil.model;

import lombok.*;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Team extends BaseModel{

    private String teamName;
//    private Country country;
//    private List<Player> playerList;
//    private User coach;
    private String odiRanking;
    private String testRanking;
    private String t20Ranking;
//    private User teamManager;
//    private Captain captain;
//    private Attachment teamLogo;

}