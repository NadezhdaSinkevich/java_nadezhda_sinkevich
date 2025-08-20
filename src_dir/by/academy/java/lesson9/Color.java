package by.academy.java.lesson9;

public enum Color {
    RED("#FF0000"),BLUE("#0000FF");
    private  String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
