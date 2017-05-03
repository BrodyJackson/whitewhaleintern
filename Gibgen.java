import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Gibgen
{
	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("No Input String Given");
		}
		else
		{
			String[] wordArray = args[0].split(" ");
			for (int i = 0; i < wordArray.length; i ++)
			{
				scrambleWord(wordArray[i]);
				System.out.print(" ");
			}
		}
	}

	public static void scrambleWord (String word)
	{
		char[] originalChars = word.toCharArray();
		List<Character> toShuffle = new LinkedList<Character>();
		for (int j = 1; j < originalChars.length -1; j++)
		{
			if(Character.isLetter(originalChars[j]) && Character.isLowerCase(originalChars[j]))
			{
				toShuffle.add(originalChars[j]);
			}
		}
		Collections.shuffle(toShuffle);
		for (int j = 1; j < originalChars.length -1; j++ )
		{
			if(Character.isLetter(originalChars[j]) && Character.isLowerCase(originalChars[j]) && toShuffle.size() != 0)
			{
				originalChars[j] = toShuffle.remove(0);
			}
		}
		String shuffledWord = new String(originalChars);
		System.out.print(shuffledWord);
	}
}
