package by.academy.java.homework10.factory;

import by.academy.java.homework10.head.BigHead;
import by.academy.java.homework10.head.Head;
import by.academy.java.homework10.head.MidleHead;
import by.academy.java.homework10.head.SmallHead;

public enum HeadFactory {
    BIG{

        public Head get (int id){
            return new BigHead(id);
        }
    },
    SMALL{

        public Head get (int id){
            return new SmallHead(id);
        }

    },
    MIDLE{
        public Head get (int id) {
            return new MidleHead(id);
        }
    };
    public abstract Head get(int id);

}
