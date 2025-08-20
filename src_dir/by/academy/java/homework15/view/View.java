package by.academy.java.homework15.view;

import by.academy.java.homework15.model.Order;
import by.academy.java.homework15.model.Product;
import by.academy.java.homework15.reader.Reader;
import by.academy.java.homework15.service.OrderService;
import by.academy.java.homework15.service.ProductService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private ProductService productService;
    private OrderService orderService;
    final String PATH_FILE_PRODUCTS = "C://Users//nadezhda//Desktop//filesforjava//hw//products.txt";

    public View(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    public void Start() {



        boolean flagStart = false;
        Scanner scaner = new Scanner(System.in);

        while (flagStart == false) {

            System.out.println("1.menu products");
            System.out.println("2.menu orders");
            System.out.println("3.exit");

            int inputMenu = scaner.nextInt();
            switch (inputMenu) {
                case 1: {
                    System.out.println("     menu products:      ");
                    System.out.println("________________");
                    System.out.println("1.read");
                    System.out.println("2.create");
                    System.out.println("3.delete");
                    System.out.println("4.update");
                    System.out.println("5.exit");

                    int inputStart = scaner.nextInt();
                    switch (inputStart) {
                        case 1: {
                            readProduct();
                            break;
                        }
                        case 2: {
                            createProduct();
                            break;
                        }
                        case 3: {
                            deleteProduct();
                            break;
                        }
                        case 4: {
                            updateProduct();
                        }
                        case 5: {
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("     menu orders:      ");
                    System.out.println("________________");
                    System.out.println("1.read");
                    System.out.println("2.create");
                    System.out.println("3.delete");
                    System.out.println("4.update");
                    System.out.println("5.exit");

                    int inputStart = scaner.nextInt();
                    switch (inputStart) {
                        case 1: {
                            readOrder();
                            break;
                        }
                        case 2: {
                            createOrder();
                            break;
                        }
                        case 3: {
                            deleteOrder();
                            break;
                        }
                        case 4: {
                            updateOrder();
                            break;
                        }
                        case 5: {
                            break;
                        }
                    }

                    break;
                }
                case 3: {
                    flagStart = true;
                    break;
                }

            }//switch menu global end


        }


    }


    public void updateProduct() {

                    Scanner scanerEnterProduct = new Scanner(System.in);
                    System.out.println("enter id");
                    String inputId = scanerEnterProduct.nextLine();
                    System.out.println("enter date");
                    String inputDate = scanerEnterProduct.nextLine();
                    System.out.println("enter name");
                    String inputName = scanerEnterProduct.nextLine();

                    Product product = new Product(Integer.parseInt(inputId), inputName, inputDate);
                    System.out.println(product);

                    productService.update(product, Integer.parseInt(inputId));

    }

    public void readProduct() {

        boolean flagRead = false;
        Scanner scaner = new Scanner(System.in);

        while (flagRead == false) {

            System.out.println("     menu read product:      ");
            System.out.println("________________");
            System.out.println("1.readAll");
            System.out.println("2.read");
            System.out.println("3.exit");

            int input = scaner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println(productService.readAll());
                    break;
                }
                case 2: {
                    System.out.println("enter id");

                    try {

                        Scanner scanerId = new Scanner(System.in);
                        String inputId = scanerId.nextLine();
                        System.out.println(productService.read(Integer.parseInt(inputId)));

                    } catch (NumberFormatException e) {
                        System.err.println("error format id");
                    }

                    break;
                }
                case 3: {

                    flagRead = true;
                    break;
                }
            }
        }
    }

    public void createProduct() {

        Scanner scaner = new Scanner(System.in);


        System.out.println("enter id");
        System.out.println("enter name");
        System.out.println("enter date");


        String id = scaner.nextLine();
        String name = scaner.nextLine();
        String date = scaner.nextLine();


        Product product = new Product(Integer.parseInt(id), name, date);
        productService.create(product);

    }

    public void deleteProduct() {

        Scanner scaner = new Scanner(System.in);

        System.out.println("enter id");

        int id = scaner.nextInt();

        productService.delete(id);

    }

    public void deleteOrder() {

        Scanner scaner = new Scanner(System.in);

        System.out.println("enter id");

        int id = scaner.nextInt();

        orderService.delete(id);

    }

    public void createOrder() {

        Scanner scanerOrder = new Scanner(System.in);

        System.out.println("enter id");
        String id = scanerOrder.nextLine();
        System.out.println("enter date");
        String date = scanerOrder.nextLine();

        Order order = new Order(Integer.parseInt(id),date,getListProduct());
        orderService.create(order);

    }

    public void updateOrder() {
        boolean flagRead = false;
        Scanner scaner = new Scanner(System.in);

        while (flagRead == false) {

            System.out.println("     menu update order:      ");
            System.out.println("________________");
            System.out.println("1.update order");
            System.out.println("2.exit");

            int input = scaner.nextInt();

            switch (input) {
                case 1: {
                    Scanner scanerEnterProduct = new Scanner(System.in);
                    System.out.println("enter id");
                    String inputId = scanerEnterProduct.nextLine();
                    System.out.println("enter date");
                    String inputDate = scanerEnterProduct.nextLine();

                    Order order = new Order(Integer.parseInt(inputId),inputDate,getListProduct());
                    orderService.update(order,Integer.parseInt(inputId));

                    break;
                }

                case 2: {

                    flagRead = true;
                    break;
                }
            }
        }
    }

    public void readOrder() {

        boolean flagRead = false;
        Scanner scaner = new Scanner(System.in);

        while (flagRead == false) {

            System.out.println("     menu read order:      ");
            System.out.println("________________");
            System.out.println("1.readAll");
            System.out.println("2.read");
            System.out.println("3.exit");

            int input = scaner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println(orderService.readAll());
                    break;
                }
                case 2: {
                    System.out.println("enter id");
                    try {
                        Scanner scanerId = new Scanner(System.in);
                        String inputId = scanerId.nextLine();
                        System.out.println(orderService.read(Integer.parseInt(inputId)));
                    }
                    catch (NumberFormatException e) {
                        System.err.println("error format id");
                    }


                    break;
                }
                case 3: {

                    flagRead = true;
                    break;
                }
            }
        }

    }





public List<Product> getListProduct(){

    System.out.println("enter id products,enter END to exit");

    List<Integer> listIdProducts = new ArrayList<>();
    boolean flagId = true;
    String idInput;
    Scanner scanner = new Scanner(System.in);

    while (flagId){
        idInput = scanner.nextLine();
        if (idInput.compareTo("END")==0) {
            flagId = false;
        }else {
            listIdProducts.add(Integer.parseInt(idInput));
        }

    }

    List<Product> listAllPoduct= new ArrayList<>();
    Reader reader = new Reader(PATH_FILE_PRODUCTS);
    listAllPoduct.addAll(reader.readAll());

    List<Product> listProductsOrder = new ArrayList<>();

    for (int i = 0; i < listIdProducts.size(); i++) {

        for (int j = 0; j < listAllPoduct.size(); j++) {
            if (listAllPoduct.get(j).getId() == listIdProducts.get(i)){
                listProductsOrder.add(listAllPoduct.get(j));
            }
        }

    }
    return listProductsOrder;
}

}