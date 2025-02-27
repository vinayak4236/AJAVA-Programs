package programs;

public class lab4 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        
        char[] charArray = {'H', 'E', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        
        String str3 = new String(charArray,1,4);
        
        byte[] byteArray = {86,73, 78, 65, 89,65,75};
        String str4 = new String(byteArray);
        
        String str5 = new String(byteArray,2,5);
        
        
        String original = "JAVA";
        String str6 = new String(original);
        
        StringBuffer stringBuffer = new StringBuffer("Programming");
        String str7 = new String(stringBuffer);
        
        StringBuilder stringBuilder = new StringBuilder("Development");
        String str8 = new String(stringBuilder);
        
        int s = 12345;
        String str9=Integer.toString(s);
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("String 5: " + str5);
        System.out.println("String 6: " + str6);
        System.out.println("String 7: " + str7);
        System.out.println("String 8: " + str8);
        System.out.println("String 9: " + str9);
        
       
    }
         
}
