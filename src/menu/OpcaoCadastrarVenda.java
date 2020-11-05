package menu;

import java.util.Date;
import java.util.stream.Stream;

import animal.Animal;
import animal.ColecaoAnimal;
import controlador.Controlador;
import preco.Cotacao;
import venda.VendaBuilder;

public class OpcaoCadastrarVenda extends Opcao {

	private final Controlador ctrl;
	private final VendaBuilder vendaBuilder;
	private final ColecaoAnimal  genesis = ColecaoAnimal.obterGenesis();
	
	protected OpcaoCadastrarVenda(String descricao) {
		super(descricao);
		this.ctrl = Controlador.obterControlador();
		this.vendaBuilder = new VendaBuilder();
	}
	
	private void lerData() {
		Date data = ctrl.lerData("Data da venda: ");
		vendaBuilder.setData(data);
	}
	
	private void escolherAnimais() {
		Animal[] animais = genesis.getAnimalCollection().toArray(new Animal[genesis.size()]);
		Integer[] animaisIndexes = ctrl.lerIntArr("Animais: ", animais);
		Animal[] animaisFiltrados = Stream.of(animaisIndexes)
				.map((Integer ai) -> animais[ai])
				.toArray(Animal[]::new);
		vendaBuilder.setProduto(animaisFiltrados);
		for(Animal a : animaisFiltrados) {
			genesis.popAnimal(a.getId());
		}
	}
	
	private void escolherCotacao() {
		Cotacao cotacao = ctrl.lerOpcao("Cotacao da venda", Cotacao.getCotacoes());
		vendaBuilder.setCalculadora(cotacao);
	}
	
	@Override
	public void run() {
		vendaBuilder.criarVenda();
		lerData();
		escolherCotacao();
		escolherAnimais();
		System.out.println( vendaBuilder.salvar());
	}

}
