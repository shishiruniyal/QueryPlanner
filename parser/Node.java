package parser;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private String operation;
	private double cost;
	private List<Node> childrens;
	Node(String op, double co){
		this.operation = op;
		this.cost = co;
		childrens = new ArrayList();
	}
	public void addchild(Node child){
		childrens.add(child);
	}
	public List<Node> getchildrens() {
		return childrens;
	}
	
	public String toString() {
		return "Operation: "+operation+" cost: "+cost+"\n"; 
	}
}
