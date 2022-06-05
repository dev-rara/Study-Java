public class DivideConquer {

    public static int getMax(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = left + (right - left) / 2;

        left = getMax(arr, left, mid);
        right = getMax(arr, mid + 1, right);

        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 10, 50, 25, 30, 1, 15 };
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}
