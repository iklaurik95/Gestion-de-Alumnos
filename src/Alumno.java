
public class Alumno {
	
	private int numero;
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Alumno(int numero, String nombre, String apellido, int edad) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}