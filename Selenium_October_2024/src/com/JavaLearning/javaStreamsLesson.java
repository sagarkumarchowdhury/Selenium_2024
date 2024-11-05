package com.JavaLearning;

import java.util.ArrayList;
import java.util.stream.Stream;

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

}
