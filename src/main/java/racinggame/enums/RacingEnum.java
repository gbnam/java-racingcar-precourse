package racinggame.enums;

import racinggame.common.CommonConstants;

public enum RacingEnum {
    INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    ,RACING_RESULT_SEPERATOR(": ")
    ,RACING_MOVING_ICON("-")
    ,ILLEGAL_NAME_LENGTH_MESSAGE("[ERROR] 이름은 "+ CommonConstants.NAME_LENGTH_LIMIT +"자 이하만 가능합니다.")
    ;

    public String message;
    RacingEnum(String message) {
        this.message = message;
    }
}
