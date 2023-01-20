
public class CoinsCombination {
//method to count the coins that provided.
	public static void count(int[]count,int[]input) {
		for(int pos=0;pos<input.length;pos++) {
			if(input[pos]==10)
				count[0]+=1;
			if(input[pos]==5)
				count[1]+=1;
			if(input[pos]==2)
				count[2]+=1;
			if(input[pos]==1)
				count[3]+=1;
		}
	}
		public static void main(String args[]) {
			//coinCount array represent the counts of coins 10,5,2,1 in sequence order.
			int coinCount[]=new int[4];
			int input[]= {1,1,1,1,2,3,4,5,5,5,10,10};
			int amount=20;
			int sum=0;
			int result=0;
			for(int pos=0;pos<input.length;pos++) {
				sum+=input[pos];
			}
			if(sum<amount)
				System.out.println(-1);
			else if(sum==amount)
				System.out.println(input.length);
			else {
				count(coinCount,input);
				while(amount!=0) {
					if(amount>=10&&coinCount[0]!=0) {
						amount-=10;
						result++;
						coinCount[0]--;
					}
					else if(amount>=5&&coinCount[1]!=0) {
						amount-=5;
						result++;
						coinCount[1]--;
					}
					else if(amount>=2&&coinCount[2]!=0) {
						amount-=2;
						result++;
						coinCount[2]--;
					}
					else if(amount>=1&&coinCount[3]!=0) {
						amount-=1;
						result++;
						coinCount[3]--;
					}
					
				}
				System.out.println(result);
			}
		}
}
