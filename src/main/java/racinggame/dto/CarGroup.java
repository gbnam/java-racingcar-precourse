package racinggame.dto;

import java.util.ArrayList;
import java.util.List;

public class CarGroup {
    private final List<Car> carList;

    public CarGroup(List<Car> carList) {
        this.carList = carList;
    }

    // 문자열에서 콤마를 구분자로 자동차명을 입력받아 리스트 생성
    public CarGroup(String carNames) {
        carList = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            Car c = new Car(carName.trim());
            carList.add(c);
        }
    }

    // 현재 저장된 상태 출력
    public void printCarsStatus() {
        for (Car car : carList) {
            car.printCarStatus();
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
