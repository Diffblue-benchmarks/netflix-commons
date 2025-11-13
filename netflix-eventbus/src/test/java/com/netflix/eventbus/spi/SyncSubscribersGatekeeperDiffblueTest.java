package com.netflix.eventbus.spi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.gson.JsonParseException;
import com.netflix.eventbus.spi.SubscriberConfigProvider.SubscriberConfig;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SyncSubscribersGatekeeperDiffblueTest {
  /**
   * Test {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig,
   * Class, Class)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SyncSubscribersGatekeeper.isSyncSubscriber(SubscriberConfig, Class, Class)"
  })
  public void testIsSyncSubscriber_givenFalse_thenReturnFalse() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenReturn(false);
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act
    boolean actualIsSyncSubscriberResult =
        SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass, subscriberClass);

    // Assert
    verify(subscribe).syncIfAllowed();
    assertFalse(actualIsSyncSubscriberResult);
  }

  /**
   * Test {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   *
   * <ul>
   *   <li>Given {@link JsonParseException#JsonParseException(String)} with {@code Msg}.
   *   <li>Then throw {@link JsonParseException}.
   * </ul>
   *
   * <p>Method under test: {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig,
   * Class, Class)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SyncSubscribersGatekeeper.isSyncSubscriber(SubscriberConfig, Class, Class)"
  })
  public void testIsSyncSubscriber_givenJsonParseExceptionWithMsg_thenThrowJsonParseException() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenThrow(new JsonParseException("Msg"));
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act and Assert
    assertThrows(
        JsonParseException.class,
        () -> SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass, subscriberClass));
    verify(subscribe).syncIfAllowed();
  }

  /**
   * Test {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig,
   * Class, Class)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SyncSubscribersGatekeeper.isSyncSubscriber(SubscriberConfig, Class, Class)"
  })
  public void testIsSyncSubscriber_givenTrue_thenReturnTrue() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenReturn(true);
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act
    boolean actualIsSyncSubscriberResult =
        SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass, subscriberClass);

    // Assert
    verify(subscribe).syncIfAllowed();
    assertTrue(actualIsSyncSubscriberResult);
  }

  /**
   * Test {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig,
   * Class, Class)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SyncSubscribersGatekeeper.isSyncSubscriber(SubscriberConfig, Class, Class)"
  })
  public void testIsSyncSubscriber_givenTrue_whenNull_thenReturnTrue() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenReturn(true);
    Class<Object> subscriberClass = Object.class;

    // Act
    boolean actualIsSyncSubscriberResult =
        SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, null, subscriberClass);

    // Assert
    verify(subscribe).syncIfAllowed();
    assertTrue(actualIsSyncSubscriberResult);
  }
}
