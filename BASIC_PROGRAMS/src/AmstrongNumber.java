public class AmstrongNumber {
	static boolean isAmstrong(int num) {
		int temp,digits=0,last=0,sum=0;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;//153%10=3; 15%10=5 ,1%10=1
			sum=(int) (sum+Math.pow(last, digits));//0+3^3=27, 27+5^3=152 ,152+1^3=153
			temp=temp/10;//153/10=15 ,15/10=1 ,1/10=0
			}
		if(num==sum) {
			return true;
		}
		else
			return false;
		}

	public static void main(String[] args) {
		int num=153;
		if(isAmstrong(num))//1^3+5^3+3^3=153
		{
			System.out.println("I am an amstrong number");
		}
		else
			System.out.println("I am not an amstrong number");
	}


	}

