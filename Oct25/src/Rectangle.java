public class Rectangle {
	
	int width;
	int height;
	boolean filled;
	
	public Rectangle(int width, int height, boolean filled)
	{
		this.width = width;
		this.height = height;
		this.filled = filled;
	}
	
	public void draw()
	{
		if(filled == true)
		{
			for(int i = 0; i < height; i++)
			{
				for(int j = 0; j < width; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
		{
			for(int i = 0; i < height; i++)
			{
				if(i == 0 || i == height-1)
				{
					for(int j = 0; j < width; j++)
					{
						System.out.print("*");
					}
				}
				else
				{
					for(int j = 0; j < width; j++)
					{
						if(j == 0 || j == width-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}