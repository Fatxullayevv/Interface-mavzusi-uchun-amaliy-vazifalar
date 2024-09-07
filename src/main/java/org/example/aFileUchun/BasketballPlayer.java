package org.example.aFileUchun;

public class BasketballPlayer extends Player{

    private  int numberOfGols;

    public BasketballPlayer(){}

    public BasketballPlayer(String nameOfplayer, int numberPosition , String teamName,
                            int numberOfGols){
        super(nameOfplayer, "Basketball", numberPosition, teamName);
        this.numberOfGols=numberOfGols;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"Goals"+numberOfGols;
    }
}
