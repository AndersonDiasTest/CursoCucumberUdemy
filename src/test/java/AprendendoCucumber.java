import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprendendoCucumber {

	private int contador;
	private boolean resultado;
	private Date entrega;
	
	@Dado("que primeiro texto")
	public void que_primeiro_texto() {
	    System.out.println("Dado");
	}

	@Quando("segundo texto")
	public void segundo_texto() {
	    System.out.println("Quando");
	}

	@Entao("terceiro texto")
	public void terceiro_texto() {
	    System.out.println("Entao");
	}
	
	@Dado("que o valor do contador eh {int}")
	public void queOValorDoContadorEh(Integer int1) {
	    contador = int1;
	}
	@Quando("eu incrementar {int}")
	public void euIncrementar(Integer int1) {
	    contador = contador + int1;
	}
	@Entao("o valor do contador sera {int}")
	public void oValorDoContadorSera(Integer int1) {
		if(contador == int1) {
			resultado = true;
		}
	    Assert.assertTrue(resultado);
	}
	
	@Dado("que o prazo eh dia {int}\\/{int}\\/{int}")
	public void queOPrazoEhDia(Integer dia, Integer mes, Integer ano) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.DAY_OF_MONTH, mes);
	    cal.set(Calendar.DAY_OF_MONTH, ano);
	    entrega = cal.getTime();
	}
	
	@Quando("^a entrega atrasar em (\\d+) (.+)$")
	public void aEntregaAtrasarEmDias(Integer int1, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo == "dias") {
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		if (tempo == "mes") {
			cal.add(Calendar.MONTH, int1);
		}
		entrega = cal.getTime();		
	}
	
	@Entao("^a entrega sera efetuada em (\\d+)\\/(\\d+)\\/(\\d+)$")
	public void aEntregaSeraEfetuadaEm(Integer int1, Integer int2, Integer int3) {
	    System.out.println(int1);
	}
}
