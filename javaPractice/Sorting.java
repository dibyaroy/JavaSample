package javaPractice;

import java.util.Arrays;

public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int givenArray[] = {3,1,78,4,5,96,56};
		
		int temp=0;
		
		for(int i=0;i<givenArray.length;i++)
		{
			for(int j=i+1;j<givenArray.length;j++)
			{
				if(givenArray[i]>givenArray[j])
				{
					temp=givenArray[i];
					givenArray[i]=givenArray[j];
					givenArray[j]=givenArray[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(givenArray));
		

	}

}
