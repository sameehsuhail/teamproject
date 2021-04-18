
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;




public class Data_applications {

	//throws FileNotFoundException 
	
	


public static void main (String[] args)   {
	//System.out.println("Hello world");
	
	
	String path="/Users/kpnew/Downloads/TeamProjectRandomData - 10People.csv";
	
	load_data(path);
	
		
		add_data();
				
		
		
		
	} 
	
	
	
	
	


public static void add_data()  {
	BufferedReader read= new BufferedReader ( new InputStreamReader(System.in));
	try
	{
		String ID= read.readLine();
		String Last_Name= read.readLine();
		String First_Name= read.readLine();
		String Vaccine_type= read.readLine();
		String Vaccine_date= read.readLine();
		String Vaccine_location= read.readLine();
		
		System.out.println(Last_Name);
		
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}
	
	
}



public static void load_data(String path)  {
	
	String line="";
	String [] values ;
	String ID_arr [] = new String[200]  ;
	String Last_name_arr [] = new String[200]  ;
	String First_name_arr [] = new String[200]  ;
	String Vac_type_arr [] = new String[200]  ;
	String Vac_date_arr [] = new String[200]  ;		
	String Vac_loc_arr [] = new String[200]  ;	
	
	int counter=0;
	
	try {
		BufferedReader br= new BufferedReader(new FileReader(path));
		
		
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			values= line.split(",");
			//System.out.println(values[0]+" "+ values[1]+" " +values[2]+" "+values[4]);
			String sd1=values[0];
			ID_arr[counter]=values[0];
			Last_name_arr[counter]=values[1];
			First_name_arr[counter]=values[2];
			Vac_type_arr[counter]=values[3];
			Vac_date_arr [counter]=values[4];
			Vac_loc_arr[counter]=values[5];
			
			
			
			counter++;
			
		}
		for(int i=0;i<200;i++)
			System.out.println(Last_name_arr[i]);
}
	
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}

}

}








