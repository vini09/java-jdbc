package db;

public class DbIntegritException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIntegritException(String msg) {
		super("Não é possível deletar dados que utilizam a mesma chave para integração ou seja, não pode excluir um departamento onde contenha funcionários inseridos");
	}
}
