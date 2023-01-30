public class Main {
    public static void main(String[] args) {
        /*
         * Question 1
         *
         * Define an integer variable called bankBalance. Initialize it to a value of 500. Then add 250 to it. Then
         * subtract 100 from it. Finally, print the resulting value.
         */
        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        /*
         * Question 2
         *
         * Write Java code to define an integer variable called day, and a String variable called month. Give month and
         * day appropriate values for your birthday.
         */
        int day = 19;
        String month = "June";

        /*
         * Question 3
         *
         * Write Java code to create a String variable called firstName, define it to be your first name as a String.
         * Then define a variable called lastName and define it to be your last name as a String. Then define a
         * variable called fullName and set it to be your first name followed by a space followed by your last name.
         * Use the existing variables for your first and last name and String concatenation to define fullName.
         * Finally, write code to print this text:
         *
         * Hello, my name is [full name].
         * There are [number] letters in my name.
         *
         * Use String concatenation to create the first String to print using the fullName variable, and use the
         * .length() command on firstName and lastName to calculate the number of letters.
         *
         * Note: you can concatenate an integer and a String and the integer will be converted to a String.
         */
        String firstName = "Saksham";
        String lastName = "Khanuja";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ".");
        System.out.println("There are " + (fullName.length() - 1) + " letters in my name.");

        /*
         * Question 4
         *
         * Write Java code to define a double variable called fahrenheit and set it to an initial value between 0 and
         * 100. Then, create a double variable called celsius, and calculate its value based on the value of fahrenheit.
         * (To convert from Fahrenheit to Celsius, subtract 32, then multiply by 5, then divide by 9.) Finally, print
         * the final value of celsius.
         */
        double fahrenheit = 68;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
}