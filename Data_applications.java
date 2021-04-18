
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;




public class Data_applications {

	//throws FileNotFoundException 
	
	public static String ID_arr [] = new String[200]  ;
	public static String Last_name_arr [] = new String[200]  ;
	public static String First_name_arr [] = new String[200]  ;
	public static String Vac_type_arr [] = new String[200]  ;
	public static String Vac_date_arr [] = new String[200]  ;		
	public static String Vac_loc_arr [] = new String[200]  ;	
	public static String Everything [] = new String[200]  ;	
	


public static void main (String[] args)   {
	//System.out.println("Hello world");
	
	
	String path="/Users/kpnew/Downloads/TeamProjectRandomData - 10People.csv";
	
	load_data(path);
	
	//add_data();
	
	save_data();
				
		
		
		
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
		
		int curr_arr_size=0;
		int i=0;
		while(ID_arr[i]!=null) {
			curr_arr_size++;
		}
		
		ID_arr [curr_arr_size]=ID;
		Last_name_arr [curr_arr_size]=Last_Name;
		First_name_arr [curr_arr_size]=First_Name;		
		Vac_type_arr [curr_arr_size]=Vaccine_type;
		Vac_date_arr[curr_arr_size]=Vaccine_date;
		Vac_loc_arr [curr_arr_size]=Vaccine_location;
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}
	
	
}



public static void load_data(String path)  {
	
	String line="";
	String [] values ;
	
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
		
		
		
}
	
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}

}






public static void save_data()  {
	
	System.out.println("Hello world");

	int curr_arr_size=0,i=0;
	while(ID_arr[i]!=null) {
		curr_arr_size++;
	}
	
	int count=0;
	
	for(int j=0;j<curr_arr_size;j++) {
		
			Everything[count]=ID_arr[j];
			Everything[count++]=Last_name_arr[j];
			Everything[count++]=First_name_arr[j];
			Everything[count++]=Vac_type_arr[j];
			Everything[count++]=Vac_date_arr [j];
			Everything[count++]=Vac_loc_arr[j];
			System.out.println(Everything[j]);

		count++;
	}
	
	for(int k=0;k<count;k++) {
		System.out.println(Everything[k]);
	}
	
	
	
	
	BufferedWriter br = new BufferedWriter(new FileWriter("myfile.csv"));
	StringBuilder sb = new StringBuilder();

	// Append strings from array
	for (String element : array) {
	 sb.append(element);
	 sb.append(",");
	}

	br.write(sb.toString());
	br.close();
	
	
}

}










