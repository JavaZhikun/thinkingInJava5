package paragraph13;

public class WhitherStringBuilder 
{
    public String implicit(String[] fields)
    {
    	String result = " ";
    	for(int i = 0; i < fields.length; i++)
    		result += fields[i];
    	return result;
    }
	
    public String explicit(String[] fields)
    {
         StringBuilder result = new StringBuilder();
         for(int i = 0; i <fields.length; i++)
        	 result.append(fields[i]);
         
         return result.toString();
         
    }
    
    public static void main(String[] args) {
		WhitherStringBuilder wsb = new WhitherStringBuilder();
		String[]  fields = {"hello", "world", "haha"} ;
		System.out.println(wsb.implicit(fields));
		System.out.println(wsb.explicit(fields));
	}
}
