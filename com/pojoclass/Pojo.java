package com.pojoclass;

public class Pojo {
	
	private static int id;
	private static String name;
	public static long sal = 40000;
	
	
	public static void setId(int id) {
		Pojo.id = id;
	}
	
	public static int getId() {
		return id;
	}

	public static void setName(String name) {
		Pojo.name = name;
	}
	
	public static String getName() {
		return name;
	}


	protected static void empId() {
		
		System.out.println("EmpId : 123");

	}

}
