package service.impl;

import service.FileSearchService;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSearchServiceImpl implements FileSearchService {

    @Override
    public int findWord(String word) throws IOException {
        File file = new File("resources/Words.txt");
        Scanner scanner = new Scanner(file);
        int increment = 0;
        System.out.println("Your word is " + word);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);
            String[] words = str.split(", ");
            for (String target: words){
                System.out.println(target);
                if (target.equals(word)){
                    increment++;
                }
                if (increment == 0){
                    System.out.println("Your words have no matches");
                }
            }
        }
        return increment;
    }
}
