package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromText implements Reader {
    private List<String> list = new ArrayList<String>();
    @Override

    public List<String> read() throws IOException {
        String fileName ="C://1.txt";
        File file = new File(fileName);

        //StringBuilder sb = new StringBuilder();
        exists(fileName);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    list.add(s);
                  //  sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла

        return list;

    }
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}
