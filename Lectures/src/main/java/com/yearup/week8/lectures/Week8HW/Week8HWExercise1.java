package com.yearup.week8.lectures.Week8HW;

import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Week8HWExercise1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get("dictionary.txt"))) {
            while(fileReader.hasNextLine()) {
                String word = fileReader.nextLine();
                list.add(word);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 1. Find all the palindromes in the dictionary and print them
        //list.stream().filter(word -> checkIfPalindrome(word)).forEach(word -> System.out.println(word));
        List<String> newList = list.stream().filter(word -> checkIfPalindrome(word)).toList();
        System.out.println("Words that are palindromes: " + newList);
        //----------------------------

        // 2. Find all the words starting with letter b to m
        List<String> wordsStartingWithBtoM = list.stream().filter(word -> checkIfStartsWithBtoM(word)).toList();

        //   Find the longest word and print it
        OptionalInt lengthOfLongestWord = wordsStartingWithBtoM.stream().mapToInt(word -> word.length()).max();
        System.out.println(lengthOfLongestWord.getAsInt());
        List<String> longestWords = wordsStartingWithBtoM.stream().filter(word -> word.length() == lengthOfLongestWord.getAsInt()).toList();
        System.out.println("Longest Words: " + longestWords);

        // Count the total number of vowels and print it
        int numOfVowels = wordsStartingWithBtoM.stream().mapToInt(word -> countVowels(word)).sum();
        System.out.println("Number of vowels: " + numOfVowels);

        //----------------------------
        // 3. Write function that group words by the first letter

        //HashMap<String, Integer> lettersGroupCountMap = new HashMap<>();
        Map<String, Long> lettersGroupCountMap = list.stream().map(word -> word.split("")[0]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        list.stream().map(word -> getFirstLetter(word)).forEach(n -> System.out.println(n));
        // Find the group with the most word and print it
       System.out.println(lettersGroupCountMap);

        Optional<Map.Entry<String, Long>> maxEntry = lettersGroupCountMap.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        System.out.println("The group with the most words is " + maxEntry.get().getKey() + " which has " + maxEntry.get().getValue() + "words");
        //       lettersGroupCountMap.forEach

    }

    public static boolean checkIfPalindrome(String str) {
        Stack stack = new Stack();

        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);
            stack.push(letter);
        }
        String newStr = "";

        for (int i=0; i<str.length(); i++) {
            newStr += stack.pop();
        }
        if (str.equals(newStr)) {
            return true;
        }
        return false;
    }

    public static boolean checkIfStartsWithBtoM(String word) {
        return Pattern.matches("[b-m].*", word);
    }
    public static int countVowels(String word) {
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (checkVowels(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkVowels(char letter) {
        boolean vowelOrNot = false;
        switch (letter) {
            case 'a': vowelOrNot=true; break;
            case 'e': vowelOrNot=true; break;
            case 'i': vowelOrNot=true; break;
            case 'o': vowelOrNot=true; break;
            case 'u': vowelOrNot=true; break;
        }
        return vowelOrNot;
    }

}




