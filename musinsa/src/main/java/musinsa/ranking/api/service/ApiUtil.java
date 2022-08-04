package musinsa.ranking.api.service;


/**
 * @author 민동현
 *
 */
public class ApiUtil {
	/**
	 * 오류객체로 에러메세지를 생성합니다
	 * @param ㅇ
	 * @param e
	 * @return
	 */
	public static String makeErrorMessage(String faileValue, Exception e) {
		String faileReason = "서버에서 오류가 발생했습니다.";

		try{
			if(e.toString().contains("org.springframework.dao.DuplicateKeyException")){
				faileReason = "해당 브랜드명은 이미 존재합니다. 다른 브랜드명을 입력해주세요.";
			}
		}catch(Exception exception){

		}

		String result = "실패값 : " + faileValue +" , " + "실패 사유 : " + faileReason;

		return result;
	}


}