public class Main {

    public static void main(String[] args) {
        // casting
        /*
        int can hold 32 bits
        double can hold 64 bits
        double can hold about 2^32 more values than int, allowing it to have decimals
        int can not store as much info and can not store the decimal points. int can actually store up to about 2.1 billion before overflow errors
        we can not store a double value into an int without casting it
        we can write:
        int intValue = (int) 9.1782372198;
        or
        double d = 9.1782372198;
        int i = (int) d
        when casting a double to an int, the decimal values will be truncated or cut off. There is no rounding. 9.9999999 casted to an int will be 9
         */
        System.out.println("-----Casting-----");
        System.out.println("double: " + 9.1782372198);                          // prints 9.1782372198
        System.out.println("double casted to an int: " + (int) 9.1782372198);   // prints 9
        double d = 12.3456789;
        int i = (int) d;                                                        // 12.3456789 gets truncated to just 12
        System.out.println("d: " + d);                                          // prints 12.3456789
        System.out.println("i casted from d: " + i);                            // prints 12

        // we can also cast an int to a double
        System.out.println("5 casted to double: " + (double) 5);                // prints 5.0
        System.out.println("99 casted to double" + (double) 99);                // prints 99.0

        // somewhat interesting
        double originalDouble = 918.273645;
        int intValue = (int) originalDouble;                                        // 918.273645 gets truncated to just 918
        System.out.println("originalDouble casted to int: " + intValue);            // prints 918
        double newDouble = (double) intValue;                                       // will this convert back to 918.273645?
        System.out.println("int variable casted back to double: " + newDouble);     // prints only 918.0 because the values are truncated when stored in the int. 918 costed to a double becomes 918.0 and not the original

        // casting more complicated things
        /*
        you can cast more than just singular numbers
        you can cast equations
        just make sure to put what you want to calculate first inside parentheses
        the (int) cast will apply to what comes immediately to the right. operations inside parenthesis are considered together
        for example:
        (int) 4.5 + 5.5 + 6.5       becomes     4 + 5.5 + 6.5   = 16.0
        (int) (4.5 + 5.5) + 6.5     becomes     10 + 6.5        = 16.5
        (int) (4.5 + 5.5 + 6.5)     becomes     (int) 16.5      = 16
         */
        System.out.println("-----Casting Expressions-----");
        System.out.println("(int) 4.5 + 5.5 + 6.5: " + (int) 4.5 + 5.5 + 6.5);
        System.out.println("(int) (4.5 + 5.5) + 6.5: " + (int) (4.5 + 5.5) + 6.5);
        System.out.println("(int) (4.5 + 5.5 + 6.5): " + (int) (4.5 + 5.5 + 6.5));

        // int overflow errors
        System.out.println("-----Integer Overflow-----");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Integer Max Value: " + max);
        System.out.println("Integer Min Value: " + min);
        max++;                                                  // int overflow, will wrap around to negative 2.1 billion
        min--;                                                  // int overflow, will wrap around to positive 2.1 billion
        System.out.println("Integer Max + 1: " + max);
        System.out.println("Integer Min - 1: " + min);
        double added = Integer.MAX_VALUE + 3000000000.0;        // should be about 5.1 billion as a double
        double subtracted = Integer.MIN_VALUE - 3000000000.0;   // should be about -5.1 billion as a double
        System.out.println("Casting adding 3 billion to int max: " + (int) added);
        System.out.println("Casting subtracting 3 billion from int min: " + (int) subtracted);

        // Math.random()
        /*
        Math.random() generates a value between [0, 1)
        this does not include 1
        */
        System.out.println("-----Math.random()-----");
        System.out.println("5 Math.random(): ");
        // I chose not to use a loop to keep things simple because this is meant as a very basic beginner sample
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        // FOR THE FOLLOWING, ASSUME max AND min ARE INTEGERS

        /*
        If we want to generate a wider range between [0, max), we can just multiply
        Math.random() * max;
        this does not include max
        For example, a random number between [0, 10) can be generated by:
        Math.random() * 10;
        this does not include 10
         */
        System.out.println("-----Math.random() between [0, max)-----");
        System.out.println("5 Math.random() * 10: ");
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);

