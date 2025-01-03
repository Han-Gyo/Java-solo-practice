package chap_02;

public class _Quiz_02챕터2퀴즈 {
    public static void main(String[] args) {
        //실행결과
        // 키가 115cm 이므로 탑승 불가능합니다 (값이 115인 경우)
        // 키가 121cm 이므로 탑승 가능합니다   (값이 121인 경우)

        // 조건 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용

        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)

        int a어린이 = 115;
        int b어린이 = 121;
        int 탑승키 = 120;

        String x = (a어린이 >= 탑승키) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 115cm 이므로 탑승 " + x);

        String y = (b어린이 >= 탑승키) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 121cm 이므로 탑승 "+y);

        int 아야카_어린이= 115;
        int 한교_어린이= 121;
        int 탑승가능키 = 120;

        String a = (아야카_어린이>=탑승가능키) ? "가능합니다" : " 불가능합니다 ";
        System.out.println("키가 "+ 아야카_어린이 +"cm 이므로 탑승"+a);

        String b = (한교_어린이 >= 탑승가능키 ) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 "+ 한교_어린이 + "cm 이므로 탑승 " +b);

        // 여기 까지는 나의 머리속 정답.

        // 여기는 완벽한 정답.
        int height = 115;
        String result = (height >= 120) ? ("탑승 가능합니다") : ("탑승 불가능합니다");
        System.out.println("키가 " + height + "cm 이므로 " + result);

        int height2 = 121;
        String result2 = (height2 >=120) ? ("탑승 가능합니다") : ("탑승 불가능합니다");
        System.out.println("키가 " +height2+"cm 이므로 " + result2);

        // 키= 115;
        //                 조건    ?       가능         :         불가능      ;
        // String 결과 = (키 >=120) ? ("탑승 가능합니다") : ("탑승 불가능합니다");
        // System.out.println("키가" + 키 + "cm 이므로 " + 결과);

       //string a = (a>=b) ? ("false") : ("true")

    }
}
