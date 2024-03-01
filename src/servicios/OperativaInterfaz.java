package servicios;

import java.util.List;

import dtos.VentaDto;

/**
 * Esta es la interfaz la cual contiene los metodos de la fucionalidad de la app
 * @author ilp-01032024
 */
public interface OperativaInterfaz {
	
	/**
	 * Este metodo genera una id automatica mediante la lista de ventas 
	 * @param listaVentas
	 * @return
	 * @author ilp-01032024
	 */
	public long idAutogenerado(List<VentaDto> listaVentas);
	
	/**
	 * Este metodo sirve para aniadir una venta en la funcionalidad
	 * @param listaVentas
	 * @param id
	 * @author ilp-01032024
	 */
	public void AniadirVenta(List<VentaDto> listaVentas,idAutogenerado id);
	
	public void CalculoVentasDiario(List<VentaDto> listaVentas);
	
	

}
