import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VehicleList
{
	
	public static final String path = "./vehicles/";
	
	public static void main(String[] args)
	{
		
		File folder = new File(path);
		
		if (!(Files.isDirectory(Paths.get(path))))
		{
			folder.mkdir();
		}
		
		File[] filesinFolder = folder.listFiles();
		File[] vehsinFolder = new File[filesinFolder.length];
		int files = 0;
		
		for(int i = 0; i < filesinFolder.length; i++)
		{
			String filename = filesinFolder[i].getName();
			String[] split = filename.split("\\.");
			String type = split[split.length - 1];
			
			if(type.equalsIgnoreCase("veh"))
			{
				vehsinFolder[files] = filesinFolder[i];
				files++;
			}
			
			
		}
		
		
		System.out.println(files + " files have been found!");
		
		
		
		int usablefiles = 0;
		for(int i = 0; i < files; i++)
		{
			if(FileMgr.read(path, vehsinFolder[i].getName()) != null)
			{
				usablefiles++;
			}
		}
		
		System.out.println(usablefiles + " vehicles have been found!");
		
		Vehicle[] veh = new Vehicle[usablefiles];
		
		int counter = 0;
		for(int i = 0; i < files; i++)
		{
			Vehicle test = FileMgr.read(path, vehsinFolder[i].getName());
			if(test == null)
			{
				//System.out.println("\"" + vehsinFolder[i].getName() + "\" is invalid!");
			}
			else
			{
				veh[counter] = test;
				System.out.println("\"" + vehsinFolder[i].getName() + "\" has been imported! ID: " + veh[counter].getId());
				counter++;
			}
			
		}
		new Window(veh, veh.length);
		
		
		
		
		
		
		
	}
}
