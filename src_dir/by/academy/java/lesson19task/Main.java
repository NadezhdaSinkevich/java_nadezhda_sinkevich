package by.academy.java.lesson19task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  by.academy.java.lesson19task.StudentManager;

public class Main {


    public static void main (String[] args){
        StudentManager studentManager = new StudentManager();
        boolean flagEnd = true;

        while (flagEnd) {
        System.out.println("1.add");
        System.out.println("2.grade");
        System.out.println("3.list");
        System.out.println("4.remove");
        System.out.println("5.exit");

        Scanner scan = new Scanner(System.in);
        Integer operation = scan.nextInt();

            switch (operation) {
                case 1: {
                    //add
                    System.out.println("fio enter ");
                    scan.nextLine();
                    String fio = scan.nextLine();
                    System.out.println("number book enter");
                    Integer book = scan.nextInt();

                    List<Integer> listGrades = new ArrayList<>();

                    Student student = new Student(fio, book, listGrades);


                    studentManager.add(student);


                    break;
                }
                case 2: {
                    //grade
                    System.out.println("number book enter");
                    Integer book = scan.nextInt();
                    System.out.println("grade");
                    Integer grade= scan.nextInt();

                    studentManager.grade(book,grade);
                    break;
                }
                case 3: {
                    //list
                    studentManager.allList();
                    break;
                }
                case 4: {
                    //remove
                    System.out.println("number book enter");
                    Integer book = scan.nextInt();
                    studentManager.remove(book);
                    break;
                }
                case 5: {
                    //exit
                    System.out.println("до свидания");
                    flagEnd = false;
                    break;
                }
            }
        }
    }

}
