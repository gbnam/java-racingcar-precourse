package racinggame.view;

import racinggame.enums.RacingEnum;

public class RacingView {
    public static void printInputCarName() {
        System.out.println(RacingEnum.INPUT_CAR_NAME_MESSAGE.message);
    }

    public static void printCarStatus(String carName, String movingCountIcon) {
        System.out.println(carName + RacingEnum.RACING_RESULT_SEPERATOR.message + movingCountIcon);
    }

    public static void printIllegalArgument(String message){
        System.out.println(message);
    }
}
