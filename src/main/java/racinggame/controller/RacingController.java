package racinggame.controller;

import nextstep.utils.Console;
import racinggame.dto.CarGroup;
import racinggame.view.RacingView;

public class RacingController {
    public void runRacingGame() {
        // 자동차명 입력
        RacingView.printInputCarName();
        CarGroup carGroup = new CarGroup(Console.readLine());

        // 반복횟수 입력

        // 반복횟수만큼 반복
    }
}
