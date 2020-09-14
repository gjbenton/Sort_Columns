import java.util.List;
import java.util.ArrayList;

public class SortColumns{
	private List<Integer> values;
	
	public SortColumns(){
		values = new ArrayList<Integer>();
	}

	void add(int n){
		values.add(n);
	}
	public String toString(){
		return values.toString();
	}

	


	public static void main(String[] args){
		SortColumns unordered = new SortColumns();

		//7-6-8- example desired output is [1]
		unordered.add(7);
		unordered.add(6);
		unordered.add(8);

		System.out.println(unordered);
	}
}