

public class Vehicle
{
	public static int amount;
	
	public Vehicle()
	{
		amount++;
	}
	
	private int id;
	private String brand = "";
	private String model = "";
	private String color = "gray";
	private int year = 2000;
	private int kilometers = 0;
	private int kW = 0;
	private int ccm = 0;
	private double price = 0;
	private String fueltype = "gasoline";
	private String shopurl = "";
	private String imgurl = "";

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getHP() {
		return (int)(kW / 0.745699872);
	}

	public void setHP(int hP) {
		kW = (int)(hP * 0.745699872);
	}

	public int getCcm() {
		return ccm;
	}

	public void setCcm(int ccm) {
		this.ccm = ccm;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getkW() {
		return kW;
	}

	public void setkW(int kW) {
		this.kW = kW;
	}

	public String getCondition() {
		if(kilometers > 0)
		{
			return "used";
		}
		else
		{
			return "new";
		}
			
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	public String getInfos()
	{
		return year + " " + brand + " " + model;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getShopurl() {
		return shopurl;
	}

	public void setShopurl(String shopurl) {
		this.shopurl = shopurl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
