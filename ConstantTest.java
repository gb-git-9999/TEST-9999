package variableTest;

public class ConstantTest {
	public static void main(String[] args) {
//		final은 변경할 수 없는 값 또는 동작을 지정하는 데 사용된다. 상수값.
		
//		final 변수: 초기화된 후 값을 변경할 수 없는 상수.
//		final 메서드: 하위 클래스에서 오버라이딩할 수 없는 메서드.
//		final 클래스: 상속할 수 없는 클래스.
		
		final int ON = 187568;
		final int OFF = 187458;
		
//		0: 로그인 실패, 1: 로그인 성공, 2: 관리자
		final int LOGIN_SUCCESS_STATUS = 0;
		final int LOGIN_FAIL_STATUS = 1;
		final int LOGIN_ADMIN_STATUS = 2;
		
	}
}
