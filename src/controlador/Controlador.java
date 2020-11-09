package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

import peso.Arroba;
import peso.IUnidade;
import peso.Kilograma;
import peso.Medida;

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
	
	public <T> T lerOpcao(String msg, T[] opcoes) {
		int op = 0;
		System.out.println(msg);
		listarOpcoes(opcoes);
		op = ctrl.lerInt("Escolha uma opcao: ", new ValidadorOpcao(opcoes.length));
		return opcoes[op-1];
	}
	
	public Integer[] lerIntArr(String msg, Object[] opcoes) {
		Integer[] nums = new Integer[]{};
		System.out.println(msg);
		listarOpcoes(opcoes);
		Validador validador = new ValidadorOpcoes(opcoes.length);
		do {
			System.out.print("Escolha as opcoes(separado por virgula): ");
			String entrada = scan.nextLine();
			try {
				nums = Stream.of(entrada.split(","))
						.map( (String s) -> Integer.parseInt(s) - 1)
						.toArray(Integer[]::new);
				
			} catch(Exception err) {
				System.out.println("Por favor insira suas escolhas separadas por virgula");
				continue;
			}
		} while(!validador.validar(nums));
		return nums;
	}
	
	static double getNumbers(String s) {

	    String[] n = s.split("");
	    StringBuffer f = new StringBuffer();

	    for (int i = 0; i < n.length; i++) {
	        if((n[i].matches("[0-9\\.]+"))) {
	            f.append(n[i]);
	        }else {
	            return Double.parseDouble(f.toString()); 
	        }   
	    }
	    return -1;
	 }
	
	public Medida lerMedida(String msg, Validador validador) {
		Medida m = new Medida();
		double x = -1;
		IUnidade unidade = new Arroba();
		do {
			try {
				System.out.print(msg);
				String entrada = scan.nextLine().trim().toLowerCase();
				if(entrada.endsWith("kg")) {
					unidade = new Kilograma();
				} else if(entrada.endsWith("@") || entrada.matches("\\d+\\.?\\d+")) {
					unidade = new Arroba();
				} else  {
					throw new Exception();
				}
				x = unidade.converterParaArroba(getNumbers(entrada));
			} catch(Exception err) {
				System.out.println("Por favor entre com uma medida valida");
			}
		}while(!validador.validar(x));
		m.setQuantidade(x);
		return m;
	}
	
}
