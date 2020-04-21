package br.qualiti.excecoes;

public class ContaInexistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 3736143437484454036L;

	public ContaInexistenteException() {
        super();
    }

    public ContaInexistenteException(String message) {
        super(message);
    }
	
}
