package programs;

public class lab4 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        
        char[] charArray = {'H', 'E', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        
        byte[] byteArray = {86,73, 78, 65, 89,65,75};
        String str3 = new String(byteArray);
        
        String original = "JAVA";
        String str4 = new String(original);
        
        StringBuffer stringBuffer = new StringBuffer("Programming");
        String str5 = new String(stringBuffer);
        
        StringBuilder stringBuilder = new StringBuilder("Development");
        String str6 = new String(stringBuilder);
        
        
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("String 5: " + str5);
        System.out.println("String 6: " + str6);
        
        stringBuilder.append(" is Awesome!");
        System.out.println("After append: "+stringBuilder);
        
        stringBuilder.insert(11," JAVA");
        System.out.println("After Insert: "+stringBuilder);
        
        stringBuilder.replace(7,11 ,"ing");
        System.out.println("After Replace: "+stringBuilder);
        
        stringBuilder.delete(11,16);
        System.out.println("After Delete: "+stringBuilder);
        
        stringBuilder.reverse();
        System.out.println("After Reversing: "+stringBuilder);
    }
         
}
