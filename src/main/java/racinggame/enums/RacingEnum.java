package racinggame.enums;

public enum RacingEnum {
    INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    ,RACING_RESULT_SEPERATOR(": ")
    ,RACING_MOVING_ICON("-")
    ;

    public String message;
    RacingEnum(String message) {
        this.message = message;
    }
}
