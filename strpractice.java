public class strpractice {
    public static void main(String[] args) {
        String name = "lenovo";
       // System.out.println(name.length());
       // System.out.println(name.toLowerCase());
       // System.out.println(name.trim());
       // System.out.println(name.substring(3,4));
      //  System.out.println(name.indexOf("vo"));
       // System.out.println(name.startsWith("le"));
    //   //  System.out.println(name.endsWith("v"));
    //     System.out.println(name.concat(" is my laptop brand name"));

    //     String LK= "JHDHDJK LAJ huhsij";
    //     System.out.println(LK.toLowerCase());
    //     System.out.println(LK.replace( " ", "_"));
    //     String letter = "\"dear <|name>|,\n thanks a lot.\n ooooo.. \"  ";
    //     System.out.println(letter.replace("<|name>|", "bunty"));

        // String s1="1234";
        // int n1 = Integer.parseInt(s1);
        // int num = 12;
        // String s2 = Integer.toString(num);
        // System.out.println(s2.length());
        // System.out.println( n1);

        // string builder class practice(string are immutable so string builder are used)

        // StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb);

        // sb.append("ello");
        // System.out.println(sb);

        // System.out.println(sb.charAt(2));

        // sb.setCharAt(3, 'p');
        // System.out.println(sb);

        // sb.insert(2, 'p');
        // System.out.println(sb);

        // sb.delete(2, 3);
        // System.out.println(sb);

        // char [] a1=new char[5];
        // sb.getChars(0,4,a1,0);
        // System.out.println(a1);
        // System.out.println(sb);

        StringBuilder sb =new StringBuilder("darshika");
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
    
}
