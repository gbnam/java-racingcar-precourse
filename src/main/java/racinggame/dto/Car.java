package racinggame.dto;

import racinggame.enums.RacingMessageEnum;
import racinggame.view.RacingView;

public class Car {
    private final String name;
    private int movingCount;

    public Car(String name) {
        this.name = name;
        this.movingCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getMovingCount() {
        return movingCount;
    }

    public void printCarStatus() {
        String movedIcon = "";
        for (int i = 0; i < movingCount; i++) {
            movedIcon += RacingMessageEnum.RACING_MOVING_ICON.message;
        }
        RacingView.printCarStatus(name, movedIcon);
    }
}
