package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

/**
 * Esta es la implementacion la cual lleva los metodos de la funcionalidad de la app
 * @param listaVentas
 * @author ilp-01032024
 */
public class OperativaImplementacion implements OperativaInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public long idAutogenerado(List<VentaDto> listaVentas) {
		
		long id=listaVentas.size();
		
		if(listaVentas.size()==0) {
			id=1;
		}else {
			
			for(int i=1; i<listaVentas.size(); i++){
				id=listaVentas.size()-1;
						}		  
	}
		return id;

	}

	@Override
	public void AniadirVenta(List<VentaDto> listaVentas,id) {
		
		VentaDto venta = new VentaDto();
		
		System.out.println("Escribe el importe de la venta ");
		venta.setImporte(sc.nextFloat());
		
		venta.setIdVenta()=id;
		
	
	}

	


	

	@Override
	public void CalculoVentasDiario(List<VentaDto> listaVentas) {
		
		
	
	
	System.out.println("Escriba la fecha que de la venta en formato (dd-MM-yyyy)");
		String fechausu=sc.next();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		LocalDateTime fecha1  =LocalDateTime.parse(fechausu, formato); 	
		
	}
	}