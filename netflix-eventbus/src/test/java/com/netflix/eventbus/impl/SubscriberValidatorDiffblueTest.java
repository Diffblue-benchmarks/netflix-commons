package com.netflix.eventbus.impl;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SubscriberValidatorDiffblueTest {
  /**
   * Test {@link SubscriberValidator#validate(Object, List)}.
   *
   * <ul>
   *   <li>When {@code Subscriber}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link SubscriberValidator#validate(Object, List)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SubscriberValidator.validate(Object, List)"})
  public void testValidate_whenSubscriber_thenReturnEmpty() {
    // Arrange and Act
    Map<Method, String> actualValidateResult =
        SubscriberValidator.validate("Subscriber", new ArrayList<>());

    // Assert
    assertTrue(actualValidateResult.isEmpty());
  }
}
