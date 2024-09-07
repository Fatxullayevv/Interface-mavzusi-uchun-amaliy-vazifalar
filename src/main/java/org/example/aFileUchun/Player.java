package org.example.aFileUchun;


public class Player implements Information{

    private String nameOfplayer;
    private String sportType;
    int  numberPosition;
    private String teamName;


    public  Player(){}

    public  Player(String nameOfplayer, String sportType, int numberPosition , String teamName){
        this.nameOfplayer= nameOfplayer;
        this.sportType=sportType;
        this.numberPosition=numberPosition;
        this.teamName=teamName;
    }

    @Override
    public String getInfo() {
        return "Player Name: " + nameOfplayer + ", Sport: " + sportType +
                ", Position: " + numberPosition;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }
}
