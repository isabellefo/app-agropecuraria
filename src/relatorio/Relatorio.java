package relatorio;

import animal.ColecaoAnimal;
import peso.IUnidade;

public class Relatorio {
	private final ColecaoAnimal genesis = ColecaoAnimal.obterGenesis();
	
	private String pesoTotal( ) {
		return IUnidade.obterUnidadeSistema().getUnidade(genesis.getPeso());
	}
	public void print() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Total de animais: " + genesis.size() + System.lineSeparator());
		buffer.append("Peso Total: " + pesoTotal() + System.lineSeparator());
		buffer.append("Machos: " + genesis.getProporcaoMachos());
		buffer.append(" Femeas: " + (100 - genesis.getProporcaoMachos()) + System.lineSeparator());
		buffer.append("Vacindados: " + genesis.getProporcaoVacina() + System.lineSeparator());
		System.out.println(buffer.toString());
	}

}
