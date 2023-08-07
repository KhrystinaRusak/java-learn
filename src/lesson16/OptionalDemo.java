package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> companyNames = Arrays.asList("Tms", "hi");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        Supplier<Integer> listSizeViSupplier = companyNames::size;
        int size = listOptional.map(List::size).orElse(0);

        Function<List, Integer> listSizeViFunction = List::size;
        System.out.println(listSizeViFunction.apply(companyNames));
    }
}
