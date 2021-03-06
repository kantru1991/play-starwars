package bdoisw.test.entities;

public class Planet
{
	public static String entityName = "planet";
	private String name;
	private String climate;
	private String terrain;
	
	public Planet()
	{
	}
	
	public Planet(String name, String climate, String terrain)
	{
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getClimate()
	{
		return climate;
	}
	
	public void setClimate(String climate)
	{
		this.climate = climate;
	}
	
	public String getTerrain()
	{
		return terrain;
	}
	
	public void setTerrain(String terrain)
	{
		this.terrain = terrain;
	}
}