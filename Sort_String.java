package String_Handling;

public class Sort_String {
static String arr[]= {"Now", "time", "for", "all", "good"
,"men", "to","the","aid", "of", "their", "country"};
public static void main(String args[])
{
	for(int j= 0;j<arr.length;j++) {
		
	
		for(int i = j+1;i<arr.length;i++) {
			if(arr[i].compareTo(arr[j])<0) {
			String t = arr[j];
			arr[j] = arr[i];
			arr[i]= t;
			
		}
		
		}
		System.out.println(arr[j]);
		
}	
	
}
}