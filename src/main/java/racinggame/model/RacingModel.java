package racinggame.model;

import racinggame.dto.Car;
import racinggame.enums.RacingMessageEnum;
import racinggame.enums.RacingNumberEnum;
import racinggame.view.RacingView;

import java.util.List;

public class RacingModel {

    // 움직인 수만큼 아이콘 생성
    public static String getMovingCountIcon(int movingCount) {
        String movingCountIcon = "";
        for (int i = 0; i < movingCount; i++) {
            movingCountIcon += RacingMessageEnum.RACING_MOVING_ICON.message;
        }
        return movingCountIcon;
    }

    // 5글자 이하여부 체크
    public static boolean isPassNameLengthValidation(List<Car> tempCarList){
        boolean isPass = true;
        for(Car car : tempCarList){
            isPass &= car.getName().length() <= RacingNumberEnum.NAME_LENGTH_LIMIT.number;
        }

        // 체크결과 false 일때 메세지 출력
        if(!isPass){
            RacingView.printIllegalArgument(RacingMessageEnum.ILLEGAL_NAME_LENGTH_MESSAGE.message);
        }
        return isPass;
    }
}
