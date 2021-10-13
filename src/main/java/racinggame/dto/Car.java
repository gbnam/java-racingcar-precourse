package racinggame.dto;

import racinggame.model.RacingModel;
import racinggame.view.RacingView;

public class Car {
    private final String name;
    private int movingCount;

    public Car(String name) {
        this.name = name;
        this.movingCount = 0;
    }

    public Car(String name, int movingCount) {
        this.name = name;
        this.movingCount = movingCount;
    }

    public String getName() {
        return name;
    }

    public int getMovingCount() {
        return movingCount;
    }

    public void printCarStatus() {
        String movingCountIcon = RacingModel.getMovingCountIcon(movingCount);
        RacingView.printCarStatus(name, movingCountIcon);
    }

    void move() {
        this.movingCount++;
    }

    public String equalsScoreThenGetName(int score) {
        if (score == movingCount) {
            return name + ",";
        }
        return "";
    }
}
