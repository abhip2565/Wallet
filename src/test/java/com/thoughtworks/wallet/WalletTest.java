package com.thoughtworks.wallet;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class WalletTest {
    
    @Test
    public void shouldCreditWalletWhenMoneyIsAdded()throws Exception
    {
        Wallet wallet=new Wallet();
        Rupee rupee=new Rupee(41);
        Rupee expectedBalance = new Rupee(42.0);
        
        wallet.put(rupee);
        assertTrue(wallet.balance().equals(expectedBalance));
    }

  


}
