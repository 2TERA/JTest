package TestCode;

import org.junit.*;

public class TMember {
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember); //단정메소드
//		assertNotNull(newMember); 			//객체가 Null이면 실패, Null이 아니면 성공
//		assertSame(newMember, oldMember);	//같은객체인지 다른객체인지 판별
		
//		assertTrue(newMember == null);		//조건 테스트
//		if(newMember == null) {
//			System.out.println("ok");
//		}
		//실행시킬때는 F11말고, 항상 runAs로 실행
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = new Member();
	}
	
	/*
		단위 테스트를 하기 위해서는 라이브러리 (JUnit)을 추가한다.
		JUnit : 독립된 단위 테스트를 지원해 주는 프레임워크
		<사용되는 어노테이션 >
		- @Test : @Test가 선언된 메소드가 테스트를 수행한다.
		- @Before : @Test가 선언된 메소드가 실행되기 전에 수행되야 하는 메소드에 쓰인다.(우선순위 지정)
		- @Ignore : 테스트를 실행하지 않는다.
		
		sysout으로 콘솔에 결과를 출력하지만, 
		단정(assert)메소드로 테스트의 결과를 판별한다.
		예시>> assertEquals(예상값, 실제값);
		- 단정메소드란 예상값과 실제값이 일치하면 성공, 일치하지 않으면 실패
		
		JUnit메소드
		assertEquals(a,b);			- 객체 또는 값이 일치하는가?
		assertArrayEquals(a,b);		- 배열의 값이 일치하는가?
		assertSame(a,b);			- 같은 객체인가?
		assertTrue(a);				- 객체가 null이 아닌가?
		assertNotNull(a);			- 객채가 null인가?
	*/
}
