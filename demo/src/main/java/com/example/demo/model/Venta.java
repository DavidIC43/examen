package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "venta")
public class Venta {
@Id
@GeneratedValue
@Column(unique = true, nullable = false)
private int idVenta;
private double montoVenta;
private String DetalleVenta;
public String getDetalleVenta() {
	return DetalleVenta;
}
public void setDetalleVenta(String detalleVenta) {
	DetalleVenta = detalleVenta;
}
public int getIdVenta() {
	return idVenta;
}
public void setIdVenta(int idVenta) {
	this.idVenta = idVenta;
}
public double getMontoVenta() {
	return montoVenta;
}
public void setMontoVenta(double montoVenta) {
	this.montoVenta = montoVenta;
}
@Override
public String toString() {
	return "Venta [idVenta=" + idVenta + ", montoVenta=" + montoVenta + ", DetalleVenta=" + DetalleVenta
			+ ", getDetalleVenta()=" + getDetalleVenta() + ", getIdVenta()=" + getIdVenta() + ", getMontoVenta()="
			+ getMontoVenta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
