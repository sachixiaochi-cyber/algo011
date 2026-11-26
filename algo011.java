import java.util.Scanner;

class algo011{
    public static void main(String[] args){

        //初期処理
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        sc.nextLine();

        //引数を文字列から整数に変換
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        //操作番号Xと一致した場合、回数を記録
        int count = 0;
        for (int i = 0; i < n; i++){
            if(x == numbers[i]){
                count += 1;
            }
        }

        //出力結果
        System.out.println(count);
    }
}