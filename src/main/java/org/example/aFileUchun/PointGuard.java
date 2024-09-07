package org.example.aFileUchun;

public class PointGuard extends BasketballPlayer{
    private  int countOfGuard;

    public PointGuard(){}
    public PointGuard( String nameOfPlayer, int numberPosition, String teamName, int numberOfGoals, int countOfGuard){
        super(nameOfPlayer,numberPosition, teamName, numberOfGoals);
        this.countOfGuard=countOfGuard;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"Guard"+countOfGuard;
    }
}
