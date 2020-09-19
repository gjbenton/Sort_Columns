import java.util.List;
import java.util.ArrayList;

public class SortColumns{
	private List<Integer> deletedIndex;
	
	public SortColumns(){
		deletedIndex = new ArrayList<Integer>();
	}
	
	void add(int n){
		deletedIndex.add(n);
	}
	public String toString(){
		return deletedIndex.toString();
	}

	List<Integer> minDeletionSize(String[] given){
		if(valid(given)){
			for(int letter = 0; letter<given[0].length(); letter++){
				for(int word = 0; word < given.length-1; word++){
					if(given[word].charAt(letter) > given[word+1].charAt(letter)){
						if (!deletedIndex.contains(letter))
							deletedIndex.add(letter);
					}					
				}
			}
			return deletedIndex;
		}	
		else
			deletedIndex.add(-1);
			return deletedIndex;
	}
	boolean valid(String[] given){
		//compares the size of the elements in the array, eg returns false for avengers
		for(int i=0; i<given.length-1; i++)
			if(given[i].length() != given[i+1].length())
				return false;
		return true;	
	}

	public static void main(String[] args){
		//expected output [1]
		SortColumns unordered = new SortColumns();
		String[] ex1 = {"cba", "daf", "ghi"};
		unordered.minDeletionSize(ex1);
		System.out.println("Deleted Column Indices: " + unordered);

		//expected output []
		SortColumns inOrder = new SortColumns();
		String[] ex2 = {"a", "b"};
		inOrder.minDeletionSize(ex2);
		System.out.println("Deleted Column Indices: " + inOrder);

		//expected output [0,1,2]
		SortColumns backOrdered = new SortColumns();
		String[] ex3 = {"zyx", "wvu", "tsr"};
		backOrdered.minDeletionSize(ex3);
		System.out.println("Deleted Column Indices: " + backOrdered);
		
		//expected output [-1]
		SortColumns avengers = new SortColumns();
		String[] ex4 = {"Captain", "Marvel", "saved", "the", "Avengers"};
		avengers.minDeletionSize(ex4);
		System.out.println("Deleted Column Indices: " + avengers);
		
	}
}
