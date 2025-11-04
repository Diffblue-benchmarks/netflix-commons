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

public class ComparableTreeNodeDiffblueTest {
  /**
   * Test {@link ComparableTreeNode#ComparableTreeNode(Token)}.
   * <p>
   * Method under test: {@link ComparableTreeNode#ComparableTreeNode(Token)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ComparableTreeNode.<init>(Token)"})
  public void testNewComparableTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ComparableTreeNode actualComparableTreeNode = new ComparableTreeNode(t);

    // Assert
    assertNull(actualComparableTreeNode.getChildren());
    assertNull(actualComparableTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualComparableTreeNode.getChildIndex());
    assertSame(t, actualComparableTreeNode.getToken());
  }

  /**
   * Test {@link ComparableTreeNode#ComparableTreeNode(ComparableTreeNode)}.
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparableTreeNode#ComparableTreeNode(ComparableTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ComparableTreeNode.<init>(ComparableTreeNode)"})
  public void testNewComparableTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ComparableTreeNode actualComparableTreeNode = new ComparableTreeNode(new ComparableTreeNode(t));

    // Assert
    Token token = actualComparableTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<ComparableTreeNode>", actualComparableTreeNode.toStringTree());
    assertNull(actualComparableTreeNode.getText());
    assertNull(actualComparableTreeNode.getChildren());
    assertNull(actualComparableTreeNode.getAncestors());
    assertNull(actualComparableTreeNode.getParent());
    assertEquals(0, actualComparableTreeNode.getChildCount());
    assertEquals(0, actualComparableTreeNode.getCharPositionInLine());
    assertEquals(0, actualComparableTreeNode.getLine());
    assertEquals(0, actualComparableTreeNode.getTokenStartIndex());
    assertEquals(0, actualComparableTreeNode.getTokenStopIndex());
    assertEquals(1, actualComparableTreeNode.getType());
    assertFalse(actualComparableTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualComparableTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link ComparableTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link ComparableTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree ComparableTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new ComparableTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ComparableTreeNode);
    Token token = ((ComparableTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<ComparableTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ComparableTreeNode) actualDupNodeResult).getChildren());
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
