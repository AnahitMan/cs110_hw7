import utils.ArrayUtils;
import animals.Puppy;
import utils.Math;
public class Driver {
	public static void main(String[] args) {
		Puppy joey = new Puppy("Joey");
		System.out.println(joey.getName());
		Puppy chandler = new Puppy("Chandler");
		System.out.println(chandler.getName());
		Puppy ross = new Puppy("Ross");
		System.out.println(ross.getName());

		int[] arr = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(arr);
		System.out.println(ArrayUtils.stringifyArray(arr));
		double n = 15.4;
		System.out.println(Math.factorial((int) n));
	}
}