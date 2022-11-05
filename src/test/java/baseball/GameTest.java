package baseball;

import org.junit.jupiter.api.Test;


import static baseball.game.Game.*;
import static org.assertj.core.api.Assertions.assertThat;
public class GameTest {

    @Test
    void setUserNumberTest(){
        String input = "123";
        setUserNumber(input);
        assertThat(userNumbers).containsExactly(1,2,3);
    }

}
