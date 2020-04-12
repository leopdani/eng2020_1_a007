package ex_8_2;

public class AgregadorTopico {
	
	private String texto;
	private int dia;
	private int mes;
	private String topico;
	
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
	public String(Noticia){
		System.out.println("Imprimindo Noticias: " +getNoticia+ "Dia" +getDia+ "Mes" +getMes);
	}
}