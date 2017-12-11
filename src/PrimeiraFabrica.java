

public class PrimeiraFabrica implements FabricaAbstrata{

    @Override
    public JanelaA criarJanelaA() {
        return new JanelaA1();
       }

    @Override
    public JanelaB criarJanelaB() {
        return new JanelaB1();
    }

    

  
    
}
