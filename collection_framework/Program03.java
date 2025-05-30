package collection_framework;

import java.util.*;

public class Program03 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(22);
		c1.add("abc");
		c1.add("30.2");
		c1.add("xyz");
		c1.add(20);
		c1.add(56);
		c1.add(40);
		c1.add(50);
		c1.add(50);
		System.out.println("Integer Elements in Collection are:");
		int sum = 0;
		for (Object x : c1) {
			if (x instanceof Integer) {
				sum += (int) x;
				System.out.println(x);
			}
		}
		System.out.println("The sum of Integer elements is: " + sum);
	}
}