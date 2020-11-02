package controlador;

public class ValidadorOpcoes extends ValidadorOpcao implements Validador {	
	
	public ValidadorOpcoes(int max) {
		super(max);
	}


	@Override
	public boolean validar(Object target) {
		if(!(target instanceof Integer[])) {
			return false;
		}
		Integer[] nums = (Integer[]) target;
		for(int n : nums) {
			if( (n < 0) || (n >= max) ) {
				System.out.println(n);
				return false;
			}
		}
		return true;
	}

}
