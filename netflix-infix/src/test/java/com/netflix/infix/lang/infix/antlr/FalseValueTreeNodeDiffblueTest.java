package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.google.common.base.Predicate;
import com.netflix.infix.AlwaysFalsePredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class FalseValueTreeNodeDiffblueTest {
  /**
   * Method under test: {@link FalseValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new FalseValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof FalseValueTreeNode);
    assertEquals("null<FalseValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((FalseValueTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((FalseValueTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link FalseValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new FalseValueTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof FalseValueTreeNode);
    assertEquals("null<FalseValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((FalseValueTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link FalseValueTreeNode#translate()}
   */
  @Test
  public void testTranslate() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult = (new FalseValueTreeNode(new ClassicToken(1))).translate();

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysFalsePredicate);
    assertFalse(actualTranslateResult.apply("42"));
    assertFalse(actualTranslateResult.apply("Input"));
    assertFalse(actualTranslateResult.test("Input"));
  }

  /**
   * Method under test: {@link FalseValueTreeNode#translate()}
   */
  @Test
  public void testTranslate2() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult = (new FalseValueTreeNode(mock(Token.class))).translate();

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysFalsePredicate);
    assertFalse(actualTranslateResult.apply("42"));
    assertFalse(actualTranslateResult.apply("Input"));
    assertFalse(actualTranslateResult.test("Input"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FalseValueTreeNode#FalseValueTreeNode(Token)}
   *   <li>{@link FalseValueTreeNode#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    FalseValueTreeNode actualFalseValueTreeNode = new FalseValueTreeNode(t);
    actualFalseValueTreeNode.getValue();

    // Assert
    assertNull(actualFalseValueTreeNode.getChildren());
    assertNull(actualFalseValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualFalseValueTreeNode.getChildIndex());
    assertSame(t, actualFalseValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link FalseValueTreeNode#FalseValueTreeNode(FalseValueTreeNode)}
   */
  @Test
  public void testNewFalseValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    FalseValueTreeNode actualFalseValueTreeNode = new FalseValueTreeNode(new FalseValueTreeNode(t));

    // Assert
    assertEquals("null<FalseValueTreeNode>", actualFalseValueTreeNode.toStringTree());
    assertNull(actualFalseValueTreeNode.getText());
    assertNull(actualFalseValueTreeNode.getChildren());
    assertNull(actualFalseValueTreeNode.getAncestors());
    assertNull(actualFalseValueTreeNode.getParent());
    assertEquals(0, actualFalseValueTreeNode.getChildCount());
    assertEquals(0, actualFalseValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualFalseValueTreeNode.getLine());
    assertEquals(0, actualFalseValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualFalseValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualFalseValueTreeNode.getType());
    assertFalse(actualFalseValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualFalseValueTreeNode.getChildIndex());
    assertSame(t, actualFalseValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link FalseValueTreeNode#FalseValueTreeNode(FalseValueTreeNode)}
   */
  @Test
  public void testNewFalseValueTreeNode2() {
    // Arrange and Act
    FalseValueTreeNode actualFalseValueTreeNode = new FalseValueTreeNode(new FalseValueTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<FalseValueTreeNode>", actualFalseValueTreeNode.toStringTree());
    assertNull(actualFalseValueTreeNode.getText());
    assertNull(actualFalseValueTreeNode.getChildren());
    assertNull(actualFalseValueTreeNode.getAncestors());
    assertNull(actualFalseValueTreeNode.getParent());
    assertEquals(0, actualFalseValueTreeNode.getChildCount());
    assertEquals(0, actualFalseValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualFalseValueTreeNode.getLine());
    assertEquals(0, actualFalseValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualFalseValueTreeNode.getTokenStopIndex());
    assertEquals(0, actualFalseValueTreeNode.getType());
    assertFalse(actualFalseValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualFalseValueTreeNode.getChildIndex());
  }
}
