package org.example.aFileUchun;

public class GoalKeeper extends  FootballPlayer{

    private int countOfSaves;

    public GoalKeeper(String nameOfPlayer, int numberPosition, String teamName,
                      int countOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, numberPosition, teamName, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Saves: " + countOfSaves;
    }

}
