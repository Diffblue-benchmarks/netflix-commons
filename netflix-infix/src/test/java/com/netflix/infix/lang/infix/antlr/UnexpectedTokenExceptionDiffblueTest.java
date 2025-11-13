package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UnexpectedTokenExceptionDiffblueTest {
  @Mock private Tree tree;

  @InjectMocks private UnexpectedTokenException unexpectedTokenException;

  /**
   * Test {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnexpectedTokenException.<init>(Tree, String[])"})
  public void testNewUnexpectedTokenException() {
    // Arrange and Act
    UnexpectedTokenException actualUnexpectedTokenException =
        new UnexpectedTokenException(new CommonTree(), "Expected");

    // Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getMessage());
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getLocalizedMessage());
    assertNull(actualUnexpectedTokenException.getCause());
    assertEquals(0, actualUnexpectedTokenException.getSuppressed().length);
  }

  /**
   * Test {@link UnexpectedTokenException#toString()}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnexpectedTokenException.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        new UnexpectedTokenException(new CommonTree(), "Expected").toString());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnexpectedTokenException.getMessage()"})
  public void testGetMessage() {
    // Arrange
    UnexpectedTokenException unexpectedTokenException =
        new UnexpectedTokenException(
            new CommonTree(), "Unexpected token %s at %d:%d. Expected: %s", "Expected");

    // Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Unexpected token %s at %d:%d. Expected: %s or Expected",
        unexpectedTokenException.getMessage());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <ul>
   *   <li>Given {@link Tree} {@link Tree#getText()} throw {@link
   *       RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnexpectedTokenException.getMessage()"})
  public void testGetMessage_givenTreeGetTextThrowRuntimeException_thenThrowRuntimeException() {
    // Arrange
    when(tree.getText()).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> unexpectedTokenException.getMessage());
    verify(tree).getText();
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <ul>
   *   <li>Then return {@code Unexpected token null at 0:0. Expected:}.
   * </ul>
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnexpectedTokenException.getMessage()"})
  public void testGetMessage_thenReturnUnexpectedTokenNullAt00Expected() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: ",
        new UnexpectedTokenException(new CommonTree()).getMessage());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <ul>
   *   <li>Then return {@code Unexpected token null at 0:0. Expected: Expected}.
   * </ul>
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnexpectedTokenException.getMessage()"})
  public void testGetMessage_thenReturnUnexpectedTokenNullAt00ExpectedExpected() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        new UnexpectedTokenException(new CommonTree(), "Expected").getMessage());
  }
}
