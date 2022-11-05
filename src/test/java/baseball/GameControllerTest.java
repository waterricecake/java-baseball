package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class GameControllerTest extends NsTest {
    @Test
    void gameTest() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("145","123","2");
                    assertThat(output()).contains("스트라이크");
                },
                1, 2,3
        );
    }
    @Test
    void restartTest(){
        assertRandomNumberInRangeTest(
                () -> {
                    run("145","123","1","123","2");
                    assertThat(output()).contains("스트라이크");
                },
                1, 2,3,1,2,3
        );
    }
    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
