package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public class File extends FSElement {

	public File(Directory parent, String name, int size, LocalDateTime creationTime) {
		super(parent, name, size, creationTime);
	}

	@Override
	public Boolean isDirectory() {
		return false;
	}
	public static void main(String[] args) {
		System.out.println("File Class Successfully Run!!");
	}

}
