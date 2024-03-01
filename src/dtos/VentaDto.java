package dtos;

import java.time.LocalDateTime;

/**
 * Esta clase contiene los contructores , atributos , getters y setters de VentaDto
 * @author ilp-01032024
 */
public class VentaDto {
	///Atributos
	float importe=1111;
	LocalDateTime fechaHoy =LocalDateTime.now();
	long idVenta;
	
	
	
	
	///Constructores
	public VentaDto() {
		super();
	}
	public VentaDto(float importe, LocalDateTime fechaHoy, long idVenta) {
		super();
		this.importe = importe;
		this.fechaHoy = fechaHoy;
		this.idVenta = idVenta;
	}
	
	
	///Getters y Setters
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public LocalDateTime getFechaHoy() {
		return fechaHoy;
	}
	public void setFechaHoy(LocalDateTime fechaHoy) {
		this.fechaHoy = fechaHoy;
	}
	public float getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	
	
	
	
	
}
