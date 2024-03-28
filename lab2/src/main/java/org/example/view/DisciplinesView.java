package org.example.view;

import lombok.RequiredArgsConstructor;
import org.example.service.DisciplineService;

@RequiredArgsConstructor
public class DisciplinesView {

    private final DisciplineService disciplineService;

    public void view(int numberOfPairs, int numberOfClass){
        System.out.print("Date by numberOfPairs: ");
        System.out.println(disciplineService.showDateByNumberOfPairs(numberOfPairs));
        System.out.print("Show classroom info: ");
        System.out.println(disciplineService.showDateByNumberOfClass(numberOfClass));
    }

}
