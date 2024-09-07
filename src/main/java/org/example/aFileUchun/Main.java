package org.example.aFileUchun;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Lionel Messi", 10, "Inter Miami", 0, 1, 25);
        System.out.println(footballPlayer.getInfo());
        System.out.println("Team: " + footballPlayer.getTeamName());


        GoalKeeper goalKeeper = new GoalKeeper("Manuel Neuer", 1, "Bayern Munich", 0, 0, 0, 100);
        System.out.println(goalKeeper.getInfo());
        System.out.println("Team: " + goalKeeper.getTeamName());
    }
}
