package racinggame;

import nextstep.test.NSTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.dto.Car;
import racinggame.dto.CarGroup;

import java.util.ArrayList;
import java.util.List;

public class RacingGameTest extends NSTest {
    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    void 자동차명_입력테스트() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("자동차1"));
        carList.add(new Car("자동차2"));

        CarGroup carGroup1 = new CarGroup(carList);
        CarGroup carGroup2 = new CarGroup("자동차1, 자동차2");

        Assertions.assertThat(carGroup1).isEqualTo(carGroup2);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
