public class Loja {
    private String endereco;
    private String tel;
    private int numToppings;        
    private String toppingList;	


    //Construtor  


    public void setNumToppings(int number)
    {
            numToppings = number;
    }

    public void setToppingList (String newTopping)
    {
            toppingList = newTopping;
    }

    public int getNumToppings()
    {
            return numToppings;
    }

    public String getToppingList()
    {
            return toppingList;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public String getTel()
    {
        return tel;
    }


}
