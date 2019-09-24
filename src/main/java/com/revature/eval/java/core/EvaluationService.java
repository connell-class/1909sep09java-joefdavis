package com.revature.eval.java.core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String a = phrase.substring(0, 1);
		char b;
		for (int i = 0; i < phrase.length(); i++) {
			b = phrase.charAt(i);

			if (b == ' ' || b == '-') {
				a = a + Character.toString(phrase.charAt(i + 1));
			}

		}

		return a;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if (sideOne == sideTwo && sideTwo == sideThree)
				return true;

			return false;
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree)
				return true;
			return false;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if (sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree)
				return true;
			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int score = 0;
		char b;
		for (int i = 0; i < string.length(); i++) {
			b = string.charAt(i);

			if (b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U' || b == 'L' || b == 'N' || b == 'R' || b == 'S'
					|| b == 'T' || b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'l' || b == 'n'
					|| b == 'r' || b == 's' || b == 't') {
				score = score + 1;
			}
			if (b == 'D' || b == 'G' || b == 'd' || b == 'g') {
				score = score + 2;
			}
			if (b == 'B' || b == 'C' || b == 'M' || b == 'P' || b == 'b' || b == 'c' || b == 'm' || b == 'p') {
				score = score + 3;
			}
			if (b == 'F' || b == 'H' || b == 'V' || b == 'W' || b == 'Y' || b == 'f' || b == 'h' || b == 'v' || b == 'w'
					|| b == 'y') {
				score = score + 4;
			}
			if (b == 'K' || b == 'k') {
				score = score + 5;
			}
			if (b == 'J' || b == 'X' || b == 'j' || b == 'x') {
				score = score + 8;
			}
			if (b == 'Q' || b == 'q' || b == 'Z' || b == 'z') {
				score = score + 10;
			}

		}
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		char b;
		String number = "";

		for (int i = 0; i < string.length(); i++) {
			b = string.charAt(i);

			if (Character.isDigit(b)) {
				number = number + Character.toString(b);

			}

		}

		if (number.charAt(0) == '1' && number.length() == 11) {
			number = number.substring(1);
			return number;
		}

		if (number.length() != 10) {
			return null;
		}
		return number;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration

		Map<String, Integer> map = new HashMap<>();
		int count = 1;
		boolean white = false;
		for (int t = 0; t < string.length(); t++) {
			if (string.charAt(t) == ' ') {
//				System.out.println("space");
				white = true;
			}

			if (white == true) {
				String[] s = string.split(" ");
				if (s.length > 1) {
					for (int i = 0; i < string.length(); i++) {
						count = 1;
						for (int j = i + 1; j < string.length(); j++) {
							if (s[i] == s[j] && i < j) {
								count++;
							}
							map.put(s[i], count);
						}

					}
				}
			} else {
				map.put(string, 1);
			}

			return map;
		}
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}
	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
//		System.out.println("why");

		boolean white = false;
		for (int t = 0; t < string.length(); t++) {
			if (string.charAt(t) == ' ') {
//				System.out.println("space");
				white = true;
			}
		}

		String[] s = string.split(" ");

		String end = "ay";
		boolean vowel = false;
		String part;
		int size = s.length;
//		System.out.println(size);

		// testing if my array worked and split the string
