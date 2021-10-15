public class StudentDetails {

	    public static void main(String arg[])
	    {
	        String names[] = { "Ram", "Sam", "James" };
	        int marks[] = { 45, 78, 83};
	        char sections[] = { 'A', 'B', 'A'};
	        
	        for(int i = 0; i < names.length; i++)
	        {
	            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
	        }    
	    }
	}
