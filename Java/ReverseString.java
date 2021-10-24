public class ReverseString {

    public static void main(String[] args) {
        String name = "jainath kumhar";
        String nName = "";
        char ch;
        for(int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            nName = ch + nName;
        }

        System.out.println("Reverse String :" + nName);

    }
    
}
