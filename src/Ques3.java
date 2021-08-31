import java.util.Arrays;

public class Ques3 {
    public static String[] filterEmails(String[] items) {
        String[] list = new String[items.length];
        int cnt = 0;
        for(String item: items){
            if(item.indexOf('@') != -1){
                list[cnt] = item;
                cnt++;
            }
        }
        return Arrays.copyOf(list, cnt);
//        {"adam@example.com", "aab", "john@example.com", "some@"};
//        {"adam@example.com","john@example.com","some@",""} cnt = 3
//        {"adam@example.com","john@example.com","some@"}
    }

    public static void printItems(String[] items) {
//        [1,2,3,4,5]
        System.out.print('[');
        for(int i = 0; i < items.length; i++){
            if(i != items.length - 1){
                System.out.print(items[i] + ", ");
            }
            else{
                System.out.print(items[i]);
            }
        }
        System.out.println(']');
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}