package by.academy.java.homework8.compulsory;

public class AbstractContainer {
    public int height;
    private int diagonal;
    private int volume;
    public boolean isSmall;
    public int density;

    public AbstractContainer(int height, int diagonal, int volume, boolean size, int density) {
        this.height = height;
        this.diagonal = diagonal;
        this.volume = volume;
        this.isSmall = size;
        this.density = density;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isSmall() {
        return isSmall;
    }

    public void setSmall(boolean small) {
        this.isSmall = small;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "AbstractContainer{" +
                "height=" + height +
                ", diagonal=" + diagonal +
                ", volume=" + volume +
                ", isSmall=" + isSmall +
                ", density=" + density +
                '}';
    }

    public int makeVolume(){
        return 0;
    }

    public String nameContainer(){
        return ("name");
    }
}
