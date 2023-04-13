package exercicios;

public class AppDetran {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Fusca";
		Proprietario proprietario = new Proprietario();
		proprietario.nome = "Joao";
		
		proprietario.meuCarro = carro;
		
		System.out.println(proprietario.nome + " tem um "+ proprietario.meuCarro.modelo);
		
	}

}
