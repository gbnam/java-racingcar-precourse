package racinggame.enums;

public enum RacingNumberEnum {
    NAME_LENGTH_LIMIT(5)
    ,MOVING_FORWARD(4)
    ,STOP(3)
    ;

    public int number;
    RacingNumberEnum(int number) {
        this.number = number;
    }
}
