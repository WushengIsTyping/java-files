/**
 * This file is for java basic grammar practice.
 * Test whatever you want to try in a seperate method, if you don't need the output, make it a comment.
 * 
 * Test included:
 * 1. grammarTest (if, while, for)
 * 2. sortTest1&2 (two ways of sorting an array)
 * 
 * 
 *  */
import java.util.Arrays;

public class grammarPractice{
    public static void main(String[] args) {
        // "main" for main method

        System.out.println("Hello World!");

        for (int k = 0; k < args.length-1; k++){
            String arg = args[k];
            System.out.println(arg);
            if (arg.equals("-version")){
                System.out.println("v 1.o");
                break;
            }
        }

        System.out.println("Result of grammarTest.");
        grammarTest();
        System.out.println("Result of sortTest1:");
        sortTest1();
        System.out.println("Result of sortTest2:");
        sortTest2();

    }

    private static void grammarTest(){
        // 浮点数，观察x和y是否相等
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);
        
        // String类型的重赋值不改变存储单元的值，只是改变变量的指向
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
        t = s;
        System.out.println(t);

        int n = 1;
        while(n <= 10){
            System.out.println(n);
            n ++;
        }

        int n2 = 1;
        int sum = 0;
        do {
            sum = sum + n2;
            n2 ++;
        } while (n2 <= 10);
        System.out.println(sum);

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    private static void sortTest1(){
        // 冒泡排序
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));

        for (int i = 0; i < ns.length-1; i++){
            for (int j = 0; j < ns.length-i-1; j++){
                if(ns[j] > ns[j+1]){
                    int tmp = ns[j+1];
                    ns[j+1] = ns[j];
                    ns[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }

    private static void sortTest2(){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }

    
}