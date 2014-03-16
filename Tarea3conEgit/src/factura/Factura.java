package factura;


import java.util.Arrays;

import lineafactura.LineaFactura;
/*
 * Esta clase genera facturas.
 * Detalla los productos comprados por cada cliente
 * @see LineaFactura.java
 */

public class Factura {
	
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/*
	 * Constructor
	 * A traves de este metodo se asigna una linea de productos comprados a una persona con un codigo y nombre designados.
	 * @param idCliente primer parámetro de entrada, es de tipo string y designa el numero de codigo asignado a un cliente.
	 * @param nombreCliente segundo parámetro de entrada, es de tipo string y designa el nombre del cliente.
	 * @param lineas tercer primer parámetro de entrada, es un array  y designa los diversas productos comprados por un cliente determinado.
	 */
	 
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada linea	 
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}


	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
