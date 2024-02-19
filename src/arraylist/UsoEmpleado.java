package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import arraylist.Empleado;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Empleado listaEmpleados[]= new Empleado[3];
		
		listaEmpleados[0]= new Empleado("Ana", 45,2500);
		listaEmpleados[1]= new Empleado("antonio", 55,3500);
		listaEmpleados[2]= new Empleado("Maria", 70,4500);
		listaEmpleados[3]= new Empleado("Sed", 45,2500);*/
		
		ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
		
		//listaEmpleados.ensureCapacity(15);
		
		
		
		listaEmpleados.add(new Empleado("Ana", 45,2500));
		listaEmpleados.add(new Empleado("Antonio", 55,3500));
		listaEmpleados.add(new Empleado("Maria", 70,4500));
		listaEmpleados.add(new Empleado("Sed", 45,2500));
		listaEmpleados.add(new Empleado("Buchito", 45,2500));
		listaEmpleados.add(new Empleado("Guame", 45,2500));
		listaEmpleados.add(new Empleado("Antonio", 55,3500));
		listaEmpleados.add(new Empleado("Maria", 70,4500));
		listaEmpleados.add(new Empleado("Sed", 45,2500));
		listaEmpleados.add(new Empleado("Buchito", 45,2500));
		listaEmpleados.add(new Empleado("Ana", 45,2500));
		listaEmpleados.add(new Empleado("Antonio", 55,3500));
		listaEmpleados.add(new Empleado("Maria", 70,4500));
		listaEmpleados.add(new Empleado("Pedrin", 45,2500));
		
		
		
		//listaEmpleados.trimToSize();//echar un vistazo en la api
		//listaEmpleados.add(new Empleado("Olga", 45,2500));
		
		listaEmpleados.set(1,new Empleado("Olga", 45,2500));
		
		System.out.println(listaEmpleados.get(5).damedatos());
		
		System.out.println(listaEmpleados.size());
		
		for (Empleado e : listaEmpleados) {
			
			System.out.println(e.damedatos());
		}
		
	/*	Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
	
		while (mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().damedatos());
		}
		
		/*	for (int i = 0; i < listaEmpleados.size(); i++) {
			
			Empleado e=listaEmpleados.get(i);
			
			System.out.println(e.damedatos());
		}*/
		
		
		
	}

}
class Empleado{
	
	

	

	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
public String damedatos() {
	
	return "El empleado se llama " + nombre+ " Tiene "+ edad+ " años"+ "Y un salario de " + salario+ "$";
		
		
	}
	
	private String nombre;
	private int edad;
	private double salario;
}