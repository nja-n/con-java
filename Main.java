import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements count : ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            h.add(s.nextInt());
        }
        s.close();
        System.out.println(h);
        String a="hdi";
        Map<Integer,Integer> hMap=new HashMap<>();
    }
}