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
            movingCountIcon = movingCountIcon.concat(RacingMessageEnum.RACING_MOVING_ICON.message);
        }
        return movingCountIcon;
    }

    // 5글자 이하여부 체크
    public static boolean isPassNameLengthValidation(List<Car> tempCarList) {
        boolean isPass = true;
        for (Car car : tempCarList) { // 1개라도 false 라면 isPass == false
            isPass &= car.getName().length() <= RacingNumberEnum.NAME_LENGTH_LIMIT.number;
        }
        if (!isPass) { // 체크결과 false 일때 메세지 출력
            RacingView.printIllegalArgument(RacingMessageEnum.ILLEGAL_NAME_LENGTH_MESSAGE.message);
        }
        return isPass;
    }

    public static String findWinner(List<Car> carList) {
        int largestScore = getLargestScore(carList);
        String winnerName = getWinnerName(carList, largestScore);
        return winnerName.substring(0,winnerName.length()-1);
    }

    private static int getLargestScore(List<Car> carList) {
        int maxScore = -1;
        for (Car car : carList) {
            maxScore = Math.max(car.getMovingCount(), maxScore);
        }
        return maxScore;
    }

    private static String getWinnerName(List<Car> carList, int largestScore) {
        String winnerName = "";
        for (Car car : carList) {
            winnerName = winnerName.concat(car.equalsScoreThenGetName(largestScore));
        }
        return winnerName;
    }
}
