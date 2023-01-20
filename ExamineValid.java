
public class ExamineValid {
	public static  String validChecking(String input) {
		int openBraceCheck=0,closeBraceCheck=0;
		for(int pos1=0,pos2=input.length()-1;pos1<input.length();pos1++,pos2--) {
			if(input.charAt(pos1)=='(') {
				openBraceCheck++;
			}
			else if(input.charAt(pos1)==')'){
				openBraceCheck--;
			}
			if(input.charAt(pos2)==')') {
				closeBraceCheck++;
			}
			else if(input.charAt(pos2)=='(') {
				closeBraceCheck--;
			}
		}
		if(openBraceCheck==0&&closeBraceCheck==0)
			return "Valid";
		return "Invalid";
	}
	
	public static void main (String args[]) {
		String s="(a+b)a*b)";
		System.out.println(validChecking(s));
	}
}
