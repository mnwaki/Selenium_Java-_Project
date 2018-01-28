package com.pages;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class SortAlgorith {

	public enum tens {Twenty, Thirty, Forty, Fifty, Sixty, Seventy, Eighty, Ninety}
    public enum ones {One, Two, Three, Four, Five, Six, Seven, Eight, Nine}
    public enum tenPlusNums { Ten, Eleven, Twelve, Thirteen, Fourteen, Fifteen, Sixteen, Seventeen, Eighteen, Nineteen}
    public static String text = "";
    
    

	//1. Index of the value 6 =4
    public int getIndex(){
    	int index =0;
    	int[] a ={5,9,2,0,6};
		
		for(int i=0; i<a.length; i++){
			if(a[i]==6){
				index =i;
			}
		}
		System.out.println(" i:= " + index);
		return index;
		
	}
    
	
	//2. Add all values
	
public int addArrayVal(int[] a){
		int sum =0;
		for(int i =0; i<a.length;i++){				
				sum = sum +a[i];
			}
		
		System.out.println("sum:= " + sum);
		return sum;
	}
	
	//3. sort
	public int[] sortArray(int[] a){
		
		int min=0;
		for(int i =0; i<a.length-1;i++){			
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					min=a[i];
					a[i]=a[j];
					a[j] =min;	
				}
			}
		}
		for(int p=0;p<a.length; p++){
			System.out.print(". " + a[p]);
		}
		return a;
	}
	
//Q2
public static void printText(int num)
{
    if(!(num > 9 && num < 19))
    {
        if(num % 10 > 0)
            getOnes(num % 10);

        num = num / 10;
        if(num % 10 > 0)
        	getTens(num % 10);
        	num = num / 10;

        	if(num < 0)
        		getSpecialNums(num % 10);
    	}
}

public static void getSpecialNums(int num)
{
    text = tenPlusNums.values()[num]+ " " + text;
}


public static void getTens(int num)
{
    text = tens.values()[num - 2]+ " " + text;
}

public static void getOnes(int num)
{
    text = ones.values()[num - 1]+ " " + text;
}


	public static void main(String[] args) {
		
		SortAlgorith sa = new SortAlgorith();
		int[] a ={5,9,2,0,6};
		sa.addArrayVal(a);
		sa.sortArray(a);
		sa.getIndex();
		
		System.out.println("Enter Number ");
        Scanner sc = new Scanner(System.in);
        long val = sc.nextInt();
        int temp = 0;
        int i = 0;
        while(val > 0)
        {
            if(i == 0){
            	temp = (int) (val % 1000);
                printText(temp);
                System.out.println("...." + temp);
                val = val / 1000;
                i++;
            }
            else if(val > 0)
            {
            	temp = (int) (val % 100);
                if(temp > 0)
                printText(temp);
                val = val / 100;
                i++;
            }
        }
        if(i > 0)
            System.out.println(text);
        else
            System.out.println("Zero");
    }
		

}
