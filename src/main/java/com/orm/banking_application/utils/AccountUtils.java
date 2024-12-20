package com.orm.banking_application.utils;

import java.time.Year;

public class AccountUtils {
    public static String generateAccountNumber(){
        /**
         *  2024 + randomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //random num
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        // convert to string
        String year = String.valueOf(currentYear);
        String num = String.valueOf(randNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(num).toString();
    }
}
