package br.qualiti.excecoes;

public class ContaJaExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 3736143437484454036L;

	public ContaJaExistenteException() {
        super();
    }

    public ContaJaExistenteException(String message) {
        super(message);
    }
	
}
