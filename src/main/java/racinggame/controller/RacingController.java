package racinggame.controller;

import racinggame.dto.CarGroup;
import racinggame.model.InputParser;

public class RacingController {

    InputParser inputParser;

    public RacingController() {
        this.inputParser = new InputParser();
    }

    public void runRacingGame() {
        CarGroup carGroup = new CarGroup(); // 자동차명 입력 및 초기화
        int repeatNumber = inputParser.getRepeatNumber(); // 반복횟수 입력
        for (int i = 0; i < repeatNumber; i++) {
            carGroup.raceStart();
            carGroup.printCarsStatus();
        }
        carGroup.printWinner(); // 최종결과 출력
    }
}
