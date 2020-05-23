package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class LinkTest {

FileSystem filesystem;
	
	private void testfunction() {
		filesystem = FileSystem.getFileSystem();

		Directory root = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));

		Directory home = new Directory(root, "Home", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		root.appendChild(home);

		Directory system = new Directory(root, "System", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		root.appendChild(system);

		

		File file1 = new File(system, "file1.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file2 = new File(system, "file2.txt", 200, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file3 = new File(system, "file3.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));
		system.appendChild(file1);
		system.appendChild(file2);
		system.appendChild(file3);
		
		Directory picture = new Directory(home, "Picture", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		home.appendChild(picture);
		
		File file4 = new File(home, "file4.txt", 400, LocalDateTime.of(2020, 5, 5, 10, 0));
		home.appendChild(file4);

		Link link1 = new Link(home, "link1", 0, LocalDateTime.of(2020, 5, 5, 10, 0), system);
		home.appendChild(link1);
		
		File file5 = new File(picture, "file5.txt", 500, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file6 = new File(picture, "file6.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));

		Link link2 = new Link(picture, "link2", 0, LocalDateTime.of(2020, 5, 5, 10, 0), file5);
		
		picture.appendChild(link2);
		picture.appendChild(file5);
		picture.appendChild(file6);
		filesystem.addRootDir(root);

	}
	
	private String[] LinktoStringArray(FSElement fse) {
		return new String[]{""+fse.isDirectory() ,fse.getName(), ""+fse.getSize(), ""+fse.getCreationTime(),fse.getParent()!= null ? fse.getParent().getName() : "null", ""+((Link)fse).getTargetLink().getName()};
	}
	
	@Test
	public void verifyLinkEqualitySystem() {
		testfunction();
		String[] expectedvalues = {"true", "link1", "0", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "Home", "System"};
		assertArrayEquals(expectedvalues,LinktoStringArray(((Directory)filesystem.getRoot().getSubDirectories().get(0)).getSubDirectories().get(2))
						);
	}
	
	@Test
	public void verifyLinkEqualityHome() {
	testfunction();
	String[] expectedvalues = {"true", "link2", "0", ""+LocalDateTime.of(2020, 5, 5, 10, 0), "Picture", "file5.txt"};
	
	assertArrayEquals(expectedvalues,LinktoStringArray(((Directory)((Directory)filesystem.getRoot().getSubDirectories().get(0)).getSubDirectories().get(0)).getSubDirectories().get(0)));
	}

}
