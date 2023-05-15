package chapter06;

public class _Quiz_06 {
//    public static String changeName(String name) {
//        String chName = name.substring(0, 1);
//        for (int i = 1; i < name.length(); i++) {
//            chName = chName + "*";
//        }
//        return chName;
//    }
//
//    public static String changeId(String id) {
//        String chId = id.substring(0, 8);
//        for (int i = 9; i < id.length(); i++) {
//            chId = chId + "*";
//        }
//        return chId;
//    }
//
//    public static String changePhoneNumber(String phoneNumber) {
//        String chPhoneNumber = phoneNumber.substring(0, 9);
//        for (int i = 8; i < phoneNumber.length(); i++) {
//            chPhoneNumber = chPhoneNumber + "*";
//        }
//        return chPhoneNumber;
//    }

    public static String changeMethod(String info, int num) {
        String chInfo = info.substring(0, num);
        for (int i = num; i < info.length(); i++) {
            chInfo = chInfo + "*";
        }
        return chInfo;
    }


    public static void main(String[] args) {
        System.out.println("[ 증명서 ]");
        System.out.println("이름 : " + changeMethod(args[0], 1));
        System.out.println("주민번호 : " + changeMethod(args[1], 8));
        System.out.println("전화번호 : " + changeMethod(args[2], 9));
    }
}
