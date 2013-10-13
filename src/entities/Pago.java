package entities;

import java.util.Date;

public class Pago {

	private Date	fecha;
	private boolean	pagado;
	private Usuario	usuario;

	public Pago()
	{

	}

	public Pago(Date fecha, boolean pagado, Usuario usuario)
	{
		this.fecha = fecha;
		this.pagado = pagado;
		this.usuario = usuario;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public boolean isPagado()
	{
		return pagado;
	}

	public void setPagado(boolean pagado)
	{
		this.pagado = pagado;
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