package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class XPathTreeNodeDiffblueTest {
  /**
   * Test {@link XPathTreeNode#getValue()}.
   *
   * <ul>
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link XPathTreeNode#getValue()}
   */
  @Test
  public void testGetValue_thenReturnLabel() {
    // Arrange
    XPathTreeNode xPathTreeNode = new XPathTreeNode(new ClassicToken(1));
    ParseTree t = new ParseTree("Label");
    xPathTreeNode.addChild(t);

    // Act
    Object actualValue = xPathTreeNode.getValue();

    // Assert
    assertEquals("Label", actualValue);
    assertSame(t.payload, actualValue);
  }

  /**
   * Test {@link XPathTreeNode#getValue()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link XPathTreeNode#getValue()}
   */
  @Test
  public void testGetValue_thenReturnNull() {
    // Arrange
    XPathTreeNode xPathTreeNode = new XPathTreeNode(new ClassicToken(1));
    xPathTreeNode.addChild(new AndTreeNode(new ClassicToken(1)));

    // Act and Assert
    assertNull(xPathTreeNode.getValue());
  }

  /**
   * Test {@link XPathTreeNode#XPathTreeNode(Token)}.
   *
   * <p>Method under test: {@link XPathTreeNode#XPathTreeNode(Token)}
   */
  @Test
  public void testNewXPathTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    XPathTreeNode actualXPathTreeNode = new XPathTreeNode(t);

    // Assert
    assertNull(actualXPathTreeNode.getChildren());
    assertNull(actualXPathTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualXPathTreeNode.getChildIndex());
    assertSame(t, actualXPathTreeNode.getToken());
  }

  /**
   * Test {@link XPathTreeNode#XPathTreeNode(XPathTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link XPathTreeNode#XPathTreeNode(XPathTreeNode)}
   */
  @Test
  public void testNewXPathTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    XPathTreeNode actualXPathTreeNode = new XPathTreeNode(new XPathTreeNode(t));

    // Assert
    Token token = actualXPathTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<XPathTreeNode>", actualXPathTreeNode.toStringTree());
    assertNull(actualXPathTreeNode.getText());
    assertNull(actualXPathTreeNode.getChildren());
    assertNull(actualXPathTreeNode.getAncestors());
    assertNull(actualXPathTreeNode.getParent());
    assertEquals(0, actualXPathTreeNode.getChildCount());
    assertEquals(0, actualXPathTreeNode.getCharPositionInLine());
    assertEquals(0, actualXPathTreeNode.getLine());
    assertEquals(0, actualXPathTreeNode.getTokenStartIndex());
    assertEquals(0, actualXPathTreeNode.getTokenStopIndex());
    assertEquals(1, actualXPathTreeNode.getType());
    assertFalse(actualXPathTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualXPathTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link XPathTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link XPathTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new XPathTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof XPathTreeNode);
    Token token = ((XPathTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<XPathTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((XPathTreeNode) actualDupNodeResult).getChildren());
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
