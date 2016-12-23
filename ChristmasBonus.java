package me.moppletop;
import static java.lang.System.out;
public class ChristmasBonus {
	public static final String START = "On the %s day of Christmas\nmy true love sent to me:\n";
	public static final String[] DAYS = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
	public static final String[] GIFTS = { "Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Golden Rings", "Geese a Laying", "Swans a Swimming", "Maids a Milking", "Ladies Dancing", "Lords a Leaping", "Pipers Piping", "Drummers Drumming" };
	public static final String[] NUMBERS = {"a", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "tweleve"};
	public static void main(String[] args) {
		String last = "";		
		for (int i = 0; i < 12; i++) {
			out.printf(START, DAYS[i]);
			out.println(last = NUMBERS[i] + " " + GIFTS[i] + "\n" + last);
			if (i == 0)
				last = "and " + last;
		}
	}
}