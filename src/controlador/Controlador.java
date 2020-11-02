package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

public class Controlador {
	static Controlador ctrl = null;
	
	private final Scanner scan;
	private final SimpleDateFormat DATEFORMAT;
	
	private Controlador() {
		super();
		this.scan = new Scanner(System.in);
		this.DATEFORMAT = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public static Controlador obterControlador() {
		if(ctrl == null) {
			ctrl = new Controlador();
		}
		return ctrl;
	}
	
	public int lerInt(String msg, Validador validador) {
		int x = -1;
		do {
			System.out.print(msg);
			String entrada = scan.nextLine();
			try {
				x = Integer.parseInt(entrada);
			} catch (Exception e) {
				System.out.println("Por favor insira um numero");
				continue;
			}
		} while(!validador.validar(x));
		return x;
	}
	
	public String lerString(String msg, Validador validador) {
		String entrada = "";
		do {
			System.out.print(msg);
			entrada = scan.nextLine().trim();
		}while(!validador.validar(entrada));
		return entrada.replaceAll(" +", " ");
	}
	
	public double lerDouble(String msg, Validador validador) {
		double x = -1;
		do {
			System.out.print(msg);
			String entrada = scan.nextLine().trim();
			try {
				x = Double.parseDouble(entrada);
			} catch(Exception e) {
				System.out.println("Por favor insira um numero");
				continue;
			}
		}while(!validador.validar(x));
		
		return x;
	}
	
	public Date lerData(String msg) {
		Date data = null;
		do {
			System.out.print(msg);
			String entrada = scan.nextLine();
			try {
				data = DATEFORMAT.parse(entrada);
			} catch (Exception e) {
				System.out.println("Por favor insira uma data");
				data = null;
			}
		}while(data == null);
		return data;
	}
	
	private void listarOpcoes(Object[] opcoes) {
		int i = 0;
		for(Object opcao : opcoes) {
			System.out.println("\t" +  ++i + ". " + opcao);
		}
	}
	
	public int lerOpcao(String msg, Object[] opcoes) {
		int op = 0;
		System.out.println(msg);
		listarOpcoes(opcoes);
		op = ctrl.lerInt("Escolha uma opcao: ", new ValidadorOpcao(opcoes.length));
		return op - 1;
	}
	
	public Integer[] lerIntArr(String msg, Object[] opcoes) {
		Integer[] nums = null;
		System.out.println(msg);
		listarOpcoes(opcoes);
		Validador validador = new ValidadorOpcoes(opcoes.length);
		do {
			System.out.print("Escolha as opcoes(separado por virgula): ");
			String entrada = scan.nextLine();
			try {
				nums = Stream.of(entrada.split(",")).map( (String s) -> Integer.parseInt(s) - 1).toArray(Integer[]::new);
			} catch(Exception err) {
				System.out.println("Por favor insira suas escolhas separadas por virgula");
				continue;
			}
			for(int n : nums ) {
				System.out.println(n);
			}
		} while(!validador.validar(nums));
		return nums;
	}
	
}
