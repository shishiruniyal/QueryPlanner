package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class queryPlanParser {
	static Node root;
	public static void main(String args[]) throws IOException {
		String line;
		FileReader fileReader = new FileReader("/home/shishir/eclipse-workspace/parser/src/parser/content.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			root = getRoot(bufferedReader);
			if(root != null) {
				System.out.println(root.toString());
			}
	}
	
	private static Node getRoot(BufferedReader bf) throws IOException {
		String line = bf.readLine();
		while(line != null && !line.contains("|")) {
			line = bf.readLine();
		}
		if(line ==null) {
			System.out.println("No root found");
			return null;
		}
		line = bf.readLine();
		String op =bf.readLine().trim();
		bf.readLine();
		line = bf.readLine().trim();
		double cost = Double.parseDouble(line);
		line = bf.readLine();
		return new Node(op,cost);
	}
}