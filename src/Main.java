public class Main {
    public static void main(String[] args) {

       byte[]bytes = {'a','b','c'};
       String s1 = new String(bytes);
        System.out.println(s1);
        char[]chars = {'c','d','e'};
        String s2 = new String(chars);
        System.out.println(s2);
        String s5 = "hello" + "world" ;
        int alphabetLen = 26;
        char[]alphabet = new char[alphabetLen];
        int[]integers = new int[alphabetLen];
        byte[]bytes1 = new byte[alphabetLen];
        int i = 0;
        for(char c = 'a'; c <= 'z';c++,i++) {
            alphabet[i] = c;
            integers[i] = (int) c;
            bytes1[i] = (byte) c;
        }
            String charstr = new String(alphabet);
            System.out.println(charstr);
            String byteStr = new String(bytes1);
            System.out.println(byteStr);

            String intStr = new String(integers,6,alphabetLen - 6);
            System.out.println(intStr);

    }
}