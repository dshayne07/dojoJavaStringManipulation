public class StringManipulation{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld
    }
}
class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim()+str2.trim();
    }
    public static Integer getIndexOrNull(String str, char letter){
        return str.indexOf(letter);
    }
    public static String concatSubstring(String str1, int index1, int index2, String str2){
        return str1.substring(index1, index2) + str2;
    }
}