package by.academy.java.homework10;

import by.academy.java.homework10.factory.BodyFactory;
import by.academy.java.homework10.body.Body;
import by.academy.java.homework10.factory.HeadFactory;
import by.academy.java.homework10.head.Head;
import by.academy.java.homework10.robot.Robot;


public class Main {
    public static void main(String[] args) {

        Body body1 = BodyFactory.BIG.get(1);
        Head head1 = HeadFactory.SMALL.get(1);

        Body body2 = BodyFactory.SMALL.get(2);
        Head head2 = HeadFactory.BIG.get(2);

        Body body3 = BodyFactory.MIDLE.get(3);
        Head head3 = HeadFactory.MIDLE.get(3);

        Body body4 = BodyFactory.BIG.get(4);
        Head head4 = HeadFactory.MIDLE.get(4);

        Body body5 = BodyFactory.MIDLE.get(5);
        Head head5 = HeadFactory.SMALL.get(5);

        Body body6 = BodyFactory.BIG.get(6);
        Head head6 = HeadFactory.BIG.get(6);

        Body body7 = BodyFactory.SMALL.get(7);
        Head head7 = HeadFactory.SMALL.get(7);

        Body body8 = BodyFactory.SMALL.get(8);
        Head head8 = HeadFactory.MIDLE.get(8);

        Body body9 = BodyFactory.MIDLE.get(9);
        Head head9 = HeadFactory.BIG.get(9);

        Robot robot1 = new Robot("robot1",head1,body1);
        Robot robot2 = new Robot("robot2",head2,body2);
        Robot robot3 = new Robot("robot3",head3,body3);
        Robot robot4 = new Robot("robot4",head4,body4);
        Robot robot5 = new Robot("robot5",head5,body5);
        Robot robot6 = new Robot("robot6",head6,body6);
        Robot robot7 = new Robot("robot7",head7,body7);
        Robot robot8 = new Robot("robot8",head8,body8);
        Robot robot9 = new Robot("robot9",head9,body9);


        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);
        System.out.println(robot5);
        System.out.println(robot6);
        System.out.println(robot7);
        System.out.println(robot8);
        System.out.println(robot9);
    }
}
