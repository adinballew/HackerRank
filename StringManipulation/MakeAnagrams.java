import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MakeAnagrams
{
	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b)
	{
		HashMap<Character, Integer> aOccurrences = new HashMap<>();
		HashMap<Character, Integer> bOccurrences = new HashMap<>();
		int deletionCount = 0;

		for (char c : a.toCharArray())
		{
			if (aOccurrences.containsKey(c))
			{
				aOccurrences.replace(c, aOccurrences.get(c) + 1);
			}
			else
			{
				aOccurrences.put(c, 1);
			}
		}

		for (char c : b.toCharArray())
		{
			if (bOccurrences.containsKey(c))
			{
				bOccurrences.replace(c, bOccurrences.get(c) + 1);
			}
			else
			{
				bOccurrences.put(c, 1);
			}
		}

		Iterator it = aOccurrences.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry) it.next();
			if (!bOccurrences.containsKey(pair.getKey()) || bOccurrences.get(pair.getKey()) == null)
			{
				deletionCount = deletionCount + (int) pair.getValue();
				System.out.println("Character: " + pair.getKey() + " deleted " + pair.getValue() + " times from a");
			}
			else
			{
				if (bOccurrences.containsKey(pair.getKey()) && pair.getKey() != bOccurrences.get(pair.getKey()))
				{
					deletionCount = deletionCount + Math.abs((int) pair.getValue() - bOccurrences.get(pair.getKey()));
				}
				bOccurrences.remove(pair.getKey());
			}
			it.remove();
		}

		Iterator it2 = bOccurrences.entrySet().iterator();
		while (it2.hasNext())
		{
			Map.Entry pair = (Map.Entry) it2.next();
			if (!aOccurrences.containsKey(pair.getKey()) || aOccurrences.get(pair.getKey()) == null)
			{
				deletionCount = deletionCount + (int) pair.getValue();
				System.out.println("Character: " + pair.getKey() + " deleted " + pair.getValue() + " times from b");
			}
			it2.remove();
		}

		return deletionCount;
	}

	public static void main(String[] args) throws IOException
	{
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

		int res = makeAnagram(a, b);
		System.out.print(res);
	}
}
