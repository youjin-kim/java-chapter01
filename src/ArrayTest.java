
public class ArrayTest {

	public static void main(String[] args) {
		int[] arrayInt = new int[5];
		arrayInt[0] = 10;
		arrayInt[1] = 10;
		arrayInt[2] = 10;
		arrayInt[3] = 10;
		arrayInt[4] = 10;
		
		Value[] values = new Value[3];
		values[0] = new Value(10);
		values[0].val = 20;
		System.out.println(values[0]);
		System.out.println(values.length);
		
		
		int[] list = new int[5];
		
		int[] temp = new int[10];
		for(int i = 0; i < list.length; i++) {
			temp[i] = list[i];	
		}
		
		list = temp;
		temp = null;
		
		
	}

}
