package racinggame.enums;

public enum RacingMessageEnum {
    INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    ,INPUT_REPEAT_NUMBER_MESSAGE("시도할 회수는 몇회인가요?")
    ,RACING_RESULT_SEPERATOR(": ")
    ,RACING_MOVING_ICON("-")
    ,ILLEGAL_NAME_LENGTH_MESSAGE("[ERROR] 이름은 "+ RacingNumberEnum.NAME_LENGTH_LIMIT.number +"자 이하만 가능합니다.")
    ,ILLEGAL_REPEAT_NUMBER_MESSAGE("[ERROR] 0 이상의 숫자만 입력 가능합니다.")
    ;

    public String message;
    RacingMessageEnum(String message) {
        this.message = message;
    }
}
