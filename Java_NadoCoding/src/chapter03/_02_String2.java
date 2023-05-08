package chapter03;

public class _02_String2 {
    public static void main(String[] args) {
        String str = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(str.replace(" and", ",")); // 'and'를 ','로 변환
        System.out.println(str.substring(7)); // 인덱스 7부터 출력
        System.out.println(str.substring(str.indexOf("Java"))); // Java의 문자열의 시작인덱스부터 출력
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("."))); // 시작 위치부터 끝 위치 직전까지

        // 공백제거
        str = "       I Love Java.         ";
        System.out.println(str);
        System.out.println(str.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.concat(",  ").concat(s2));
    }
}
