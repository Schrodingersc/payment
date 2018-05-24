package order;

interface FactoryPay {  
    process validataPara();  
}  

public class Factory implements FactoryPay{  
	  
    @Override  
    public validataPara validataPara() {  
  
        return new validataPara();  
    }
    
    
  
}  
 