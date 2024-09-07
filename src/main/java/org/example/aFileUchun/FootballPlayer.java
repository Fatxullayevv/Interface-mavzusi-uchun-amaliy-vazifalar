package org.example.aFileUchun;

public class FootballPlayer extends Player {
    private int counOfRedCard;
    private int counOfYellowCard;
    private int counOfGools;

    public FootballPlayer() {
    }

    public FootballPlayer(String nameOfPlayer, int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, "Football", numberPosition, teamName);
        this.counOfRedCard = countOfRedCard;
        this.counOfYellowCard = countOfYellowCard;
        this.counOfGools = countOfGoals;
    }

    public String getInfo() {
        return super.getInfo() + ", Red Cards: " + counOfRedCard +
                ", Yellow Cards: " + counOfYellowCard + ", Goals: " + counOfGools;
    }
}