        /*
        If we want to generate a random integer between [0, max), we can use casting
        (int) (Math.random() * max);
        this does not include max and includes only whole numbers from 0 to max - 1 inclusive
        For example, a random integer between [0, 10) can be generated by:
        (int) (Math.random() * 10);
        this does not include 10 and includes only whole numbers 0 through 9 inclusive
         */
        System.out.println("-----Math.random() Integer between [0, max)-----");
        System.out.println("5 (int) (Math.random() * 10): ");
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));

        /*
        If we want to include max when generating a random integer, or generate an integer between [0, max], we can simply just add 1 to what multiplies Math.random()
        (int) (Math.random() * (max + 1));
        This includes all whole numbers from 0 to max inclusive
        For example, a random integer between [0, 10] can be generated by:
        (int) (Math.random() * 11);
        or
        (int) (Math.random() * (10 + 1));
        This includes all whole numbers from 0 to 10 inclusive;
         */
        System.out.println("-----Math.random() Integer between [0, max]-----");
        System.out.println("5 (int) (Math.random() * (10 + 1)): ");
        System.out.println((int) (Math.random() * (10 + 1)));
        System.out.println((int) (Math.random() * (10 + 1)));
        System.out.println((int) (Math.random() * (10 + 1)));
        System.out.println((int) (Math.random() * (10 + 1)));
        System.out.println((int) (Math.random() * (10 + 1)));

        /*
        If we want to generate a random number between [min, max), we need to perform some more operations
        The range between max and min and max - min
        Math.random() * (max - min);
        This will generate a value between [0, max - min), not including max - min
        To shift this to [min, max), we add min
        Math.random() * (max - min) + min;
        This will generate a value between [min, max), not including max

        For example, a random number between 10 and 50 can be generated by:
        Math.random() * (50 - 10) + 10;
        or
        Math.random() * 40 + 10;
        This will generate a value between [10, 50), not including 50
         */

        System.out.println("-----Math.random() between [min, max)-----");
        System.out.println("5 Math.random() * (50 - 10) + 10: ");
        System.out.println(Math.random() * (50 - 10) + 10);
        System.out.println(Math.random() * (50 - 10) + 10);
        System.out.println(Math.random() * (50 - 10) + 10);
        System.out.println(Math.random() * (50 - 10) + 10);
        System.out.println(Math.random() * (50 - 10) + 10);

        /*
        If we want to generate a random integer between [min, max), we can use casting
        (int) (Math.random() * (max - min)) + min;
        This will generate an integer between [min, max), not including max
        For example, an integer between [10, 50) can be generated by:
        (int) (Math.random() * (50 - 10) + 10);
        This does not include 50 and includes only whole numbers from 10 to 49 inclusive
         */
        System.out.println("-----Math.random() Integer between [min, max)-----");
        System.out.println("5 (int) (Math.random() * (50 - 10)) + 10: ");
        System.out.println((int) (Math.random() * (50 - 10)) + 10);
        System.out.println((int) (Math.random() * (50 - 10)) + 10);
        System.out.println((int) (Math.random() * (50 - 10)) + 10);
        System.out.println((int) (Math.random() * (50 - 10)) + 10);
        System.out.println((int) (Math.random() * (50 - 10)) + 10);

        /*
        If we want to generate a random integer between [min, max] to include max, we add 1 to what multiplies Math.random()
        (int) (Math.random() * (max - min + 1))  + min;
        This includes all whole numbers from max to min inclusive
        For example, a random integer between [10, 50] can be generated by:
        (int) (Math.random() * 41) + 10;
        or
        (int) (Math.random() * (50 - 10 + 1)) + 10;
        This includes all whole numbers from 10 to 50 inclusive
         */
        System.out.println("-----Math.random() Integer between [min, max]-----");
        System.out.println("5 (int) (Math.random() * (50 - 10 + 1)) + 10: ");
        System.out.println((int) (Math.random() * (50 - 10 + 1)) + 10);
        System.out.println((int) (Math.random() * (50 - 10 + 1)) + 10);
        System.out.println((int) (Math.random() * (50 - 10 + 1)) + 10);
        System.out.println((int) (Math.random() * (50 - 10 + 1)) + 10);
        System.out.println((int) (Math.random() * (50 - 10 + 1)) + 10);
    }

}