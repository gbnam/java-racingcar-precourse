package racinggame.controller;

import racinggame.dto.CarGroup;
import racinggame.model.InputParser;

public class RacingController {

    InputParser inputParser;

    public RacingController() {
        this.inputParser = new InputParser();
    }

    public void runRacingGame() {

        // 자동차명 입력
        CarGroup carGroup = new CarGroup();

        // 반복횟수 입력
        int repeatNumber = inputParser.getRepeatNumber();

        // 반복횟수만큼 반복
        for(int i=0; i<repeatNumber; i++){
            carGroup.raceStart();
            carGroup.printCarsStatus();
        }

        // 최종결과 출력
        carGroup.printWinner();

    }
}
