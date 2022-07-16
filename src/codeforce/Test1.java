package codeforce;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            for(int i =0;i<s.length();i++) {
                set.add(s.charAt(i));
            }
            System.out.println(n+set.size());
        }

    }
}
