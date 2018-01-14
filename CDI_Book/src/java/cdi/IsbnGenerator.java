package cdi;

import java.util.Random;

/**
 *
 * @author andre
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGeneretor{

    public IsbnGenerator() {
    }
    
    @Override
    public String generatedNumber() {
       return "13-84652-" + Math.abs( new Random().nextInt());
    }

    
}
