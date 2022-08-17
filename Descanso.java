package lab2;

/**
 * @author - Miguel Macedo Ferreira.
 * A classe Descanso, implementada a seguir, verifica se o aluno está cansado, ou descansado,...
 * ... baseado na qtde de horas e no número de semanas que ele descansou, informadas durante...
 * a execução da classe.
 */

public class Descanso {
	/**
	 * O atributo horasDescanso armazena as horas de descanso do aluno.
	 * O atributo numSemanas armazena a qtde de Semanas durante as quais o aluno descansou.
	 */
	private int horasDescanso;
	private int numSemanas = 1;
    
	/**
	 * O construtor defineHorasDescanso atualiza o valor armazenado em horasDescanso.
	 * @param horasDescanso
	 */
	public void defineHorasDescanso(int horasDescanso) {
    	this.horasDescanso = horasDescanso;
	}
    
	/**
	 * O construtor defineNumeroSemanas atualiza o valor armazenado em numSemanas.
	 * @param numSemanas
	 */
	public void defineNumeroSemanas(int numSemanas) {
    	this.numSemanas = numSemanas;
	}
    
	/**
	 * O método getStatusGeral calcula o descanso semanal do aluno.
	 * Se o descanso semanal for maior ou igual a 26 horas, o aluno está descansado.
	 * Caso contrário, o aluno está cansado.
	 * Os retornos para cada um dos casos serão "descansado" ou "cansado".
	 * @return cansado ou descansado.
	 */
	public String getStatusGeral() {
    	double descansoSemana = horasDescanso / numSemanas;
    	if (descansoSemana >= 26) {
        	return (String) "descansado";
    	} else {
        	return (String) "cansado";
    	}
   	 
	}
}
