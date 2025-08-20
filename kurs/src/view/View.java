package view;

import model.Film;
import model.Ticket;
import model.User;
import reader.Logger;
import service.FilmService;
import service.TicketService;
import service.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class View {
    private UserService userService;
    private FilmService filmService;
    private TicketService ticketService;

    private Logger logger;
    final String REGULAR_DATE_TIME = "\\d\\d.\\d\\d.\\d\\d\\d\\d/\\d\\d:\\d\\d";
    final String REGULAR_FORMAT_INT = "\\d+";
    private String userOperation;

    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yy/HH:mm");
    final String dateTimeNow = dtf.format( LocalDateTime.now());

    public View(UserService userService,FilmService filmService,TicketService ticketService, Logger logger) {
        this.userService = userService;
        this.filmService = filmService;
        this.ticketService = ticketService;
        this.logger = logger;
    }

    public void Start(){
        boolean flagStart = true;

        while (flagStart){

            System.out.println("CINEMA:");
            System.out.println("1.sing in");
            System.out.println("2.registration");
            System.out.println("3.exit");
            System.out.println();
            System.out.println("enter operation (1-3):");

            Scanner scan = new Scanner(System.in);
            String operation = scan.nextLine();
            switch (operation){
                case "1":{
                    //1.sing in
                    Scanner scanUser = new Scanner(System.in);

                    System.out.println("enter login");
                    String login = scanUser.nextLine();

                    System.out.println("enter password");
                    String password = scanUser.nextLine();

                    String roleUser = userService.roleUser(login, password);

                    if (roleUser == null) {
                        System.out.println("user not found");

                    }else {

                        if (roleUser.equals("user")){
                            singInUser(login,password);
                        }
                        if (roleUser.equals("manager")){
                            singInManager(login,password);
                        }
                        if (roleUser.equals("admin")){
                            singInAdmin(login,password);
                        }

                    }
                    break;
                }
                case "2":{
                    //2.registration
                    registrationUser();
                    break;
                }
                case "3":{
                    //3.exit
                    System.out.println("the end");
                    flagStart = false;
                    break;
                }
                default:{
                    System.out.println("incorrect operation");
                    break;
                }

            }//end switch
        }//end while

    }//end start


    public void registrationUser(){

        Scanner scan = new Scanner(System.in);

        System.out.println("enter login");
        String login = scan.nextLine();

        System.out.println("enter password");
        String password = scan.nextLine();

        if (!login.trim().equals("") && !password.trim().equals("")){

            User user = new User(login,password,"user");

            if (userService.create(user) != null){

                System.out.println("user create");

                logger.createLogFile(login);
                String userOperation = "User "+ login +" registrated";
                logger.writeOperation(userOperation,login);
            }
            else {
                System.out.println("user exists");
            }
        }
        else {
            System.out.println("incorrect login/password");
        }
    }



    public void singInUser(String login, String password){

            //авторизация прошла пользователь
            //личный кабинет

            int idUser = userService.read(login, password).getId();


            userOperation = "Date and time sing in : " + dateTimeNow;
            logger.writeOperation(userOperation,login);

            boolean flagUserAccount = true;

            while (flagUserAccount) {

                userOperation = "Main menu open";
                logger.writeOperation(userOperation,login);

                System.out.println("MENU USER ACCOUNT:");
                System.out.println("1.view films");
                System.out.println("2.buy ticket");
                System.out.println("3.return ticket");
                System.out.println("4.view my ticket");
                System.out.println("5.exit");

                System.out.println();
                System.out.println("enter operation (1-5) : ");

                Scanner scanMenuUserAcc = new Scanner(System.in);
                String operation = scanMenuUserAcc.nextLine();

                switch (operation) {
                    case "1": {
                        //1.view films

                        userOperation = "User view films";
                        logger.writeOperation(userOperation,login);

                        viewAllFilmUser();
                        break;
                    }
                    case "2": {
                        //2.buy ticket
                        //вывод билетов только доступных для покупки

                        Scanner scanTicket = new Scanner(System.in);
                        System.out.println("enter id film to see tickets for buy");
                        String idFilm = scanTicket.nextLine();

                        if (idFilm.matches(REGULAR_FORMAT_INT)){

                            viewTicketToBuy(Integer.parseInt(idFilm));

                            System.out.println();
                            System.out.println("MENU BUY TICKET");
                            System.out.println("1.buy ticket");
                            System.out.println("2.exit");
                            System.out.println();
                            System.out.println("enter operation (1-2):");

                            String operationTicket = scanTicket.nextLine();
                            switch (operationTicket){
                                case "1":{
                                    //buy ticket
                                    System.out.println("enter id ticket");
                                    String idTicket = scanTicket.nextLine();

                                    if (idTicket.matches(REGULAR_FORMAT_INT)){
                                        String flagBuy = "true";

                                        if (ticketService.update(Integer.parseInt(idTicket),idUser,flagBuy)){
                                            System.out.println("ticket "+ idTicket + " buyed successfuly");
                                            userOperation = "User buy ticket id="+idTicket;
                                            logger.writeOperation(userOperation,login);
                                        }
                                        else {
                                            System.out.println("you can't buy ticket");
                                        }

                                    }
                                    else {
                                        System.out.println("incorrect id ticket");
                                    }
                                    break;
                                }
                                case "2":{
                                    //exit
                                    break;
                                }
                                default:{
                                    System.out.println("incorrect operation");
                                    break;
                                }

                            }//end switch
                        }
                        else {
                            System.out.println("incorrect id film");
                            System.out.println();
                        }

                        break;
                    }
                    case "3": {
                        //3.return ticket

                        Scanner scanTicket = new Scanner(System.in);
                        System.out.println("enter id ticket to return");
                        String idTicket = scanTicket.nextLine();
                        String flagBuy = "false";

                        if (idTicket.matches(REGULAR_FORMAT_INT)) {

                            if (ticketService.update(Integer.parseInt(idTicket),idUser,flagBuy)){

                                System.out.println("ticket " + idTicket + " returned successfuly");
                                userOperation = "User return ticket id="+idTicket;
                                logger.writeOperation(userOperation,login);
                            }
                            else {
                                System.out.println("you can't return the ticket");
                            }

                        }
                        else {
                            System.out.println("incorrect id ticket");
                        }

                        break;
                    }
                    case "4": {
                        //4.view my ticket
                        userOperation = "User view tickets";
                        logger.writeOperation(userOperation,login);

                        viewTicketUser(idUser);
                        break;
                    }

                    case "5": {
                        //5.exit

                        userOperation = "Date and time exit : " + dateTimeNow;
                        logger.writeOperation(userOperation,login);

                        flagUserAccount = false;
                        break;
                    }
                    default:{
                        System.out.println("incorrect operation");
                        break;
                    }

                }//end switch
            }//end while
    }

    public void singInManager(String login, String password){

        //авторизация прошла менеджер
        //личный кабинет

        int idUser = userService.read(login, password).getId();

        userOperation = "Date and time sing in : " + dateTimeNow;
        logger.writeOperation(userOperation,login);

        boolean flagUserAccount = true;

        while (flagUserAccount) {

            userOperation = "Main menu open";
            logger.writeOperation(userOperation,login);

            System.out.println();
            System.out.println("MENU MANAGER ACCOUNT:");
            System.out.println("1.view films");
            System.out.println("2.update film");
            System.out.println("3.buy ticket for user");
            System.out.println("4.return user's ticket");
            System.out.println("5.view user's ticket");
            System.out.println("6.exit");

            System.out.println();
            System.out.println("enter operation:");

            Scanner scanMenuUserAcc = new Scanner(System.in);
            String operation = scanMenuUserAcc.nextLine();
            switch (operation) {
                case "1": {
                    //1.view films

                    userOperation = "Manager view films";
                    logger.writeOperation(userOperation,login);

                    System.out.println("1.view films");
                    viewAllFilmUser();
                    break;
                }
                case "2": {
                    //2.update films

                    userOperation = "Manager update film";
                    logger.writeOperation(userOperation,login);

                    System.out.println("2.update films");
                    Scanner scanFilm = new Scanner(System.in);
                    System.out.println("enter id film to change");
                    String idFilm = scanFilm.nextLine();

                    if (idFilm.matches(REGULAR_FORMAT_INT)){

                        System.out.println("ENTER EDITS:");
                        System.out.println("enter name");
                        String nameFilm = scanFilm.nextLine();
                        System.out.println("enter date, format dd.mm.yyyy/hh:nn ");
                        String dateFilm = scanFilm.nextLine();

                        if(dateFilm.matches(REGULAR_DATE_TIME)){

                            Film filmUpdate = new Film(nameFilm,dateFilm);
                            if (filmService.update(filmUpdate,Integer.parseInt(idFilm))){
                                System.out.println("film update successfully");
                            }
                            else {
                                System.out.println("update impossible");
                            }
                        }
                        else {
                            System.out.println("not correct format date and time");
                        }
                    }
                    else {
                        System.out.println("incorrect id film");
                    }
                    break;
                }
                case "3": {
                    //3.buy ticket for user

                    userOperation = "Manager buy ticket";
                    logger.writeOperation(userOperation,login);

                    System.out.println("3.buy ticket for user");
                    Scanner scanTicket = new Scanner(System.in);
                    System.out.println("enter id ticket");
                    String idTicket = scanTicket.nextLine();

                    if (idTicket.matches(REGULAR_FORMAT_INT)){

                        System.out.println("enter id user");
                        String idUserTicket = scanTicket.nextLine();

                        if (idUserTicket.matches(REGULAR_FORMAT_INT)) {

                            String flagBuy = "true";

                            if (ticketService.update(Integer.parseInt(idTicket), Integer.parseInt(idUserTicket), flagBuy)) {

                                System.out.println("successfully buy ticket");

                            } else {
                                System.out.println("impossible to buy ticket");
                            }
                        }
                        else {
                            System.out.println("incorrect id user");
                        }
                    }
                    else {
                        System.out.println("incorrect id ticket");
                    }
                    break;
                }
                case "4": {
                    //4.return ticket

                    userOperation = "Manager return ticket";
                    logger.writeOperation(userOperation,login);

                    System.out.println("4.return ticket");

                    Scanner scanTicket = new Scanner(System.in);
                    System.out.println("enter id ticket");
                    String idTicket = scanTicket.nextLine();

                    if (idTicket.matches(REGULAR_FORMAT_INT)){

                        System.out.println("enter id user");
                        String idUserTicket = scanTicket.nextLine();

                        if (idUserTicket.matches(REGULAR_FORMAT_INT)) {

                            String flagBuy = "false";

                            if (ticketService.update(Integer.parseInt(idTicket),Integer.parseInt(idUserTicket),flagBuy)){

                                System.out.println("ticket return successfully");
                            }
                            else {
                                System.out.println("impossible to return ticket");
                            }

                        }
                        else {
                            System.out.println("incorrect id user");
                        }
                    }
                    else {
                        System.out.println("incorrect id ticket");
                    }
                    break;
                }
                case "5": {
                    //5.view users ticket
                    userOperation = "Manager view users ticket";
                    logger.writeOperation(userOperation,login);

                    System.out.println("5.view users ticket");

                    Scanner scanTicket = new Scanner(System.in);
                    System.out.println("enter id user");
                    String idUserTicket = scanTicket.nextLine();

                    if (idUserTicket.matches(REGULAR_FORMAT_INT)) {

                            viewTicketUser(Integer.parseInt(idUserTicket));
                    }
                    else {
                        System.out.println("incorrect id user");
                    }
                    break;
                }
                case "6": {
                    //6.exit

                    userOperation = "Date and time exit : " + dateTimeNow;
                    logger.writeOperation(userOperation,login);

                    flagUserAccount = false;
                    break;
                }
                default:{
                    System.out.println("incorrect operation");
                    break;
                }

            }//end switch
        }//end while
    }

    public void singInAdmin(String login, String password){

        //авторизация прошла админ
        //личный кабинет

        int idUser = userService.read(login, password).getId();

        userOperation = "Date and time sing in : " + dateTimeNow;
        logger.writeOperation(userOperation,login);

        boolean flagUserAccount = true;

        while (flagUserAccount) {

            userOperation = "Main menu open";
            logger.writeOperation(userOperation,login);

            System.out.println();
            System.out.println("MENU ADMIN ACCOUNT:");
            System.out.println("1.view films");
            System.out.println("2.create film");
            System.out.println("3.update film");
            System.out.println("4.add ticket in film");
            System.out.println("5.delete film");
            System.out.println("6.view users");
            System.out.println("7.create user");
            System.out.println("8.update user");
            System.out.println("9.delete user");
            System.out.println("10.exit");


            System.out.println();
            System.out.println("enter operation (1-10):");

            Scanner scanMenuUserAcc = new Scanner(System.in);
            String operation = scanMenuUserAcc.nextLine();

            switch (operation) {
                case "1": {
                    //1.view films

                    userOperation = "Admin view films";
                    logger.writeOperation(userOperation,login);

                    System.out.println("1.view films");
                    viewAllFilmUser();
                    break;
                }
                case "2": {
                    //2.create film

                    userOperation = "Admin create film";
                    logger.writeOperation(userOperation,login);

                    System.out.println("2.create film");

                    Scanner scanFilm = new Scanner(System.in);
                    System.out.println("enter name film");
                    String nameFilm = scanFilm.nextLine();
                    System.out.println("enter date film, format dd.mm.yyyy/hh:nn ");
                    String dateFilm = scanFilm.nextLine();

                    if(dateFilm.matches(REGULAR_DATE_TIME)){
                        Film film = new Film(nameFilm,dateFilm);

                        if (filmService.create(film) != null){

                            System.out.println("film create successfully");
                        }
                        else {
                            System.out.println("film exist");
                        }
                    }
                    else {
                        System.out.println("not correct format date and time");
                    }

                    break;
                }
                case "3": {
                    //3.update film
                    userOperation = "Admin update film";
                    logger.writeOperation(userOperation,login);

                    System.out.println("3.update film");

                    Scanner scanFilm = new Scanner(System.in);
                    System.out.println("enter id film to change");
                    String idFilm = scanFilm.nextLine();

                    if (idFilm.matches(REGULAR_FORMAT_INT)){

                        System.out.println("ENTER EDITS:");
                        System.out.println("enter name");
                        String nameFilm = scanFilm.nextLine();
                        System.out.println("enter date, format dd.mm.yyyy/hh:nn ");
                        String dateFilm = scanFilm.nextLine();

                        if(dateFilm.matches(REGULAR_DATE_TIME)){

                            Film filmUpdate = new Film(nameFilm,dateFilm);
                            if (filmService.update(filmUpdate,Integer.parseInt(idFilm))){
                                System.out.println("film update successfully");
                            }
                            else {
                                System.out.println("update impossible");
                            }
                        }
                        else {
                            System.out.println("not correct format date and time");
                        }
                    }
                    else {
                        System.out.println("incorrect id film");
                    }

                    break;
                }
                case "4": {
                    //4.add ticket

                    userOperation = "Admin add ticket";
                    logger.writeOperation(userOperation,login);

                    System.out.println("4.add ticket");

                    Scanner scanTicketAdd = new Scanner(System.in);
                    System.out.println("enter id film");

                    String idFilm = scanTicketAdd.nextLine();
                    if (idFilm.matches(REGULAR_FORMAT_INT)){

                        System.out.println("enter place");
                        String place = scanTicketAdd.nextLine();
                        if (place.matches(REGULAR_FORMAT_INT)){

                            System.out.println("enter price");
                            String price = scanTicketAdd.nextLine();

                            if (price.matches(REGULAR_FORMAT_INT)){

                                String flagBuy = "false";
                                Ticket ticketAdd = new Ticket(Integer.parseInt(idFilm),Integer.parseInt(place),Integer.parseInt(price),flagBuy);

                                if (ticketService.create(ticketAdd) != null){

                                    System.out.println("ticket add successfully");
                                }
                                else {
                                    System.out.println("impossible add ticket");
                                }
                            }
                            else {
                                System.out.println("incorrect price");
                            }
                        }
                        else {
                            System.out.println("incorrect place");
                        }
                    }
                    else {
                        System.out.println("incorrect id film");
                    }
                    break;
                }
                case "5": {
                    //5.delete film
                    userOperation = "Admin delete film";
                    logger.writeOperation(userOperation,login);

                    Scanner scanTicket = new Scanner(System.in);
                    System.out.println("enter id film");
                    String idFilm = scanTicket.nextLine();

                        if (idFilm.matches(REGULAR_FORMAT_INT)){

                            // проверка на наличие билетов с фильмом перед удалением фильма, в service ??????
                            if (ticketService.readTicketInFilm(Integer.parseInt(idFilm)).size() == 0) {

                                if (filmService.delete(Integer.parseInt(idFilm))){


                                    System.out.println("film successfully deleted");
                                }
                                else {
                                    System.out.println("film not exist");
                                }
                            }
                            else {
                                System.out.println("tickets exist with this film");
                            }
                        }
                        else {
                            System.out.println("incorrect id film");
                        }

                    break;
                }
                case "6": {
                    //6.view users
                    userOperation = "Admin view users";
                    logger.writeOperation(userOperation,login);

                    System.out.println("Users:");

                    List<User> userList = userService.readAll();

                    for (int i = 0; i < userList.size(); i++) {
                        System.out.println("id : "+ userList.get(i).getId());
                        System.out.println("login : "+ userList.get(i).getLogin());
                        System.out.println("role : "+ userList.get(i).getLevel());
                        System.out.println();
                    }


                    break;
                }
                case "7": {
                    //7.create user
                    userOperation = "Admin create user";
                    logger.writeOperation(userOperation,login);

                    registrationUser();
                    break;
                }
                case "8": {
                    //8.update user

                    userOperation = "Admin update user";
                    logger.writeOperation(userOperation,login);

                    Scanner scanUserUpdate = new Scanner(System.in);
                    System.out.println("enter id user to change");
                    String idUserUpdate = scanUserUpdate.nextLine();

                    if (idUserUpdate.matches(REGULAR_FORMAT_INT)){

                        System.out.println("ENTER EDITS:");
                        System.out.println("enter login");
                        String loginUpdate = scanUserUpdate.nextLine();
                        System.out.println("enter password");
                        String passwordUpdate = scanUserUpdate.nextLine();

                        if (!loginUpdate.trim().equals("") && !passwordUpdate.trim().equals("")){

                            System.out.println("enter role");
                            String roleUpdate = scanUserUpdate.nextLine();

                            if (roleUpdate.equals("user") || roleUpdate.equals("manager")) {

                                User userUpdate = new User(loginUpdate,passwordUpdate,roleUpdate);
                                if (userService.update(userUpdate,Integer.parseInt(idUserUpdate))){

                                    System.out.println("user update successfully");
                                }
                                else {
                                    System.out.println("user not exists");
                                }
                            }
                            else {
                                System.out.println("incorrect role");
                            }
                        }
                        else {
                            System.out.println("incorrect login/password");
                        }
                    }
                    else {
                        System.out.println("incorrect id user");
                    }


                    break;
                }
                case "9": {
                    //9.delete user
                    userOperation = "Admin delete user";
                    logger.writeOperation(userOperation,login);

                    Scanner scanUser = new Scanner(System.in);
                    System.out.println("enter id user");
                    String idUserDelete = scanUser.nextLine();

                    if (idUserDelete.matches(REGULAR_FORMAT_INT)){

                        //проверка на наличие пользователя в билетах, в service ?????
                        if (ticketService.readTicketInUser(Integer.parseInt(idUserDelete)) != null){
                            if (ticketService.readTicketInUser(Integer.parseInt(idUserDelete)).size() == 0){

                                if(userService.delete(Integer.parseInt(idUserDelete))){

                                    System.out.println("user delete successfully");
                                }
                                else{
                                    System.out.println("user is not exist");
                                }
                            }
                            else {
                                System.out.println("user have tickets");
                            }
                        }
                        else {
                            System.out.println("impossible delete user");
                        }
                    }
                    else{
                        System.out.println("incorrect id user");
                    }

                    break;
                }
                case "10": {
                    //10.exit

                    userOperation = "Date and time exit : " + dateTimeNow;
                    logger.writeOperation(userOperation,login);

                    flagUserAccount = false;
                    break;
                }
                default:{
                    System.out.println("incorrect operation");
                    break;
                }

            }//end switch
        }//end while
    }




    public void viewAllFilmUser(){

        System.out.println("FILMS : ");
        System.out.println();

        List<Film> films = filmService.readAll();

        for (int i = 0; i < films.size(); i++) {
            System.out.println("film id : " + films.get(i).getId());
            System.out.println("film name : " + films.get(i).getName());
            System.out.println("film date : " + films.get(i).getDate_time());
            System.out.println();
        }

            boolean flagViewTicket = true;

            while (flagViewTicket){

                System.out.println();
                System.out.println("MENU VIEW FILMS:");
                System.out.println("1.view tickets");
                System.out.println("2.exit");

                System.out.println("enter operation (1-2) : ");
                Scanner scanFilm = new Scanner(System.in);
                String operation = scanFilm.nextLine();

                switch (operation) {
                    case "1":{
                        //1.view tickets
                        System.out.println("enter id film to view tickets");
                        Scanner scanTicket = new Scanner(System.in);
                        String idFilm = scanTicket.nextLine();

                        if (idFilm.matches(REGULAR_FORMAT_INT)){
                            //NumberFormatException
                            viewTicketFilm(Integer.parseInt(idFilm));
                        }
                        else {
                            System.out.println("enter correct id film");
                        }
                        break;
                    }
                    case "2":{
                        //2.exit
                        flagViewTicket = false;
                        break;
                    }
                    default:{
                        System.out.println("incorrect operation");
                        break;
                    }

                }//end switch

            }//end while
    }
    public void viewTicketUser(int id){

        if (ticketService.readTicketInUser(id) != null) {

            List<Ticket> tickets = ticketService.readTicketInUser(id);

            if (tickets.size() != 0) {

                System.out.println("MY TICKETS: ");
                System.out.println();

                for (int i = 0; i < tickets.size(); i++) {

                    System.out.println("id ticket : " + tickets.get(i).getId());
                    System.out.println("film name : " + filmService.read(tickets.get(i).getFilm()).getName());
                    System.out.println("place : " + tickets.get(i).getPlace());
                    System.out.println("price : " + tickets.get(i).getPrice());
                    System.out.println();

                }
            } else {
                System.out.println("you have no tickets :(");
            }
        }
        else {
            System.out.println("user not exist");
        }
    }

    public void viewTicketFilm(int id){

        if (ticketService.readTicketInFilm(id) != null) {

            System.out.println();
            System.out.println("tickets:");
            System.out.println();

            List<Ticket> tickets = ticketService.readTicketInFilm(id);

            if (tickets.size() != 0) {
                for (int i = 0; i < tickets.size(); i++) {
                    System.out.println("ticket id :" + tickets.get(i).getId());
                    System.out.println("ticket place :" + tickets.get(i).getPlace());
                    System.out.println("ticket price :" + tickets.get(i).getPrice());
                    System.out.println("ticket buy :" + tickets.get(i).getBuy());
                    System.out.println();
                }
            } else {
                System.out.println("tickets not found, add tickets :(");
            }
        }
        else {
            System.out.println("film not exist");
        }
    }
    public void viewTicketToBuy(int id){

        if (ticketService.readTicketToBuy(id) != null){

            System.out.println();
            System.out.println("tickets to buy:");
            System.out.println();

            List<Ticket> tickets = ticketService.readTicketToBuy(id);

            if (tickets.size() != 0) {
                for (int i = 0; i < tickets.size(); i++) {

                    System.out.println("ticket id :" + tickets.get(i).getId());
                    System.out.println("ticket place :" + tickets.get(i).getPlace());
                    System.out.println("ticket price :" + tickets.get(i).getPrice());
                    System.out.println();

                }
            }
            else {
                System.out.println("have no tickets to buy");
            }
        }
        else {
            System.out.println("film not exist");
        }

    }
}
