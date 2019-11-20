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

        assertThat(result, stringContainsInOrder("[1][2][Fizz][4][Buzz][Fizz][Bang][8][Fizz][Buzz]" +
                "[11][Fizz][13][Bang][FizzBuzz][16][17][Fizz][19][Buzz]" +
                "[FizzBang][22][23][Fizz][Buzz][26][Fizz][Bang][29][FizzBuzz]" +
                "[31][32][Fizz][34][BuzzBang][Fizz][37][38][Fizz][Buzz]" +
                "[41][FizzBang][43][44][FizzBuzz][46][47][Fizz][Bang]" +
                "[Buzz][Fizz][52][53][Fizz][Buzz][Bang][Fizz][58][59][FizzBuzz]" +
                "[61][62][FizzBang][64][Buzz][Fizz][67][68][Fizz][BuzzBang]" +
                "[71][Fizz][73][74][FizzBuzz][76][Bang][Fizz][79][Buzz]" +
                "[Fizz][82][83][FizzBang][Buzz][86][Fizz][88][89][FizzBuzz]" +
                "[Bang][92][Fizz][94][Buzz][Fizz][97][Bang][Fizz][Buzz]"));

    }
}
