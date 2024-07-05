package Arraydetails;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 6, 7, 9 };
		int item = 7;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (a[mi] == item) {
				System.out.println("Item is present at" + mi + "index Position");
				break;
			} else if (a[mi] < item) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}

		if (li > hi)

		{
			System.out.println("Item not found");
		}

	}

}
