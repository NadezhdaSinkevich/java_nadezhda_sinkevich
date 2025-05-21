package by.academy.java.homework2;

public class Coffe {
//примитивы
    private String name;
    private int sizeML;
    private boolean caffeine;
    private float price;
    private char sizeGlass;
    private long barcode;

//обертки
    private Integer sizeMlWrapper;
    private Boolean caffeineWrapper;
    private Float priceWrapper;
    private Character sizeGlassWrapper;
    private Long barcodeWrapper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeML() {
        return sizeML;
    }

    public void setSizeML(int sizeML) {
        this.sizeML = sizeML;
    }

    public boolean getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(boolean caffeine) {
        this.caffeine = caffeine;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public char getSizeGlass() {
        return sizeGlass;
    }

    public void setSizeGlass(char sizeGlass) {
        this.sizeGlass = sizeGlass;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public Integer getSizeMlWrapper() {
        return sizeMlWrapper;
    }

    public void setSizeMlWrapper(Integer sizeMlWrapper) {
        this.sizeMlWrapper = sizeMlWrapper;
    }

    public Boolean getCaffeineWrapper() {
        return caffeineWrapper;
    }

    public void setCaffeineWrapper(Boolean caffeineWrapper) {
        this.caffeineWrapper = caffeineWrapper;
    }

    public Float getPriceWrapper() {
        return priceWrapper;
    }

    public void setPriceWrapper(Float priceWrapper) {
        this.priceWrapper = priceWrapper;
    }

    public Character getSizeGlassWrapper() {
        return sizeGlassWrapper;
    }

    public void setSizeGlassWrapper(Character sizeGlassWrapper) {
        this.sizeGlassWrapper = sizeGlassWrapper;
    }

    public Long getBarcodeWrapper() {
        return barcodeWrapper;
    }

    public void setBarcodeWrapper(Long barcodeWrapper) {
        this.barcodeWrapper = barcodeWrapper;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "name='" + name + '\'' +
                ", sizeML=" + sizeML +
                ", caffeine=" + caffeine +
                ", price=" + price +
                ", sizeGlass=" + sizeGlass +
                ", barcode=" + barcode +
                ", sizeMlWrapper=" + sizeMlWrapper +
                ", caffeineWrapper=" + caffeineWrapper +
                ", priceWrapper=" + priceWrapper +
                ", sizeGlassWrapper=" + sizeGlassWrapper +
                ", barcodeWrapper=" + barcodeWrapper +
                '}';
    }
}
