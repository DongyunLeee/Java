package chapter05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // For 문
        for (int i = 0; i < 3; i++) { // 행의 수
            for (int j = 0; j < 5; j++) { // 열의 수
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        // 각 행의 열의 수가 다른 경우
        String[][] seats2 = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // For 문
        for (int i = 0; i < seats2.length; i++) { // 행의 수
            for (int j = 0; j < seats2[i].length; j++) { // 열의 수
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        // 세로 10 x 가로 15 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "j"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 좌석예약
        seats3[7][7] = "__"; // H8
        seats3[7][8] = "__"; // H9

        // 영화관 좌석 출력
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
