package P5;

public class Estudiante {

	private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String dni;
    private String estudiosPrevios;
    
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidos, String fechaNacimiento, String dni, String estudiosPrevios) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.estudiosPrevios = estudiosPrevios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstudiosPrevios() {
		return estudiosPrevios;
	}

	public void setEstudiosPrevios(String estudiosPrevios) {
		this.estudiosPrevios = estudiosPrevios;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", dni=" + dni + ", estudiosPrevios=" + estudiosPrevios + "]";
	}

}
