package by.academy.java.homework10.robot;

import by.academy.java.homework10.body.Body;
import by.academy.java.homework10.head.Head;

public class Robot {
    private String name;
    private Head head;
    private Body body;

    public Robot(String name, Head head, Body body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", body=" + body +
                '}';
    }
}
