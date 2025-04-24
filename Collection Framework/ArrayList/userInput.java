import java.util.ArrayList;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> myList=new ArrayList<>();
        System.out.println("how many digit you want to store in the ArrayList :");
        int number=sc.nextInt();

        for(int i=0;i<number;i++){
            System.out.println("enter the element:");
            int num=sc.nextInt();
            myList.add(num);

        }
        System.out.println(" the numbers in the list are:");
        for(int j:myList){

            
            System.out.println(j);
        }
        
    }
    
}
