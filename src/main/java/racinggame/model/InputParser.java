package racinggame.model;

import nextstep.utils.Console;
import racinggame.enums.RacingMessageEnum;
import racinggame.view.RacingView;

public class InputParser {
    public int getRepeatNumber() {
        String input = "";
        boolean isPass = true;
        while (isPass) {
            RacingView.printInputRepeatNumber(); // 반복숫자입력 문구 출력
            input = Console.readLine(); // 숫자 콘솔에서 입력받음
            isPass = !checkInputRepeatNumber(input); // 반복숫자 입력 후 패스할때까지 검증
        }
        return Integer.parseInt(input);
    }

    public boolean checkInputRepeatNumber(String input) {
        boolean isPass = true;
        isPass &= input.matches("[0-9]*");
        isPass &= isPass && Integer.parseInt(input) > 0;

        if (!isPass) {
            RacingView.printIllegalArgument(RacingMessageEnum.ILLEGAL_REPEAT_NUMBER_MESSAGE.message);
        }
        return isPass;
    }
}
