package entities;

import java.util.Date;

public class Reproduccion {

	private Cancion	cancion;
	private Date	fecha;
	private Usuario	usuario;

	public Reproduccion()
	{

	}

	public Reproduccion(Cancion cancion, Date fecha, Usuario usuario)
	{
		this.cancion = cancion;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public Cancion getCancion()
	{
		return cancion;
	}

	public void setCancion(Cancion cancion)
	{
		this.cancion = cancion;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
}