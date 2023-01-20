public class RefStringCount {
	public static void main(String[]args) {
		String input="Hello World Please";
		input=input.toLowerCase();
		String refString="Help";
		refString=refString.toLowerCase();
		int count=0;
		for(int pos=0;pos<refString.length();pos++) {
			for(int inputpos=0;inputpos<input.length();inputpos++) {
				if(input.charAt(inputpos)==refString.charAt(pos)) {
					count++;
				}
			}
			System.out.print(refString.charAt(pos)+":"+count+" ");
			count=0;
		}
	}
}
