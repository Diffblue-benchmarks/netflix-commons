package com.netflix.stats.distribution;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DistributionDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Distribution}
   *   <li>{@link Distribution#toString()}
   *   <li>{@link Distribution#getMaximum()}
   *   <li>{@link Distribution#getMinimum()}
   *   <li>{@link Distribution#getNumValues()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Distribution.<init>()", "double Distribution.getMaximum()",
      "double Distribution.getMinimum()", "long Distribution.getNumValues()", "String Distribution.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    Distribution actualDistribution = new Distribution();
    String actualToStringResult = actualDistribution.toString();
    double actualMaximum = actualDistribution.getMaximum();
    double actualMinimum = actualDistribution.getMinimum();

    // Assert
    assertEquals("{Distribution:N=0: 0.0..0.0..0.0}", actualToStringResult);
    assertEquals(0.0d, actualMaximum, 0.0);
    assertEquals(0.0d, actualMinimum, 0.0);
    assertEquals(0L, actualDistribution.getNumValues());
  }

  /**
   * Test {@link Distribution#noteValue(double)}.
   * <p>
   * Method under test: {@link Distribution#noteValue(double)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Distribution.noteValue(double)"})
  public void testNoteValue() {
    // Arrange
    Distribution distribution = new Distribution();

    // Act
    distribution.noteValue(10.0d);

    // Assert
    assertEquals(10.0d, distribution.getMaximum(), 0.0);
    assertEquals(10.0d, distribution.getMean(), 0.0);
    assertEquals(10.0d, distribution.getMinimum(), 0.0);
    assertEquals(1L, distribution.getNumValues());
  }

  /**
   * Test {@link Distribution#getMean()}.
   * <p>
   * Method under test: {@link Distribution#getMean()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"double Distribution.getMean()"})
  public void testGetMean() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Distribution()).getMean(), 0.0);
  }

  /**
   * Test {@link Distribution#getVariance()}.
   * <p>
   * Method under test: {@link Distribution#getVariance()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"double Distribution.getVariance()"})
  public void testGetVariance() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Distribution()).getVariance(), 0.0);
  }

  /**
   * Test {@link Distribution#getStdDev()}.
   * <p>
   * Method under test: {@link Distribution#getStdDev()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"double Distribution.getStdDev()"})
  public void testGetStdDev() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Distribution()).getStdDev(), 0.0);
  }
}
