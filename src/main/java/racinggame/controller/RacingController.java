package racinggame.controller;

import nextstep.utils.Console;
import nextstep.utils.Randoms;
import racinggame.dto.CarGroup;
import racinggame.model.InputParser;
import racinggame.view.RacingView;

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


    }
}
