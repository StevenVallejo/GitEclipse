
public class Alumno {
	private String nombre,apellido,dni;
	
	Alumno (String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " Apellido: " + apellido + " dni: " + dni;
	}
	
}
