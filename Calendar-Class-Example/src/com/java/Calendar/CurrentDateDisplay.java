package com.java.Calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateDisplay {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format the current date using the defined format
        String formattedDate = currentDate.format(formatter);

        // Display the formatted date in the console
        System.out.println("Date: " + formattedDate);
    }
}
