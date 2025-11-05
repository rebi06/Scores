/**2025/11/06
*/
import java.util.Scanner;

public class Scores{
		int[] score = new int[3];
	
	public int sum(){
		int retv = 0;
		for(int w: score){
			retv += w;
		}
		return retv;
	}

	public int average(int a ){
		return a/score.length;
		
	}
	
	public int max(){
		int index = score[0];
		for(int i=0;i<score.length;i++){
			if(score[i]>index){
				index = score[i];
			}
		}
		return index;
	}
	
	public int min(){
		int index = score[0];
		for(int i=0;i<score.length;i++){
			if(score[i]<index){
				index = score[i];
			}
		}
		return index;
	}

	
	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		Scores so = new Scores();
		for(int i =0; i<3; i++){
		 so.score[i] = sc.nextInt();
		 
		}
		
		System.out.printf("合計値は%d\n",so.sum());
		System.out.printf("平均値は%d\n",so.average(so.sum()));
		System.out.printf("最高値は%d\n",so.max());
		System.out.printf("最低値は%d\n",so.min());
		sc.close();
	}
}


/**学び点
*拡張for文の使い方
*配列の宣言の仕方
*配列にあとからscannerで入れる方法
*メソッドを呼び出す時に()を忘れない
*scannerを閉じる癖つける
*staticとnon-staticの仕組みを理解した（new Scoresの順番が悪かった)
*最低値を出す際に初期値をどの値にするかを理解した
*/
