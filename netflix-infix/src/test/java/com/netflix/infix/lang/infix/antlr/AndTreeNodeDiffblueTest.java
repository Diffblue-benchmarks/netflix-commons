package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AndTreeNodeDiffblueTest {
  /**
   * Test {@link AndTreeNode#AndTreeNode(Token)}.
   * <p>
   * Method under test: {@link AndTreeNode#AndTreeNode(Token)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AndTreeNode.<init>(Token)"})
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
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.</li>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndTreeNode#AndTreeNode(AndTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AndTreeNode.<init>(AndTreeNode)"})
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
   * <p>
   * Method under test: {@link AndTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree AndTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new AndTreeNode(t)).dupNode();

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
