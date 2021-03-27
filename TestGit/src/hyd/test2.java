package hyd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hyd
 * @version 1.0
 * @Date 2021/2/27 - 02 - 27 - 13:43
 * @Description com.hyd
 */
public class test2 {
    public static final int eng = 18;
    public static void main(String[] args) {
        System.out.println("Hello,world");
        int num = 1;
        int num2 = 0;
        System.out.println(num);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("test2.main");
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        test();
        new test2();
    }

    /**
     *
     */
    public static void test() {
        int[] arr = {1,2,3,4,5};
        for (int value : arr) {
            System.out.println(value);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public test2(){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("aaaaa");
        list.add("bbbbbbbb");
        list.add("ccccccccc");
        if (list2 == null) {

        }
        if (list == null) {

        }
        if (list != null) {
            
        }
        if (list2 != null) {
            
        }
    }
}
