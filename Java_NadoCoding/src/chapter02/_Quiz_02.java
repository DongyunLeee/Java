package chapter02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int child_1 = 115;
        int child_2 = 121;

        String str = (child_1 >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + child_1 + "cm 이므로 탑승 " + str + "합니다.");

        str = (child_2 >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + child_2 + "cm 이므로 탑승 " + str + "합니다.");
    }
}
