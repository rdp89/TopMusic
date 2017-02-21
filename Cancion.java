package topMusic;
/**
 * 
 * @author Rafael Delgado Peña
 * @version 1.0
 *
 */
public class Cancion {
	/**
	 * Titulo de la cancion
	 */
	String titulo;
	/**
	 * Artista de la cancion
	 */
	String artista;
	/**
	 * Año de grabacion
	 */
	String anoGrabacion;

	/**
	 * Constructor de la cancion
	 * 
	 * @param titulo
	 * @param artista
	 * @param anoGrabacion
	 */
	public Cancion(String titulo, String artista, String anoGrabacion) {
		setTitulo(titulo);
		setArtista(artista);
		setAnoGrabacion(anoGrabacion);
	}

	/**
	 * Constructor solo con un titulo
	 * 
	 * @param titulo
	 */
	public Cancion(String titulo) {
		setTitulo(titulo);
	}

	/**
	 * Obtiene el titulo de la cancion
	 * 
	 * @return
	 */
	private String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el titulo de la cancion
	 * 
	 * @param titulo
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Obtiene el artista
	 * 
	 * @return
	 */
	private String getArtista() {
		return artista;
	}

	/**
	 * Modifica el valor de artista
	 * 
	 * @param artista
	 */
	private void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * Obtiene el año de grabacion
	 * 
	 * @return
	 */
	private String getAnoGrabacion() {
		return anoGrabacion;
	}

	/**
	 * Modifica el valor de año de grabacion
	 * 
	 * @param anoGrabacion
	 */
	private void setAnoGrabacion(String anoGrabacion) {
		this.anoGrabacion = anoGrabacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + getTitulo() + ", por " + getArtista() + " (" + getAnoGrabacion() + ")";
	}
}