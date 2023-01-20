import java.util.Arrays;

public class SumSubArray {
	public static int splitpos(int [] array) {
		int pos1=0,pos2=array.length-1,sum1=array[pos1],sum2=array[pos2];
		while(pos1!=pos2) {
			if(sum1<=sum2) {
				pos1++;
				if(pos1==pos2)
					break;
				sum1+=array[pos1];
			}
			if(sum1>sum2) {
				pos2--;
				if(pos1==pos2)
					break;
				sum2+=array[pos2];
			}
		}
		if(sum1==sum2) {
			return pos1;
		}
		return 0;
	}
	public static void main(String args[]) {
		int array[]= {1,2,3,1,5};
		int position=splitpos(array);
		if(position==0) {
			System.out.println("Array not able to seperate");
		}
		else {
			int sumSubArray1[]=Arrays.copyOf(array, position);
			int	sumSubArray2[]=Arrays.copyOfRange(array, position,array.length);
			System.out.println(Arrays.toString(sumSubArray1));
			System.out.println(Arrays.toString(sumSubArray2));
		}
	}

}
