package by.academy.java.homework8.compulsory.container;

import by.academy.java.homework8.compulsory.AbstractContainer;

public class ContainerCone extends AbstractContainer {

    public ContainerCone(int height, int diagonal, int volume, boolean size, int density) {
        super(height, diagonal, volume, size, density);
    }



    public int makeVolume() {
        int d = getDiagonal();
        int h= getHeight();

        double pi = 3.14;
        int area = (int) (0.3 * pi * Math.pow((d/2),2) * h);

        //System.out.println("d="+d+"h="+h+"volume="+area);
        return area;
    }

    public String nameContainer(){
        return ("containerCone");
    }
}
