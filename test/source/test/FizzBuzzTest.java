package test;

import fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.StringContainsInOrder.stringContainsInOrder;

public class FizzBuzzTest {

    @Test
    public void test() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.execute();
        System.out.println(result);

        assertThat(result, stringContainsInOrder("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz"));

    }
}
