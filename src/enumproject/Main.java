package enumproject;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfTheWeek weekday = DayOfTheWeek.TUES;
		for (int i = 0; i < 10; i++) {
			weekday = getRandomDay();
//			System.out.printf("name is %s ordinal value=%d%n", weekday.name(), weekday.ordinal());
			switchDayOfWeek(weekday);
		}
		for (Topping topping : Topping.values()) {
			System.out.println(topping.name() + ":" + topping.getPrice());
		}

	}

	public static void switchDayOfWeek(DayOfTheWeek weekday) {
		int weekDayInteger = weekday.ordinal() + 1;
		switch (weekday) {
		case WED -> System.out.println("wednesday is day" + weekDayInteger);
		case SAT -> System.out.println("saturday is day" + weekDayInteger);
		default -> System.out.println(
				weekday.name().charAt(0) + weekday.name().substring(1).toLowerCase() + "day is Day" + weekDayInteger);
		}
	}

	public static DayOfTheWeek getRandomDay() {
		int randomInteger = new Random().nextInt(7);
		var allDays = DayOfTheWeek.values();
		return allDays[randomInteger];
	}
}
