package arraylist;
import java.io.*;
public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList archivos=new ArrayList(5);
		
		archivos.add("Nes");
		archivos.add("Alba");
		archivos.add("Vin");
		archivos.add("Enc");
		archivos.add(new File("bolaroja.gif"));		
		
		String nombrePersona= (String) archivos.get(0);
		
	;
		
		
		
		
		
		System.out.println(nombrePersona);
		
		
		
	}

}
