package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class FileSystemTest {

	FileSystem filesystem;

	private void testfunc() {
		filesystem = FileSystem.getFileSystem();

		Directory root = new Directory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0));

		Directory home = new Directory(root, "Home", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		root.appendChild(home);

		Directory system = new Directory(root, "System", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		root.appendChild(system);

		Directory picture = new Directory(home, "Picture", 0, LocalDateTime.of(2020, 5, 5, 10, 0));
		home.appendChild(picture);

		File file1 = new File(system, "file1.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file2 = new File(system, "file2.txt", 200, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file3 = new File(system, "file3.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));
		system.appendChild(file1);
		system.appendChild(file2);
		system.appendChild(file3);
		
		File file4 = new File(home, "file4.txt", 400, LocalDateTime.of(2020, 5, 5, 10, 0));
		home.appendChild(file4);

		Link link1 = new Link(home, "link1", 0, LocalDateTime.of(2020, 5, 5, 10, 0), system);
		home.appendChild(link1);
		
		File file5 = new File(picture, "file5.txt", 500, LocalDateTime.of(2020, 5, 5, 10, 0));

		File file6 = new File(picture, "file6.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0));

		Link link2 = new Link(picture, "link2", 0, LocalDateTime.of(2020, 2, 5, 10, 0), file5);
		
		picture.appendChild(link2);
		picture.appendChild(file5);
		picture.appendChild(file6);
		filesystem.addRootDir(root);

	}
	
	@Test
	void verifyRootDirectory() {testfunc();
		assertEquals(filesystem.getRoot().getName(), "Root");
	}
	
	@Test
	void verifyTotalSize() {testfunc();
		assertEquals(filesystem.getRoot().getTotalSize(), 1800);
	}
	
	@Test
	void verifyDirectorRootForPicture() {testfunc();
		assertNotNull(filesystem.getRootDirs((Directory)((Directory)filesystem.getRoot().getSubDirectories().get(0)).getSubDirectories().get(0)));
	}

}
