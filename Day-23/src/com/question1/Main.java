package com.question1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
//        Path p = Paths.get("d://abc//a1.txt"); // here d:/abc folder must be there,otherwise we get an exception
//        if(Files.exists(p)) {
//            System.out.println("File is aready exist");
//        }else {
//            Path p2 = null;
//            try {
//                p2 = Files.createFile(p);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("created a file at :" + p2);
//        }

//        Path p = Paths.get("a1.txt");
//        String msg="welcome to java";
//        //writing a normal string
//        try {
//            Files.write(p, msg.getBytes());
//
//        List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");
//        //writing a List of String
////        Files.write(p, list);
//         //In append mode
//        Files.write(p, list, StandardOpenOption.APPEND);
//        System.out.println("done...");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        Path p = Paths.get("d://abc//a1.txt");
//        List<String> list= null;
//        try {
//            list = Files.readAllLines(p);
//
//        System.out.println("Reading from the file");
//        for(String line:list) {
//            System.out.println(line);
//        }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        Path p = Paths.get("a1.txt");
//        Stream<String> str= null;
//        try {
//            str = Files.lines(p);
//
//        str.forEach(line -> System.out.println(line));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        Path p = Paths.get("a1.txt");
//        Stream<String> str= null;
//        try {
//            str = Files.lines(p);
//
//        str.map(line -> {
//            if(line.contains("delhi"))
//                return line.replace("delhi","Welcome Admin");
//            else
//                return line;
//        }).forEach( line -> System.out.println(line));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Path sourcePath = Paths.get("d://abc//a1.txt");
        Path dPath = Paths.get("ab.txt");
        try {
            Files.createFile(dPath);

        List<String> list = Files.readAllLines(sourcePath);
        Files.write(dPath, list);
        System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

