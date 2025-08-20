package by.academy.java.lesson19;

import java.util.Random;

public class Chicken {
    public static void main(String[] args){
        Egg egg = new Egg();
        System.out.println("начинаем спор");

        egg.start();//запуск потока
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(Chicken.getTimeSleep());
                System.out.println(" chicken");
            } catch (InterruptedException ignored){}
        }
        if (egg.isAlive()){
            try
                {
                    //ждем пока яйцо закончит высказыв
                    egg.join();
                }catch (InterruptedException ignored){}

            System.out.println("fiirst egg");
            }else {System.out.println("first chicken");}
        System.out.println("спор закончился");
        }

        public static  int getTimeSleep (){
        final Random random = new Random();
        int tm = random.nextInt(1000);
        if (tm < 10) {
            tm *= 100;
        }else if (tm < 100){
            tm *= 10;
        }
        return tm;

    }
}
