package service;

import dao.TicketRepository;
import dao.TicketRepositoryImpl;
import model.Ticket;

import java.util.List;

public class TicketService {
    private TicketRepositoryImpl ticketRepository;
    private FilmService filmService;
    private UserService userService;

    public TicketService(TicketRepositoryImpl ticketRepository,FilmService filmService,UserService userService) {
        this.ticketRepository = ticketRepository;
        this.filmService = filmService;
        this.userService = userService;
    }
    public TicketService(TicketRepositoryImpl ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket create(Ticket ticket) {

        if (readTicketPlaceFilm(ticket.getFilm(),ticket.getPlace()) == null){

            if (filmService.read(ticket.getFilm()) != null){
                return ticketRepository.create(ticket);
            }
            else {
                System.out.println("film not exist");
                return null;
            }
        }
        else {
            System.out.println("ticket exist");
            return null;
        }
    }

    public Ticket read(int id) {

        return ticketRepository.read(id);
    }

    public Ticket readTicketPlaceFilm(int film, int place){

        return ticketRepository.readTicketPlaceFilm(film,place);
    }

    public boolean update(int idTicket, int idUser, String flag ) {

        Ticket ticketUpdate = read(idTicket);

        if (ticketUpdate != null ) {
            if (userService.readId(idUser) != null) {

                switch (flag) {
                    case "true": {
                        //buy ticket
                        if (ticketUpdate.getBuy().equals(flag)) {
                            System.out.println(" ticket already buy");
                            return false;
                        } else {
                            ticketRepository.update(idTicket, idUser, flag);
                            return true;
                        }
                    }

                    case "false": {
                        //return ticket
                        if (!ticketUpdate.getUser().equals(idUser)) {
                            System.out.println(" ticket not your");
                            return false;
                        } else {
                            ticketRepository.update(idTicket, 0, flag);
                            return true;
                        }
                    }
                    default: {
                        return false;
                    }
                }//end switch

            }
            else {
                System.out.println("user not exist");
                return false;
            }
        }else {
            System.out.println("ticket not exist");
            return false;
        }
    }


    public boolean delete(int id) {
        return false;
    }


    public List<Ticket> readAll() {
        return ticketRepository.readAll();
    }

    public List<Ticket> readTicketInUser(int idUser) {

        if (userService.readId(idUser) != null){
            return ticketRepository.readTicketInUser(idUser);
        }
        else {
            return null;
        }

    }

    public List<Ticket> readTicketInFilm(int idFilm){

        if (filmService.read(idFilm) != null){
            return ticketRepository.readTicketInFilm(idFilm);
        }
        else {
            return null;
        }

    }
    public List<Ticket> readTicketToBuy(int idFilm){

        if (filmService.read(idFilm) != null){
            return ticketRepository.readTicketToBuy(idFilm);
        }
        else {
            return null;
        }

    }
}
