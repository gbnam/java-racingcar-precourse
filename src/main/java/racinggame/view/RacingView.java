package racinggame.view;

import racinggame.enums.RacingMessageEnum;

public class RacingView {
    public static void printInputCarName() {
        System.out.println(RacingMessageEnum.INPUT_CAR_NAME_MESSAGE.message);
    }

    public static void printCarStatus(String carName, String movingCountIcon) {
        System.out.println(carName + RacingMessageEnum.RACING_RESULT_SEPERATOR.message + movingCountIcon);
    }

    public static void printIllegalArgument(String message){
        System.out.println(message);
    }

    public static void printInputRepeatNumber(){
        System.out.println(RacingMessageEnum.INPUT_REPEAT_NUMBER_MESSAGE.message);
    }

    public static void printNewLine(){
        System.out.println();
    }

    public static void printRacingResult(String winnerName){
        System.out.printf(RacingMessageEnum.RACING_RESULT_MESSAGE.message, winnerName);
    }
}
