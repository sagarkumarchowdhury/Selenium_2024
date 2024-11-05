package com.JavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStreamsLesson {
	@Test
	public static void Names() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Sagar");
	names.add("Rahul");
	names.add("Kush");
	names.add("Sush");
	names.add("jack");
	long c =names.stream().filter(actual-> actual.startsWith("S")).count();
	System.out.println(c);
	names.stream().filter(a->a.length()>4).forEach(a->System.out.println(a));
	Stream.of(3, 4,1, 6, 2, 0, 7).sorted().forEach(a->System.out.println(a));

	
	}
	@Test
	public static void mapStream() {
		Stream.of("James", "Sagar", "Sonu", "Safar", "Gomu").filter(s->s.startsWith("S")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

	@Test
	public static void mergeStream() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sagar");
		names.add("Rahul");
		names.add("Kush");
		names.add("Sush");
		names.add("jack");

		List<String> names1 = Arrays.asList("Sam", "James", "Kurt", "Rough");

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.forEach(s -> System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("kush"));
		Assert.assertTrue(flag);

	}
	@Test
	public static void streamCollect() {
		List<String> ls = Stream.of("James", "Sagar", "Sonu", "Safar", "Gomu").filter(s -> s.startsWith("S")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		ls.get(0);

	}
	@Test
	public static void test() {
		
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
//		print Unique Numbers
//		Sort the array
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	}

}
