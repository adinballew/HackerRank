import java.lang.reflect.Array;
import java.util.*;

public class RansomMagazine
{

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note)
	{
		Map<String, Integer> magazineOccurences = new HashMap<>();
		Map<String, Integer> ransomOccurences = new HashMap<>();

		for (String word : magazine)
		{
			if (!magazineOccurences.containsKey(word))
			{
				magazineOccurences.put(word, 0);
			}
			magazineOccurences.put(word, magazineOccurences.get(word) + 1);
		}

		for (String word : note)
		{
			if (!ransomOccurences.containsKey(word))
			{
				ransomOccurences.put(word, 0);
			}
			ransomOccurences.put(word, ransomOccurences.get(word) + 1);
		}

		for (String key : ransomOccurences.keySet())
		{
			if (!magazineOccurences.containsKey(key))
			{
				System.out.print("No");
				return;
			}
			int needed = ransomOccurences.get(key);
			if (magazineOccurences.get(key) < needed)
			{
				System.out.print("No");
				return;
			}
		}

		System.out.print("Yes");
	}

	public static void main(String[] args)
	{
		String[] magazine = {"two", "times", "three", "is", "not", "four"};
		String[] note = {"two", "times", "two", "is", "four"};

		checkMagazine(magazine, note);
	}
}
