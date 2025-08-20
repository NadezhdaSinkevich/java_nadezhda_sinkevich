package by.academy.java.lesson8;

public enum AniFactory {
    CAT {
        public Animal action(String name){
            return new Cat();
        }
    },
    DOG{
        public Animal action(String name){
            return new Dog();
        }
    };

    public abstract Animal action(String name);

}
