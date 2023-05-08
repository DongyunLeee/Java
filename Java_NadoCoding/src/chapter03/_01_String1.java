package chapter03;

public class _01_String1 {
    public static void main(String[] args) {
        String str = "I like Java and Python and C.";
        System.out.println(str);

        // 문자열의 길이
        System.out.println(str.length());

        // 대소문자 변환
        System.out.println(str.toUpperCase()); // 대문자 변환
        System.out.println(str.toLowerCase()); // 소문자 변환

        // 포함 관계 (대소문자 구분)
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("C#")); // false
        System.out.println(str.indexOf("Java")); // 7 (문자 위치)
        System.out.println(str.indexOf("C#")); // -1  (미포함)
        System.out.println(str.lastIndexOf("and")); // 23 (마지막 문자 위치)
        System.out.println(str.startsWith("I like")); // true (시작 문자열 확인)
        System.out.println(str.endsWith("C.")); // true (마지막 문자열 확인)
    }
}
