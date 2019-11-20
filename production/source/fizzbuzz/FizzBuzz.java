package fizzbuzz;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String execute() {
        Function<Integer, String> converter = number -> {
            String conversion="";
            if (number % 3==0) {
                conversion+="Fizz";
            }
            if (number % 5==0) {
                conversion+="Buzz";
            }
            if (conversion.length()==0) conversion=""+number;
            return conversion;
        };

       return IntStream.rangeClosed(1, 100).mapToObj(converter::apply).collect(Collectors.joining());
    }
}
