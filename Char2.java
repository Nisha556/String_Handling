package String_Handling;

public class Char2 {
	public static void main(String args[])
	{
		String s = "This is a demo of the getChar  method";
		int star = 10;
		int end = 14;
		char buf[] = new char[end - star ];
		s.getChars(star , end , buf , 0);
		System.out.println(buf);
		
	}

}
