package by.academy.java.homework10.factory;

import by.academy.java.homework10.body.Body;
import by.academy.java.homework10.body.BigBody;
import by.academy.java.homework10.body.MidleBody;
import by.academy.java.homework10.body.SmallBody;

public enum BodyFactory {
    BIG{

        public Body get (int id){
            return new BigBody(id);
        }
    },
    SMALL{

        public Body get (int id){
            return new SmallBody(id);
        }

    },
    MIDLE{
        public Body get (int id){
            return new MidleBody(id);
        }
    };
    public abstract Body get(int id);

}
