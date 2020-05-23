package edu.umb.cs680.hw09;

import java.time.LocalDateTime;

public class APFS extends FileSystem{

	private static APFS instance = null;
	
	private APFS() {};
	
	public static APFS getAPFSFileSystem() {
		if(instance==null)
			instance = new APFS ();
		return instance;
	}

	@Override
	protected FSElement createDefaultRoot() {
		LocalDateTime localTime = LocalDateTime.of(2020, 5, 5, 0, 0);
		ApfsDirectory root = new ApfsDirectory(null, "root", 0, localTime, "Tushar Nagpal", localTime);
		return root;
	}
	
	public static void main(String[] args) {
		System.out.println("APFS Class Successfully Run!!");
	}
}
