class ciling {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 12, 14 ,16};
        int target = 6;
        System.out.println(ceilingNumber(arr, target));
    }    


    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
