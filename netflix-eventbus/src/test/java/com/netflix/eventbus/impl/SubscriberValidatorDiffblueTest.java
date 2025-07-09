package com.netflix.eventbus.impl;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

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
  public void testValidate_whenSubscriber_thenReturnEmpty() {
    // Arrange and Act
    Map<Method, String> actualValidateResult =
        SubscriberValidator.validate("Subscriber", new ArrayList<>());

    // Assert
    assertTrue(actualValidateResult.isEmpty());
  }
}
