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

public class NotTreeNodeDiffblueTest {
  /**
   * Test {@link NotTreeNode#NotTreeNode(Token)}.
   * <p>
   * Method under test: {@link NotTreeNode#NotTreeNode(Token)}
   */
  @Test
  public void testNewNotTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NotTreeNode actualNotTreeNode = new NotTreeNode(t);

    // Assert
    assertNull(actualNotTreeNode.getChildren());
    assertNull(actualNotTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNotTreeNode.getChildIndex());
    assertSame(t, actualNotTreeNode.getToken());
  }

  /**
   * Test {@link NotTreeNode#NotTreeNode(NotTreeNode)}.
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.</li>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotTreeNode#NotTreeNode(NotTreeNode)}
   */
  @Test
  public void testNewNotTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NotTreeNode actualNotTreeNode = new NotTreeNode(new NotTreeNode(t));

    // Assert
    Token token = actualNotTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NotTreeNode>", actualNotTreeNode.toStringTree());
    assertNull(actualNotTreeNode.getText());
    assertNull(actualNotTreeNode.getChildren());
    assertNull(actualNotTreeNode.getAncestors());
    assertNull(actualNotTreeNode.getParent());
    assertEquals(0, actualNotTreeNode.getChildCount());
    assertEquals(0, actualNotTreeNode.getCharPositionInLine());
    assertEquals(0, actualNotTreeNode.getLine());
    assertEquals(0, actualNotTreeNode.getTokenStartIndex());
    assertEquals(0, actualNotTreeNode.getTokenStopIndex());
    assertEquals(1, actualNotTreeNode.getType());
    assertFalse(actualNotTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNotTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link NotTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link NotTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NotTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NotTreeNode);
    Token token = ((NotTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NotTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NotTreeNode) actualDupNodeResult).getChildren());
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
