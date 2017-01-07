package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyApp {

public void StartProg(Reader reader,Writer writer) throws IOException {
    List<String> list = new ArrayList<String>();

    list = reader.read();

    System.out.println("Получаем данные с ридера" + list);
    list.add("Добавили");
    System.out.println("обрабатываем данные" + list);

    writer.Write(list);
    System.out.println("программа выполнена!");
}

}
