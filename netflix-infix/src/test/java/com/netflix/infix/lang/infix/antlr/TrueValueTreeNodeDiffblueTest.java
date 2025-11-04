package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.google.common.base.Predicate;
import com.netflix.infix.AlwaysTruePredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class TrueValueTreeNodeDiffblueTest {
  /**
   * Method under test: {@link TrueValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new TrueValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TrueValueTreeNode);
    assertEquals("null<TrueValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((TrueValueTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((TrueValueTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link TrueValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new TrueValueTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TrueValueTreeNode);
    assertEquals("null<TrueValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((TrueValueTreeNode) actualDupNodeResult).getChildren());
    assertNull(actualDupNodeResult.getAncestors());
    assertNull(actualDupNodeResult.getParent());
    assertEquals(0, actualDupNodeResult.getCharPositionInLine());
    assertEquals(0, actualDupNodeResult.getChildCount());
    assertEquals(0, actualDupNodeResult.getLine());
    assertEquals(0, actualDupNodeResult.getTokenStartIndex());
    assertEquals(0, actualDupNodeResult.getTokenStopIndex());
    assertEquals(0, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
  }

  /**
   * Method under test: {@link TrueValueTreeNode#translate()}
   */
  @Test
  public void testTranslate() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult = (new TrueValueTreeNode(new ClassicToken(1))).translate();

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysTruePredicate);
    assertTrue(actualTranslateResult.apply("42"));
    assertTrue(actualTranslateResult.apply("Input"));
    assertTrue(actualTranslateResult.test("Input"));
  }

  /**
   * Method under test: {@link TrueValueTreeNode#translate()}
   */
  @Test
  public void testTranslate2() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult = (new TrueValueTreeNode(mock(Token.class))).translate();

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysTruePredicate);
    assertTrue(actualTranslateResult.apply("42"));
    assertTrue(actualTranslateResult.apply("Input"));
    assertTrue(actualTranslateResult.test("Input"));
  }

  /**
   * Method under test: {@link TrueValueTreeNode#TrueValueTreeNode(Token)}
   */
  @Test
  public void testNewTrueValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TrueValueTreeNode actualTrueValueTreeNode = new TrueValueTreeNode(t);

    // Assert
    assertNull(actualTrueValueTreeNode.getChildren());
    assertNull(actualTrueValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualTrueValueTreeNode.getChildIndex());
    assertSame(t, actualTrueValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link TrueValueTreeNode#TrueValueTreeNode(TrueValueTreeNode)}
   */
  @Test
  public void testNewTrueValueTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TrueValueTreeNode actualTrueValueTreeNode = new TrueValueTreeNode(new TrueValueTreeNode(t));

    // Assert
    assertEquals("null<TrueValueTreeNode>", actualTrueValueTreeNode.toStringTree());
    assertNull(actualTrueValueTreeNode.getText());
    assertNull(actualTrueValueTreeNode.getChildren());
    assertNull(actualTrueValueTreeNode.getAncestors());
    assertNull(actualTrueValueTreeNode.getParent());
    assertEquals(0, actualTrueValueTreeNode.getChildCount());
    assertEquals(0, actualTrueValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualTrueValueTreeNode.getLine());
    assertEquals(0, actualTrueValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualTrueValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualTrueValueTreeNode.getType());
    assertFalse(actualTrueValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTrueValueTreeNode.getChildIndex());
    assertSame(t, actualTrueValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link TrueValueTreeNode#TrueValueTreeNode(TrueValueTreeNode)}
   */
  @Test
  public void testNewTrueValueTreeNode3() {
    // Arrange and Act
    TrueValueTreeNode actualTrueValueTreeNode = new TrueValueTreeNode(new TrueValueTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<TrueValueTreeNode>", actualTrueValueTreeNode.toStringTree());
    assertNull(actualTrueValueTreeNode.getText());
    assertNull(actualTrueValueTreeNode.getChildren());
    assertNull(actualTrueValueTreeNode.getAncestors());
    assertNull(actualTrueValueTreeNode.getParent());
    assertEquals(0, actualTrueValueTreeNode.getChildCount());
    assertEquals(0, actualTrueValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualTrueValueTreeNode.getLine());
    assertEquals(0, actualTrueValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualTrueValueTreeNode.getTokenStopIndex());
    assertEquals(0, actualTrueValueTreeNode.getType());
    assertFalse(actualTrueValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTrueValueTreeNode.getChildIndex());
  }
}