//		for (int y=0;y<size;y++) {
//			System.out.print(s[y]);
//		}
		if (white = true) {
			for (int i = 0; i < s.length; i++) {
				vowel = false;
				for (int j = 0; j < s[i].length(); j++) {
					if (s[i].substring(0, 2).equalsIgnoreCase("qu")) {
						s[i] = s[i].substring(2) + "quay";
						j = s[i].length();
					} else if (s[i].substring(j, j + 1).equalsIgnoreCase("a")
							|| s[i].substring(j, j + 1).equalsIgnoreCase("e")
							|| s[i].substring(j, j + 1).equalsIgnoreCase("0")
							|| s[i].substring(j, j + 1).equalsIgnoreCase("i")
							|| s[i].substring(j, j + 1).equalsIgnoreCase("u")) {
						vowel = true;
						if (j == 0) {
							s[i] += end;
							j = s[i].length();
						}

						else {
							part = s[i].substring(0, j);
//						System.out.println(s[i].substring(0,j));
							s[i] = s[i].substring(j) + part + end;
							j = s[i].length();
						}

					}
				}
//put string back together
				if (size == 1) {
					string = s[0];
				} else {
					string = "";
					for (int k = 0; k < size; k++) {

						string = string + s[k] + " ";
					}
				}

			}
		} else {

			for (int index = 0; index < string.length(); index++) {
				if (string.substring(index, index + 1).equalsIgnoreCase("a")
						|| string.substring(index, index + 1).equalsIgnoreCase("e")
						|| string.substring(index, index + 1).equalsIgnoreCase("0")
						|| string.substring(index, index + 1).equalsIgnoreCase("i")
						|| string.substring(index, index + 1).equalsIgnoreCase("u")) {
					if (string.substring(0, 2).equalsIgnoreCase("qu")) {
						string = string.substring(2) + "quay";
						index = string.length();
					} else if (index == 0) {
						string += end;
						index = string.length();
					}

					else {
						part = s[index].substring(0, index);
						string = string.substring(index) + part + end;
						index = string.length();
					}

				}

			}

		}
		return string;

	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		int a = input;
		if (a == armStrong(input)) {
			return true;
		}

		return false;
	}

	public int armStrong(int input) {

		String as = Integer.toString(input);
		int arm = 0;
		int number;
		char p;
		for (int i = 0; i < as.length(); i++) {
			p = as.charAt(i);
			number = Character.getNumericValue(p);
			number = (int) Math.pow(number, as.length());
			arm = arm + number;

		}

		return arm;
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration

//			int key=-3;
			String ciph = "";
			char place;
			for (int i = 0; i < string.length(); i++) {
				place = string.charAt(i);
				// not at a space
				if (place != ' ' && Character.isLetter(place)) {
					// is it in between a&z
					if (place >= 'a' && place <= 'z') {

						if (((char) place + key) >= 'a' && ((char) place + key) <= 'z') {
							ciph += ((char) (place + key));

						} else if (place + key < 97) {
							ciph += ((char) (place + key + 26));
						} else {
							ciph += ((char) (place + key - 26));
						}
					} // is it between upper case alphabet
					else if (place >= 'A' && place <= 'Z') {

						if (((char) place + key) >= 'A' && ((char) place + key) <= 'Z') {
							ciph += ((char) (place + key));
						} else if (place + key < 65) {
							ciph += ((char) (place + key + 26));
						} else {
							ciph += ((char) (place + key - 26));
						}

					} else {
						ciph += ((char) (place + key));
					}

				} else if (place == ' ') {
					ciph += " ";
				} else if (Character.isDigit(place)) {
					ciph += place;
				} else {
					ciph += place;
				}
			}
			return ciph;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		if (i == 1) {
			return 2;
		}
		if (i == 2) {
			return 3;
		}
		if (i == 3) {
			return 5;
		}
		if (i == 4) {
			return 7;
		}
		if (i == 5) {
			return 11;
		}

		int prime = 0;
		int counter = 5;
		if (i > 5) {
			for (int j = 12; j < 100000000; j++) {

				if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0 && j % 11 != 0) {
					prime = j;
					counter++;
				}
				if (counter == i) {
					return prime;
				}

			}
		}

		return 0;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			char place;
			String s = "";
			int difference;
			for (int i = 0; i < string.length(); i++) {
				place = string.charAt(i);

				if (Character.isLetter(place)) {
					if (place >= 'a' && place <= 'z') {
						difference = place - 97;
						place = ((char) (122 - difference));
						s += place;

					} else {
						difference = place - 65;
						place = ((char) (90 - difference));
						s += place;
					}

				} else {
					s += place;
				}

			}

			return s;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			char place;
			String s = "";
			int difference;
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				place = string.charAt(i);
				if (count % 5 == 0) {
					s += " ";
				}
				if (Character.isLetter(place)) {
					if (place >= 'a' && place <= 'z') {
						difference = 122 - place;
						place = ((char) (97 + difference));
						s += place;
						count++;
					} else {
						difference = 90 - place;
						place = ((char) (65 + difference));
						s += place;
						count++;
					}

				} else {
					count++;
					s += place;
				}

			}

			return s;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		int sum = 0;
		char place;
		int count = 10;
		int temp;
		for (int i = 0; i < string.length(); i++) {
			place = string.charAt(i);

			if (Character.isDigit(place)) {
				temp = Character.getNumericValue(place);
				sum += count * temp;
				count--;
			}
			if (Character.isLetter(place) && count == 1) {
				sum += count * 10;
				count--;
			}
		}
		// case not enough numbers
		if (count != 0) {
			return false;
		}
		// System.out.println(count);
		if (sum % 11 == 0) {
			return true;
		}

		return false;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z = false;
		a = z;
		a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z;
		char place;

		for (int index = 0; index < string.length(); index++) {
			place = string.charAt(index);
			if (place == 'a') {
				a = true;
			}
			if (place == 'b') {
				b = true;
			}
			if (place == 'c') {
				c = true;
			}
			if (place == 'd') {
				d = true;
			}
			if (place == 'e') {
				e = true;
			}
			if (place == 'f') {
				f = true;
			}
			if (place == 'g') {
				g = true;
			}
			if (place == 'h') {
				h = true;
			}
			if (place == 'i') {
				i = true;
			}
			if (place == 'j') {
				j = true;
			}
			if (place == 'k') {
				k = true;
			}
			if (place == 'l') {
				l = true;
			}
			if (place == 'm') {
				m = true;
			}
			if (place == 'n') {
				n = true;
			}
			if (place == 'o') {
				o = true;
			}
			if (place == 'p') {
				p = true;
			}
			if (place == 'q') {
				q = true;
			}
			if (place == 'r') {
				r = true;
			}
			if (place == 's') {
				s = true;
			}
			if (place == 't') {
				t = true;
			}
			if (place == 'u') {
				u = true;
			}
			if (place == 'v') {
				v = true;
			}
			if (place == 'w') {
				w = true;
			}
			if (place == 'x') {
				x = true;
			}
			if (place == 'y') {
				y = true;
			}
			if (place == 'z') {
				z = true;
			}

		}
		if (a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v
				&& w && x && y && z) {
			return true;
		}

		return false;

	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
