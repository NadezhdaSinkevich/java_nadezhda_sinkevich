package by.academy.java.homework8.compulsory.container;

import by.academy.java.homework8.compulsory.AbstractContainer;


public class ContainerСylinder extends AbstractContainer {

    public ContainerСylinder(int height, int diagonal, int volume, boolean size, int density) {
        super(height, diagonal, volume, size, density);
    }

    public int makeVolume() {
        int d = getDiagonal();
        int h= getHeight();
        double pi = 3.14;
        int area = (int) (pi * Math.pow((d/2),2) * h);

        //System.out.println("d="+d+"h="+h+"volume="+area);

        return area;
    }

    public String nameContainer(){
        return ("containerCylinder");
    }

}
