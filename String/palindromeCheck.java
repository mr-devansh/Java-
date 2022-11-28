package String;

public class palindromeCheck {
    public static boolean check(String str) {
        int l = 0;
        int r = str.length()-1;
        while (l<r) {
            if (str.charAt(l)!=str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ded";
        System.out.println(check(str)); 
    }
}
