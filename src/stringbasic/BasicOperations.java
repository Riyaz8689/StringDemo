package stringbasic;

public class BasicOperations {
	
	
	public String st1() {
		
		String str3 = "             Hello                ";
		
		
		return str3;
		
	}
	
	
	
	
		
	
	public static void stringreverse() {
		
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		
		System.out.println(arr.length);
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				
				if(i==j) {
					
					System.out.println(arr[i][j]);
				}
				
				
						
			}
		}
		
			
		}
		
		
		
		

 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicOperations obj = new BasicOperations();
		String str4 =obj.st1();
		
		String str = "My name is Riyaz Mansoor";
		String str1 = "Hello";
		String str2 = "Vello";
		String str5 = "";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.concat(" I am an Engineer"));
		System.out.println(str.contains("R"));
		System.out.println(str.contains("x"));
		System.out.println(str.startsWith("M"));
		System.out.println(str.endsWith("or"));
		System.out.println(str1.equals(str4));
		System.out.println(str4.equals(str2));
		System.out.println(str.indexOf("r"));
		System.out.println(str.isEmpty());
		System.out.println(str5.isEmpty());
		System.out.println(str.replace("R", "p"));
		
		char[] chararray = str.toCharArray();
		
		System.out.println(chararray[1]);
		
		for (int i=0; i < str.length(); i++)
		{
               System.out.println(chararray[i]);
	}
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str4);
		
		System.out.println(str4.trim());
		
	String str6 = str + " "  + str2;
	System.out.println(str6);
	stringreverse();
	
	
}

	
}



//String'length() " length!of!the!string
//String'charAt() " returns!a!char!value!at!the!given!index!number
//String'concat() " combines!specified!string!at!the!end!of!this!string
//String'contains() " returns!true if chars are!found!in!the!string
//String'startsWith() " checks!if!this!string!starts!with!given!prefix
//String'endsWith() " checks!if!this!string!ends!with!given!suffix
//String'equals() " compares!the!contents!of!two!given!strings
//String'indexOf() " returns!index!of!given!character!value!or!substring
//String'isEmpty() " checks!if!this!string!is!empty
//String'replace() " returns!a!string!replacing!all!the!old!char!to!new!char
//String'substring() " returns!a!part!of!the!string
//String'toCharArray() " converts!this!string!into!character!array
//String'toLowerCase() " returns!the!string!in!lowercase!letter
//String'toUpperCase() " returns!the!string!in!uppercase!letter
//String'trim() " eliminates!leading!and!trailing!spaces