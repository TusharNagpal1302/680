package edu.umb.cs680.hw16;

public interface FSVisitor<T> {
	public void visit(ApfsLink link) ;
	public void visit(ApfsDirectory dir);
	public void visit(ApfsFile file) ;
}
