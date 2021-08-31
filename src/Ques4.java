import java.util.Arrays;
import java.util.Scanner;

public class Ques4 {



    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Your expenses while overseas?");
        line = in.nextLine();
        String[] words = line.split(",| ");
        String[] money = new String[words.length];
        int cnt = 0;
        for(String word: words){
            if(!word.equals("") && word.charAt(0) == '$'){
                money[cnt] = word;
                cnt++;
            }
        }
        money = Arrays.copyOf(money, cnt);
        double totalMoney = 0;
        System.out.print("Expenses in overseas currency:");
        System.out.print('[');
        for(int i = 0; i < money.length; i++){
            if(i != money.length - 1){
                System.out.print(money[i] + ", ");
            }
            else{
                System.out.print(money[i]);
            }
            totalMoney += Double.parseDouble(money[i].substring(1));
        }
        System.out.println(']');
        System.out.println(String.format("Total in local currency: $%.2f", totalMoney * 1.7));
    }


}