package racinggame.dto;

import nextstep.utils.Console;
import racinggame.common.CommonConstants;
import racinggame.enums.RacingEnum;
import racinggame.view.RacingView;

import java.util.ArrayList;
import java.util.List;

public class CarGroup {
    private final List<Car> carList;

    // 문자열에서 콤마를 구분자로 자동차명을 입력받아 리스트 생성
    public CarGroup() {
        List<Car> tempCarList = null;
        boolean isPass = true;
        while(isPass){
            RacingView.printInputCarName();
            String carNames = Console.readLine(); // 콘솔에서 입력받음
            tempCarList = setCarNames(carNames); // 입력받은 값 set
            isPass = !isPassNameLengthCheck(tempCarList); // 길이체크 통과시 패스
        }
        this.carList = tempCarList;
    }

    // 입력받은 값 split, Car 타입 변환, 리스트에 입력하여 리턴
    private List<Car> setCarNames(String carNames) {
        List<Car> tempCarList = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            Car c = new Car(carName.trim());
            tempCarList.add(c);
        }
        return tempCarList;
    }

    // 입력받은 값 5글자 이하여부 체크
    public boolean isPassNameLengthCheck(List<Car> tempCarList){
        boolean isPass = true;
        for(Car car : tempCarList){
            isPass &= car.getName().length() <= CommonConstants.NAME_LENGTH_LIMIT;
        }

        // 체크결과 false 일때 메세지 출력
        if(!isPass){
            RacingView.printIllegalArgument(RacingEnum.ILLEGAL_NAME_LENGTH_MESSAGE.message);
        }
        return isPass;
    }

    // 현재 저장된 상태 출력
    public void printCarsStatus() {
        for (Car car : carList) {
            car.printCarStatus();
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
