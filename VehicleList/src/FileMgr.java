import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileMgr
{
	@SuppressWarnings("unchecked")
	public static void write(Vehicle veh, String path, String filename)
	{
		JSONObject obj = new JSONObject();
		obj.put("id", veh.getId());
		obj.put("brand", veh.getBrand());
		obj.put("model", veh.getModel());
		obj.put("color", veh.getColor());
		obj.put("year", veh.getYear());
		obj.put("km", veh.getKilometers());
		obj.put("kW", veh.getkW());
		obj.put("ccm", veh.getCcm());
		obj.put("price", veh.getPrice());
		obj.put("fueltype", veh.getFueltype());
		obj.put("shopurl", veh.getShopurl());
		obj.put("imgurl", veh.getImgurl());
 
		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter(path + filename + ".veh"))
		{
			file.write(obj.toJSONString());
			System.out.println(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	 public static Vehicle read(String path, String filename) {
	        JSONParser parser = new JSONParser();
	        try
	        {
	        	Vehicle veh = new Vehicle();
	 
	            Object obj = parser.parse(new FileReader(path + filename));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	            
	            veh.setId(Integer.parseInt(jsonObject.get("id").toString()));
	            veh.setBrand(jsonObject.get("brand").toString());
	            veh.setModel(jsonObject.get("model").toString());
	            veh.setColor(jsonObject.get("color").toString());
	            veh.setYear(Integer.parseInt(jsonObject.get("year").toString()));
	            veh.setKilometers(Integer.parseInt(jsonObject.get("km").toString()));
	            veh.setkW(Integer.parseInt(jsonObject.get("kW").toString()));
	            veh.setCcm(Integer.parseInt(jsonObject.get("ccm").toString()));
	            veh.setPrice(Double.parseDouble(jsonObject.get("price").toString()));
	            veh.setFueltype(jsonObject.get("fueltype").toString());
	            veh.setShopurl(jsonObject.get("shopurl").toString());
	            veh.setImgurl(jsonObject.get("imgurl").toString());
	            
	            
	            return veh;
	 
	        }
	        catch (Exception e)
	        {
	            return null;
	        }
	    }

}
