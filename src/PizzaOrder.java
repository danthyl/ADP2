import java.util.Scanner;


public class PizzaOrder
{
      public String nome;
      public String endereco;
      public String tel;
      public String id;
      
	public static void main (String [] args)
	{
		
		Scanner keyboard = new Scanner (System.in);

		//Criando uma instancia Pizza
		Pizza order = new Pizza();
                
                String nome;
                String endereco;
                String tel;
                int id;
                id = 0;
		int inches;			//tamanho
		char pizzaType = 0;             //Tipo de pizza
		final double TAX_DELIVERY = .08;//taxa entrega
                double cost;			//custo
		double tax;			//taxa extra
		char choice;			//escolha
		String input;			//usuário entrada
		String toppings = "Itens";      //Lista de tópicos
		int numberOfToppings = 0;	//numero topicos

		//prompt Usuário
		System.out.println("Bem Vindo a pizza Express");
		System.out.println("Entre com o nome:  ");
		nome = keyboard.nextLine();
                System.out.println("Entre com endereço");
                endereco = keyboard.nextLine();
                System.out.println("Qual telefone");
                tel = keyboard.nextLine();
                id = id + 1;
                System.out.println("Numero id:" + id);

		//prompt usuario tamanho
		System.out.println("Pizza Tamanho(cortes)   Valor");
		System.out.println("        10            R$20.00");
		System.out.println("        12            R$30.00");
		System.out.println("        14            R$40.00");
		System.out.println("        16            R$45.00");
		System.out.println("Qual tamanho deseja?");
		System.out.print("10, 12, 14, or 16 (entre com um tamanho): ");
		inches = keyboard.nextInt();

		{
			int diameter;
			
			if (inches == 10)
			diameter = 10;
			
			else if (inches == 12)
			diameter = 12;
			
			else if (inches == 14)
			diameter = 14;
			
			else if (inches == 16)
			diameter = 16;
		}
		
		keyboard.nextLine();

		//Tipo de Massa
		System.out.println("Qual tipo de Pizza ");
		System.out.print("(1)Calabreza, (2)Frango, (3)Margherita , (4) Portuguesa " + pizzaType);
		input = keyboard.nextLine();
		pizzaType = input.charAt(0);

		
		//Escolha extras
		System.out.println("Itens adicionais R$5.0 cada,"
				+ " escolha");
		System.out.println("Cheeder, Coca 2lt");

		//Lista de itens
		System.out.print("Gostaria Cheeder?  (S/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
		if (choice == 'S' || choice == 's')
		{
			numberOfToppings += 1;
			toppings = toppings + "Cheeder ";
		}
		System.out.print("Coca-Cola 2lt?  (S/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
		if (choice == 'S' || choice == 's')
		{
			numberOfToppings += 1;
			toppings = toppings + "Coca-Cola ";
		}

		//Ordem dos itens
		order.setNumToppings (numberOfToppings);
		order.setToppingList(toppings);

		//Adicionais
		order.setCost(5.0*numberOfToppings);

		//Confirmação
		System.out.println();
		System.out.println("Cliente:"+ nome);
                System.out.println("Endereço:"+ endereco);
                System.out.println("Tel: "+ tel);
                System.out.println("Seu pedido é: "+ id);
		System.out.println(order.getSize() + " tam. pizza");
		System.out.println("Pizza: " + pizzaType);
		
                System.out.println(order.getToppingList());

		//valor 
		cost = order.getCost();

		System.out.println("O valor do seu pedido é: R$" + cost);

		//Calculos extras
		tax = cost * TAX_DELIVERY;
		System.out.println("Valor de entrega:  R$" + tax);
		System.out.println("Valor total:  R$" + (tax+cost));

		System.out.println("Seu pedido criado foi criado!");
                
	}
  
}