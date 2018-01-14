package cdi;

import java.util.Random;

/**
 *
 * @author andre
 */
@EightDigits
public class IssnGenerator implements NumberGeneretor{

    public IssnGenerator() {
    }

    @Override
    public String generatedNumber() {
        return "8-" + Math.abs(new Random().nextInt());
    }
    
}
