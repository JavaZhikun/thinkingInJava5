package paragraph13;

//背后使用StringBuilder来实现的重载"+"
public class Concatenation 
{
	public static void main(String[] args) {
		String mango = "mango";
		String  s = "abc" + mango + "ced" + 47;
	    System.out.println(s);
	}

}
