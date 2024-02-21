package com.example.service.impl;

import com.example.service.ChangeStyle;

import java.util.Scanner;

public class ChangeStyleImpl implements ChangeStyle {


    private final String text = """
                Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
                Aenean commodo ligula eget dolor. Aenean massa.
                Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem.
                Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu.
                In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.
                Nullam dictum felis eu pede mollis pretium. Integer tincidunt.
                Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.
                Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.
                Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.
                Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum.
                Aenean imperdiet. Etiam ultricies nisi vel augue.
                Curabitur ullamcorper ultricies nisi. Nam eget dui.
                Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus,
                sem quam semper libero, sit amet adipiscing sem neque sed ipsum.
                Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,""";

    @Override
    public String changeStyle(int numberOfRow) {
        Scanner scanner = new Scanner(text);
        String res = "0";
        int i = 0;
        while (scanner.hasNextLine()) {
            if (i == numberOfRow) {
                break;
            }
            else{
                res = scanner.nextLine();
                i++;
            }
        }
        return res;
    }
}
