public class Ques2 {

    public static void printTotalScore(String[] values){
        int sum = 0;
        for(String num : values){
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}