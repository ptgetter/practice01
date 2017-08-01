package practice01;

public class Prob5 {
	public static void main(String[] args) {
		
		int lastNumber = 99;
		
		for(int i=1; i<=lastNumber; i++) {
			String s = String.valueOf(i);
			String clapSound = "";
			
			for(int j=0; j<s.length(); j++) {
				int nowNumber = Integer.parseInt(String.valueOf(s.charAt(j)));
				if(nowNumber !=0 && nowNumber % 3 == 0) {
					clapSound += "짝";
				}
			}
			System.out.printf("%d %s\n", i, clapSound);
		}

	}
}