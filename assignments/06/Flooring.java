class Flooring {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 12, 23, 25, 39};
        int target = 8;
        System.out.println(flooring(arr, target));
    }    


    static int flooring(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}
