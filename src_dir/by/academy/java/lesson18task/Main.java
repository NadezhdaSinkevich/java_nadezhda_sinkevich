package by.academy.java.lesson18task;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final String STR_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main (String[] args){

        System.out.println("length" + STR_ALPHABET.length());

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string:");
        String strInput = scanner.nextLine();
        System.out.println("enter N=");
        Integer N = scanner.nextInt();

        String convertString = "";


        for (int i = 0; i < strInput.length(); i++) {
            if (checkSymb(strInput.charAt(i))){
                convertString += returnConvertSymbol(strInput.charAt(i),N);
            }
            else {
                convertString += strInput.charAt(i);
            }
        }

        System.out.println(convertString);

    }
    public static boolean checkSymb(Character symb){
        //String alphabetUpperCase = STR_ALPHABET.toUpperCase();

        if (STR_ALPHABET.indexOf(symb) !=  -1) {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean checkBondersEnd (int index, int n){
        if (index + n <= STR_ALPHABET.length()-1){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean checkBondersStart (int index, int n){
        if (index + n >= 0){
            return true;
        }
        else {
            return false;
        }

    }

    public static Character returnConvertSymbol(Character symb, Integer n){
        Integer index = STR_ALPHABET.indexOf(symb);
        Character convertSymb = null;
        int indexBorders = 0;
        int iteration=0;


        if (checkBondersStart(index,n)){

            if (checkBondersEnd(index,n)){
                convertSymb = STR_ALPHABET.charAt(index + n);
            }
            else {
                iteration = (index + n) / STR_ALPHABET.length();
                indexBorders = (index + n) - STR_ALPHABET.length()*iteration;

                convertSymb = STR_ALPHABET.charAt(indexBorders);
            }

        }
        else {
            iteration = (index + Math.abs(n)) / STR_ALPHABET.length();
            indexBorders = (index + n) + STR_ALPHABET.length()*iteration ;

            convertSymb = STR_ALPHABET.charAt(Math.abs(indexBorders));
        }


        return convertSymb;
    }
}
