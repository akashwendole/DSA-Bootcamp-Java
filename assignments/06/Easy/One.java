class One {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }
    
    static int mySqrt(int x) {
        int start = -46340;
        int end = 46340;
        int mid = 0;
        while (start <= end) {
            if (mid * mid == x) {
                return mid;
            }
            else if (mid * mid < x) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}
