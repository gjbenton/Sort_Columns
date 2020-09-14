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
	int size(){
		return values.size();
	}
	int get(num){
		return values.get(num);
		//java:20: error: <identifier> expected
	}

	SortColumns minDeletionSize(SortColumns given){
		SortColumns del = new SortColumns();
		
		for(int i=0; i<given.size()-1; i++){
			if(given.get(i)> given.get(i+1))
				del.add(given.get(i));
		}

		return del;
	}

	void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	int findSmallest(int[] arr, int start){
		//int small = arr[0];
		int smallest = start;
		for(int i=start+1; i<arr.length; i++){
			if(arr[i]<arr[smallest])
				smallest = i;
		}
		return smallest;
	}
	void sort(int[] arr){
		for(int i=0; i<arr.length - 0; i++)
			swap(arr, i, findSmallest(arr, i));
	}


	public static void main(String[] args){
		SortColumns unordered = new SortColumns();
		//7-6-8- example desired output is [1]
		unordered.add(7);
		unordered.add(6);
		unordered.add(8);
		System.out.println(unordered);
		
		SortColumns deleted = unordered.minDeletionSize(unordered);
		System.out.println("Deleted Column Indices: " + deleted);

		SortColumns ordered = new SortColumns();
		ordered.add(121);
		ordered.add(542);
		ordered.add(963);
		
	}
}