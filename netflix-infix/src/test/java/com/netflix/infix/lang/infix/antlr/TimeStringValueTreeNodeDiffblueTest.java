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

public class TimeStringValueTreeNodeDiffblueTest {
  /**
   * Test {@link TimeStringValueTreeNode#TimeStringValueTreeNode(Token)}.
   * <p>
   * Method under test:
   * {@link TimeStringValueTreeNode#TimeStringValueTreeNode(Token)}
   */
  @Test
  public void testNewTimeStringValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TimeStringValueTreeNode actualTimeStringValueTreeNode = new TimeStringValueTreeNode(t);

    // Assert
    assertNull(actualTimeStringValueTreeNode.getChildren());
    assertNull(actualTimeStringValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualTimeStringValueTreeNode.getChildIndex());
    assertSame(t, actualTimeStringValueTreeNode.getToken());
  }

  /**
   * Test
   * {@link TimeStringValueTreeNode#TimeStringValueTreeNode(TimeStringValueTreeNode)}.
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link TimeStringValueTreeNode#TimeStringValueTreeNode(TimeStringValueTreeNode)}
   */
  @Test
  public void testNewTimeStringValueTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TimeStringValueTreeNode actualTimeStringValueTreeNode = new TimeStringValueTreeNode(new TimeStringValueTreeNode(t));

    // Assert
    Token token = actualTimeStringValueTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TimeStringValueTreeNode>", actualTimeStringValueTreeNode.toStringTree());
    assertNull(actualTimeStringValueTreeNode.getText());
    assertNull(actualTimeStringValueTreeNode.getChildren());
    assertNull(actualTimeStringValueTreeNode.getAncestors());
    assertNull(actualTimeStringValueTreeNode.getParent());
    assertEquals(0, actualTimeStringValueTreeNode.getChildCount());
    assertEquals(0, actualTimeStringValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualTimeStringValueTreeNode.getLine());
    assertEquals(0, actualTimeStringValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualTimeStringValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualTimeStringValueTreeNode.getType());
    assertFalse(actualTimeStringValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTimeStringValueTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link TimeStringValueTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link TimeStringValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new TimeStringValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TimeStringValueTreeNode);
    Token token = ((TimeStringValueTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TimeStringValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((TimeStringValueTreeNode) actualDupNodeResult).getChildren());
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
