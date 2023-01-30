package hw3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

class Dz1 {
    public static void main(String[] args) {
        System.out.println(get(Arrays.asList(1,2,3,6,5)));
        System.out.println(get(Arrays.asList(1,2,3,4,7,-3)));
    }

    static List<Integer> get(List<Integer> integers){
        Map<Boolean, List<Integer>> map = integers.stream()
                .collect(partitioningBy(x -> x % 2 == 0, toList()));
        return map.get(map.get(false).size() % 2 != 0);
    }
}