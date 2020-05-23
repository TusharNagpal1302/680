package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem {

	private static FileSystem fs = null;
	private Directory root;

	private FileSystem() {
	}

	public static FileSystem getFileSystem() {
		if (fs == null)
			fs = new FileSystem();
		return fs;
	}

	public LinkedList<Directory> getRootDirs(Directory d) {
		LinkedList<Directory> child = new LinkedList<Directory>();
		while (d.getParent() != null) {
			child.add(d.getParent());
			d = d.getParent();
		}
		return child;
	}

	public void addRootDir(Directory root) {
		this.root = root;
	}

	public Directory getRoot() {
		return root;
	}
	public static void main(String[] args) {
		System.out.println("FileSystem Class Successfully Run!!");
	}
}
