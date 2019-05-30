import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumToys
{
	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k)
	{
		ArrayList<Integer> toyOptions = new ArrayList<>();
		int cash = k;
		int numberOfToys = 0;

		for (int price : prices)
		{
			if (price <= cash)
			{
				toyOptions.add(price);
			}
		}

		Collections.sort(toyOptions);

		for (Integer toy : toyOptions)
		{
			if (cash >= toy)
			{
				numberOfToys++;
				cash = cash - toy;
			}
		}

		return numberOfToys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{

		int[] prices = {1, 12, 5, 111, 200, 1000, 10};


		int result = maximumToys(prices, 50);
		System.out.print(result);
	}
}
