package Data;

import java.util.Arrays;
import java.util.Scanner;

public class AllStringMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your three name");
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.println("enter your stringname  number of letter");
		int number = sc.nextInt();
		char charAt = a.charAt(number);
		System.out.println("charAt=" + charAt);

		System.out.println("ennter your position number");
		int place = sc.nextInt();
		int result = a.codePointAt(number);
		System.out.println("codepointAt = " + result);

		int result1 = a.codePointBefore(number);
		System.out.println("codepoint before = " + result1);

		System.out.println("name uppercase = " + a.toUpperCase());
		System.out.println("name lowercase = " + a.toLowerCase());
		System.out.println("string name.length = " + a.length());

		System.out.println("two string odd concate method(name and r variable) = " + a.concat(b));
		System.out.println("condentequal when the same word applicable = " + a.contentEquals(b));

		System.out.println("trim method can not applicable start space = " + c.trim());
		System.out.println("startwith is when the same order set = " + a.startsWith(b));
		// System.out.println("endmethod lastletter same ="+a.endsWith(b));
		System.out.println("emtymethode = " + a.isEmpty());
		System.out.println(" contain method in only same name &letter true & false = " + a.contains(b));
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.println("enter your two  word");
		String str = input.nextLine();
		String e = input.nextLine();
		System.out.println("enter your mark");
		int mark = input.nextInt();
		System.out.println("enter your total");
		int total = input.nextInt();
		System.out.println(str.regionMatches(total, e, mark, total));
		System.out.println("value of=" + str.valueOf(str));
		System.out.println("codePointCount used  not unique letter = " + str.codePointCount(mark, total));

		System.out.println("enter your two letter replace");
		String change = input.next();
		String remove = input.next();

		System.out.println("tostring same name =" + str.toString());
		System.out.println("subsequence fixed the number = " + str.subSequence(mark, total));
		System.out.println("substring fixt number the print after name = " + str.substring(total));
		System.out.println("replace method change the letter = " + str.replace(change, remove));
		System.out.println("using intern =" + str.intern());

		System.out
				.println("offsetByCodePoints two letter remove reminder count =" + str.offsetByCodePoints(mark, total));
		System.out.println("replaceall change the word = " + str.replaceAll(str, e));
		System.out.println("compareto method = " + str.compareTo(e));
		System.out.println("compare tolgnorecase = " + str.compareToIgnoreCase(str));

		Scanner count = new Scanner(System.in);
		System.out.println("enter your two  word lastindexof");
		String word = count.nextLine();
		String letter = count.nextLine();
		System.out.println("lastindexof mathod = " + word.lastIndexOf(letter));
		System.out.println("indexof method = " + word.indexOf(letter));
		System.out.println("equalsignorecase same name is true = " + word.equalsIgnoreCase(letter));

		Scanner array = new Scanner(System.in);
		System.out.println("Please enter elements...");
		char[] a1 = array.next().toCharArray();
		String value = array.nextLine();
		int z = array.nextInt();
		int y = array.nextInt();
		System.out.println(value.copyValueOf(a1, z, y));
		System.out.println("copy value of program fixed number counting 1 =" + value);

		Scanner get = new Scanner(System.in);
		System.out.println("enter your name");
		String x = get.next();
		byte[] barr = x.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}

	}

}