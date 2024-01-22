package com.thoughtworks.wallet;

import java.util.Objects;

public class Rupee {
      private final double value;
    
    public Rupee(double value) throws Exception
    {
        if(value<0)
            throw new Exception();
        this.value=value;
    }

    public Rupee add(Rupee rupee,Rupee currentRupee) throws Exception
    {
        
        return new Rupee(rupee.value+currentRupee.value);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rupee rupee = (Rupee) obj;
        return Double.compare(rupee.value, value) == 0;
    }
        @Override
        public int hashCode() {
            return 1;
        
    }

    
   
   
    
}
