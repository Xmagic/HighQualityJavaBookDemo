import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLarge {
	
	
	public static void main(String args[])
	{
		Integer[] a  = {3,2,12,22,22,77,77,55,87};
		List<Integer> list = Arrays.asList(a);
		TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
		
		System.out.println(treeSet);
		System.out.println("biggest number:" + treeSet.last());
		System.out.println("2nd biggest number:" + treeSet.lower(treeSet.last()));
		
//		int[] a  = {3,2,12,22,22,77,77,55,87};
//		System.out.println(Arrays.asList(a).size()); //size is 1, it's a Array Object
	}
}
