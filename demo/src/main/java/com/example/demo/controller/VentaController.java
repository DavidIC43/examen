package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Venta;
import com.example.demo.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
    @Autowired
	VentaService ventaService;
    
    @GetMapping()
    public ArrayList<Venta> obtenerVentas(){
    	return ventaService.obtenerVentadia();
    }
    
    @PostMapping()
    public Venta guardarVenta(@RequestBody Venta venta) {
    	return this.ventaService.guardarVenta(venta);
    }
}
