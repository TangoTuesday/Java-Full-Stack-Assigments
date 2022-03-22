package com.Cal;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Calender {

	public static void main(String[] args) {

		// Time watch = new Time();

		Date d = new Date(122, 2, 21);

		LocalDate obj = LocalDate.now();

		System.out.println(d);

		System.out.println("Todays date is " + obj);

		LocalTime obje = LocalTime.now();

		System.out.println("The current time is " + obje);

		LocalDate objec = LocalDate.of(2017, 4, 20);

		// Time elapsed - last seen 53 minutes, last updates 10 days ago
		LocalTime sooner = LocalTime.of(17, 00);

		LocalTime later = LocalTime.of(19, 00);

		Duration duration = Duration.between(sooner, later);

		System.out.println(duration.toHours());

		LocalDate Obj = LocalDate.now();
		System.out.println("Before formatting " + Obj);

		DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-mm-yyyy MM:hh:SS");
		String afterFormate = Obj.format(formated);
		System.out.println("After formatting " + afterFormate);

	}

}
