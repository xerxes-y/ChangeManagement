package manager.action;

import model.Ticket;

public interface ManagerService {
     String login(String username,String password);
     String createTicket(Ticket ticket);
     void closeTicket(Ticket ticketId);
     void cancelTicket(Ticket ticketId);
     void logout(String username);


}
