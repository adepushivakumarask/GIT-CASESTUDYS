package casestudy;

public class BinarySearch {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int position = binarySearch(array, target);
        if (position != -1) {
            System.out.println("Target element found at position " + position);
        } else {
            System.out.println("Target element not found in the array");
        }
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
