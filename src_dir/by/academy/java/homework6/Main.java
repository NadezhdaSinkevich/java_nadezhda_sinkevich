package by.academy.java.homework6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String firstLink = "https://jira.academy.com/secure/Dashboard.jspa?selectPageId=22702";
        String secondlink = "http://jira.academy.com/secure/Dashboard.jspa";


            Pattern pattern = Pattern.compile("(https|http)://(\\w+\\.)*(\\w+\\.)+(com|ru|eu)/\\w+(?:/[\\w\\d\\-\\.]*)");
        Matcher matcher = pattern.matcher(firstLink);
        boolean found = matcher.find();



        if (found ){
            System.out.println("Найдено " );
        }
        else {
            System.out.println("Не найдено");
        }


    }
}
