import java.util.HashSet;
import java.util.Scanner;

public class CodeTask1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<>();
        System.out.println("Enter Numbers with spaces, To stop input Enter 0");
        while(s.hasNextInt()){
            int v=s.nextInt();
            h.add(v);
            System.out.println("new set = "+h);
            if(v==0){
                break;
            }
        }
        s.close();
        System.out.println("\nFinal set = "+h);
    }
}
