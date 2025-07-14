package by.academy.java.homework13;

import java.util.Arrays;

public class MyArrayList<T> {
    public int LENGHT = 10 ;
    public Object[] array;
    public int size;

    public MyArrayList() {
        this.array = new Object[LENGHT];
        size = 0;
    }

    public MyArrayList(int capasity) {
        this.array = new Object[capasity];
        size=0;
    }

    public void MyAdd (T element){

        if (size<array.length) {
            array[size] = element;
        }
        else {

            resize(array.length*2);
            array[size] = element;
        }
        size ++;

    }
    public void MyAdd (T element,int ind){

        if (ind<array.length) {
            array[ind] = element;
        }
        else {

            resize(array.length*2);
            array[ind] = element;
        }
        size ++;

    }

    public void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
    public void MyRemove(T element){
        for (int i = 0; i < size; i++) {
            if (array[i] == element){
                remove(i,array[i]);
                size--;
            }
        }
    }

    public void MyRemove(int ind){
        remove(ind,array[ind]);
        size--;
    }

    public void remove (int i, Object element) {

        System.arraycopy(array,i+1,array,i,size);
    }

    public void MySet (int i, Object element){
        array[i] = element;
    }

    public boolean MyIsEmpty(){
        boolean empty ;
        if (size==0) {empty=true;} else {empty=false;};
        return empty;
    }

    public int MySize(){
        return size;
    }

    public T MyGet(int i) {
        return (T) array[i];
    }

    public int MyIndexOf(T element){
        for (int i = 0; i < size; i++) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }
    public int MyLastIndexOf(T element){
        for (int i = size-1; i >= 0; i--) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public boolean MyContains(T element){
        for (int i = 0; i < size; i++) {
            if (array[i] == element){
                return true;
            }
        }
        return false;
    }






    @Override
    public String toString() {
        return "MyArrayList{" +
                "SIZE=" + LENGHT +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
