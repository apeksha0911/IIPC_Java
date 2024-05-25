package core_java;
public class CountryTextCalculator {
public static void main(String args[]) {
	System.out.println(countCharacters("Dhruvik"));
}
 public static int countCharacters(String text) {
     return text.length();
 }

 public static int countWords(String text) {
     return text.split("\\s+").length;
 }

 public static int countLines(String text) {
     return text.split("\r\n|\r|\n").length;
 }
}
