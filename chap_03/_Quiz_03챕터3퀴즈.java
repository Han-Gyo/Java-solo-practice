package chap_03;

public class _Quiz_03챕터3퀴즈 {
    public static void main(String[] args) {

        // 퀴즈3
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오
        // 주민등록번호는 13자리의 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        // 입력 데이터는 -을 포함한 14자리의 문자열 형태

        // ex) "901231-1234567" 인 경우 901231-1 까지 출력
        // ex) "030708-4567890" 인 경우 030708-4 까지 출력

        String id1 = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id1.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(id1.substring(0, id1.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지



        String id2 = "030708-4567890";
        System.out.println(id2.substring(0,8));
        System.out.println(id2.substring(0,id2.indexOf("-")+2));
        System.out.println(id2.substring(id2.indexOf("030708"),(id2.indexOf("567890"))));


        // 나도코딩님의 해설정답
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2 )); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
