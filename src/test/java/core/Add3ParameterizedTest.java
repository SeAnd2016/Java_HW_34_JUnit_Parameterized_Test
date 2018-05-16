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
public class Add3ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} + {2} + {3} = {0}")
       public static Collection<Double[]> addNumbers() {
              return Arrays.asList(new Double[][] {
                           { 6.0, 1.0, 2.0, 3.0 },
                           { 15.0, 2.0, 3.0, 10.0 },
                           { 8.0, 3.0, 4.0, 1.0 },
                           { 12.0, 4.0, 5.0, 3.0 },
              });}
      
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Parameter(value = 3) public Double third;
       
       @Category({AcceptanceTest.class, RegressionTest.class})
       @Test
       public void add() {
              System.out.println(first + " + " + second + " + " + third + " = " + expected);
              assertEquals("Result of addition of 3 parameters is wrong", Calculator.add(first, second, third), expected, 0.09);
       }
 }

