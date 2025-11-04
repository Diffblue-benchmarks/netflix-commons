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

public class ExistsTreeNodeDiffblueTest {
  /**
   * Test {@link ExistsTreeNode#ExistsTreeNode(Token)}.
   * <p>
   * Method under test: {@link ExistsTreeNode#ExistsTreeNode(Token)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ExistsTreeNode.<init>(Token)"})
  public void testNewExistsTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ExistsTreeNode actualExistsTreeNode = new ExistsTreeNode(t);

    // Assert
    assertNull(actualExistsTreeNode.getChildren());
    assertNull(actualExistsTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualExistsTreeNode.getChildIndex());
    assertSame(t, actualExistsTreeNode.getToken());
  }

  /**
   * Test {@link ExistsTreeNode#ExistsTreeNode(ExistsTreeNode)}.
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.</li>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExistsTreeNode#ExistsTreeNode(ExistsTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ExistsTreeNode.<init>(ExistsTreeNode)"})
  public void testNewExistsTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ExistsTreeNode actualExistsTreeNode = new ExistsTreeNode(new ExistsTreeNode(t));

    // Assert
    Token token = actualExistsTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<ExistsTreeNode>", actualExistsTreeNode.toStringTree());
    assertNull(actualExistsTreeNode.getText());
    assertNull(actualExistsTreeNode.getChildren());
    assertNull(actualExistsTreeNode.getAncestors());
    assertNull(actualExistsTreeNode.getParent());
    assertEquals(0, actualExistsTreeNode.getChildCount());
    assertEquals(0, actualExistsTreeNode.getCharPositionInLine());
    assertEquals(0, actualExistsTreeNode.getLine());
    assertEquals(0, actualExistsTreeNode.getTokenStartIndex());
    assertEquals(0, actualExistsTreeNode.getTokenStopIndex());
    assertEquals(1, actualExistsTreeNode.getType());
    assertFalse(actualExistsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualExistsTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link ExistsTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link ExistsTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree ExistsTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new ExistsTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ExistsTreeNode);
    Token token = ((ExistsTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<ExistsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ExistsTreeNode) actualDupNodeResult).getChildren());
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
