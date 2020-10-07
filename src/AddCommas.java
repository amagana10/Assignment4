import acm.program.*;

public class AddCommas extends ConsoleProgram {
	
	public void run() {
		 while (true) {
		 String digits = readLine("Enter a numeric string: ");
		 if (digits.length() == 0) break;
		 println(addCommasToNumericString(digits));
		 }
	}
	
	private String addCommasToNumericString(String digits) {
		String commaNum = "";
		
		for(int i = 1; i <= digits.length();i++ ) {
			char lastChar = digits.charAt(digits.length()-i);
			
			commaNum = lastChar + commaNum;
			
			if(i % 3 == 0 && i != digits.length()) {
				commaNum = "," + commaNum;
			}
		}
		
		return commaNum;
	}

}
