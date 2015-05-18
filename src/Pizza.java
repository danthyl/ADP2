public class Pizza
{
        private String nome;
        private String endereco;
        private String tel;
        private int id;
	private double cost;		
	public String pizzaType;
	private int size;		
	private int numToppings;        
	private String toppingList;	
	
        
	//Construtor  
        String [] PizzaType  = {"(1)Calabreza, (2)Frango, (3)Margherita , (4) Portuguesa "};
        
        
        public Pizza()
	{
                size = 10;
		cost = 20.00;
                numToppings = 0;
		toppingList = null;
                
                /*
                
                size = 12;
		cost = 30.00;
                numToppings = 0;
		toppingList = null;
               
                
               
                size = 14;
		cost = 40.00;
                numToppings = 0;
		toppingList = null;
  
                    
               
                size = 16;
		cost = 45.00;
                numToppings = 0;
		toppingList = null;
                            
	
            }*/
        }
	
	public void setCost (double amount)
	{
		cost += amount;
	}
	
	
	public void setCrust (String type)
	{
		pizzaType = type;
	}
	
	
	public void setSize (int diameter)
	{
		size = diameter;
	}
	
	
	public void setNumToppings(int number)
	{
		numToppings = number;
	}
	
	public void setToppingList (String newTopping)
	{
		toppingList = newTopping;
	}
		

	public double getCost()
	{
		return cost;
	}
	
	public String getCrust()
	{
		return pizzaType;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getNumToppings()
	{
		return numToppings;
	}
	
	public String getToppingList()
	{
		return toppingList;
	}

        public String getNome() 
        {
            return nome;
        }

        public String getEndereco() 
        {
            return endereco;
        }

        public String getTel()
        {
            return tel;
        }

        public int getId()
        {
            return id; 
        }

    
}