import java.io.*;
import java.util.*;


public class TwoStrings
{
	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2)
	{
		long startTime = System.nanoTime();
		char[] searching;
		char[] searched;
		if (s1.length() >= s2.length())
		{
			searched = s1.toCharArray();
			searching = s2.toCharArray();
		}
		else
		{
			searched = s2.toCharArray();
			searching = s1.toCharArray();
		}

		for (char c : searching)
		{
			if (Arrays.binarySearch(searched, 0, searched.length, c) >= 0)
			{
				System.out.println("YES");
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				System.out.println(timeElapsed);
				return "YES";
			}
		}
		System.out.println("NO");
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(timeElapsed);
		return "NO";
	}

	public static void main(String[] args) throws IOException
	{
		String[] s1 = {"aardvark", "beetroot"};
		String[] s2 = {"apple", "sandals"};

		for (int i = 0; i < s1.length; i++)
		{
			String result = twoStrings(s1[i], s2[i]);
		}
	}

}
