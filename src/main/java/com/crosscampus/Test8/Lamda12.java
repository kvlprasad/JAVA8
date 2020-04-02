package com.crosscampus.Test8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface x12{

    void show();

}

public class Lamda12 {


    public Lamda12(){
    }



    public List<Employee> getemps(){


        Employee e1= new Employee(100,"Ashley",2500,10 );
        Employee e2= new Employee(200,"Caroline",3500,20 );
        Employee e3= new Employee(300,"Kapur",3000,20 );
        Employee e4= new Employee(400,"Jade",3500,10 );

        List<Employee> emps= new ArrayList<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        return emps;
    }
    public List<Integer>  getsort3limit(){
        int[] numbers = {10,20,0,-2,90,86,9,13,7};

        return IntStream.of(numbers).sorted()
                .distinct().limit(3).boxed().collect(Collectors.toList());

    }

    public boolean IsanyOdd(){
        int[] numbers = {10,20,0,-2,90,86,9,13,7};

        return  IntStream.of(numbers).boxed().anyMatch(n -> n % 2 ==1);

    }

    public void getmin(){

       int[] numbers = {10,20,0,-2,90,86,9,13,7};
       int[] numcopy = Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(numcopy);
        System.out.println(Arrays.toString(numcopy));



        //List<Integer> Li= Arrays.asList(10,20,0,-2,90,86,9,13,7);

        int m= IntStream.of(numbers).min().getAsInt();

        System.out.println(m);

        IntSummaryStatistics intStatics = IntStream.of(numbers).summaryStatistics();


        int minx= numbers[0];

        for(int x:numbers){
            System.out.println(x);
            if(x < minx){
                minx=x;

            }

        }

        System.out.println("minx is " + minx);

    }

    public static void main(String[] args) {
       // IntStream.generate(random(1,0));

        Lamda12 lmd=new Lamda12();
        lmd.getmin();
        System.out.println(lmd.getsort3limit());
        List<Employee> emps = lmd.getemps();

        //lmd.IsanyOdd();

           // emps.stream().sorted(Comparator.comparingInt(Employee::getSal).reversed()).limit(3).forEach(e -> System.out.println(e.getEmpNm() + " :: " + e.getSal()));                          
            List<String> enames = emps.stream().sorted(Comparator.comparingInt(Employee::getSal).reversed()).limit(3).map(Employee::getEmpNm).collect(Collectors.toList());
            Map<Integer,List<Employee>> Emap = emps.stream().collect(Collectors.groupingBy(e -> e.deptno));
            Emap.forEach((k,v) -> System.out.println(k +"::" +v.toString()));

           // Map<String,int> xxger= new Map<String, int>() ;

            //System.out.println(enames.toString());

        x12 obj;
        obj = ()->{
                System.out.println("Here is my Lamda !!!!!");

        };
        obj.show();

        List<Integer> values = new ArrayList<Integer>();
        for(int i=0;i<=1000;i++){
            values.add(i);

        }
        //IntStream.range(1,10).map(n -> n * 2).forEach(System.out::println);

        int[] b = IntStream.range(1,10).map(n -> n*2).toArray();


        System.out.println(b);

      //  values.forEach(i-> System.out.println(i));



    }
}
