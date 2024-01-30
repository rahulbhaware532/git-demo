import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionExample {

    public static void main(String[] args) {
        System.out.println("Hello Word");

        List<Integer> list = Arrays.asList(15, 15, 15, 13, 15, 12, 430);
        List<Integer> collect = list.stream().filter(x -> !x.equals(15)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
