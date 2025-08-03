package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistic")
public class Player {

    @Id
    @Column(name = "player_name", unique = true)
    private String playerName;

    private String nation;
    private String position;
    private Integer age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    private Integer starts;

    @Column(name = "minutes_played")
    private Float minutesPlayed;

    private Float goals;
    private Float assists;

    @Column(name = "goal_contributions")
    private Float goalContributions;

    @Column(name = "non_penalty_goals")
    private Float nonPenaltyGoals;

    @Column(name = "penalty_goals")
    private Float penaltyGoals;

    @Column(name = "penalty_attempts")
    private Float penaltyAttempts;

    @Column(name = "yellow_cards")
    private Float yellowCards;

    @Column(name = "red_cards")
    private Float redCards;

    @Column(name = "expected_goals")
    private Float expectedGoals;

    @Column(name = "expected_assists")
    private Float expectedAssists;

    private String team;

    public Player() {
    }

    public Player(String playerName, String nation, String position, int age, int matchesPlayed, int starts,
            float minutesPlayed, float goals, float assists, float goalContributions, float nonPenaltyGoals,
            float penaltyGoals, float penaltyAttempts, float yellowCards, float redCards, float expectedGoals,
            float expectedAssists, String team) {
        this.playerName = playerName;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.goalContributions = goalContributions;
        this.nonPenaltyGoals = nonPenaltyGoals;
        this.penaltyGoals = penaltyGoals;
        this.penaltyAttempts = penaltyAttempts;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.team = team;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public float getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(float minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public float getGoals() {
        return goals;
    }

    public void setGoals(float goals) {
        this.goals = goals;
    }

    public float getAssists() {
        return assists;
    }

    public void setAssists(float assists) {
        this.assists = assists;
    }

    public float getGoalContributions() {
        return goalContributions;
    }

    public void setGoalContributions(float goalContributions) {
        this.goalContributions = goalContributions;
    }

    public float getNonPenaltyGoals() {
        return nonPenaltyGoals;
    }

    public void setNonPenaltyGoals(float nonPenaltyGoals) {
        this.nonPenaltyGoals = nonPenaltyGoals;
    }

    public float getPenaltyGoals() {
        return penaltyGoals;
    }

    public void setPenaltyGoals(float penaltyGoals) {
        this.penaltyGoals = penaltyGoals;
    }

    public float getPenaltyAttempts() {
        return penaltyAttempts;
    }

    public void setPenaltyAttempts(float penaltyAttempts) {
        this.penaltyAttempts = penaltyAttempts;
    }

    public float getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(float yellowCards) {
        this.yellowCards = yellowCards;
    }

    public float getRedCards() {
        return redCards;
    }

    public void setRedCards(float redCards) {
        this.redCards = redCards;
    }

    public float getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(float expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public float getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(float expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    
    

    
}

