package edu.umb.cs680.hw02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void primeGen1to10() {
		PrimeGenerator Pgen = new PrimeGenerator(1, 15);
		Pgen.generatePrimes();
		System.out.println(Pgen.getPrimes().toArray());
		Long[] expectedPrimes = { 2L, 3L, 5L, 7L, 11L, 13L };
		assertArrayEquals(expectedPrimes, Pgen.getPrimes().toArray());
	}

	@Test
	public void primeGen1to30() {
		PrimeGenerator Pgen = new PrimeGenerator(1, 30);
		Pgen.generatePrimes();
		System.out.println(Pgen.getPrimes().toArray());
		Long[] expectedPrimes = { 2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L };
		assertArrayEquals(expectedPrimes, Pgen.getPrimes().toArray());
	}

	@Test
	public void primeGenWrongRange() {
		PrimeGenerator gen = new PrimeGenerator(-100,-1);
		gen.generatePrimes();
		Long[] expectedPrimes = {};
		assertArrayEquals( expectedPrimes,gen.getPrimes().toArray());	
	
	}

	

	


}