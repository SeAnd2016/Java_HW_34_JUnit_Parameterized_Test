package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Subtract4ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} - {2} - {3} - {4} = {0}")
       public static Collection<Double[]> subtractNumbers() {
              return Arrays.asList(new Double[][] {
                           { 4.0, 10.0, 2.0, 3.0, 1.0 }, 
                           { 4.0, 20.0, 3.0, 10.0, 3.0 }, 
                           { 1.0, 30.0, 4.0, 20.0, 5.0 }, 
                           { 30.0, 99.0, 5.0, 14.0, 50.0 },
              });}
      
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Parameter(value = 3) public Double third;
       @Parameter(value = 4) public Double forth;
       
       @Category(RegressionTest.class)
       @Test
       public void subtract() {
              System.out.println(first + " - " + second + " - " + third + " - " + forth + " = " + expected);
              assertEquals("Result of subtraction of 4 parameters is wrong", Calculator.subtract(first, second, third, forth), expected, 0.09);
       }
 }

