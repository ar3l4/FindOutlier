public class FindOutlier{
  static int find(int[] arr){
  boolean even = false;
		int counter = 0;

		if (arr[0] %2 == 0) {
			counter++;
		}
		if (arr[1] %2 == 0) {
			counter++;
		}
		if (arr[2] %2 == 0) {
			counter++;
		}

		if (counter >= 2) {
			even = true;
		}

		int i = 0;

		if (even == true) {
			while (true) {
				if (arr[i] %2 != 0) {
					return arr[i];
				}
				i++;
			}
		}

		else {
			while (true) {
				if (arr[i] %2 == 0) {
					return arr[i];
				}
				i++;
			}
		}
	}
}
