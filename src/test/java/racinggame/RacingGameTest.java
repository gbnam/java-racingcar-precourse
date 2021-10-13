package racinggame;

import nextstep.test.NSTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.dto.Car;
import racinggame.model.InputParser;
import racinggame.model.RacingModel;

import java.util.ArrayList;
import java.util.List;

public class RacingGameTest extends NSTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;
    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    void 자동차명_입력값_체크_테스트() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji", "pobi, java");
            verify(ERROR_MESSAGE, "시도할 회수");
        });
    }

    @Test
    void 반복횟수_입력값_체크_테스트() {
        InputParser inputParser = new InputParser();

        String input1 = "123aa";
        String input2 = "-11";
        String input3 = "1";

        Assertions.assertThat(inputParser.checkInputRepeatNumber(input1)).isEqualTo(false);
        Assertions.assertThat(inputParser.checkInputRepeatNumber(input2)).isEqualTo(false);
        Assertions.assertThat(inputParser.checkInputRepeatNumber(input3)).isEqualTo(true);
    }

    @Test
    void 우승자_찾기_테스트(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a",7));
        carList.add(new Car("b",4));
        carList.add(new Car("c",7));
        carList.add(new Car("d",1));

        RacingModel racingModel = new RacingModel();
        String winnerName = racingModel.findWinner(carList);
        Assertions.assertThat(winnerName).isEqualTo("a,c");
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
