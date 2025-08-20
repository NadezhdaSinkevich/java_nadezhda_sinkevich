package by.academy.java.lesson3;

public class HistoryCar
{
   public static final String BMV = "BMV" ;
    public String getCar(int year){

        String result = "not found";
        switch (year){
            case 2000 :
                result = BMV;
                break;
            case 2010:

                result = "vw";
                break;

            case 3000:

                result = "tesla";
                break;
/* case 2000 -> result ->"bmw"*/



        }return result;
    }



}
