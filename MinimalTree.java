
public class Main {
	
	public static void main(String[] args){
		Main main = new Main();
		int[] input = new int[]{1,2,3,4,5,6,7};
		MinimalTree tree = main.arrayToMinimalTree(input);
		System.out.println(tree);
	}

	public MinimalTree arrayToMinimalTree(int[] input) {
		int mid = input[(input.length/2)+1];
		MinimalTree answer = new MinimalTree();
		Node root = new Node(mid);
		answer.root = root;
		
		int midpos = (input.length/2)+1;
		int counter = 1;
		while (true){
			
			if (midpos-(2*counter)-1 > 0) {
				Node leftroot = new Node(input[midpos-(2*counter)]);
				Node leftleft = new Node(input[midpos-(2*counter)]-1);
				Node leftright = new Node(input[midpos-(2*counter)]+1);
			} else {
				if (midpos-(2*counter) > 0) {
					Node leftroot = new Node(input[midpos-(2*counter)+1]);
					Node leftleft = new Node(input[midpos-(2*counter)]);
				} else {
					Node leftroot = new Node(input[midpos-(2*counter)+1]);
				}
			}

			if (midpos+(2*counter)+1 < input.length) {
				Node rightroot = new Node(input[midpos+(2*counter)]);
				Node rightleft = new Node(input[midpos+(2*counter)]-1);
				Node rightright = new Node(input[midpos+(2*counter)]+1);
			} else {
				if (input[input[midpos+(2*counter)]])
			}

			else {
				break;
			}
			counter++;
		}

	return new MinimalTree();
	} 

	public class MinimalTree {
		public Node root;

		public MinimalTree() {

		}
	}

	static class Node {
        public int value;
        public Node[] children;

        public Node(int val) {
			this.value = val;
		}
    }
	
}
