package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromConsole implements Reader {

    private List<String> list = new ArrayList<String>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public ReadFromConsole()

    {
       System.out.println("Конструктор  ReadFromConsole отработал");
    }

    @Override
    public List<String> read() throws IOException {
        list.add(reader.readLine());
        System.out.println("из консоли");
        return list;
    }
}
