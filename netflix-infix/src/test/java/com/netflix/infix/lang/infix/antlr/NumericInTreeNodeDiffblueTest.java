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

public class NumericInTreeNodeDiffblueTest {
  /**
   * Test {@link NumericInTreeNode#NumericInTreeNode(Token)}.
   * <p>
   * Method under test: {@link NumericInTreeNode#NumericInTreeNode(Token)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NumericInTreeNode.<init>(Token)"})
  public void testNewNumericInTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumericInTreeNode actualNumericInTreeNode = new NumericInTreeNode(t);

    // Assert
    assertNull(actualNumericInTreeNode.getChildren());
    assertNull(actualNumericInTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNumericInTreeNode.getChildIndex());
    assertSame(t, actualNumericInTreeNode.getToken());
  }

  /**
   * Test {@link NumericInTreeNode#NumericInTreeNode(NumericInTreeNode)}.
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NumericInTreeNode#NumericInTreeNode(NumericInTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NumericInTreeNode.<init>(NumericInTreeNode)"})
  public void testNewNumericInTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumericInTreeNode actualNumericInTreeNode = new NumericInTreeNode(new NumericInTreeNode(t));

    // Assert
    Token token = actualNumericInTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NumericInTreeNode>", actualNumericInTreeNode.toStringTree());
    assertNull(actualNumericInTreeNode.getText());
    assertNull(actualNumericInTreeNode.getChildren());
    assertNull(actualNumericInTreeNode.getAncestors());
    assertNull(actualNumericInTreeNode.getParent());
    assertEquals(0, actualNumericInTreeNode.getChildCount());
    assertEquals(0, actualNumericInTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumericInTreeNode.getLine());
    assertEquals(0, actualNumericInTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumericInTreeNode.getTokenStopIndex());
    assertEquals(1, actualNumericInTreeNode.getType());
    assertFalse(actualNumericInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumericInTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link NumericInTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link NumericInTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree NumericInTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NumericInTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumericInTreeNode);
    Token token = ((NumericInTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NumericInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumericInTreeNode) actualDupNodeResult).getChildren());
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
