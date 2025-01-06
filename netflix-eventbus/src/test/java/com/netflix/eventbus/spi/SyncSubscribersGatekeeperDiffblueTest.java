package com.netflix.eventbus.spi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.google.gson.JsonParseException;
import org.junit.Test;

public class SyncSubscribersGatekeeperDiffblueTest {
  /**
   * Test
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfigProvider.SubscriberConfig, Class, Class)}
   */
  @Test
  public void testIsSyncSubscriber_givenFalse_thenReturnFalse() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenReturn(false);
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act
    boolean actualIsSyncSubscriberResult = SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass,
        subscriberClass);

    // Assert
    verify(subscribe).syncIfAllowed();
    assertFalse(actualIsSyncSubscriberResult);
  }

  /**
   * Test
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   * <ul>
   *   <li>Given {@link JsonParseException#JsonParseException(String)} with
   * {@code Msg}.</li>
   *   <li>Then throw {@link JsonParseException}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfigProvider.SubscriberConfig, Class, Class)}
   */
  @Test
  public void testIsSyncSubscriber_givenJsonParseExceptionWithMsg_thenThrowJsonParseException() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenThrow(new JsonParseException("Msg"));
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act and Assert
    assertThrows(JsonParseException.class,
        () -> SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass, subscriberClass));
    verify(subscribe).syncIfAllowed();
  }

  /**
   * Test
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfig, Class, Class)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link SyncSubscribersGatekeeper#isSyncSubscriber(SubscriberConfigProvider.SubscriberConfig, Class, Class)}
   */
  @Test
  public void testIsSyncSubscriber_givenTrue_thenReturnTrue() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.syncIfAllowed()).thenReturn(true);
    Class<Object> eventClass = Object.class;
    Class<Object> subscriberClass = Object.class;

    // Act
    boolean actualIsSyncSubscriberResult = SyncSubscribersGatekeeper.isSyncSubscriber(subscribe, eventClass,
        subscriberClass);

    // Assert
    verify(subscribe).syncIfAllowed();
    assertTrue(actualIsSyncSubscriberResult);
  }
}
