package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticket;
import com.example.demo.model.Venta;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	@Autowired
	TicketService ticketservice;
	
	@GetMapping()
	public ArrayList<Ticket> obtenerTickets(){
		return ticketservice.ObtenerTickets();
	}
	@PostMapping()
    public Ticket guardarTicket(@RequestBody Ticket ticket) {
    	return this.ticketservice.guardarTicket(ticket);
    }
}
