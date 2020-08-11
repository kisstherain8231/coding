package demo;

public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        int [] arr = {5, 6,7, 1, 2, 3, 4};
        int target = 6;
        int[] range =   findPos(arr, target);

        int pos = binFind(range[0], range[1], target, arr);
        System.out.println(pos);
    }

    // 查找分界点, 并找出是前半段还是后半段
    public static int[]  findPos(int [] arr, int target) {
        int [] scope = new int [2];
        int start = -1;
        // 假设两段都是升序排列
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                start = i;
            }
        }

        if(arr[start] >= target) {
            scope[0] = 0;
            scope[1] =  start;
        }

        if(arr[start] < target) {
            scope[0] = start+1;
            scope[1] = arr.length - 1;
        }

        return scope;
    }
    // 二分查找
    public  static int  binFind(int left, int right, int target, int [] arr) {

        while(left<= right) {
            int mid = (left + right) / 2;
            int tmp = arr[mid];
            if(target == tmp) {
                return mid;
            } else if(target < tmp) {
                left = left;
                right = mid;
            } else {
                left = mid;
                right = right;
            }
        }

        return  -1;
    }
}
