import dao.FilmRepositoryImpl;
import dao.TicketRepositoryImpl;
import dao.UserRepositoryImpl;
import reader.Logger;
import service.FilmService;
import service.TicketService;
import service.UserService;
import view.View;

public class Main {
    public static void main(String[] args){

        String pathDirectoryLog = "C://Users//nadezhda//Desktop//filesforjava//log//";
        Logger logger = new Logger(pathDirectoryLog);

        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        UserService userService = new UserService(userRepository);

        FilmRepositoryImpl filmRepository = new FilmRepositoryImpl();
        FilmService filmService = new FilmService(filmRepository);


        TicketRepositoryImpl ticketRepository = new TicketRepositoryImpl();
        TicketService ticketService = new TicketService(ticketRepository,filmService,userService);


        View view = new View(userService,filmService,ticketService,logger);
        view.Start();


    }
}
