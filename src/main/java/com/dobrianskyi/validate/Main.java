package com.dobrianskyi.validate;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the sentence:");
            String value = reader.readLine();
            System.out.println("Enter the regex:");
            String regex = reader.readLine();
            System.out.println("Enter the replace:");
            String replace = reader.readLine();
            String output = value.replace(regex, replace);
            System.out.println(output);

            System.out.println(change(value, regex, replace));


        } catch (IOException | NumberFormatException e) {
            System.out.println("Enter the number");
        }

    }

    static String change(String str, String regex, String replace) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i = 0;
        while ((i = sb.indexOf(regex, i)) >= 0) {
            sb.delete(i, i + regex.length());
            sb.insert(i, replace);
            i += replace.length();
        }
        return sb.toString();
    }

}
