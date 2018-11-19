import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("「１２３４」");
			String str = br.readLine();
			int i = Integer.parseInt(str);
			boolean b1 = !(i ==1234);
			
			while (b1) {
				System.out.println("１２３４と入力してください");
				str = br.readLine();
				i = Integer.parseInt(str);
			}
			System.out.println("正しく入力されました");
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
