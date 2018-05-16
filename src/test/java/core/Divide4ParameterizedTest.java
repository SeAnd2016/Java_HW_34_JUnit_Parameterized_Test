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
public class Divide4ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} / {2} / {3} / {4} = {0}")
       public static Collection<Double[]> divideNumbers() {
              return Arrays.asList(new Double[][] {
                           { 1.0, 8.0, 2.0, 2.0, 2.0 }, 
                           { 1.5, 30.0, 2.0, 5.0, 2.0 }, 
                           { 2.0, 120.0, 3.0, 10.0, 2.0 }, 
                           { 2.5, 100.0, 2.0, 10.0, 2.0 },
              });}
      
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Parameter(value = 3) public Double third;
       @Parameter(value = 4) public Double forth;
       
       @Category(RegressionTest.class)
       @Test
       public void divide() {
              System.out.println(first + " / " + second + " / " + third + " / " + forth + " = " + expected);
              assertEquals("Result of division of 4 parameters is wrong", Calculator.divide(first, second, third, forth), expected, 0.09);
       }
 }

