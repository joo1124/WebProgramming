package com.test;

import java.time.LocalDate;

public class age1 {
	public int inputage(int year) {
		LocalDate date = LocalDate.now();
		int age = date.getYear() - year;
		return age;
	}
}
