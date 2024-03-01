package dtos;

import java.sql.Date;
/**
 * Esta clase contiene los Atributos , Contructores, y Getters y Setters de la clase PedidoDto
 *@author ilp-01032024
 */
public class PedidoDto {

	///Atributos
	String nombreProducto="aaaa";
	int cantidadProducto=1111;
	Date fechaDeEntrega;
	
	
	///Constructores
	public PedidoDto() {
		super();
	}
	public PedidoDto(String nombreProducto, int cantidadProducto, Date fechaDeEntrega) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaDeEntrega = fechaDeEntrega;
	}
	
	
	///Getter y Setters
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}


}
