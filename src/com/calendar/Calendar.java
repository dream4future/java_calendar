package com.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MaxDay = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDay(int month) {
			return MaxDay[month];
	}
	
	public void printSampleCalendar() {
		System.out.println("일    월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		Calendar cal = new Calendar();

		// 숫자 입력받아 해당 월의 최대 일수 출력
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.println(">>>");
			
			int month = sc.nextInt();
			
			if(month>12 || month<1) {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
			else {
				System.out.println(month + "월의 최대 일수는 " + cal.getMaxDay(month) + "일입니다.");
			}
			
		}
		sc.close();
		cal.printSampleCalendar();
	}
}
