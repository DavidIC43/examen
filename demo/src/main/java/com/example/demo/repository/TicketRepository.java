package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ticket;
@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer>{
	
	

}
