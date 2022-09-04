package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
   private String name;
   private int salary;
   private int age;
   private String sex;
   private String area;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public Person(String name, int salary, int age, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>(){{
            add(new Person("Tom",8900,23,"male","New York"));
            add(new Person("Jack",7000,25,"male","Washington"));
            add(new Person("Lily",7800,21,"female","Washington"));
            add(new Person("Anni",8200,24,"female","New York"));
            add(new Person("Owen",9500,25,"male","New York"));
            add(new Person("Alisa",7900,26,"female","New York"));
        }};
//        List<String> filterList = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
//        System.out.println("高于8000的员工姓名："+filterList);
//        Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getSalary));
//        System.out.println("员工工资最大值："+max.get().getSalary());
//        List<Person> personListNew = personList.stream().map(person -> {
//            Person personNew = new Person(person.getName(), 0, 0, null, null);
//            personNew.setSalary(person.getSalary() + 10000);
//            return personNew;
//        }).collect(Collectors.toList());
//        System.out.println("一次改动前："+personList.get(0).getName()+"-->"+personList.get(0).getSalary());
//        System.out.println("一次改动后："+personListNew.get(0).getName()+"-->"+personListNew.get(0).getSalary());
//
//        List<Person> personListNew2 = personList.stream().map(person -> {
//            person.setSalary(person.getSalary() + 10000);
//            return person;
//        }).collect(Collectors.toList());
//        System.out.println("一次改动前："+personList.get(0).getName()+"-->"+personList.get(0).getSalary());
//        System.out.println("一次改动后："+personListNew2.get(0).getName()+"-->"+personListNew2.get(0).getSalary());
//        Optional<Integer> sumSalary = personList.stream().map(Person::getSalary).reduce(Integer::sum);
//        Integer sumSalary2 = personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), (sum1, sum2) -> sum1 + sum2);
//        Integer sumSalary3 = personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), Integer::sum);
//        Integer maxSalary = personList.stream().reduce(0, (max, p) -> max > p.getSalary() ? max : p.getSalary(), Integer::max);
//        Integer maxSalary2 = personList.stream().reduce(0, (max, p) -> max > p.getSalary() ? max : p.getSalary(), (max1, max2) -> max1 > max2 ? max1 : max2);
//        System.out.println("工资之和："+sumSalary.get()+","+sumSalary2+","+sumSalary3);
//        System.out.println("最高工资："+maxSalary+","+maxSalary2);
//        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
//        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
//
//        Map<String, Person> map = personList.stream().filter(p -> p.getSalary() > 8000).collect(Collectors.toMap(Person::getName, p -> p));
//        System.out.println("toList:"+listNew);
//        System.out.println("toSet:"+set);
//        System.out.println("toMap:"+map);
//        Long count = personList.stream().collect(Collectors.counting());
//        Double average = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
//        Optional<Integer> max = personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compare));
//        Integer sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
//        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));
//
//        System.out.println("员工总数："+count);
//        System.out.println("员工平均工资："+average);
//        System.out.println("员工工资总数："+sum);
//        System.out.println("员工工资所有统计："+collect);
//        Map<Boolean, List<Person>> part = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
//        Map<String, List<Person>> group = personList.stream().collect(Collectors.groupingBy(Person::getSex));
//        Map<String, Map<String, List<Person>>> group2 = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
//        System.out.println("员工按薪资是否大于8000分组情况："+part);
//        System.out.println("员工按性别分组情况："+group);
//        System.out.println("员工按性别、地区："+group2);
//        String names = personList.stream().map(p -> p.getName()).collect(Collectors.joining(","));
//        System.out.println("所有员工的姓名："+names);
//        List<String> list = Arrays.asList("A", "B", "C");
//        String string = list.stream().collect(Collectors.joining("-"));
//        System.out.println("拼接后的字符串："+string);
//        Integer sum = personList.stream().collect(Collectors.reducing(0, Person::getSalary, (i, j) -> (i + j - 5000)));
//        System.out.println("员工扣税薪资总和："+sum);
//
//        Optional<Integer> sum2 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
//        System.out.println("员工薪资综合："+sum2.get());
//        List<String> newList = personList.stream().sorted(Comparator.comparing(Person::getSalary)).map(Person::getName).collect(Collectors.toList());
//        List<String> newList2 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).map(Person::getName).collect(Collectors.toList());
//        List<String> newList3 = personList.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName).collect(Collectors.toList());
//        List<String> newList4 = personList.stream().sorted((p1, p2) -> {
//            if (p1.getSalary() == p2.getSalary()) {
//                return p2.getAge() - p1.getAge();
//            } else {
//                return p2.getSalary() - p1.getSalary();
//            }
//        }).map(Person::getName).collect(Collectors.toList());
//        System.out.println("按工资升序排序："+newList);
//        System.out.println("按工资降序排列："+newList2);
//        System.out.println("先按工资再按年龄升序排序："+newList3);
//        System.out.println("先按工资再按年龄自定义降序排序："+newList4);
          String[] arr1={"a","b","c","d"};
          String[] arr2={"d","e","f","g"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        List<String> newList = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());
        List<Integer> collect = Stream.iterate(1, x -> x + 2).limit(10).collect(Collectors.toList());
        List<Integer> collect1 = Stream.iterate(1, x -> x + 2).skip(1).limit(5).collect(Collectors.toList());
        System.out.println("流合并："+newList);
        System.out.println("limit:"+collect);
        System.out.println("skip:"+collect1);
    }
}
