package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void InstateStudentInstance() {
		Student stud = Student.createInStateStudent("Test1", "Address", 5);
		assertNotNull(stud);
	}
	
	@Test
	public void InstateStudentFactoryInstance() {
		Student stud = StudentFactory.createInStateStudent("Test1", "Address", 5);
		assertNotNull(stud);
	}
	
	@Test
	public void InstateStudentValidData() {
		Student stud = Student.createInStateStudent("Test1", "Address", 5);
		assertEquals("Test1", stud.getName());
		assertEquals("Address", stud.getUsAddr());
		assertEquals(5, stud.getYrsInState());
	}
	
	@Test
	public void InstateStudentFactoryValidData() {
		Student stud = StudentFactory.createInStateStudent("Test1", "Address", 5);
		assertEquals("Test1", stud.getName());
		assertEquals("Address", stud.getUsAddr());
		assertEquals(5, stud.getYrsInState());
	}
	
	@Test
	public void OutStateStudentInstance() {
		Student stud = Student.createOutStateStudent("Test2", "Address1", "State1");
		assertNotNull(stud);
	}
	
	@Test
	public void OutStateStudentFactoryInstance() {
		Student stud = StudentFactory.createOutStateStudent("Test2", "Address1", "State1");
		assertNotNull(stud);
	}
	
	@Test
	public void OutStateStudentValidData() {
		Student stud = Student.createOutStateStudent("Test2", "Address1", "State1");
		assertEquals("Test2", stud.getName());
		assertEquals("Address1", stud.getUsAddr());
		assertEquals("State1", stud.getPriorState());
	}
	
	@Test
	public void OutStateStudentFactoryValidData() {
		Student stud = Student.createOutStateStudent("Test2", "Address1", "State1");
		assertEquals("Test2", stud.getName());
		assertEquals("Address1", stud.getUsAddr());
		assertEquals("State1", stud.getPriorState());
	}
	
	@Test
	public void IntlStateStudentInstance()  {
		Student stud = Student.createIntlStudent("Test3", "Address2", 123, "Address3");
		assertNotNull(stud);
	}
	
	
	@Test
	public void IntlStateStudentFactoryInstance()  {
		Student stud = Student.createIntlStudent("Test3", "Address2", 123, "Address3");
		assertNotNull(stud);
	}
	
	
	@Test
	public void IntlStateStudentValidData() {
		Student stud = Student.createIntlStudent("Test3", "Address2", 123, "Address3");
		assertEquals("Test3", stud.getName());
		assertEquals("Address2", stud.getUsAddr());
		assertEquals("Address3", stud.getForeignAddr());
		assertEquals(123, stud.getI20num());
	}
	
	@Test
	public void IntlStateStudentFactoryValidData() {
		Student stud = Student.createIntlStudent("Test3", "Address2", 123, "Address3");
		assertEquals("Test3", stud.getName());
		assertEquals("Address2", stud.getUsAddr());
		assertEquals("Address3", stud.getForeignAddr());
		assertEquals(123, stud.getI20num());
	}

}
