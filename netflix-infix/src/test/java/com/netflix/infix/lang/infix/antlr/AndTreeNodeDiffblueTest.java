package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.google.common.base.Predicate;
import com.netflix.infix.AndPredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.mockito.Mockito;

public class AndTreeNodeDiffblueTest {
  /**
   * Test {@link AndTreeNode#translate()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>Then return not apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AndTreeNode#translate()}
   */
  @Test
  public void testTranslate_givenPredicateApplyReturnFalse_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    BetweenTimeMillisTreeNode t = mock(BetweenTimeMillisTreeNode.class);
    when(t.isNil()).thenReturn(false);
    when(t.translate()).thenReturn(predicate);
    doNothing().when(t).setChildIndex(anyInt());
    doNothing().when(t).setParent(Mockito.<Tree>any());

    AndTreeNode andTreeNode = new AndTreeNode(new ClassicToken(1));
    andTreeNode.addChild(t);

    // Act
    Predicate<Object> actualTranslateResult = andTreeNode.translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(t).translate();
    verify(t).isNil();
    verify(t).setChildIndex(eq(0));
    verify(t).setParent(isA(Tree.class));
    assertTrue(actualTranslateResult instanceof AndPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualTranslateResult.apply("Input"));
    assertFalse(actualTranslateResult.test("Input"));
  }

  /**
   * Test {@link AndTreeNode#translate()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AndTreeNode#translate()}
   */
  @Test
  public void testTranslate_givenPredicateApplyReturnTrue_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    BetweenTimeMillisTreeNode t = mock(BetweenTimeMillisTreeNode.class);
    when(t.isNil()).thenReturn(false);
    when(t.translate()).thenReturn(predicate);
    doNothing().when(t).setChildIndex(anyInt());
    doNothing().when(t).setParent(Mockito.<Tree>any());

    AndTreeNode andTreeNode = new AndTreeNode(new ClassicToken(1));
    andTreeNode.addChild(t);

    // Act
    Predicate<Object> actualTranslateResult = andTreeNode.translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(t).translate();
    verify(t).isNil();
    verify(t).setChildIndex(eq(0));
    verify(t).setParent(isA(Tree.class));
    assertTrue(actualTranslateResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualTranslateResult.apply("Input"));
    assertTrue(actualTranslateResult.test("Input"));
  }

  /**
   * Test {@link AndTreeNode#AndTreeNode(Token)}.
   *
   * <p>Method under test: {@link AndTreeNode#AndTreeNode(Token)}
   */
  @Test
  public void testNewAndTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    AndTreeNode actualAndTreeNode = new AndTreeNode(t);

    // Assert
    assertNull(actualAndTreeNode.getChildren());
    assertNull(actualAndTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualAndTreeNode.getChildIndex());
    assertSame(t, actualAndTreeNode.getToken());
  }

  /**
   * Test {@link AndTreeNode#AndTreeNode(AndTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link AndTreeNode#AndTreeNode(AndTreeNode)}
   */
  @Test
  public void testNewAndTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    AndTreeNode actualAndTreeNode = new AndTreeNode(new AndTreeNode(t));

    // Assert
    Token token = actualAndTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<AndTreeNode>", actualAndTreeNode.toStringTree());
    assertNull(actualAndTreeNode.getText());
    assertNull(actualAndTreeNode.getChildren());
    assertNull(actualAndTreeNode.getAncestors());
    assertNull(actualAndTreeNode.getParent());
    assertEquals(0, actualAndTreeNode.getChildCount());
    assertEquals(0, actualAndTreeNode.getCharPositionInLine());
    assertEquals(0, actualAndTreeNode.getLine());
    assertEquals(0, actualAndTreeNode.getTokenStartIndex());
    assertEquals(0, actualAndTreeNode.getTokenStopIndex());
    assertEquals(1, actualAndTreeNode.getType());
    assertFalse(actualAndTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualAndTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link AndTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link AndTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new AndTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof AndTreeNode);
    Token token = ((AndTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<AndTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((AndTreeNode) actualDupNodeResult).getChildren());
    assertNull(actualDupNodeResult.getAncestors());
    assertNull(actualDupNodeResult.getParent());
    assertEquals(0, actualDupNodeResult.getCharPositionInLine());
    assertEquals(0, actualDupNodeResult.getChildCount());
    assertEquals(0, actualDupNodeResult.getLine());
    assertEquals(0, actualDupNodeResult.getTokenStartIndex());
    assertEquals(0, actualDupNodeResult.getTokenStopIndex());
    assertEquals(1, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
    assertSame(t, token);
  }
}
