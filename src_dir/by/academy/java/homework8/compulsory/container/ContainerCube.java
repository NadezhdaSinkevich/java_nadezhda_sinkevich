package by.academy.java.homework8.compulsory.container;

import by.academy.java.homework8.compulsory.AbstractContainer;
import by.academy.java.homework8.compulsory.Deck;

public class ContainerCube extends AbstractContainer {
    public ContainerCube(int height, int diagonal, int volume, boolean size, int density) {
        super(height, diagonal, volume, size, density);
    }



    public int makeVolume() {
        int d = getDiagonal();
        int area = (int) (Math.pow((d),3) );

        //System.out.println("d="+d+"volume="+area);

        return area;
    }

    public String nameContainer(){
        return ("containerCube");
    }

}
