public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1 , 2, 3, 3, 3, 4 , 6};
        System.out.println(BinarySearchIterative(a, 3));
        System.out.println(BinarySearchIterative(a, 5));
        System.out.println(BinarySearchRecursive(a, 0, a.length, 3));
        System.out.println(BinarySearchRecursive(a, 0, a.length, 5));
    }

    public static int BinarySearchIterative(int[] a, int x){
        int l = 0;
        int r = a.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(a[m] == x) {
                return m;
            }

            if(a[m] < x){
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return -1;
    }

    public static int BinarySearchRecursive(int[] a, int l, int r, int x){

        if(l <= r){
            int m = l + (r - l) / 2;
            if(a[m] == x) {
                return m;
            }
            if(a[m] < x){
                l = m + 1;
            }
            else {
                r = m - 1;
            }
            return BinarySearchRecursive(a, l, r, x);
        }

        return -1;
    }
}
