package com.company;

import java.util.ArrayList;
import java.util.List;

public class WriteToConsole implements Writer {


    @Override
    public void Write(List<String> list) {
        System.out.println("Вывод на консоль");
        System.out.println(list);
    }
}
