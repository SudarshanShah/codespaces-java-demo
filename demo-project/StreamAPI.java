import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(56);
        list.add(100);
        list.add(55);

        List<Integer> squaresOfEven = list.stream().filter(e -> e % 2 == 0).map(e -> e * e).collect(Collectors.toList());
        System.out.println(squaresOfEven);
    }
}

