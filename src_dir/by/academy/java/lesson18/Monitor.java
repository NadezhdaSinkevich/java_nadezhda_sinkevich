package by.academy.java.lesson18;

import java.time.LocalDateTime;

public class Monitor {
    public Monitor() {
    }
    public static <T> void doMon(Class <T> t){

        try {/*
            final T t1 = t.getConstructor().newInstance();
            final Method[] methods = t1.getClass().getMethods();
            for (int i = 0; i < methods.length; i++) {
                final Monitoring annotation = methods[i].getAnnotation(Monitoring.class);
                if(annotation != null){
                    methods[i].setAccesible(true);
                    int start = LocalDateTime.now().getNano();
                    methods[i].invoke(t1);

                    int end = LocalDateTime.now().getNano();
*/
                   // System.out.println(methods[i].getName);

                } catch (Exception e) {
            throw new RuntimeException(e);
        }
            }


}
