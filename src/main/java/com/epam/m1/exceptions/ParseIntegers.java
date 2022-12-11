package com.epam.m1.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations.".split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        List<String> onlyWords = new ArrayList<>();
        Pattern integerPattern = Pattern.compile("-?\\d+");

        while (words.hasNext()) {
            String next = words.next();
            int number;
            Matcher matcher = integerPattern.matcher(next);
            boolean matches = matcher.matches();
            if(matches) {
                try {
                    number = Integer.parseInt(next);
                } catch (NumberFormatException e) {
                    System.out.println("Number format exception");
                }
                number = Integer.parseInt(next);
                sum += number;
            } else {
                onlyWords.add(next);
            }
        }
        justWords = String.join(" ", onlyWords);


        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);
    }
}

