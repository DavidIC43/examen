package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Venta;
import com.example.demo.repository.VentaRepository;

@Service
public class VentaService {
	@Autowired
	VentaRepository ventaRepo;
	
	public ArrayList<Venta> obtenerVentadia(){
		return (ArrayList<Venta>) ventaRepo.findAll();
	}
	
	public Venta guardarVenta(Venta venta) {
		return ventaRepo.save(venta);
	}

}
