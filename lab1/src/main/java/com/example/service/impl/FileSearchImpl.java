package com.example.service.impl;

import com.example.service.FileSearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSearchImpl implements FileSearch {
    @Override
    public int findWord(String checkWord) throws IOException {
        File file = new File("/home/daniil/IdeaProjects/Labs_2/lab1/src/main/resources/Words.txt");
        Scanner scanner = new Scanner(file);
        int increment = 0;
        System.out.println("Your word is " + checkWord);
        while(scanner.hasNextLine() ){
            String str = scanner.nextLine();
            System.out.println(str);
            String[] words = str.split(", ");
            for (String target: words){
                System.out.println(target);
                if (target.equals(checkWord))
                    increment++;
            }
        }
        return increment;
    }
}
