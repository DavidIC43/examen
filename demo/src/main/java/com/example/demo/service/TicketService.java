package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepo;
	
	public ArrayList<Ticket> ObtenerTickets(){
		return (ArrayList<Ticket>) ticketRepo.findAll();
	}
	
	public Ticket guardarTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}
	
	

}
