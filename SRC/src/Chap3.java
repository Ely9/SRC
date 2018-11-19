import java.util.*;

public class Chap3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> names = new ArrayList<String>();
		names.add("奏");
		names.add("朝香");
		names.add("ssss");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}

	}

}
