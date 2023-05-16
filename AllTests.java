package entornos2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    RomanNumeralConverterTest.class,
    CurrencyConverterTest.class
})
public class AllTests {
    // this class only needs to be defined
    // to annotate the @SuiteClasses annotation
}