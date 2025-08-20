package by.academy.java.lesson15;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /*
        InputStream is = InputStream.nullInputStream();
        try {
            int avaible = is.available();
            System.out.println(avaible);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(is != null) {
                    is.close();
                }
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        */

/*
        String text = "Hello";
        try (FileOutputStream fos = new FileOutputStream("C://Users//nadezhda//Desktop//filesforjava//file.txt")){
            //перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer,0, buffer.length);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("the file has been written");
*/
/*
        try (FileInputStream fin = new FileInputStream("C://Users//nadezhda//Desktop//filesforjava//file1.txt")){
            System.out.printf("File size: %d bytes \n", fin.available());
             int i = -1;
             while ((i=fin.read())!=-1){
                 System.err.print((char)i);
             }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

 */

        /*
        try{
            InputStreamReader isReader = new InputStreamReader(System.in);
            BufferedReader bReader = new BufferedReader(isReader);
            System.out.println("enter anything");
            String data = bReader.readLine();
            System.out.println("you entered.."+data);
        } catch (IOException e){
            e.printStackTrace();
        }

*/
        /*
try (BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//nadezhda//Desktop//filesforjava//file.txt"))){
    String text = "hello world!";
    bw.write(text);
} catch (IOException e) {
    System.out.println(e.getMessage());
}

*/
/*
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//nadezhda//Desktop//filesforjava//file.txt"))){
            int c;
            //чтение посимвольно
            while ((c=br.read())!=-1){
                System.out.println((char)c);
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    */
        /*
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//nadezhda//Desktop//filesforjava//file.txt"))){
            String c;
            //чтение посимвольно
            while ((c=br.readLine())!=null){
                System.out.println(c);
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
*/


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//nadezhda//Desktop//filesforjava//file.txt"))){
            //чтение построчно
            System.out.println("enter");
            String text;
            while (!(text=br.readLine()).equals("ESC")){
                bw.write(text+"\n");
                bw.flush();
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        /*
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter");
            int num1 = sc.nextInt();
            System.out.println("enter");
            int num2 = sc.nextInt();
            System.out.println("sum =" + (num1+num2));
        }
        catch (Exception e){
            e.printStackTrace();
        }

         */
// ????

        /*
        Scanner scanner = null;
        try {
            File file = new File("C://Users//nadezhda//Desktop//filesforjava//file.txt");
            scanner = new Scanner(file);
            while (scanner .hasNext());
            String line = scanner .nextLine();
            System.out.println(line);
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            if(scanner != null) {
                scanner.close();
            }
        }
*/
    }
}
