package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task01MainTest {

    @Test
    public void solution() throws Exception {
        String result = Task01Main.solution();
        Assertions.assertThat(result).isEqualToIgnoringCase("Я думаю, быть программистом - это круто");
    }

}
