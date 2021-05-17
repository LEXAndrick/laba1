//Проверяет слова (аргументы), являются они палиндромами или нет
public class Palindrome {
    //Основная функция
    public static void main(String[] args) {
        boolean res=true;
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if(!isPalindrome(s)) res = false;

        }
        System.out.println(res);
    }
    //Функция которая переворачивает строчку
    public static String reverseString(String s) {
        String ans="";
        for (int j=s.length()-1;0<=j;--j)
            ans+=s.charAt(j);
        return ans;
    }
    //Логическая функция которая возвращяет значение true или false, в зависимости от того оказалось слово палиндромом
    //или нет.
    public static boolean isPalindrome(String s) {
        boolean ans=false;
        if (s.equals(reverseString(s)))
            ans=true;
        return ans;
    }
}