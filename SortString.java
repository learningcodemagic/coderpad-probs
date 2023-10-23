package com.mphasis.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Formatter;

public class SortString {

	public static void main(String[] args) {
		String dateFormat = "MM-dd-yyyy";
		String dateString = "Mon Jan 01 05:21:10 IST 1900";
		Date date = new Date();
		System.out.println(date);
		  ;
		
		//Date parsedDate = validateAndParseDateJava7(dateString, dateFormat);

		System.out.println(new SimpleDateFormat("MM/dd/YYYY").format(date));
		if(new SimpleDateFormat("MM/dd/YYYY").format(date).equals("10/18/2022")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	

}
