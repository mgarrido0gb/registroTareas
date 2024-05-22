package models;
import java.util.Date;

public class Tarea extends Categoria {
	public int id;
	

	public String texto;
	public boolean completada;
	public Date fecha;
	public int categoria_id;
	
	public Tarea(int id, String texto, boolean completada, Date fecha,int categoria_id ) {
		super(id, texto);
		this.id = id;
		this.texto = texto;
		this.completada = completada;
		this.fecha = fecha;
		this.categoria_id = categoria_id;


	}

	
	@Override
	public String toString() {
		return "Tarea :  id=" + id +"\n"+
				"texto:  texto=" + texto +"\n"+
				"completada: completada=" + completada + " \n"+
				"fecha: fecha=" + fecha + "\n"; 
				
	}
	
	
	

	
	
}
