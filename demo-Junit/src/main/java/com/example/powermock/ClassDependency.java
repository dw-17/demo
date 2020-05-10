package com.example.powermock;

public class ClassDependency {
	public final boolean isAlive() {
		// do something
		return false;
	}

	public static boolean isExist() {
		// do something
		return false;
	}

	public boolean isGod(String oh) {
		System.out.println(oh);
		return false;
	}
}