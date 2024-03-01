package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Program {

	/**
	 * Esta es la clase principal de la app , por la cuual se lanzara 
	 * @author ilp-01032024
	 * @param args
	 */
	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperativaImplementacion();
		
		List<VentaDto> listaVentas =new ArrayList();
		
		boolean cerrarMenu = false;
		boolean cerrarMenuEmpleado = false;
		boolean cerrarMenuGerencia = false;
		int opcion;
		int opcionEmpleado;
		int opcionGerencia;

		while (!cerrarMenu) {
			opcion = mi.mostrarMenuYSeleccion();

			switch (opcion) {
			case 0:
				cerrarMenu = true;
				System.out.println("------------------------------------");
				System.out.println("Cerrar Menu");
				break;
			case 1:

				System.out.println("------------------------------------");
				System.out.println("Accedio a Menu Empleado");
				opcionEmpleado = mi.mostrarMenuEmpleados();
				switch (opcionEmpleado) {
				case 0:
					
					System.out.println("#########################################################");
					System.out.println("Cerrar Menu");
					break;
				case 1:
					
					System.out.println("#########################################################");
					System.out.println("Accedio a añadir venta");
					break;
				case 2:
				
					System.out.println("#########################################################");
					System.out.println("Accedio a calculo de ventas diario");
					break;

				}

				break;
			case 2:

				System.out.println("------------------------------------");
				System.out.println("Accedio a Menu Gestor");
				
				while(!cerrarMenuGerencia) {
					opcionGerencia=mi.mostrarMenuGerencia();
					switch(opcionGerencia) {
					case 0:
						cerrarMenuGerencia = true;
						System.out.println("#########################################################");
						System.out.println("Cerrar Menu");
						break;
					case 1:
						
						System.out.println("#########################################################");
						System.out.println("Accedio a mostrar ventas del dia");
						break;
					case 2:
					
						System.out.println("#########################################################");
						System.out.println("Accedio a crear pedido");
						break;
					
					}
					
				}
				break;
			default:
				System.out.println("------------------------------------");
				System.out.println("Esta opcion no existe");
				break;
			}

		}

	}

}
