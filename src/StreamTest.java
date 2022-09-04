import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
//        list.stream().filter(x->x>6).forEach(System.out::println);
//        Optional<Integer> findFirst=list.stream().filter(x->x>6).findFirst();
//        Optional<Integer> findAny=list.parallelStream().filter(x->x>6).findAny();
//        boolean anyMatch = list.stream().anyMatch(x -> x > 6);
//        System.out.println("匹配第一个值："+findFirst.get());
//        System.out.println("匹配任意一个值："+findAny.get());
//        System.out.println("是否存在大于6的值："+anyMatch);
//        List<Integer> list = Arrays.asList(6, 7, 3, 8, 1, 2, 9);
//        Stream<Integer> stream = list.stream();
//        stream.filter(x->x>7).forEach(System.out::println);
//        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
//        Optional<String> max=list.stream().max(Comparator.comparing(String::length));
//        System.out.println("最长的字符串："+max.get());
//        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);
//        Optional<Integer> max = list.stream().max(Integer::compareTo);
//        Optional<Integer> max1 = list.stream().max(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println("自然排序的最大值："+max.get());
//        System.out.println("自定义排序的最大值："+max1.get());
//        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
//        long count = list.stream().filter(x -> x > 6).count();
//        System.out.println("list中大于6的元素个数："+count);
//        String[] strArr={"abcd","bcdd","defde","fTr"};
//        List<String> strList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
//        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
//        List<Integer> intListNew = intList.stream().map(x -> x + 3).collect(Collectors.toList());
//        System.out.println("每个元素大写："+strList);
//        System.out.println("每个元素+3："+intListNew);
//        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
//        List<String> listNew = list.stream().flatMap(s -> {
//            String[] split = s.split(",");
//            Stream<String> s2 = Arrays.stream(split);
//            return s2;
//        }).collect(Collectors.toList());
//        System.out.println("处理前的集合："+list);
//        System.out.println("处理后的集合："+listNew);
        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);
        Integer sum3 = list.stream().reduce(0, Integer::sum);
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);
        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);
        Integer max2 = list.stream().reduce(1, Integer::max);
        System.out.println("list求和："+sum.get()+","+sum2.get()+","+sum3);
        System.out.println("list求积："+product.get());
        System.out.println("list求和："+max.get()+","+max2);
    }
}
