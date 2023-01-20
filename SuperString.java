import java.util.Arrays;

public class SuperString {
	public static boolean superString(String x,String[]y) {
		char xString[]=x.toCharArray();
		Arrays.sort(xString);
		for(int pos=0;pos<y.length;pos++) {
			String yString=y[pos];
			if(xString.length<yString.length())
				return false;
			int subpos=0,xpos=0;
			while(subpos<yString.length()&&xpos<xString.length) {
				if(yString.charAt(subpos)<xString[xpos])
					return false;
				else if(yString.charAt(subpos)==xString[xpos]) {
					subpos++;
					xpos++;
				}
				else if(yString.charAt(subpos)>xString[xpos]) {
					xpos++;
				}
			}
		}
		return true;
	}
	public static void main (String args[]) {
		String x[]= {"adseaver","adseaver","aers"};
		String y[]= {"adse","aver"};
		for(int pos=0;pos<y.length;pos++) {
			char temp[]=y[pos].toCharArray();
			Arrays.sort(temp);
			String s="";
			for(int i=0;i<temp.length;i++) {
				s+=temp[i];
			}
			y[pos]=s;
			s="";
		}
		int count=0;
		boolean sub=false;
		for(int pos=0;pos<x.length;pos++) {
			
			sub=superString(x[pos],y);
			if(sub) {
				count++;
			}
		}
		System.out.print(count);
	}
}
