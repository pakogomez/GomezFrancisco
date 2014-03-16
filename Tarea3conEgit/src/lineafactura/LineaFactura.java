package lineafactura;
/**
 * Clase para calcular factura.
 * version 1.0, 16/03/2014
 * @author Paco Gómez
 */
public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 * Método Constructor
	 * @param idProducto primer parametro de entrada, de tipo string designa el codigo del producto.
	 * @param nombreProducto segundo parametro de entrada, este string designa el nombre del producto.
	 * @param precio tercer parametro de entrada, de tipo float designa el valor inicial del producto.
	 * @param cantidad cuarto parametro de entrada, de tipo float designa el numero de productos comprados.
	 * @param descuento quinto parametro de entrada, de tipo float designa el descuento que se hace del precio inicial.
	 */
	
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
