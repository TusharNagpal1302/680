package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Link extends FSElement {

	LinkedList<FSElement> children = new LinkedList<FSElement>();
	FSElement target;
	
	public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target) {
		super(parent, name, size, creationTime);
		this.target = target;
	}

	@Override
	public Boolean isDirectory() {
		return true;
	}

	public FSElement getTargetLink() {
		return target;
	}
	
	public void setTargetLink(FSElement target) {
		this.target = target;
	}
	public static void main(String[] args) {
		System.out.println("Link Class Successfully Run!!");
	}
	
	
}