package com.dobrianskyi.validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main( String[] args )
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the sentence:");
           String value = reader.readLine();
            System.out.println("Enter the regex:");
            String regex = reader.readLine();
            System.out.println("Enter the replace:");
            String replace = reader.readLine();
            String output= value.replace(regex, replace);
            System.out.println(output);

            System.out.println(value.indexOf(regex));


            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                System.out.println(value.substring(matcher.start(), matcher.end()));
            }


        } catch (IOException | NumberFormatException e) {
            System.out.println("Enter the number");
        }

    }

}
