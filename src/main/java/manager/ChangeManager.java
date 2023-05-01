package manager;

import manager.action.ManagerService;
import manager.action.NotificationService;
import manager.action.TicketService;
import model.Notification;
import model.Ticket;

public class ChangeManager implements ManagerService, TicketService, NotificationService {
    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String createTicket(Ticket ticket) {
        return null;
    }

    @Override
    public void closeTicket(Ticket ticketId) {

    }

    @Override
    public void cancelTicket(Ticket ticketId) {

    }

    @Override
    public void logout(String username) {

    }

    @Override
    public String ticketStatus(Ticket ticket) {
        return null;
    }

    @Override
    public String send(Notification notification) {
        return null;
    }
}
