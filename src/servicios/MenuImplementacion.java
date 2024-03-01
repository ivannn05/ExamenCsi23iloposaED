package servicios;

import java.util.Scanner;

/**
 * Esta es la implementacion la cual lleva la logica de los metodos que llevan los menus 
 * @author ilp-01032024
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		int opcion;
		
		System.out.println("Seleccione una opcion");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Modo Empleado");
		System.out.println("2.Modo Gerencia");
		opcion=sc.nextInt();
		
		return opcion;
	}
	@Override
	public int mostrarMenuEmpleados() {
int opcion;
		
		System.out.println("Seleccione una opcion del menu empleado");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Añadir Venta");
		System.out.println("2.Calcalo Total De Ventas Diario");
		opcion=sc.nextInt();
		
		return opcion;
	}
	@Override
	public int mostrarMenuGerencia() {
int opcion;
		
		System.out.println("Seleccione una opcion del menu gerencia");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Mostrar ventas del día");
		System.out.println("2.Crear Pedido");
		opcion=sc.nextInt();
		
		return opcion;
	}
	
	

}
