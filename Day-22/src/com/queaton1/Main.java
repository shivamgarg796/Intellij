package com.queaton1;

import java.io.*;

public class Main {

    public static void main(String[] args){


//        File f = new File("ab.txt");
//        System.out.println(f);
//        System.out.println(f.exists());
//        try {
//            f.createNewFile(); // it will create a abc.txt file in the current location
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(f.exists()); //true
//
//        File f2=new File("d://abc.txt");
//
//        try {
//            f2.createNewFile();// if d://myfiles location is not there
//        } catch (IOException e) {
////            throw new RuntimeException(e);
//            System.out.println("Path does not exists");
//        }
//        //then it will throw an exception

//        File f=new File("d://myfiles2");
//
//        f.mkdir(); //to create folder
//
//        System.out.println(f);// d:\myfiles2
//
//        System.out.println(f.exists()); //true


//                try {
//                    File file = new File("a.txt");
//                    if (file.createNewFile()) {
//                        System.out.println("New File is created!");
//                    } else {
//                        System.out.println("File already exists.");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }

//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("abc.txt");
//
//        fw.write(100);//d will be added
//        fw.write("ramesh\nwelcome");
//        fw.write("\n");
//        fw.write("india");
//        fw.write("\n");
//        char ch[]={'a','b','c'};
//        fw.write(ch);
//        fw.flush();
//        fw.close();
//        System.out.println("done");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        FileReader fr= null;
//        try {
//            fr = new FileReader("abc.txt");
//
//        int i=fr.read();
//        while( i != -1) {
//            System.out.print((char) i);
//            i = fr.read();
//        }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File f=new File("d://abc.txt");
//        FileReader fr= null;
//        try {
//            fr = new FileReader(f);
//
//        char[] chr=new char[(int)f.length()];
//        fr.read(chr);
//        for(char c:chr){
//            System.out.print(c);
//        }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("c.txt");
//
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(100);//d will be added
//        bw.newLine(); //inserting a new line
//        bw.write("ramesh");
//        bw.newLine();
//        bw.write("india");
//        bw.newLine();
//        char ch[]={'a','b','c'};
//        bw.write(ch);
//          bw.flush();
//          bw.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("done");

//        FileReader fr= null;
//        try {
//            fr = new FileReader("a.txt");
//
//        BufferedReader br=new BufferedReader(fr);
//        String line=br.readLine();
//        while(line != null){
//            System.out.println(line);
//            line=br.readLine();
//        }
//        br.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        PrintWriter out= null;
//        try {
//            out = new PrintWriter("e.txt");
//
//        out.write(100);//d will be added
//        out.println(100);
//        out.println(true);
//        out.println('c');
//        out.println("amit");
//        out.flush(); //need not call the flush method
//        out.close();
//        System.out.println("done..");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        FileInputStream fis= null;
//        try {
//            fis = new FileInputStream("d://shivam.jpeg");
//
//        FileOutputStream fos=new FileOutputStream("shivam2222.jpeg");
//        int i=fis.read();
//        while(i != -1){
//            fos.write(i);
//            i=fis.read();
//        }
//        fos.flush();
//        fos.close();
//        fis.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }
        }

