package fixxx;
import java.util.*;

public class Matrix 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double[][] arr = new double[3][4];
    	
    	for(int i = 0; i < 3; i++)
    	{
    		for(int j = 0; j < 4; j++)
    		{
    			arr[i][j] = (int)(20*Math.random());
    		}
    	}
    	
    	for(int i = 0; i < 3; i++)
    	{
    		for(int j = 0; j < 4; j++)
    		{
    			System.out.print((int)arr[i][j]);
    			System.out.print(" ");
    		}
    		System.out.println(" ");
    	}
    	
    	double temp;
    	//1-1
    	temp = arr[0][0];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[0][j] = arr[0][j]/temp;
    	}
    	//2-1
    	temp = arr[1][0];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[1][j] = arr[1][j]-arr[0][j]*temp;
    	}
    	//2-2
    	temp = arr[1][1];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[1][j] = arr[1][j]/temp;
    	}
    	//3-1
    	temp = arr[2][0];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[2][j] = arr[2][j]-arr[0][j]*temp;
    	}
    	//3-2
    	temp = arr[2][1];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[2][j] = arr[2][j]-arr[1][j]*temp;
    	}
    	//3-3
    	temp = arr[2][2];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[2][j] = arr[2][j]/temp;
    	}
    	//2-3
    	temp = arr[1][2];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[1][j] = arr[1][j]-arr[2][j]*temp;
    	}
    	//1-2
    	temp = arr[0][1];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[0][j] = arr[0][j]-arr[1][j]*temp;
    	}
    	//1-3
    	temp = arr[0][2];
    	for(int j = 0; j < 4; j++)
    	{
    		arr[0][j] = arr[0][j]-arr[2][j]*temp;
    	}
		
    	//
    	System.out.println(" ");
    	for(int i = 0; i < 3; i++)
    	{
    		for(int j = 0; j < 4; j++)
    		{
    			System.out.print((int) arr[i][j]);
    			System.out.print(" ");
    		}
    		System.out.println(" ");
    	}
    	System.out.println();
    	
    	//
    	System.out.println("x = "+arr[0][3]);
    	System.out.println("y = "+arr[1][3]);
    	System.out.println("z = "+arr[2][3]);
	}
	

}
