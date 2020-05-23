package edu.umb.cs680.hw12;

import static org.junit.Assert.assertNotEquals;
import java.time.LocalDateTime;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class ElementShortComparatorTest {

	Apfs apfs;

	private void befor() {
		apfs = Apfs.getFileSystem();
		ApfsElement root = new ApfsDirectory(null, "Root", 0, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);

		

		ApfsElement system = new ApfsDirectory(root, "System", 0, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);
		root.appendChild(system);
		
		ApfsElement home = new ApfsDirectory(root, "Home", 0, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);
		root.appendChild(home);
		
		ApfsElement picture = new ApfsDirectory(home, "Picture", 0, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);
		home.appendChild(picture);

		ApfsFile a = new ApfsFile(system, "a.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);

		ApfsFile b = new ApfsFile(system, "b.txt", 200, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);

		ApfsFile c = new ApfsFile(system, "c.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);
		system.appendChild(a);
		system.appendChild(b);
		system.appendChild(c);
		
		ApfsFile d = new ApfsFile(home, "d.txt", 400, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);
		home.appendChild(d);

		ApfsElement x = new ApfsLink(home, "x", 0, LocalDateTime.of(2020, 5, 5, 10, 0), system, "Tushar Nagpal", null);
		home.appendChild(x);
		
		ApfsFile e = new ApfsFile(picture, "e.txt", 500, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);

		ApfsFile f = new ApfsFile(picture, "f.txt", 100, LocalDateTime.of(2020, 5, 5, 10, 0), "Tushar Nagpal", null);

		ApfsElement y = new ApfsLink(picture, "y", 0, LocalDateTime.of(2020, 5, 5, 10, 0), e, "Tushar Nagpal", null);
		
		picture.appendChild(y);
		picture.appendChild(e);
		picture.appendChild(f);
		apfs.setRoot(root);

	}
	

	@Test
	public void verifyLinkEqualitySystem() {
		befor();
		LinkedList<ApfsElement> list1 = ((ApfsDirectory)apfs.getRoot()).getChildren();
		String string1 = list1.getFirst().getName();
		LinkedList<ApfsElement> list2 = ((ApfsDirectory)apfs.getRoot()).getChildren(new ElementShortComparator());
		String string2 = list2.getLast().getName();
		assertNotEquals(string1, string2);
	}

}
