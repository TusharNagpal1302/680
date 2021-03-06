package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ApfsFileTest {

static LocalDateTime localdateTime = LocalDateTime.of(2020, 5, 5, 0, 0);
	
	@SuppressWarnings("unused")
	@BeforeAll
	public static void initialize() {
		
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.initFileSystem("drive", 2000);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsDirectory pictures = new ApfsDirectory(home, "pictures", 0, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile a = new ApfsFile(system, "a", 100, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile b = new ApfsFile(system, "b", 150, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile c = new ApfsFile(system, "c", 200, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile d = new ApfsFile(home, "d", 50, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile e = new ApfsFile(pictures, "e", 100, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsFile f = new ApfsFile(pictures, "f", 200, localdateTime, "Tushar Nagpal", localdateTime);
		ApfsLink x = new ApfsLink(home, "x", 0, localdateTime, "Tushar Nagpal", localdateTime, system);
		ApfsLink y = new ApfsLink(pictures, "y", 0, localdateTime, "Tushar Nagpal", localdateTime, e);
	}
	
	private String[] fileToStringArray(ApfsFile file) {
		Optional<ApfsDirectory> optionalDirectory = Optional.ofNullable(file.getParent());
		String[] fileInfo = { Boolean.toString(file.isDirectory()), file.getName(), 
				Integer.toString(file.getSize()), file.getCreationTime().toString(), 
				optionalDirectory.isPresent()?file.getParent().getName():null, file.getOwnerName(),file.getLastModified().toString()};
		return fileInfo;
	}

	@Test
	void checkIfDirectory() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		assertTrue(root.findDirByName("root").isDirectory());
		assertTrue(root.findDirByName("home").isDirectory());
		assertTrue(root.findDirByName("system").isDirectory());
		assertTrue(root.findDirByName("pictures").isDirectory());
		assertFalse(root.findFileByName("a").isDirectory());
		assertFalse(root.findFileByName("b").isDirectory());
		assertFalse(root.findFileByName("c").isDirectory());
		assertFalse(root.findFileByName("d").isDirectory());
		assertFalse(root.findFileByName("e").isDirectory());
		assertFalse(root.findFileByName("f").isDirectory());
	}
	
	@Test
	public void verifyFileEqualityA() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "a", "100", localdateTime.toString(), "system", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("a");
		assertArrayEquals(expected,fileToStringArray(actual));
	}
	
	@Test
	public void verifyFileEqualityB() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "b", "150", localdateTime.toString(), "system", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("b");
		assertArrayEquals(expected,fileToStringArray(actual));
	}
	
	@Test
	public void verifyFileEqualityC() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "c", "200", localdateTime.toString(), "system", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("c");
		assertArrayEquals(expected,fileToStringArray(actual));
	}
	

	
	@Test
	public void verifyFileEqualityE() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "e", "100", localdateTime.toString(), "pictures", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("e");
		assertArrayEquals(expected,fileToStringArray(actual));
	}
	
	@Test
	public void verifyFileEqualityD() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "d", "50", localdateTime.toString(), "home", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("d");
		assertArrayEquals(expected,fileToStringArray(actual));
	}
	
	@Test
	public void verifyFileEqualityF() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory root = (ApfsDirectory)ApfsFileSystem.getRootDir();
		String[] expected = { "false", "f", "200", localdateTime.toString(), "pictures", "Tushar Nagpal", localdateTime.toString() };
		ApfsFile actual = root.findFileByName("f");
		assertArrayEquals(expected,fileToStringArray(actual));
	}

}
