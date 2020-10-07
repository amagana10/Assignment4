import acm.program.*;

public class DeleteChar extends ConsoleProgram{
	
	public void run() {
		
		println(removeAllOccurrences("This is a test", 't')); //returns "This is a es"
		println(removeAllOccurrences("Summer is here!", 'e')); //returns "Summr is hr"
		println(removeAllOccurrences("---0---", '-')); //returns "0"

	}
	
	
	public String removeAllOccurrences(String str, char ch) {
		
		int index = str.indexOf(ch);
		while(index != -1) {
			str = str.substring(0,index) + str.substring(index+1);
			index = str.indexOf(ch);
		}
		
		return str;
	}

}
