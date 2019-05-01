package clase03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.PasswordValidator;

import clase03.Tar;

public class TestTarjeta {
	
	
	
	//validacion de longitud
	@Test
	public void validarLongitudTarj() {
		Tar pv = new Tar();
	assertEquals(true, pv.longtarjeta("qw34567"));
	}
	
	
	
	@Test
	public void testNotDigit() {
	assertEquals(false, PasswordValidator.isValid5("Abcdefg"));
	}
		

	
	
}
