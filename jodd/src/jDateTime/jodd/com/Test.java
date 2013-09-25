package jDateTime.jodd.com;

import java.util.TimeZone;

import jodd.datetime.JDateTime;

public class Test {

	public static void main(String[] args) {
		JDateTime jdt = new JDateTime();            // current date and time
		jdt = new JDateTime(2012, 12, 21);         // 21st December 2012, midnight
		jdt = new JDateTime(System.currentTimeMillis());    // current date and time
		jdt = new JDateTime(2012, 12, 21, 11, 54, 22, 124); // 21st Dec. 2012,11:54:22.124
		jdt = new JDateTime("12/21/2012", "MM/DD/YYYY");    // 21st Dec. 2012, midnight
		System.out.println(jdt.toString());
		jdt = new JDateTime("2002-12-21 11:54:22.124");     // -//-
		jdt = new JDateTime(System.currentTimeMillis()); 
		jdt.setTimeZone(TimeZone.getTimeZone("China"));
		System.out.println(jdt.toString("YYYY-MM-DD hh:mm:ss:mss  MML DL DDD WW W E TZL TZS"));
		System.out.println(jdt.toString("YYYY年MMS DD日 hh时mm分ss秒  DL"));
	}
}
