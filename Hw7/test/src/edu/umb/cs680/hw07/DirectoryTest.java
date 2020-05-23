package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class DirectoryTest {

	private String[] directorytoStringArray(Directory dir) {
		return new String[]{""+dir.isDirectory() ,dir.getName(), ""+dir.getSize(), ""+dir.getCreationTime(), dir.getParent()!= null ? dir.getParent().getName() : "null", ""+dir.countChildren()};
	}
	
	@Test
	public void verifyDirectoryEqualityRoot() {
		String[] expectedvalues = {"true", "Root", "0", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "null", "0"};
		
		Directory actualvalues = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		
		assertArrayEquals(expectedvalues,directorytoStringArray(actualvalues));
	}
	
	@Test
	public void verifyDirectoryEqualityHome() {

		
	Directory dir = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
	String[] expectedvalues = {"true", "Home", "0", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "Root", "0"};
		Directory actualvalues = new Directory(dir, "Home", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		
		assertArrayEquals(expectedvalues, directorytoStringArray(actualvalues));
	}

}