//		sysout something
		Duration d=Duration.ofSeconds(1000000000);
		
		if(given instanceof LocalDate) {
			LocalDateTime now=LocalDate.from(given).atStartOfDay();
			now=now.plus(d);
			return now;
		}
		else {
			given.plus(d);
		}
//	
//		Instant now = Instant.given;
		
//		
		
		
		System.out.println("yeah");

		return given;

	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		int sum = 0;
		boolean already = false;

		for (int j = set[0]; j < i; j++) {
			already = false;
			for (int k = 0; k < set.length; k++) {

				if (j % set[k] == 0 && already == false) {
					sum = sum + j;
					System.out.println(sum);
					already = true;
				}

			}
		}
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		string = convert(string);
		char place = ' ';
		for (int j = 0; j < string.length(); j++) {
			place = string.charAt(j);
			if (Character.isDigit(place) == false && place != ' ') {
				return false;
			}
		}
		int sum = 0;
		int num;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				num = Character.getNumericValue(string.charAt(i));
				sum = sum + num;
				System.out.print(num);
			} else {
				System.out.print(" ");
			}
		}
		if (sum % 10 == 0) {
			return true;
		}

		return false;
	}

	public String convert(String string) {
		String[] number = new String[string.length()];
		String[] reform = new String[string.length()];
		// put string into an array
		for (int k = 0; k < string.length(); k++) {
			reform[k] = string.substring(k, k + 1);
		}
		int a = 0;
		int b = 0;
		char place;
		int p = 0;
		String twoDigs;
		char first;
		char second;
		Boolean everySecond = false;
		// sec makes sure every second digit is changed
		int sec = 2;
		String num = "";
		int index = string.length() - 1;
		for (int i = string.length() - 2; i >= 0; i--) {
			place = string.charAt(i);

			if (Character.isDigit(place) && sec % 2 == 0) {
				p = Character.getNumericValue(place);
				System.out.print(p);
				if (p * 2 > 9) {
					p = p * 2;
					twoDigs = Integer.toString(p);
					first = twoDigs.charAt(0);
					second = twoDigs.charAt(1);
					p = (Character.getNumericValue(first) + (Character.getNumericValue(second)));
					reform[i] = Integer.toString(p);
				} else {
					p = p * 2;
					reform[i] = Integer.toString(p);
				}

			}
			if (Character.isDigit(place)) {
				sec++;
			}
		}
		System.out.println("");
		for (int j = 0; j < string.length(); j++) {
			num = num + reform[j];
			System.out.print(reform[j]);
		}
		System.out.println(" ");
		return num;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		int j = 0;
		int a = 0;
		int b = 0;
		int answer = 0;
		String sub = "";
		String num = "";
		char place = ' ';
		String function = null;
		boolean isA = false;
		boolean isB = false;
		boolean func = false;
		// for loop to read down the string
		// while checking for numbers
		// and the math function
		for (int i = 0; i < string.length(); i++) {
			j = i;
			place = string.charAt(i);
			sub = sub + place;
			// check if number is negative
			if (place == '-') {
				num = num + place;
			}
			// checking for the first number
			if (Character.isDigit(place) && isA == false) {
				num = num + place;
				while (Character.isDigit(string.charAt(j + 1))) {
					num = num + string.charAt(j + 1);
					j++;
				}
				a = Integer.parseInt(num);
				isA = true;
				num = "";
				System.out.println(a);
				place = string.charAt(i + 1);
			}

			// checking for the second number
			if (Character.isDigit(place) && isA == true && (i + 1 != string.length()) && isB == false && func == true) {
				num = num + place;
				while (Character.isDigit(string.charAt(j + 1)) && isB == false) {
					num = num + string.charAt(j + 1);
					j++;
				}
				b = Integer.parseInt(num);
				isB = true;
				System.out.println(b);
			}
			// check if string matches the math function words

			if ((place == 'd' || place == 'D') && (string.charAt(i + 1) == 'i' || string.charAt(i + 1) == 'I')) {
				function = "/";
				func = true;
			}
			if ((place == 'a' || place == 'A') && (string.charAt(i + 1) == 'd' || string.charAt(i + 1) == 'D')) {
				function = "+";
				func = true;
			}
			if ((place == 'S' || place == 's') && (string.charAt(i + 1) == 'u' || string.charAt(i + 1) == 'U')) {
				function = "-";
				func = true;
			}
			if ((place == 'm' || place == 'M') && (string.charAt(i + 1) == 'u' || string.charAt(i + 1) == 'U')) {
				function = "*";
				func = true;
			}
			// add it all up

		}
		if (function == "/") {
			answer = a / b;
		}
		if (function == "+") {
			answer = a + b;
		}
		if (function == "-") {
			answer = a - b;
		}
		if (function == "*") {
			answer = a * b;
		}

		return answer;
	}

}
