package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

   MyApp my = new MyApp();
   Reader reader= new ReadFromConsole();
   Reader reader1=new ReadFromText();
   Writer writer= new WriteToFile();
   Writer writer1=new WriteToConsole();

   my.StartProg(reader1,writer1);

    }
}
