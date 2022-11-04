package baseball.game.exception;

import static baseball.game.Options.*;

public class ExceptionCase {
    private static void throwException(String text){
        throw new IllegalArgumentException(text);
    }

    public static void catchSizeException(String input){
        if(input.length()!=COUNT_BALL){
            throwException(COUNT_BALL + "개의 숫자를 입력하시오.");
        }
    }

    public static void catchOutOfRangeException(Integer input){
        if(input<MIN_NUMBER|MAX_NUMBER<input){
            throwException(MIN_NUMBER+"~"+MAX_NUMBER+"까지의 숫자를 입력해야 합니다.");
        }
    }

    public static void catchWrongOrderRestartException(String input){
        if(!input.equals(RESTART)&!input.equals(END)){
            throwException(RESTART+"나 "+END+"를 입력하시오");
        }
    }
}
