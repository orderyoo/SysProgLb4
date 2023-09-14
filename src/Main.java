import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] team = new int[16][2];
        int num = 1;
        for(int i = 0; i < 16; i++){
           team[i][0] = num;
           num++;
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Количество sms:  ");
        int countSms = in.nextInt();
        while (countSms != 0){
            int sms = in.nextInt();
            team[sms-1][1]++;
            countSms--;
        }
        bubbleSort(team);
        for(int[]i:team){
            if(i[1] != 0){
                System.out.println(i[0] + " " + i[1]);
            }
        }
    }
    public static void bubbleSort(int[][] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1][1] > sortArr[j][1]) {
                    int[] swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}