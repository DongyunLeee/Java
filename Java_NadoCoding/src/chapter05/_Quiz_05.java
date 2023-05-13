package chapter05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용한 쇼핑몰 구매가능 신발 사이즈 옵션 출력
        // 신발사이즈 범위 : 250~295
        String[][] shoesSize = new String[10][2];
        int size = 250;
        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i][0] = String.valueOf(size);
            shoesSize[i][1] = "재고 있음";
            size += 5;
        }

        for (int i = 0; i < shoesSize.length; i++) {
                System.out.println("사이즈 " + shoesSize[i][0] + " (" + shoesSize[i][1] + ")");
        }
    }
}
