package app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="contenidos")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected int contenido_id;
	
	@OneToMany
	@JoinColumn(name = "contenido_id")
	private List<Gestion> gestion;
	
	@Column(name = "nombre")
	protected String name;

	@Column(name = "fecha_subida")
	@Temporal(TemporalType.DATE)
	protected Date uploadDate;

	@Column(name = "fecha_modificacion")
	@Temporal(TemporalType.DATE)
	protected Date modifiedDate;

	@Column(name = "ruta_publica")
	protected String path;

	@Column(name = "extension")
	protected String extension;

	/**
	 * 
	 */
	public Contenido() {
	}

	/**
	 * @param contenido_id
	 * @param gestion
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Contenido(int contenido_id, List<Gestion> gestion, String name, Date uploadDate, Date modifiedDate,
			String path, String extension) {
		this.contenido_id = contenido_id;
		this.gestion = gestion;
		this.name = name;
		this.uploadDate = uploadDate;
		this.modifiedDate = modifiedDate;
		this.path = path;
		this.extension = extension;
	}

	/**
	 * @return the contenido_id
	 */
	public int getContenido_id() {
		return contenido_id;
	}

	/**
	 * @param contenido_id the contenido_id to set
	 */
	public void setContenido_id(int contenido_id) {
		this.contenido_id = contenido_id;
	}

	/**
	 * @return the gestion
	 */
	public List<Gestion> getGestion() {
		return gestion;
	}

	/**
	 * @param gestion the gestion to set
	 */
	public void setGestion(List<Gestion> gestion) {
		this.gestion = gestion;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the uploadDate
	 */
	public Date getUploadDate() {
		return uploadDate;
	}

	/**
	 * @param uploadDate the uploadDate to set
	 */
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "Contenido [contenido_id=" + contenido_id + ", gestion=" + gestion + ", name=" + name + ", uploadDate="
				+ uploadDate + ", modifiedDate=" + modifiedDate + ", path=" + path + ", extension=" + extension + "]";
	}

}
