package TestCode;

import org.junit.*;

public class TMember {
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember); //�����޼ҵ�
//		assertNotNull(newMember); 			//��ü�� Null�̸� ����, Null�� �ƴϸ� ����
//		assertSame(newMember, oldMember);	//������ü���� �ٸ���ü���� �Ǻ�
		
//		assertTrue(newMember == null);		//���� �׽�Ʈ
//		if(newMember == null) {
//			System.out.println("ok");
//		}
		//�����ų���� F11����, �׻� runAs�� ����
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = new Member();
	}
	
	/*
		���� �׽�Ʈ�� �ϱ� ���ؼ��� ���̺귯�� (JUnit)�� �߰��Ѵ�.
		JUnit : ������ ���� �׽�Ʈ�� ������ �ִ� �����ӿ�ũ
		<���Ǵ� ������̼� >
		- @Test : @Test�� ����� �޼ҵ尡 �׽�Ʈ�� �����Ѵ�.
		- @Before : @Test�� ����� �޼ҵ尡 ����Ǳ� ���� ����Ǿ� �ϴ� �޼ҵ忡 ���δ�.(�켱���� ����)
		- @Ignore : �׽�Ʈ�� �������� �ʴ´�.
		
		sysout���� �ֿܼ� ����� ���������, 
		����(assert)�޼ҵ�� �׽�Ʈ�� ����� �Ǻ��Ѵ�.
		����>> assertEquals(����, ������);
		- �����޼ҵ�� ���󰪰� �������� ��ġ�ϸ� ����, ��ġ���� ������ ����
		
		JUnit�޼ҵ�
		assertEquals(a,b);			- ��ü �Ǵ� ���� ��ġ�ϴ°�?
		assertArrayEquals(a,b);		- �迭�� ���� ��ġ�ϴ°�?
		assertSame(a,b);			- ���� ��ü�ΰ�?
		assertTrue(a);				- ��ü�� null�� �ƴѰ�?
		assertNotNull(a);			- ��ä�� null�ΰ�?
	*/
}
