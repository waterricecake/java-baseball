package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class GameControllerTest extends NsTest {
    @Test
    void GameTest() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("145","123","2");
                    assertThat(output()).contains("스트라이크");
                },
                1, 2,3
        );
    }
    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
