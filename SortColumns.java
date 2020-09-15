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
	int size(){
		return deletedIndex.size();
	}
	int get(int num){
		return deletedIndex.get(num);
	}

	List<Integer> minDeletionSize(String[] given){
		//recognizes beginning & middle but not END indices
		for(int word = 0; word<given.length-1; word++){
			for(int letter = 0; letter < given.length; letter++){
				if(given[word].charAt(letter) >= given[word+1].charAt(letter))
					deletedIndex.add(letter);
			}
		}
		return deletedIndex;
	}

	public static void main(String[] args){
		SortColumns unordered = new SortColumns();

		String[] values = new String[2];
		values[0]= "efc";
		values[1]= "abd";

		System.out.println(values);
		
		unordered.minDeletionSize(values);
		System.out.println("Deleted Column Indices: " + unordered);

		// SortColumns ordered = new SortColumns();
		// ordered.add("121");
		// ordered.add("542");
		// ordered.add("963");
		
	}
}