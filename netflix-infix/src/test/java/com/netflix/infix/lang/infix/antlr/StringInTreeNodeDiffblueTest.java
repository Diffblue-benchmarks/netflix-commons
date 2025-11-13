package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StringInTreeNodeDiffblueTest {
  /**
   * Test {@link StringInTreeNode#StringInTreeNode(Token)}.
   *
   * <p>Method under test: {@link StringInTreeNode#StringInTreeNode(Token)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void StringInTreeNode.<init>(Token)"})
  public void testNewStringInTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringInTreeNode actualStringInTreeNode = new StringInTreeNode(t);

    // Assert
    assertNull(actualStringInTreeNode.getChildren());
    assertNull(actualStringInTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualStringInTreeNode.getChildIndex());
    assertSame(t, actualStringInTreeNode.getToken());
  }

  /**
   * Test {@link StringInTreeNode#StringInTreeNode(StringInTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link StringInTreeNode#StringInTreeNode(StringInTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void StringInTreeNode.<init>(StringInTreeNode)"})
  public void testNewStringInTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    StringInTreeNode node = new StringInTreeNode(t);

    // Act
    StringInTreeNode actualStringInTreeNode = new StringInTreeNode(node);

    // Assert
    Token token = actualStringInTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<StringInTreeNode>", actualStringInTreeNode.toStringTree());
    assertNull(actualStringInTreeNode.getText());
    assertNull(actualStringInTreeNode.getChildren());
    assertNull(actualStringInTreeNode.getAncestors());
    assertNull(actualStringInTreeNode.getParent());
    assertEquals(0, actualStringInTreeNode.getChildCount());
    assertEquals(0, actualStringInTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringInTreeNode.getLine());
    assertEquals(0, actualStringInTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringInTreeNode.getTokenStopIndex());
    assertEquals(1, actualStringInTreeNode.getType());
    assertFalse(actualStringInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringInTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link StringInTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link StringInTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree StringInTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new StringInTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringInTreeNode);
    Token token = ((StringInTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<StringInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringInTreeNode) actualDupNodeResult).getChildren());
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
