package lab2;

/**
 * @author Miguel Macedo Ferreira.
 * A classe RegistroTempoOnline implementada a seguir registra o tempo gasto pelo aluno...
 * ... em uma disciplina remota, o tempo esperado (que, se n�o for informada, ser� definida...
 * ... pela classe como 120 horas)pelos professores de p2 e labp2, e o nome da disciplina.
 * Ap�s isso, ele incrementa o tempo gasto pela disciplina, com as antradas fornecidas...
 * ...pelo usu�rio, avalia, com valores boolean, se o aluno atingiu a meta do tempo espe-...
 * ...rado, e exibe, em uma linha, o nome da disciplina,o tempo gasto e o tempo esperado...
 * ... online.
 */
public class RegistroTempoOnline {
	/** Os atributos inicializados a seguir representam, respectivamente, o tempo gasto...
	 * pelo aluno na disciplina remota, o tempo esperado, pelos professores de p2 e labp2, ...
	 * ... que seja gasto pelo aluno, e o nome da disciplina que a classe est� registrando.
	 * O valor guardado em tempoGasto ser� incrementado durante a execu��o dessa classe.
	 */
	private int tempoGasto = 0;
	private int tempoEsperadoOnline;
	private String nomeDisciplina;
    
	/**
	 * O construtor RegistroTempoOnline(String nomeDisciplina) recebe como parametro...
	 * ... o nome da disciplina remota (nomeDisciplina) e define o tempo esperado...
	 * ... 120 horas, j� que ela n�o foi informada junto com o nome da disciplina.
	 * @param nomeDisciplina
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
    	this.nomeDisciplina = nomeDisciplina;
    	this.tempoEsperadoOnline = 120;
	}
    
	/**
	 * O construtor RegistroTempoOnline(String nomeDisciplina, int tempoEsperadoOnline)...
	 * ... recebe como parametros nomeDisciplina e tempoEsperadoOnline, e define o nome...
	 * ... da disciplina remota e o tempo esperado, pelos professores de p2 e lab2,...
	 * que deve ser gasto pelo aluno nela.
	 * @param nomeDisciplina
	 * @param tempoEsperadoOnline
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoEsperadoOnline) {
    	this.nomeDisciplina = nomeDisciplina;
    	this.tempoEsperadoOnline = tempoEsperadoOnline;
	}
    
	/**
	 * O construtor adicionaTempo(int tempo) incrementa o valor guardado no atributo...
	 * ... tempoGasto, inicializado acima, com o valor que � informado no seu parametro...
	 * tempo.
	 * @param tempo
	 */
	public void adicionaTempoOnline(int tempo) {
    	this.tempoGasto += tempo;
	}
    
	/**
	 * O m�todo atingiuMetaTempo verifica se o valor tempoGasto, incrementado anteriormente...
	 * ... a partir de 0, � maior ou igual ao tempo esperado, dando retornos boolean.
	 * @return true
	 * @return false
	 */
	public boolean atingiuMetaTempoOnline() {
    	if (tempoGasto >= tempoEsperadoOnline) {
        	return true;
    	} else {
        	return false;
    	}
	}
	
	/**
	 * O m�todo toString retorna, em uma linha, os atributos nomeDisciplina, tempoGasto e...
	 * tempoEsperadoOnline.
	 */
	public String toString() {
    	return (nomeDisciplina + " " + tempoGasto + "/" + tempoEsperadoOnline);
	}
    
}
