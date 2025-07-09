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
import com.netflix.infix.OrPredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.mockito.Mockito;

public class OrTreeNodeDiffblueTest {
  /**
   * Test {@link OrTreeNode#translate()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>Then return not apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OrTreeNode#translate()}
   */
  @Test
  public void testTranslate_givenPredicateApplyReturnFalse_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    AndTreeNode t = mock(AndTreeNode.class);
    when(t.isNil()).thenReturn(false);
    when(t.translate()).thenReturn(predicate);
    doNothing().when(t).addChild(Mockito.<Tree>any());
    doNothing().when(t).setChildIndex(anyInt());
    doNothing().when(t).setParent(Mockito.<Tree>any());
    t.addChild(new AndTreeNode(new ClassicToken(1)));

    OrTreeNode orTreeNode = new OrTreeNode(new ClassicToken(1));
    orTreeNode.addChild(t);

    // Act
    Predicate<Object> actualTranslateResult = orTreeNode.translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(t).translate();
    verify(t).addChild(isA(Tree.class));
    verify(t).isNil();
    verify(t).setChildIndex(eq(0));
    verify(t).setParent(isA(Tree.class));
    assertTrue(actualTranslateResult instanceof OrPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualTranslateResult.apply("Input"));
    assertFalse(actualTranslateResult.test("Input"));
  }

  /**
   * Test {@link OrTreeNode#translate()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OrTreeNode#translate()}
   */
  @Test
  public void testTranslate_givenPredicateApplyReturnTrue_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    AndTreeNode t = mock(AndTreeNode.class);
    when(t.isNil()).thenReturn(false);
    when(t.translate()).thenReturn(predicate);
    doNothing().when(t).addChild(Mockito.<Tree>any());
    doNothing().when(t).setChildIndex(anyInt());
    doNothing().when(t).setParent(Mockito.<Tree>any());
    t.addChild(new AndTreeNode(new ClassicToken(1)));

    OrTreeNode orTreeNode = new OrTreeNode(new ClassicToken(1));
    orTreeNode.addChild(t);

    // Act
    Predicate<Object> actualTranslateResult = orTreeNode.translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(t).translate();
    verify(t).addChild(isA(Tree.class));
    verify(t).isNil();
    verify(t).setChildIndex(eq(0));
    verify(t).setParent(isA(Tree.class));
    assertTrue(actualTranslateResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualTranslateResult.apply("Input"));
    assertTrue(actualTranslateResult.test("Input"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OrTreeNode#OrTreeNode(Token)}
   *   <li>{@link OrTreeNode#toString()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(t);

    // Assert
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toString());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, actualOrTreeNode.getToken());
  }

  /**
   * Test {@link OrTreeNode#OrTreeNode(OrTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link OrTreeNode#OrTreeNode(OrTreeNode)}
   */
  @Test
  public void testNewOrTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(new OrTreeNode(t));

    // Assert
    Token token = actualOrTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toStringTree());
    assertNull(actualOrTreeNode.getText());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getAncestors());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(0, actualOrTreeNode.getChildCount());
    assertEquals(0, actualOrTreeNode.getCharPositionInLine());
    assertEquals(0, actualOrTreeNode.getLine());
    assertEquals(0, actualOrTreeNode.getTokenStartIndex());
    assertEquals(0, actualOrTreeNode.getTokenStopIndex());
    assertEquals(1, actualOrTreeNode.getType());
    assertFalse(actualOrTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link OrTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link OrTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new OrTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof OrTreeNode);
    Token token = ((OrTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<OrTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((OrTreeNode) actualDupNodeResult).getChildren());
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
