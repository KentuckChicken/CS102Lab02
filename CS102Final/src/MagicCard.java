public class MagicCard {
	
	String name;
	String color;
	String cardType;
	String rarity;
	int castingCost;
	String castingCostBreakdown;
	String description;
	
	public MagicCard(String name, String color, String cardType, String rarity, int castingCost, String castingCostBreakdown)
	{
		this.name = name;
		this.color = color;
		this.cardType = cardType;
		this.rarity = rarity;
		this.castingCost = castingCost;
		this.castingCostBreakdown = castingCostBreakdown;
	}
	
	void AddDescription(String description)
	{
		this.description = description;
	}
	
	void PrintCardDetails()
	{
		System.out.println(name + "\n" + color + "\n" + cardType + "\n" + rarity + "\n" + castingCost + " CMC; " + castingCostBreakdown);
		if(description != null)
		{
			System.out.println("'" + description + "'");
		}
		System.out.println("\n");
	}
	
}