package baseball.game;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static List<Integer> userNumbers;
    private static List<Integer> computerNumbers;

    private static Integer ball;
    private static Integer strike;


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
}
