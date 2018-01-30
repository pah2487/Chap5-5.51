import java.util.Scanner;
public class CommonPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = sc.next();
        System.out.println("Enter the second string:");
        String string2 = sc.next();
        int count = 1;
        String prefix = "";
        while((count) <= string1.length()){
            if (string1.contains(string2.substring((count-1),count))){
                prefix = prefix+string2.substring((count-1),count);
            }else{
                break;
            }
            count++;
        }
        System.out.println("The prefix is: "+prefix);

    }

}
