package com.netflix.eventbus.impl;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class SubscriberValidatorDiffblueTest {
  /**
   * Method under test: {@link SubscriberValidator#validate(Object, List)}
   */
  @Test
  public void testValidate() {
    // Arrange and Act
    Map<Method, String> actualValidateResult = SubscriberValidator.validate("Subscriber", new ArrayList<>());

    // Assert
    assertTrue(actualValidateResult.isEmpty());
  }
}
