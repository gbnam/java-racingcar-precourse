package racinggame.dto;

import nextstep.utils.Randoms;
import racinggame.enums.RacingMessageEnum;
import racinggame.enums.RacingNumberEnum;
import racinggame.model.InputParser;
import racinggame.model.RacingModel;
import racinggame.view.RacingView;

import java.util.List;

public class CarGroup {
    private final List<Car> carList;

    // 문자열에서 콤마를 구분자로 자동차명을 입력받아 리스트 생성
    public CarGroup() {
        List<Car> tempCarList = null;
        boolean isPass = true;
        while(isPass){
            tempCarList = InputParser.parseInputCarNames(); // input을 받아 Car 타입 리스트로 생성
            isPass = !RacingModel.isPassNameLengthValidation(tempCarList); // 길이체크 통과시 패스
        }
        this.carList = tempCarList;
    }

    // 현재 저장된 상태 출력
    public void printCarsStatus() {
        for (Car car : carList) {
            car.printCarStatus();
        }
        RacingView.printNewLine();
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public void raceStart(){
        for(Car car : carList){
            tryMoveCar(car);
        }
    }

    private void tryMoveCar(Car car) {
        int randomValue = Randoms.pickNumberInRange(0,9); // 랜덤값 생성
        if (randomValue >= RacingNumberEnum.MOVING_FORWARD.number) {
            car.move();
        }
    }


}
