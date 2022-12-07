import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<MagicCard> collection = new ArrayList<MagicCard>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome! ");
		String input = "";
		while(!(input.equals("q")))
		{
			System.out.println("What would you like to do?" + "\n[a]: Add new card" + "\n[s]: Search for card" + "\n[q]: Quit");
			input = scan.nextLine();
			if(input.equals("a"))
			{
				System.out.print("Please enter card name: ");
				String name = scan.nextLine();
				System.out.print("Please enter card color: ");
				String color = scan.nextLine();
				System.out.print("Please enter card type: ");
				String type = scan.nextLine();
				System.out.print("Please enter card rarity: ");
				String rarity = scan.nextLine();
				System.out.print("Please enter card mana breakdown: ");
				String costBreakdown = scan.nextLine();
				System.out.print("Please enter card converted mana cost: ");
				int cost = scan.nextInt();
				scan.nextLine();
				MagicCard card1 = new MagicCard(name, color, type, rarity, cost, costBreakdown);
				
				System.out.print("Would you like to add a description at this time?: [Y]/[N] ");
				
				String desc = scan.nextLine();
				if(desc.equals("y"))
				{
					System.out.println("Please enter card description: ");
					card1.AddDescription(scan.nextLine());
				}
				else if(desc.equals("n"))
				{
					card1.description = "";
				}
				collection.add(card1);
				System.out.println("Card added to collection!\nCollection currently has " + collection.size() + " cards.\n");
			}
			else if(input.equals("s"))
			{
				System.out.println("Search for card by name: [n]\nor Search for card by characteristics: [c]");
				String search = scan.nextLine();
				if(search.equals("n"))
				{
					System.out.print("Please enter card name: ");
					String cardName = scan.nextLine();
					SearchByName(cardName);
				}
				else if(search.equals("c"))
				{
					System.out.println("Search by:\nColor: [c]\nType: [t]\nCMC: [m]\nRarity: [r]");
					String characteristic = scan.nextLine();
					if(characteristic.equals("c"))
					{
						System.out.print("Please enter color: ");
						characteristic = scan.nextLine();
						SearchByCharacteristic(characteristic, collection);
					}
					else if(characteristic.equals("t"))
					{
						System.out.print("Please enter card type: ");
						characteristic = scan.nextLine();
						SearchByCharacteristic(characteristic, collection);
					}
					else if(characteristic.equals("m"))
					{
						System.out.print("Please enter CMC: ");
						characteristic = scan.nextLine();
						SearchByCharacteristic(characteristic, collection);
					}
					else if(characteristic.equals("r"))
					{
						System.out.print("Please enter rarity: ");
						characteristic = scan.nextLine();
						SearchByCharacteristic(characteristic, collection);
					}
				}
			}
			else if(!(input.equals("q")))
			{
				System.out.println("Please enter a correct input");
			}
		}
		System.out.println("Goodbye!");
	}
	
	public static MagicCard SearchByName(String cardName)
	{
		
	}
	
	public static ArrayList<MagicCard> SearchByCharacteristic(String characteristic, ArrayList<MagicCard> collection)
	{
		ArrayList<MagicCard> list = new ArrayList<MagicCard>();
		
	}
	
}