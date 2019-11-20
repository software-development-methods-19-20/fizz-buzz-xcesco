package fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static Map<Integer, String> conversionMap;

    {
        conversionMap = new HashMap<>();
        conversionMap.put(3, "Fizz");
        conversionMap.put(5, "Buzz");
        conversionMap.put(7, "Bang");
    }

    public String execute() {
        Function<Integer, String> converter = number -> {
            String conversion = "";

            for (Map.Entry<Integer, String> item : conversionMap.entrySet()) {
                conversion = tryToConvertInString(number, conversion, item.getKey(), item.getValue());
            }

            if (conversion.length() == 0) conversion = String.valueOf(number);
            return "["+conversion+"]";
        };

        return IntStream.rangeClosed(1, 100).mapToObj(converter::apply).collect(Collectors.joining());
    }

    private String tryToConvertInString(Integer number, String currentConversion, int i, String replacedValue) {
        if (number % i == 0) {
            currentConversion += replacedValue;
        }
        return currentConversion;
    }
}
