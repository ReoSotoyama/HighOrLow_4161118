import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;  // 正解を作る
	    int number=0;                           // 入力数
	    int count;

	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1から100までの間だよ。");

        for(count=0;number!=answer;count++){
          System.out.print("数字を入れてね : ");
          Scanner s = new Scanner(System.in);
          number=Integer.parseInt(s.next());
          if(number<answer)
            System.out.println("もっと上だよ。");
          else if(number>answer)
            System.out.println("もっと下だよ。");
        }
        System.out.println("当たり！！  "+count+"回でした。");
	}

}
