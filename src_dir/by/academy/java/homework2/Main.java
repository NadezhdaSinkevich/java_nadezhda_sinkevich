package by.academy.java.homework2;

public class Main {
    static String name1;
    static int size1;
    static char sizeGlass1;
    static boolean caffeine1;
    static float price1;
    static long barcode1;


    static String name2;
    static Integer size2;
    static Character sizeGlass2;
    static Boolean caffeine2;
    static Float price2;
    static Long barcode2;

    public static void main(String[] args ){



        Coffe coffe = new Coffe();

        coffe.setName("cappuccino");
        coffe.setSizeML(400);
        coffe.setCaffeine(true);
        coffe.setPrice(3.50F);
        coffe.setSizeGlass('M');
        coffe.setBarcode(1234567L);

        System.out.println(coffe);

        name1 = coffe.getName();
        size1 = coffe.getSizeML();
        sizeGlass1 = coffe.getSizeGlass();
        caffeine1 = coffe.getCaffeine();
        price1 = coffe.getPrice();
        barcode1 = coffe.getBarcode();

        System.out.println("FIRST:"+name1+size1+sizeGlass1+caffeine1+price1+barcode1);

        coffe.setName("americano");
        coffe.setSizeMlWrapper(500);
        coffe.setCaffeineWrapper(true);
        coffe.setPriceWrapper(4.50F);
        coffe.setSizeGlassWrapper('L');
        coffe.setBarcodeWrapper(2143657L);

        //System.out.println(coffe);

        name2 = coffe.getName();
        size2 = coffe.getSizeMlWrapper();
        sizeGlass2 = coffe.getSizeGlassWrapper();
        caffeine2 = coffe.getCaffeineWrapper();
        price2 = coffe.getPriceWrapper();
        barcode2 = coffe.getBarcodeWrapper();

        System.out.println("SECOND:"+name2+size2+sizeGlass2+caffeine2+price2+barcode2);

        long a = (long) size1;
        long b = size2.longValue();
        System.out.println(a+","+b);

        String c = String.valueOf(barcode1);
        System.out.println(c);

        String d = String.valueOf(sizeGlass1) +  String.valueOf(sizeGlass2);
        System.out.println(d);

        int s = (int) price1;
        int f = price2.intValue();
        System.out.println(s+","+f);

        float x = (float)  barcode1;
        float y = barcode2.floatValue();
        System.out.println(x+","+y);


    }
}
