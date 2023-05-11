package chapter04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용한 주차 요금 정산 프로그램
        // 주차요금 : 시간당 4,000원 (일일최대 30,000원)
        // 경차 및 장애인 차량은 50% 할인
        String carType = "Small"; // Normal : 일반, Small : 경차, Disabled : 장애인 차량
        int hourCharge = 4000; // 시간당 주차요금
        int maxCharge = 30000; // 일일 최대요금
        int hour = 5; // 주차시간
        int charge = 0; // 최종 요금

        charge = hourCharge * hour;
        if (charge > maxCharge)
            charge = maxCharge;

        switch (carType) {
            case "Normal":
                break;
            case "Small":
            case "Disabled":
                charge /= 2;
                break;
        }

        System.out.println("최종 주차 요금 : " + charge + "원");
    }
}
