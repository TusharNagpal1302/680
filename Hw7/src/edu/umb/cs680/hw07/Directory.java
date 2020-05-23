package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement {

	LinkedList<FSElement> children = new LinkedList<FSElement>();
	
	public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
		super(parent, name, size, creationTime);
	}

	@Override
	public Boolean isDirectory() {
		return true;
	}

	LinkedList<FSElement> getChildren(){
		return children;
	}
	
	public void appendChild(FSElement child) {
		children.add(child);
	}

	public int countChildren() {
		LinkedList<FSElement> child = new LinkedList<FSElement>();
		int count = 0;
		child.addAll(children);
		for(FSElement e: child) {
			if(e.isDirectory())
				child.add(e);
			else
				count += 1;
			child.remove(e);
		}
		return count;
	}
	
	public int getTotalSize() {
		LinkedList<FSElement> child = new LinkedList<FSElement>();
		int count = 0;
		child.addAll(children);
		while(child.size() != 0) {
			FSElement e = child.get(0);
			if(e instanceof Link && ((Link) e).getTargetLink() instanceof Directory) {
				child.add(((Link) e).getTargetLink());
			}
			else if(e instanceof Directory && e.isDirectory())
				child.addAll(((Directory) e).getChildren());
			else
				count += e.getSize();
			child.remove(0);
		}
		return count;
	}
	
	public LinkedList<FSElement> getSubDirectories(){
		LinkedList<FSElement> child = new LinkedList<FSElement>();
		for(FSElement e: children) {
				child.add(e);
		}
		return child;
	}
	
	public LinkedList<File> getFiles(){
		LinkedList<File> child = new LinkedList<File>();
		for(FSElement e: children) {
			if(!e.isDirectory())
				child.add((File) e);
		}
		return child;
	}
	public static void main(String[] args) {
		System.out.println("Directory Class Successfully Run!!");
	}
}