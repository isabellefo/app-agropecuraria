package relatorio;

import java.text.DecimalFormat;

import animal.ColecaoAnimal;
import peso.IUnidade;

public class Relatorio {
	private final ColecaoAnimal genesis = ColecaoAnimal.obterGenesis();
	DecimalFormat forma = new DecimalFormat("#.##");
	
	private String pesoTotal() {
		String peso = new DecimalFormat("#.###").format(genesis.getPeso());
		double pesoDouble = Double.parseDouble(peso.replaceAll(",", "."));
		return IUnidade.obterUnidadeSistema().getUnidade(pesoDouble);
	}
	public void print() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Total de animais: " + genesis.size() + System.lineSeparator());
		buffer.append("Preço total dos animais: " + forma.format(genesis.getValor()) + System.lineSeparator());
		buffer.append("Peso Total: " + pesoTotal() + System.lineSeparator());
		buffer.append("Machos: " + forma.format(genesis.getProporcaoMachos()));
		buffer.append("  Femeas: " + forma.format(100 - genesis.getProporcaoMachos()) + System.lineSeparator());
		buffer.append("Vacindados: " + forma.format(genesis.getProporcaoVacina()) + System.lineSeparator());
		System.out.println(buffer.toString());
	}

}
