import java.util.Stack;

import Main.SortedStack;

public class Main {
	
	public static void main(String[] args){
		Main main = new Main();
		
		SortedStack sortedStack = main.new SortedStack();
		
		sortedStack.mainStack.push(4);
		sortedStack.mainStack.push(2);
		sortedStack.mainStack.push(5);
		sortedStack.mainStack.push(3);
		sortedStack.sortStack();
		
		for (int i=0; i<4; i++){
			System.out.println(sortedStack.mainStack.pop());
		}
	}
	
	public class SortedStack {
		
		private int maxSoFar;
		private int buffer;
		private Stack<Integer> addStack;
		public Stack<Integer> mainStack;
		
		public SortedStack() {
			addStack = new Stack<Integer>();
			mainStack = new Stack<Integer>();
		}
		
		/*
		 * Sorts stack such that smallest items are on top
		 */
		public void sortStack(){
			int mainMax = mainStack.size();
			for (int i=0; i< mainMax; i++){
				buffer = 0;
				maxSoFar = Integer.MIN_VALUE;
				shiftStack(i);
			}
			mainStack = addStack;
		}
		
		private void shiftStack(int iteration) {
			while (!mainStack.isEmpty()){
				int temp = (int) mainStack.pop();
				if (temp > maxSoFar){
					if (maxSoFar != Integer.MIN_VALUE){
						addStack.push(maxSoFar);
						buffer++;
					}
					maxSoFar = temp;
				} else {
					addStack.push(temp);
					buffer++;
				}
			}
			
			if (iteration > 0){
				for (int i=0; i<buffer; i++){
					int temp = (int) addStack.pop();
					mainStack.push(temp);
					
				}
				addStack.push(maxSoFar);
			} else {
				mainStack.push(maxSoFar);
				Stack<Integer> temp = mainStack;
				mainStack = addStack;
				addStack = temp;
			}
		}
	}
}