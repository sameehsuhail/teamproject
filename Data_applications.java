
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;





public class Data_applications {

	//throws FileNotFoundException 
	
	public static String ID_arr [] = new String[200]  ;
	public static String Last_name_arr [] = new String[200]  ;
	public static String First_name_arr [] = new String[200]  ;
	public static String Vac_type_arr [] = new String[200]  ;
	public static String Vac_date_arr [] = new String[200]  ;		
	public static String Vac_loc_arr [] = new String[200]  ;	
	public static String Everything [] = new String[200]  ;	
	
	public static String ID;
	public static String Last_Name;
	public static String First_Name;
	public static String Vaccine_type;
	public static String Vaccine_date;
	public static String Vaccine_location;
	

public static void main (String[] args) throws IOException   {
	//System.out.println("Hello world");
	
	
	String path="/Users/kpnew/Downloads/TeamProjectRandomData - 10People.csv";
	
	load_data(path);
	save_new();
	
	add_data_get();
	
	add_data();
	
	//save_data();
	
	save_new();
	
	
	int curr_arr_size=0;
	int k=0;
	while(ID_arr[k]!=null) {
		curr_arr_size++;
		k++;
	}
	
	for(int i=0;i<curr_arr_size;i++) {
		System.out.println(ID_arr[i]);
		
	}
	
		
	} 
	

public static void add_data_get() throws IOException  {
	BufferedReader read= new BufferedReader ( new InputStreamReader(System.in));
	
		System.out.print("Enter ID:");
		 ID= read.readLine();
		System.out.print("Enter Last name:");
		 Last_Name= read.readLine();
		System.out.print("Enter First name:");
		 First_Name= read.readLine();
		System.out.print("Enter Vac type:");
		 Vaccine_type= read.readLine();
		System.out.print("Enter Vac date:");
		 Vaccine_date= read.readLine();
		System.out.print("Enter Vac loc:");
		Vaccine_location= read.readLine();
		
		
		return;
		
		/*
		
		int curr_arr_size=0;
		int i=0;
		while(ID_arr[i]!=null) {
			curr_arr_size++;
			System.out.print("done");
		}
		
		
		
		for(int h=0;h<200;h++)
			System.out.println(Last_name_arr[h]);
	
	*/
	
	
}

public static void add_data() throws FileNotFoundException {
	
	
	int curr_arr_size=0;
	int i=0;
	while(ID_arr[i]!=null) {
		curr_arr_size++;
		//System.out.print("done");
		i++;
	}
	
	System.out.print("done+++++");
	ID_arr [curr_arr_size]=ID;
	Last_name_arr [curr_arr_size]=Last_Name;
	First_name_arr [curr_arr_size]=First_Name;		
	Vac_type_arr [curr_arr_size]=Vaccine_type;
	Vac_date_arr[curr_arr_size]=Vaccine_date;
	Vac_loc_arr [curr_arr_size]=Vaccine_location;
	return;
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
		

		for(int h=0;h<20;h++)
			System.out.println(Last_name_arr[h]);
		
		
		
		
		
}
	
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}

}






public static void save_data() throws IOException {
	
	System.out.println("Hello world");

	int curr_arr_size=0,i=0;
	while(ID_arr[i]!=null) {
		curr_arr_size++;
		i++;
	}
	
	int count=0;
	ArrayList<String> All= new ArrayList<String>();
	
	for(int j=0;j<curr_arr_size;j++) {
		
		
		
		
		All.add(ID_arr[j]);
		All.add(Last_name_arr[j]);
		All.add(First_name_arr[j]);
		All.add(Vac_type_arr[j]);
		All.add(Vac_date_arr [j]);
		All.add(Vac_loc_arr[j]);
		
		All.add("\n");
}
	
	//System.out.println(All);
	
	
	
	
	/*
	  FileWriter writer = new FileWriter("/Users/kpnew/Downloads/sto1.csv");
	  
	
		 String collect = All.stream().collect(Collectors.joining(","));
		    System.out.println(collect);
		 	
	  
	  
	  
	  writer.write(collect);

	   
	    writer.close();
	    
	    
	
	*/
	
      
}    

	public static void save_new() {
		
		
		int curr_arr_size=0,i=0;
		
		while(ID_arr[i]!=null) {
			curr_arr_size++;
			i++;
		}
		
		try {
			
			FileWriter fw = new FileWriter("/Users/kpnew/Downloads/sto1.csv",true);
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			
			for(int j=0;j<curr_arr_size;j++) {
				
				pw.println(ID_arr[j]+","+Last_name_arr[j]+","+ First_name_arr[j]+","+Vac_type_arr[j]+","+ Vac_date_arr [j] +","+Vac_loc_arr[j]);
				
			}
			
			pw.flush();
			pw.close();
		}     
		
		catch(Exception e) {
			
		}
	



}

}









