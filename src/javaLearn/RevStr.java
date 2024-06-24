package javaLearn;

public class RevStr {

	public static void main(String args[]) {

		String org_txt = "clinton";
		String rev_str = "";

		for (int i = 0; i < org_txt.length(); i++) {

			rev_str = org_txt.charAt(i)+ rev_str;

		}
		
		System.out.println(rev_str);
	}
}
