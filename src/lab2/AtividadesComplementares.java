package lab2;

/**
 * @author Miguel Macedo Ferreira
 * a classe AtividadesComplementares registra as qtde de horas de est�gio, de meses...
 * ... de projeto, e de horas de curso que um aluno participou na UFCG, e conta seus...
 * cr�ditos.
 */
public class AtividadesComplementares {
	/**
	 * Os atributos horasEstagio, mesesProjeto e horasCurso armazenam os valores...
	 * ... correspondentes as qtde de horas de est�gio, de meses de projeto, e de...
	 * ... horas de curso do aluno, respectivamente, que ser�o incrementados ao...
	 * ... longo da execu��o da classe.
	 * Os atributos numProjetos e numEstagios armazenam os n�meros de estagios e...
	 * ... de projetos que o aluno participou.
	 * Os atributos arrayEstagios e arrayprojetos armazenam as entradas do usu�rio, ...
	 * ... que ser�o exibidos ao final da execu��o da classe.
	 */
    private int horasEstagio = 0;
	private int mesesProjeto = 0;
	private double horasCurso = 0;
	private int numEstagios = 0;
	private int numProjetos = 0;
	private String[] arrayEstagios = new String[9];
	private String[] arrayProjetos = new String[16];
    
	/**
	 * O m�todo AtividadesComplementares � um construtor padr�o, que eu, o...
	 * ... o desenvolvedor, optei por n�o implementar nessa classe.
	 */
	public AtividadesComplementares() {
	}
	
	/**
	 * O m�todo adicionarEstagio(int horas) incrementa os valores armazenados...
	 * ... no atributo horasEstagio e no atributo numEstagios, enquanto o valor...
	 * ... de numEstagios for menor que 9, j� que � sabido que um aluno pode fazer...
	 * ... at� 9 est�gios.
	 * O parametro horas � adicionado ao array de Estagios, armazenado no atributo...
	 * arrayEstagios, para que possa ser impresso ao final da execu��o da classe.
	 * @param horas
	 */
	public void adicionarEstagio(int horas) {
    	if (numEstagios < 9) {
        	this.horasEstagio += horas;
        	arrayEstagios[numEstagios] = "Estagios " + horas;
        	this.numEstagios += 1;
    	}
	}
	
	/**
	 * O m�todo adicionarProjeto(int meses) incrementa os valores armazenados...
	 * ... no atributo mesesProjeto e no atributo numProjetos, enquanto o valor...
	 * ... de numProjetos for menor que 16, j� que � sabido que um aluno pode fazer...
	 * ... at� 16 projetos.
	 * O parametro meses � adicionado ao array de projetos, armazenado no atributo...
	 * Projetos, para que possa ser impresso ao final da execu��o da classe.
	 * @param meses
	 */
	public void adicionarProjeto(int meses) {
    	if (numProjetos < 16) {
        	this.mesesProjeto += meses;
        	arrayProjetos[numProjetos] = "Projetos " + meses;
        	this.numProjetos += 1;
    	}
	}
	
	/**
	 * O m�todo adicionarCurso(doube cursos) incrementa o valor armazenado...
	 * ... no atributo horasCurso.
	 * @param horas
	 */
	public void adicionarCurso(double horas) {
    	this.horasCurso += horas;
    	
	}
	
	/**
	 * O m�todo contaCreditos(), quando acionado, conta os creditos acumulados...
	 * ... pelo aluno, sabido que:
	 * - A cada 300 horas de est�gio, o aluno recebe 5 cr�ditos.
	 * - A cada 3 meses de projeto, o aluno recebe 2 cr�ditos.
	 * - A cada 30 horas de curso, o aluno recebe 1 cr�dito.
	 * - N�o h� proporcionalide, se o aluno n�o completar o ciclo de 300 horas...
	 * ... de est�gio, de 3 meses de projeto, ou de 30 horas de curso, ele n�o...
	 * ... receber a qtde de cr�ditos correspondente.
	 * - Ah, o m�todo, em seguida, retorna a soma desses cr�ditos.
	 * @return
	 */
	public int contaCreditos() {
    	int creditosEstagio = 5*(int)(horasEstagio/300);
    	int creditosProjeto = 2*(int)(mesesProjeto/3);
    	int creditosCurso = 1*(int)(horasCurso/30);
    	int creditos = creditosEstagio + creditosCurso + creditosProjeto;
    	return creditos;
	}
	
	/**
	 * O m�todo pegaAtividades(), qnd acionado, retorna um array de strings...
	 * ... cujos elementos s�o os estagios e suas qtdes de horas cadastradas, ...
	 * os projetos e suas qtdes de meses cadastrados, e a soma das horas de cursos...
	 * do aluno.
	 * @arrayAtividades
	 */
	public String[] pegaAtividades() {
		int creditosEstagio = 5*(int)(horasEstagio/300);
		int creditosProjeto = 2*(int)(mesesProjeto/3);
		int creditosCurso = 1*(int)(horasCurso/30);
		String[] arrayAtividades = new String[numEstagios + numProjetos + 4];
		for (int i = 0; i < numEstagios; i++) {
			arrayAtividades[i] = arrayEstagios[i];
		}
		for (int j = 0; j < numProjetos; j++) {
			arrayAtividades[j + numEstagios] = arrayProjetos[j];
		}
		arrayAtividades[numEstagios + numProjetos] = "Cursos " + horasCurso;
		arrayAtividades[numEstagios + numProjetos + 1] = "Creditos_Estagio " + creditosEstagio;
		arrayAtividades[numEstagios + numProjetos + 2] = "Creditos_Projeto " + creditosProjeto;
		arrayAtividades[numEstagios + numProjetos + 3] = "Creditos_Curso " + creditosCurso;
    	return arrayAtividades;
	}
}