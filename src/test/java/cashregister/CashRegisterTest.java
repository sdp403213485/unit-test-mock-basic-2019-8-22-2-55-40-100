package cashregister;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
//        //given
//    	Item [] itemArr= new Item[1];
//    	itemArr[0] = new Item("apple", 2);
//    	itemArr[1] = new Item("banana", 6);
//    	
//    	Purchase purchase = new Purchase(itemArr);
//    	Printer printer = null;
//		CashRegister cashRegister = new CashRegister(printer);
//    	
//        //when
//		cashRegister.process(purchase);
//        //then
//		assertEquals(,cashRegister.process(purchase));
    	
    	Printer printer = mock(Printer.class);
    	Purchase purchase = mock(Purchase.class);
    	CashRegister cashRegister =  new CashRegister(printer);
    	when(purchase.asString()).thenReturn("the message which should be print");
    	
    	//when
    	cashRegister.process(purchase);
    	 
    	//then
    	verify(printer).print("the message which should be print");
    	
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }
    
    
    
    

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
