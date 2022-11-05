package baseball.game;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.game.Option.COUNT_BALL;

public class Game {
    public static List<Integer> userNumbers;
    public static List<Integer> computerNumbers;

    public static Integer ball;
    public static Integer strike;

    public Game(){
        makeRandomNumbers();
    }

    private static void makeRandomNumbers(){
        computerNumbers = new ArrayList<>();
        while(computerNumbers.size() <3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if(!computerNumbers.contains(randomNumber)){
                computerNumbers.add(randomNumber);
            }
        }
    }

    public static void setUserNumber(String input){
        userNumbers = new ArrayList<>();
        int number;
        for(int i = 0;i<COUNT_BALL;i++){
            number = Character.getNumericValue(input.charAt(i));
            userNumbers.add(number);
        }
    }

}
