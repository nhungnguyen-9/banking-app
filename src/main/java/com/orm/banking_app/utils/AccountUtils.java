package com.orm.banking_app.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";

    public static String generateAccountNumber() {
        /*
         * 2025 + random6Digits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // generate a random num betwen min and max
        int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // convert currentYear and random number
        String year = String.valueOf(currentYear);
        String random = String.valueOf(randomNum);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(random).toString();
    }
}
