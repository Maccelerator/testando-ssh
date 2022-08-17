package lab2;

import java.util.Arrays;

/**
 * @author Miguel Macedo Ferreira.
 * A classe Disciplina, implementada a seguir, recebe as horas de estudo do aluno,...
 * ... dedicados aquela disciplina, as 4 notas que o aluno obteve naquela disciplina...
 * ... e o nome da disciplina, e exibe para o usuário a média do aluno e um array...
 * ... contendo suas notas.
 */
public class Disciplina {
	/**
	 * O atributo String nomeDisciplina armazena o nome da disciplina.
	 * O atributo horasEstudo armazena as horas de estudo do aluno, inicializado em 0...
	 * ... para ser incrementado ao longo da execução do programa.
	 * O atributo notas armazena um array de números de ponto flutuante que tratam-se...
	 * das notas obtidas pelo aluno, em cada uma das 4 disciplinas, ordenadas conforme...
	 * os índices do array da API de java.
	 */
	private String nomeDisciplina;
	private int horasEstudo = 0;
	private double[] notas = new double[4];
    
	/**
	 * O construtor Disciplina(String nomeDisciplina) atualiza o nome da disciplina con-...
	 * ...forme o valor que é definido pelo usuário, durante a execução da classe.
	 * @param nomeDisciplina
	 */
	public Disciplina(String nomeDisciplina) {
    	this.nomeDisciplina = nomeDisciplina;
	}
    
	/**
	 * O construtor cadastraHoras(int horas) incrementa o valor armazenado no atributo...
	 * ... horasEstudo.
	 * @param horas
	 */
	public void cadastraHoras(int horas) {
    	this.horasEstudo += horas;
	}
    
	/**
	 * O construtor cadastraNota(int nota, double valorNota) atualiza os valores do array...
	 * ... armazenado no atributo notas.
	 * @param nota
	 * @param valorNota
	 */
	public void cadastraNota(int nota, double valorNota) {
    	this.notas[nota - 1] = valorNota;
	}
	
	/**
	 * O método boolean aprovado() verifica se o aluno foi aprovado, calculando a média...
	 * ... das notas passadas para classe, verificando se essa média é maior ou igual a 7...
	 * ... e assertindo com variáveis boolean.
	 * @return true
	 * @return false
	 */
	public boolean aprovado() {
   	 double somaNotas = 0;
    	for (int i = 0; i < 4; i++) {
        	somaNotas += notas[i];
    	}
    	double media = somaNotas / 4;
    	if (media >= 7) {
        	return true;
    	} else {
        	return false;
    	}
	}
	
	/**
	 * O método toString() retorna em uma única linha, o nome da disciplina, as horas de estudo, ...
	 * ... a média do aluno e o array contendo as suas 4 notas.
	 */
	public String toString() {
   	 double somaNotas = 0;
    	for (int i = 0; i < 4; i++) {
        	somaNotas += notas[i];
    	}
    	double media = somaNotas / 4;
    	return (nomeDisciplina + " " + horasEstudo + " " + media + " " + Arrays.toString(notas));
	}
}