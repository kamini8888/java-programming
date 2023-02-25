public String substring(int beginIndex, int endIndex)   
{  
if (beginIndex < 0)   
{  
throw new StringIndexOutOfBoundsException(beginIndex);  
}  
if (endIndex > value.length)   
{  
throw new StringIndexOutOfBoundsException(endIndex);  
}  
int subLen = endIndex - beginIndex;  
if (subLen < 0)   
{  
throw new StringIndexOutOfBoundsException(subLen);  
}  
return ((beginIndex == 0) && (endIndex == value.length)) ? this : new String(value, beginIndex, subLen);  
}
public class Substring{  
public static void main(String args[]){  
String s1="javatpoint";  
System.out.println(s1.substring(2,4));
System.out.println(s1.substring(2));
}}
