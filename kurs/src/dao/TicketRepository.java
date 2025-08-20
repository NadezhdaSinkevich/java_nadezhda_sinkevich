package dao;

import model.Ticket;

import java.util.List;

public interface TicketRepository {
    Ticket create (Ticket ticket);
    Ticket read(int id);
    boolean update(int idTicket, int idUser, String flag);
    boolean delete(int id);
    List<Ticket> readAll();
}
