package sumaLiczbNaLiscie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());

        Integer suma = liczby.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(liczby + "\n");
        System.out.println("Suma wszystkich liczb 1 do 100 wynosi: " + suma + ".");

    }
}
