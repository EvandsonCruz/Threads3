import java.util.Random;


public class Metodos extends Thread{
		
	Random random = new Random();
	
	private String nome;
	private int pulo;
	private int somaPulo;
	private static int colocacao;
	
	public Metodos(String nome) {
		this.nome = nome;
		this.pulo = pulo;
		this.somaPulo = somaPulo;
		start();
	}
	
	public void run() {
		
		while(somaPulo<100) {
		pulo = random.nextInt(10);
		somaPulo = somaPulo + pulo;
		System.out.println(nome + " Pulo: " + pulo + " metro(s)" + " Distancia percorrida: " + somaPulo + " metro(s)");
		}
		colocacao++;
		System.out.println(nome + " chegou em "+colocacao+"° colocado");
	}
}
