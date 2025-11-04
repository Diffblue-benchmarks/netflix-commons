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

public class EqualsTreeNodeDiffblueTest {
  /**
   * Test {@link EqualsTreeNode#EqualsTreeNode(Token)}.
   * <p>
   * Method under test: {@link EqualsTreeNode#EqualsTreeNode(Token)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EqualsTreeNode.<init>(Token)"})
  public void testNewEqualsTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    EqualsTreeNode actualEqualsTreeNode = new EqualsTreeNode(t);

    // Assert
    assertNull(actualEqualsTreeNode.getChildren());
    assertNull(actualEqualsTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualEqualsTreeNode.getChildIndex());
    assertSame(t, actualEqualsTreeNode.getToken());
  }

  /**
   * Test {@link EqualsTreeNode#EqualsTreeNode(EqualsTreeNode)}.
   * <p>
   * Method under test: {@link EqualsTreeNode#EqualsTreeNode(EqualsTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EqualsTreeNode.<init>(EqualsTreeNode)"})
  public void testNewEqualsTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    EqualsTreeNode actualEqualsTreeNode = new EqualsTreeNode(new EqualsTreeNode(t));

    // Assert
    Token token = actualEqualsTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<EqualsTreeNode>", actualEqualsTreeNode.toStringTree());
    assertNull(actualEqualsTreeNode.getText());
    assertNull(actualEqualsTreeNode.getChildren());
    assertNull(actualEqualsTreeNode.getAncestors());
    assertNull(actualEqualsTreeNode.getParent());
    assertEquals(0, actualEqualsTreeNode.getChildCount());
    assertEquals(0, actualEqualsTreeNode.getCharPositionInLine());
    assertEquals(0, actualEqualsTreeNode.getLine());
    assertEquals(0, actualEqualsTreeNode.getTokenStartIndex());
    assertEquals(0, actualEqualsTreeNode.getTokenStopIndex());
    assertEquals(1, actualEqualsTreeNode.getType());
    assertFalse(actualEqualsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualEqualsTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link EqualsTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link EqualsTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree EqualsTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new EqualsTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof EqualsTreeNode);
    Token token = ((EqualsTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<EqualsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((EqualsTreeNode) actualDupNodeResult).getChildren());
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
