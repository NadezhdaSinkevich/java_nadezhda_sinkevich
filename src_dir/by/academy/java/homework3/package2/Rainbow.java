package by.academy.java.homework3.package2;

public class Rainbow {

    public String getColorName(int number) {
        String colorName = "not found ";
        switch (number) {
            case 1:
                colorName = "red";
                break;
            case 2:
                colorName = "orange";
                break;
            case 3:
                colorName = "yellow";
                break;
            case 4:
                colorName = "green";
                break;
            case 5:
                colorName = "blue";
                break;
            case 6:
                colorName = "purple";
                break;
            case 7:
                colorName = "white";
                break;
            case 0:
                colorName ="";
                break;
        }
        return colorName;
    }
}
