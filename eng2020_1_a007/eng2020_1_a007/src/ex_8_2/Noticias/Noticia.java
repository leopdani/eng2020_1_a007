package ex_8_2.Noticias;

public class Noticia {
	private String texto;
	private int dia;
	private int mes;
	private String topico;
	
	public Noticia() {
		
	}	
	
	public Noticia(String texto, int dia, int mes, String topico) {
		super();
		this.texto = texto;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}

	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (topico == null) {
			if (other.topico != null)
				return false;
		} else if (!topico.equals(other.topico))
			return false;
		return true;
	}
	
	
	
}