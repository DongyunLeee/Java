package chapter06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getHotelAddress() {
        String hotelAddress = "경기도 수원시 팔달구 인계동 XXX";
        return hotelAddress;
    }

    // 호텔 액티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        System.out.println("호텔 주소 : " + getHotelAddress());
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
