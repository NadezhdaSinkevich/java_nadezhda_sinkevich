package by.academy.java.lesson19task;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public static List<Student> listStudent ;
    public static Student student;

    public StudentManager(Student student) {
        this.student = student;
    }
    public StudentManager() {
       listStudent = new ArrayList<>();
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString() {
        return "StudentManager{" +
                "listStudent=" + listStudent +
                ", student=" + student +
                '}';
    }
    public void add (Student student){
        listStudent.add(student);
        System.out.println("student add!");
    }
    public void allList(){
        System.out.println(listStudent);
    }
    public void remove(Integer bookRemove){
        boolean flag = false;

        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).book.compareTo(bookRemove) == 0 ){
                listStudent.remove(i);
                System.out.println("student delete!");
                flag = true;
            }
        }
        if (flag == false){System.out.println("studentnot found");}
    }
    public void grade(Integer bookUpdate, Integer gradeAdd){
        boolean flag = false;
        Integer studentId = 0;
        Integer scoreGrade1=0 ;
        Integer scoreGrade2=0 ;
        Float scoreFinal;

        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).book.compareTo(bookUpdate) == 0){
                listStudent.get(i).listGrade.add(gradeAdd);
                System.out.println("grade add!");
                flag = true;
                studentId = i;
            }
        }
        if (flag == false) {
            System.out.println("studentnot found");
        }
        else {
            for (int i = 0; i < listStudent.get(studentId).listGrade.size(); i++) {
                scoreGrade1 += (listStudent.get(studentId).listGrade.get(i));
            }
            scoreGrade2 = listStudent.get(studentId).listGrade.size();
            scoreFinal = (float) scoreGrade1/scoreGrade2;
            listStudent.get(studentId).setScore(scoreFinal.toString());
        }
    }
}
