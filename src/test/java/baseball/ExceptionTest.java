package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ExceptionTest extends NsTest {
    @Test
    void catchMoreInputExceptionTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }    @Test
    void catchLessInputExceptionTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("12"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void catchOutOfRangeExceptionTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("012"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void catchNotNumberExceptionTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("a12"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void catchWrongOrderRestartExceptionTest() {
        assertRandomNumberInRangeTest(
                () ->
                {
                    assertThatThrownBy(()->run("123","3"))
                            .isInstanceOf(IllegalArgumentException.class);
                },
                1,2,3
        );
    }
    @Test
    void catchDuplicatedNumberExceptionTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("111"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
