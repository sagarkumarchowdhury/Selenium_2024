import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorejavaBrushUp1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};
		System.out.println(numbers[1]);
		for(int i = numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		
		ArrayList arr = new ArrayList();
		arr.add("Sagar");
		arr.add(1);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr.add("Sagar");
		arr.add("James");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		
		List<int[]> newarrayList = Arrays.asList(numbers);

	}

}
