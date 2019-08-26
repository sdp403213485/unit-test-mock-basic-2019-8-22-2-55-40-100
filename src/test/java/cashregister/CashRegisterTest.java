package cashregister;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.nio.channels.NonWritableChannelException;

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
    	Printer printer = mock(Printer.class);
    	Purchase purchase = mock(Purchase.class);
    	CashRegister cashRegister =  new CashRegister(printer);
//    	when(purchase.asString()).thenReturn("asString use");
    	
    	//when
    	cashRegister.process(purchase);
    	 
    	//then
    	verify(purchase).asString();
    }
    
    
    

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
    	
        //when
        //then
    }

    
    
    @Test
    public void should_return_item_name_and_price_when_as_string_given_mock_item() {
        //given
    	Item [] items= new Item[2];
    	items[0] = mock(Item.class);
    	items[1] = mock(Item.class);
    	Purchase purchase = new Purchase(items);
//    	when(purchase.asString()).thenReturn("item_name_and_price");
        //when
    	purchase.asString();
        //then
    	verify(items[0]).getName();
    	verify(items[1]).getName();
    	verify(items[0]).getPrice();
    	verify(items[1]).getPrice();
    }
}
