import java.util.ArrayList;
import java.util.Scanner;

public class CodeTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers with spaces, To stop input Enter 0");
        while(s.hasNextInt()){
            int v=s.nextInt();
            ar.add(v);
            System.out.println("new set = "+ar);
            if(v==0){
                break;
            }
        }
        s.close();
        System.out.println("\nFinal set = "+ar);
    }
}
