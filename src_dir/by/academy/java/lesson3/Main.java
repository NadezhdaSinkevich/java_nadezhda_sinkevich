package by.academy.java.lesson3;

public class Main {


    public static void main(String[] args)
    {
        HistoryCar hc = new HistoryCar();
        String car = hc.getCar(2000);
        System.out.println(car);




    }
       // int res = getRes ();
        //System.out.println(res);
/*
       int  a=3;

        if (a%2==0){
            System.out.println("+");
        }
        else if (a%3==0){
            System.out.println("-");
        }
    }*/
        /*
    private static int getRes(){
        return (int) (Math.random()*10+1);
    }


    private static String getPassword(int count){
        string abc ="abcdef" ;
        string result="";

        for (int i = 0 ; i<count ; i++) {
            result += abc.charAt((int) (Math.random() * abc.length));
        }
        return result;


    }*/
}
