package by.academy.java.lesson19task;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String fio;
    Integer book;
    List <Integer> listGrade;
    String score;

    public Student(String fio, Integer book, List<Integer> listGrade) {
        this.fio = fio;
        this.book = book;
        this.listGrade = listGrade;
        this.score = "N/A";
    }
    public Student (){
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public Integer getBook() {
        return book;
    }
    public void setBook(Integer book) {
        this.book = book;
    }
    public List<Integer> getListGrade() {
        return listGrade;
    }
    public void setListGrade(List<Integer> listGrade) {
        this.listGrade = listGrade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", book=" + book +
                ", listGrade=" + listGrade +
                ", score=" + score +
                '}';
    }
}
