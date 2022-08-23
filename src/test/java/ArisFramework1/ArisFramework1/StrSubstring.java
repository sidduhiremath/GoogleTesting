package ArisFramework1.ArisFramework1;

public class StrSubstring {

	public static void main(String[] args) {
		String s="Shared folder start from : \blrshareShared\\ALM_Addins";
		int index=0;
		String a = null;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==':'){
				index=i;
			}
			if(s.charAt(i)=='\\'){
					a=s.substring(index,i);
					break;
		}
		
		}
		System.out.println(a);
		

	}

}
