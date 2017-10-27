package com.vogella.build.maven.simple;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListSort {

	public static void main(String a[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		

		LinkedList<String> list1 = new LinkedList<String>(list);
		list1.add("E");
		//list1.remove("A");
		try{
		List<String> subList = list1.subList(1, 3);
		for(String sub: subList){
			System.out.println(sub);
		}
		}catch(ArrayIndexOutOfBoundsException  | NullPointerException ex){
			
		}
		System.out.println(list1.containsAll(list));
		//String[] listArray = list1.toArray(arg0)
		
		//System.out.println(listArray.length);
		System.out.println(list1.size());
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		list1.clear();
//		list.add(new Empl("Ram", 3000));
//		list.add(new Empl("John", 6000));
//		list.add(new Empl("Crish", 2000));
//		list.add(new Empl("Tom", 2400));
//		Collections.sort(list, new MySalaryComp());
//		System.out.println("Sorted list entries: ");
//		for (Empl e : list) {
//			System.out.println(e);
//		}
	}
}

class MySalaryComp implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if (e1.getSalary() < e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Empl {

	private String name;
	private int salary;

	public Empl(String n, int s) {
		this.name = n;
		this.salary = s;
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

	public String toString() {
		return "Name: " + this.name + "-- Salary: " + this.salary;
	}
}
