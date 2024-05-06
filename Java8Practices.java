package com.Sixth.aap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Practices {

	public static void main(String[] args) {
	List<Integer> sc = Arrays.asList(12,13,45,67,8,89,12,89,89);
	//find the second element
Integer ac = sc.stream()
   .sorted(Comparator.reverseOrder())
   .skip(1)
   .findFirst()
   .get();
System.out.println("find the high element " + ac);

//find 2nd and 3rd number
List<Integer> secondandthried = sc.stream()
.sorted(Comparator.reverseOrder())
.collect(Collectors.toList());
Integer sum = secondandthried.get(1)+ secondandthried.get(2);
System.out.println(sum);

//find lowest number
Integer low = sc.stream()
.sorted()
.findFirst()
.get();
System.out.println(low);

//dulicate remove 
List<Integer> remove = sc.stream()
.distinct()
.collect(Collectors.toList());
System.out.println("dulicate remove " + remove);

//two array list combination
List<Integer> p = Arrays.asList(1,2,3,4,5);
List<Integer> p1 = Arrays.asList(6,7,8,9,10);
List<List<Integer>> p2 = Arrays.asList(p,p1);
System.out.println("marger two arrays list " +p2);
//so marger one list using flat map
List<Integer> p3 = p2.stream()
.flatMap(x->x.stream())
.collect(Collectors.toList());
System.out.println(p3);

//filter even number
List<Integer> even = sc.stream()
.distinct()
.filter(a->a%2==0)
.collect(Collectors.toList());
System.out.println(even);

////filter even number sum 
Integer s1 = sc.stream()
.distinct()
.filter(a->a%2==0)
.reduce(0,(a,b)->a+b);
System.out.println(s1);

//find the missing number array
List<Integer> missing = Arrays.asList(1,2,3,5,6,7,8,9,10);
Integer sum1 =missing.stream()
.reduce(0,(a,b)->a+b);
Integer sum2 = IntStream.rangeClosed(1, 10)
.reduce(0,(x,y)->x+y );
System.out.println(sum2-sum1);


   
   
	}

}
