package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class FileTest {

	private String[] fileToStringArray(File file) {
		return new String[]{""+file.isDirectory() ,file.getName(), ""+file.getSize(), ""+file.getCreationTime(), file.getParent()!= null ? file.getParent().getName() : "null"};
	}
	
	@Test
	public void verifyFileEqualityUnderRoot() {
		String[] expectedvalues = {"false", "file1.txt", "10", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "Root"};
		
		Directory root = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		
		
		File actualvalues = new File(root, "file1.txt", 10, LocalDateTime.of(2020, 5, 5, 10, 0));
		assertArrayEquals(expectedvalues, fileToStringArray(actualvalues));
	}
	
	@Test
	public void verifyDirectoryEqualityUnderHome() {
		String[] expectedvalues = {"false", "file2.txt", "100", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "Home"};

		
		Directory root = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		
		Directory home = new Directory(root, "Home", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		
		File actualvalues = new File(home, "file2.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));

		assertArrayEquals(expectedvalues, fileToStringArray(actualvalues));
	}

}
