package com.shakil.model;

import com.shakil.enums.PlayerRole;
import com.shakil.enums.PlayerStatus;
import lombok.*;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Player extends BaseModel{

//    private User user;
    private PlayerStatus playerStatus;
    private PlayerRole playerRole;
    private boolean isCaptain;
    private String battingStyle;
    private String bowlingStyle;
    private String odiRanking;
    private String testRanking;
    private String t20Ranking;

}