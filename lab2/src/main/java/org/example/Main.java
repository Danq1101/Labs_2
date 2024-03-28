package org.example;

import org.example.view.DisciplinesView;
import org.example.view.TeachersView;

public class Main {
    public static void main(String[] args) {
        TeachersView viewTeachers = null;
        DisciplinesView viewDiscipline = null;

        viewTeachers.view("30.02", 206);
        viewDiscipline.view(4, 202);

    }
}
