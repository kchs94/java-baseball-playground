package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void split2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void subString() {
        String str = "(1,2)";
        String actual = str.substring(1, str.length()-1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() 테스트")
    void charAt() {
        // given
        String str = "123";

        // when
        char actual = str.charAt(0);

        // then
        assertThat(actual).isEqualTo('1');
    }

    /*@Test
    @DisplayName("charAt() 테스트")
    void charAtException() {
        // given
        String str = "123";

        // when
        char actual = str.charAt(4);

        // then
        assertThat(actual).isEqualTo('1');
    }*/
}
