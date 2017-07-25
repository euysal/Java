package homework6;

public class hm10_25 {
	public static void main(String[] args) {
		System.out.println("Example 1");
		String[] chars = split("a?b?gf#e", "[?#]"); 
		for (int i = 0; i < chars.length; i++){
			System.out.println(chars[i]);
		}
		System.out.println("Example 2");
		chars = split("a?b?gf#e", "[?#]");
		for (int i = 0; i < chars.length; i++){
			System.out.println(chars[i]);
		}
			 
	}
	public static String[] split(String s, String regex) { 
		String[] chars = s.split(regex); 
		String[] newchars = new String[2 * chars.length - 1];
		String str = null; 
		int size = 0; 
		for (int i = 0; i < chars.length; i++) { 
			newchars[2 * i] = chars[i];
			size += newchars[2 * i].length();
			str = s.substring(size);
			if (i == chars.length -1) {
				break;
			}
			int j = str.indexOf(chars[i + 1]); 
			newchars[2 * i + 1] = str.substring(0, j); 
			size += newchars[2 * i + 1].length();
		}
		if (str != null && str.length() > 0) { 
			String[] result = new String[newchars.length + 1]; 
			System.arraycopy(newchars, 0, result, 0, newchars.length); 
			result[result.length - 1] = str;
			return result; 
		}
		else{
			return newchars;
		} 
	}
	

}

