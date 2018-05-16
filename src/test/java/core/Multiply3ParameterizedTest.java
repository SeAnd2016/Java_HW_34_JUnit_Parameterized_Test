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
public class Multiply3ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} * {2} * {3} = {0}")
       public static Collection<Double[]> multiplyNumbers() {
              return Arrays.asList(new Double[][] {
                           { 8.0, 2.0, 2.0, 2.0 }, 
                           { 60.0, 2.0, 3.0, 10.0 }, 
                           { 24.0, 3.0, 4.0, 2.0 }, 
                           { 100.0, 4.0, 5.0, 5.0 },
              });}
      
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Parameter(value = 3) public Double third;
       
       @Category({AcceptanceTest.class, RegressionTest.class})
       @Test
       public void multiply() {
              System.out.println(first + " * " + second + " * " + third + " = " + expected);
              assertEquals("Result of multiplication of 3 parameters is wrong", Calculator.multiply(first, second, third), expected, 0.09);
       }
 }

