package arraylist;

public class ArrayList {

	public ArrayList(int z) {
		
		datosElemento = new Object[z];
		
	}
	
	public Object get (int i) {
		
		return datosElemento;
	}
	
	
	public void add(Object o) {
		
		datosElemento[i]=0;
		
		i++;
	}
	
	
	
	
	private Object[] datosElemento;
	
	private int i=0;
}
