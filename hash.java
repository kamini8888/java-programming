import java.util.*;

class hash{
public static void main(String args[]) {
Map < String, Integer > num = new HashMap < > (); 
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String sentence = sc.nextLine();
String[] tokens = sentence.split(" "); 
for (String token: tokens) {
String word = token.toLowerCase();
if (num.containsKey(word)) {
int count = num.get(word); 
num.put(word, count + 1); 
} 
else {
num.put(word, 1); 
}
}
Set < String > keys = num.keySet(); 
TreeSet < String > sortedKeys = new TreeSet < > (keys); 
for (String str: sortedKeys) {
System.out.println("Word =" + str + " and it's count = " + num.get(str));
}
}
}
