package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[]= {"Nes", "Alba", "Maria", "Antonio"};
		
	
		System.out.println(MisMatrices.getMenor(nombres));
		

		/*Empleado paco= new Empleado("Paco",45,2500);
		Empleado ana= new Empleado("Ana",25,3500);
		Empleado maria= new Empleado("Maria",55,2600);
		
		Empleado misEmpleados[]= {paco,ana,maria};
		
		System.out.println(MisMatrices.getMenor(misEmpleados));*/
		
		GregorianCalendar fechas []= { new GregorianCalendar(2019,07,12),
				new GregorianCalendar(2018,07,12),
				new GregorianCalendar(2017,07,12)};
		
		System.out.println(fechas);
}
}


class MisMatrices{
	
	public static <T extends Comparable<T>> T getMenor(T[]a) {
		
		if(a==null || a.length==0) {
			
			return null;
			
		}
		
		T elementoMenor=a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if(elementoMenor.compareTo(a[i])>0) {
				
				elementoMenor=a[i];
			}
			
		}
		return elementoMenor;
	}
	
}