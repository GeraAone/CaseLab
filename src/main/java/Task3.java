public class Task3
{
    static void isPalindrom(String s)
    {
        StringBuilder newString = new StringBuilder();
        StringBuilder oldString = new StringBuilder(s.replaceAll("\\W", "").toLowerCase());
        for (int i = 1; i <= oldString.length(); i++) {
            char ch = oldString.charAt(oldString.length() - i);//весь цикл заменяется одной функцией StringBuilder.reverse()
            newString.append(ch);
        }
        System.out.println(oldString.compareTo(newString) == 0 ? "yes" : "no");
    }
}
