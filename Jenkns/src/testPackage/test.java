package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Princ.Calcula;

public class test {
	Calcula c = new Calcula();
	@Test
	public void test() {
		assertEquals(c.sum(5, 6), 11);
	}

}
