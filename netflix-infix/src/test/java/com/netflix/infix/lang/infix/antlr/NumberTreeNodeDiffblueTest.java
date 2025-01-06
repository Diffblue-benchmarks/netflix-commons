package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class NumberTreeNodeDiffblueTest {
  /**
   * Test {@link NumberTreeNode#getValue()}.
   * <ul>
   *   <li>Then return doubleValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link NumberTreeNode#getValue()}
   */
  @Test
  public void testGetValue_thenReturnDoubleValueIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42.0d, (new NumberTreeNode(new ClassicToken(1, "42"))).getValue().doubleValue(), 0.0);
  }

  /**
   * Test {@link NumberTreeNode#NumberTreeNode(Token)}.
   * <p>
   * Method under test: {@link NumberTreeNode#NumberTreeNode(Token)}
   */
  @Test
  public void testNewNumberTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumberTreeNode actualNumberTreeNode = new NumberTreeNode(t);

    // Assert
    assertNull(actualNumberTreeNode.getChildren());
    assertNull(actualNumberTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNumberTreeNode.getChildIndex());
    assertSame(t, actualNumberTreeNode.getToken());
  }

  /**
   * Test {@link NumberTreeNode#NumberTreeNode(NumberTreeNode)}.
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.</li>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NumberTreeNode#NumberTreeNode(NumberTreeNode)}
   */
  @Test
  public void testNewNumberTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumberTreeNode actualNumberTreeNode = new NumberTreeNode(new NumberTreeNode(t));

    // Assert
    Token token = actualNumberTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NumberTreeNode>", actualNumberTreeNode.toStringTree());
    assertNull(actualNumberTreeNode.getText());
    assertNull(actualNumberTreeNode.getChildren());
    assertNull(actualNumberTreeNode.getAncestors());
    assertNull(actualNumberTreeNode.getParent());
    assertEquals(0, actualNumberTreeNode.getChildCount());
    assertEquals(0, actualNumberTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumberTreeNode.getLine());
    assertEquals(0, actualNumberTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumberTreeNode.getTokenStopIndex());
    assertEquals(1, actualNumberTreeNode.getType());
    assertFalse(actualNumberTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumberTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link NumberTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link NumberTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NumberTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumberTreeNode);
    Token token = ((NumberTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NumberTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumberTreeNode) actualDupNodeResult).getChildren());
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
