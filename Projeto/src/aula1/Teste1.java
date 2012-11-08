package aula1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste1 {

	public static void main(String[] args) {
	    Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);
	    Funcionario funcionario = new Funcionario("José", 25, dataNascimento);
	    System.out.println(funcionario);
	}
}
