package basicDataStructure;

public class ArmstrongNumFrom100to500 {

	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;    
	temp=n;    
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{        
	last = temp % 10;     
	sum +=  (Math.pow(last, digits));     
	temp = temp/10;   
	}  
	if(n==sum)     
	return true;        
	else return false;   
	}    
	public static void main(String args[])     
	{     
	int num=500;    
	System.out.println("Armstrong Number from 100 to "+ num + " are: ");  
	for(int i=100; i<=num; i++)    
	if(isArmstrong(i))   
	System.out.print(i+ " ");  
	}   
}
