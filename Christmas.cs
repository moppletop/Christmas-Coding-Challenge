using System;

namespace _12DaysOfChristmas
{
    class Christmas
    {
        public static string START = "On the {0} day of Christmas\nmy true love sent to me:\n";
        public static string[] DAYS = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
        public static string[] GIFTS = { "Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Golden Rings", "Geese a Laying", "Swans a Swimming", "Maids a Milking", "Ladies Dancing", "Lords a Leaping", "Pipers Piping", "Drummers Drumming" };
        static void Main(String[] args)
        {
            String last = "";
            for (int i = 0; i < 12; i++)
            {
			    Console.WriteLine(START, DAYS[i]);
			    Console.WriteLine(last = (i + 1) + " " + GIFTS[i] + "\n" + last);
                if (i == 0)
                    last = "and " + last;
            }
            Console.ReadKey();
        }
    }
}
