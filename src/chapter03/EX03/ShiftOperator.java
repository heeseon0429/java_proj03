package chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
	//산술 시프트 ( <<, >> ) 
	//   - 부호비트는 고정되어 있다.
	//   - 대량의 계산을 빠르게 처리 할 수 있다.
		
	// <<   각비트를 왼쪽으로 이동
	System.out.println(3 << 1);  // 3* 2^1 = 6
    System.out.println(3 << 2);  // 3* 2^2 = 12
    System.out.println(3 << 3);  // 3* 2^3 = 24
    
    System.out.println(-3 << 1);

    // >>   각비트를 오른쪽으로 이동
    
    System.out.println(5 >> 1);  // 2
    System.out.println(5 >> 2);  //1
    
    //논리 시프트 ( >>> ) 
    System.out.println(3 >>> 1);
    
    
    
    
    
	}

}
