package upgrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainPractica implements Interface{
	
	// setting global variables
	
	static ArrayList <Integer> listaN =new ArrayList<Integer>();
	static int index1, index2, n;
	static Scanner sc = new Scanner(System.in);
	
	// overriding methods
	
	@Override
	public Object product(int ind1, int ind2) {
		Integer product;
		listaN.get(ind1);
		listaN.get(ind2);
		product=listaN.get(ind1)*listaN.get(ind2);
		
		return product;
	}
	
	@Override
	public Object maxValue(ArrayList lista) {
		Integer max=(Integer) Collections.max(lista);
		
		return max;
	}
	
	@Override
	public Object minValue(ArrayList lista) {
		
		Integer min=(Integer) Collections.min(lista);
		return min;
	}

	@Override
	public Object sum(int ind1, int ind2) {
		Integer adition;
		listaN.get(ind1);
		listaN.get(ind2);
		adition=listaN.get(ind1)+listaN.get(ind2);
		
		return adition;
	}
	
	public void addValues(int value) {
		for(int i=0;i<value;i++) {
			listaN.add(i);
		}
		
		
	}
	public int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }  
	
	public boolean isPrime(int number) {
		boolean isPrime = false;
		int i = (int) Math.ceil(Math.sqrt(number));
		while (i > 1) {
			if ((number != i) && (number % i == 0)) {
				isPrime = false;
				break;
			} else if (!isPrime)
				isPrime = true;
			--i;
		}
		return isPrime;
	}
	
	public void printPrime(ArrayList <?> list) {
		Integer array[] = new Integer[list.size()];
		array = list.toArray(array);
		System.out.println("Prime Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				System.out.println(array[i]);
			}
		}
		
	}
	
	
	public static void main (String args[]) {
		MainPractica obj= new MainPractica();
		
		//index1=5;
		//index2=4;
		int value;
		try {
		System.out.println("How many values will have the arrayList ");
		value=sc.nextInt();
		obj.addValues(value);
		System.out.println("enter the value of index 1 : ");
		index1=sc.nextInt();
		System.out.println("enter the value of index 2 : ");
		index2=sc.nextInt();
		System.out.println("the product value is "+obj.product(index1,index2));
		System.out.println("the maximun value is "+obj.maxValue(listaN));
		System.out.println("the minimun value is "+obj.minValue(listaN));
		System.out.println("the addititon value is "+obj.sum(index1,index2));
		System.out.println("calculate the factorioal of .. (type the number) ");
		n=sc.nextInt();
		System.out.println("factorial of "+n+" equals to : "+obj.factorial(n));
		System.out.println("*********** Calculating Prime Numbers of the ArrayList");
		obj.printPrime(listaN);
		}catch(Exception e) { // we are capturing any kind of exception throw "Exception"
			System.out.println("Error: "+e.getMessage());
		}
		
	}

	

}
