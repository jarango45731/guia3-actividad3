package perros;

public class Perro {
	private String nombre;
	private String raza;
	private String localidad;
	private String cedulaPropietario;
	private String nombrePropietario;
	private String telefonoContacto;
	private String diaAsistencia;

	public Perro(String nombre, String raza, String localidad, String cedulaPropietario, String nombrePropietario,
			String telefonoContacto, String diaAsistencia) {
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.cedulaPropietario = cedulaPropietario;
		this.nombrePropietario = nombrePropietario;
		this.telefonoContacto = telefonoContacto;
		this.diaAsistencia = diaAsistencia;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + this.getNombre());
		sb.append(", Raza: " + this.getRaza());
		sb.append(", Localidad: " + this.getLocalidad());
		sb.append(", Cedula Propietario: " + this.getCedulaPropietario());
		sb.append(", Nombre Propietario: " + this.getNombrePropietario());
		sb.append(", Telefono de Contacto: " + this.getTelefonoContacto());
		sb.append(", Dia de asistencia: " + this.getDiaAsistencia());
		return sb.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getDiaAsistencia() {
		return diaAsistencia;
	}

	public void setDiaAsistencia(String diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
}
