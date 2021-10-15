public class StudentDetails {

	    public static void main(String arg[])
	    {
	        int marks[] = { 98, 88, 83};
	        char sections[] = { 'A', 'B', 'A'};
		String names[] = { "Jordan", "Sam", "James" };
	        
	        for(int i = 0; i < names.length; i++)
	        {
	            System.out.println( names[i] + " from " + sections[i] + " got " + marks[i] + " marks." );
	        }    
	    }
	}

