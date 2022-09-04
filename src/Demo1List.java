import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo1List {
    public static void main(String[] args) {
//        List<String> list=new ArrayList<String>(){{
//            add("张无忌");
//            add("周芷若");
//            add("赵敏");
//            add("小昭");
//            add("殷离");
//            add("张三");
//            add("张三丰");
//        }};
//        List<String> listA=new ArrayList<>();
//        for (String s : list) {
//            if(s.startsWith("张")) {
//                listA.add(s);
//            }
//        }
//        List<String> listB=new ArrayList<>();
//        for (String s : listA) {
//            if(s.length()==3){
//                listB.add(s);
//            }
//        }
//
//        for (String s : listB) {
//            System.out.println(s);
//        }
//        list.stream()
//                .filter(name->name.startsWith("张"))
//                .filter(name->name.length()==3)
//                .forEach(name-> System.out.println(name));
//        List<String> list = Arrays.asList("a", "b", "c");
//        Stream<String> stream = list.stream();
//        Stream<String> parallelStream = list.parallelStream();
//        stream.forEach(System.out::println);
//        System.out.println(parallelStream);
//        parallelStream.forEach(System.out::println);

//        int[] array={1,3,5,6,8};
//        IntStream stream = Arrays.stream(array);
//        stream.forEach(System.out::println);

//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//        Stream<Integer> stream1 = Stream.iterate(0, (x) -> x + 3).limit(4);
//        stream1.forEach(System.out::println);
//
//        Stream<Double> stream2 = Stream.generate(Math::random).limit(3);
//        stream2.forEach(System.out::println);
//        List<Integer> list=new ArrayList<Integer>(){{
//            add(1);
//            add(2);
//            add(3);
//            add(5);
//            add(9);
//            add(7);
//            add(4);
//            add(3);
//            add(8);
//            add(6);
//            add(2);
//            add(5);
//        }};
        List<Integer> list = Arrays.asList(1, 3, 6, 8, 12, 4);
        Optional<Integer> findFirst=list.stream().parallel().filter(x->x>6).findFirst();
        System.out.println("使用Stream静态方法generate："+findFirst.get());
        

    }
}
