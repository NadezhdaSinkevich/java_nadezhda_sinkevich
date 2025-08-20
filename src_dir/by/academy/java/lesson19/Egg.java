package by.academy.java.lesson19;

public class Egg extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                //приоставлен
                sleep(Chicken.getTimeSleep());
                System.out.println("egg");
            } catch (InterruptedException e){}
        }

    }
}
