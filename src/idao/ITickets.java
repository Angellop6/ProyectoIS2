/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Tickets;
import java.sql.SQLException;

/**
 *
 * @author luisf
 */
public interface ITickets {
    
    void createTicket(Tickets a);
    Tickets readTicket(String id);
    ArrayList<Tickets> readTickets();
    void updateTicket(Tickets a, String id);
    void deleteTickets(String id);
    
}
