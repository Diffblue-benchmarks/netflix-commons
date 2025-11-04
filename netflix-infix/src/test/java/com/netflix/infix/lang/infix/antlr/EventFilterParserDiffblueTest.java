package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import java.io.IOException;
import java.io.StringReader;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.UnbufferedTokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.Test;

public class EventFilterParserDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.between_predicate_return}
   *   <li>{@link EventFilterParser.between_predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testBetween_predicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.between_predicate_return actualBetween_predicate_return = new EventFilterParser.between_predicate_return();

    // Assert
    assertNull(actualBetween_predicate_return.getTree());
    assertNull(actualBetween_predicate_return.getStart());
    assertNull(actualBetween_predicate_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.boolean_expr_return}
   *   <li>{@link EventFilterParser.boolean_expr_return#getTree()}
   * </ul>
   */
  @Test
  public void testBoolean_expr_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.boolean_expr_return actualBoolean_expr_return = new EventFilterParser.boolean_expr_return();

    // Assert
    assertNull(actualBoolean_expr_return.getTree());
    assertNull(actualBoolean_expr_return.getStart());
    assertNull(actualBoolean_expr_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.boolean_factor_return}
   *   <li>{@link EventFilterParser.boolean_factor_return#getTree()}
   * </ul>
   */
  @Test
  public void testBoolean_factor_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.boolean_factor_return actualBoolean_factor_return = new EventFilterParser.boolean_factor_return();

    // Assert
    assertNull(actualBoolean_factor_return.getTree());
    assertNull(actualBoolean_factor_return.getStart());
    assertNull(actualBoolean_factor_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.compariable_value_function_return}
   *   <li>{@link EventFilterParser.compariable_value_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testCompariable_value_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_function_return = new EventFilterParser.compariable_value_function_return();

    // Assert
    assertNull(actualCompariable_value_function_return.getTree());
    assertNull(actualCompariable_value_function_return.getStart());
    assertNull(actualCompariable_value_function_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.comparison_function_return}
   *   <li>{@link EventFilterParser.comparison_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testComparison_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.comparison_function_return actualComparison_function_return = new EventFilterParser.comparison_function_return();

    // Assert
    assertNull(actualComparison_function_return.getTree());
    assertNull(actualComparison_function_return.getStart());
    assertNull(actualComparison_function_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.equality_value_function_return}
   *   <li>{@link EventFilterParser.equality_value_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testEquality_value_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.equality_value_function_return actualEquality_value_function_return = new EventFilterParser.equality_value_function_return();

    // Assert
    assertNull(actualEquality_value_function_return.getTree());
    assertNull(actualEquality_value_function_return.getStart());
    assertNull(actualEquality_value_function_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.exists_predicate_return}
   *   <li>{@link EventFilterParser.exists_predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testExists_predicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.exists_predicate_return actualExists_predicate_return = new EventFilterParser.exists_predicate_return();

    // Assert
    assertNull(actualExists_predicate_return.getTree());
    assertNull(actualExists_predicate_return.getStart());
    assertNull(actualExists_predicate_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.filter_return}
   *   <li>{@link EventFilterParser.filter_return#getTree()}
   * </ul>
   */
  @Test
  public void testFilter_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.filter_return actualFilter_return = new EventFilterParser.filter_return();

    // Assert
    assertNull(actualFilter_return.getTree());
    assertNull(actualFilter_return.getStart());
    assertNull(actualFilter_return.getStop());
  }

  /**
   * Method under test: {@link EventFilterParser#getDelegates()}
   */
  @Test
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, EventFilterParser.createParser("Input").getDelegates().length);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.in_predicate_return}
   *   <li>{@link EventFilterParser.in_predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testIn_predicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.in_predicate_return actualIn_predicate_return = new EventFilterParser.in_predicate_return();

    // Assert
    assertNull(actualIn_predicate_return.getTree());
    assertNull(actualIn_predicate_return.getStart());
    assertNull(actualIn_predicate_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.null_predicate_return}
   *   <li>{@link EventFilterParser.null_predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testNull_predicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.null_predicate_return actualNull_predicate_return = new EventFilterParser.null_predicate_return();

    // Assert
    assertNull(actualNull_predicate_return.getTree());
    assertNull(actualNull_predicate_return.getStart());
    assertNull(actualNull_predicate_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.path_function_return}
   *   <li>{@link EventFilterParser.path_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testPath_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.path_function_return actualPath_function_return = new EventFilterParser.path_function_return();

    // Assert
    assertNull(actualPath_function_return.getTree());
    assertNull(actualPath_function_return.getStart());
    assertNull(actualPath_function_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.predicate_return}
   *   <li>{@link EventFilterParser.predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testPredicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.predicate_return actualPredicate_return = new EventFilterParser.predicate_return();

    // Assert
    assertNull(actualPredicate_return.getTree());
    assertNull(actualPredicate_return.getStart());
    assertNull(actualPredicate_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.regex_predicate_return}
   *   <li>{@link EventFilterParser.regex_predicate_return#getTree()}
   * </ul>
   */
  @Test
  public void testRegex_predicate_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.regex_predicate_return actualRegex_predicate_return = new EventFilterParser.regex_predicate_return();

    // Assert
    assertNull(actualRegex_predicate_return.getTree());
    assertNull(actualRegex_predicate_return.getStart());
    assertNull(actualRegex_predicate_return.getStop());
  }

  /**
   * Method under test:
   * {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  public void testReportError() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> createParserResult.reportError(new RecognitionException()));
  }

  /**
   * Method under test:
   * {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  public void testReportError2() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> createParserResult.reportError(new FailedPredicateException()));
  }

  /**
   * Method under test:
   * {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  public void testReportError3() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> createParserResult.reportError(new MismatchedTreeNodeException()));
  }

  /**
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  public void testFilter() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").filter());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").filter());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").filter());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream())))).filter());
    assertThrows(EventFilterParsingException.class, () -> (new EventFilterParser(
        new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n")))))).filter());
  }

  /**
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  public void testBoolean_expr() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").boolean_expr());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").boolean_expr());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").boolean_expr());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .boolean_expr());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .boolean_expr());
  }

  /**
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  public void testBoolean_factor() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").boolean_factor());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").boolean_factor());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").boolean_factor());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .boolean_factor());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .boolean_factor());
  }

  /**
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  public void testPredicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").predicate());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .predicate());
    assertThrows(EventFilterParsingException.class, () -> (new EventFilterParser(
        new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n")))))).predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  public void testComparison_function() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").comparison_function());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").comparison_function());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").comparison_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .comparison_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .comparison_function());
  }

  /**
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  public void testBetween_predicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").between_predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").between_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").between_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .between_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .between_predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  public void testIn_predicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").in_predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").in_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").in_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .in_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .in_predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  public void testNull_predicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").null_predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").null_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .null_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .null_predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  public void testRegex_predicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").regex_predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").regex_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .regex_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .regex_predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  public void testExists_predicate() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").exists_predicate());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").exists_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").exists_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .exists_predicate());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .exists_predicate());
  }

  /**
   * Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  public void testPath_function() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").path_function());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").path_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .path_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .path_function());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.time_millis_function_return}
   *   <li>{@link EventFilterParser.time_millis_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testTime_millis_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.time_millis_function_return actualTime_millis_function_return = new EventFilterParser.time_millis_function_return();

    // Assert
    assertNull(actualTime_millis_function_return.getTree());
    assertNull(actualTime_millis_function_return.getStart());
    assertNull(actualTime_millis_function_return.getStop());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.time_string_function_return}
   *   <li>{@link EventFilterParser.time_string_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testTime_string_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.time_string_function_return actualTime_string_function_return = new EventFilterParser.time_string_function_return();

    // Assert
    assertNull(actualTime_string_function_return.getTree());
    assertNull(actualTime_string_function_return.getStart());
    assertNull(actualTime_string_function_return.getStop());
  }

  /**
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  public void testValue_function() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    EventFilterParser.value_function_return actualValue_functionResult = createParserResult.value_function();

    // Assert
    Object start = actualValue_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualValue_functionResult.getTree());
    assertNull(actualValue_functionResult.getStop());
    assertNull(actualValue_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  public void testValue_function2() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("");

    // Act
    EventFilterParser.value_function_return actualValue_functionResult = createParserResult.value_function();

    // Assert
    Object start = actualValue_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualValue_functionResult.getTree());
    assertNull(actualValue_functionResult.getStop());
    assertNull(actualValue_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  public void testValue_function3() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("42");

    // Act
    EventFilterParser.value_function_return actualValue_functionResult = createParserResult.value_function();

    // Assert
    Object tree = actualValue_functionResult.getTree();
    assertTrue(tree instanceof NumberTreeNode);
    Object start = actualValue_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("42", ((CommonToken) start).getText());
    assertEquals("42", ((NumberTreeNode) tree).getText());
    assertEquals("42<NumberTreeNode>", ((NumberTreeNode) tree).toStringTree());
    assertNull(actualValue_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertNull(((NumberTreeNode) tree).getChildren());
    assertNull(((NumberTreeNode) tree).getAncestors());
    assertNull(((NumberTreeNode) tree).getParent());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, tokenStream.range());
    assertEquals(0, ((NumberTreeNode) tree).getChildCount());
    assertEquals(0, ((NumberTreeNode) tree).getCharPositionInLine());
    assertEquals(0, ((NumberTreeNode) tree).getTokenStartIndex());
    assertEquals(0, ((NumberTreeNode) tree).getTokenStopIndex());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, tokenStream.index());
    assertEquals(1, ((NumberTreeNode) tree).getLine());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(2, inputStream.size());
    assertEquals(42.0d, ((NumberTreeNode) tree).getValue().doubleValue(), 0.0);
    assertFalse(((NumberTreeNode) tree).isNil());
    assertEquals(EventFilterParser.EOF, ((NumberTreeNode) tree).getChildIndex());
    assertEquals(EventFilterParser.NUMBER, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.NUMBER, ((NumberTreeNode) tree).getType());
    assertSame(start, actualValue_functionResult.getStop());
    assertSame(start, ((NumberTreeNode) tree).getToken());
  }

  /**
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  public void testValue_function4() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree");

    // Act
    EventFilterParser.value_function_return actualValue_functionResult = createParserResult.value_function();

    // Assert
    Object start = actualValue_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("or", ((CommonToken) start).getText());
    assertNull(actualValue_functionResult.getTree());
    assertNull(actualValue_functionResult.getStop());
    assertNull(actualValue_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  public void testValue_function5() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    BufferedTokenStream input2 = new BufferedTokenStream(new EventFilterLexer(input));
    EventFilterParser eventFilterParser = new EventFilterParser(input2);

    // Act
    EventFilterParser.value_function_return actualValue_functionResult = eventFilterParser.value_function();

    // Assert
    Object start = actualValue_functionResult.getStart();
    assertTrue(start instanceof CommonToken);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualValue_functionResult.getTree());
    assertNull(actualValue_functionResult.getStop());
    assertNull(actualValue_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
    assertSame(input, ((CommonToken) start).getInputStream());
    assertSame(input2, eventFilterParser.getTokenStream());
  }

  /**
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  public void testEquality_value_function() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").equality_value_function());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("42").equality_value_function());
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").equality_value_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .equality_value_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .equality_value_function());
  }

  /**
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  public void testCompariable_value_function() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_functionResult = createParserResult
        .compariable_value_function();

    // Assert
    Object start = actualCompariable_value_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualCompariable_value_functionResult.getTree());
    assertNull(actualCompariable_value_functionResult.getStop());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  public void testCompariable_value_function2() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("");

    // Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_functionResult = createParserResult
        .compariable_value_function();

    // Assert
    Object start = actualCompariable_value_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualCompariable_value_functionResult.getTree());
    assertNull(actualCompariable_value_functionResult.getStop());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  public void testCompariable_value_function3() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("42");

    // Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_functionResult = createParserResult
        .compariable_value_function();

    // Assert
    Object tree = actualCompariable_value_functionResult.getTree();
    assertTrue(tree instanceof NumberTreeNode);
    Object start = actualCompariable_value_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("42", ((CommonToken) start).getText());
    assertEquals("42", ((NumberTreeNode) tree).getText());
    assertEquals("42<NumberTreeNode>", ((NumberTreeNode) tree).toStringTree());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertNull(((NumberTreeNode) tree).getChildren());
    assertNull(((NumberTreeNode) tree).getAncestors());
    assertNull(((NumberTreeNode) tree).getParent());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, tokenStream.range());
    assertEquals(0, ((NumberTreeNode) tree).getChildCount());
    assertEquals(0, ((NumberTreeNode) tree).getCharPositionInLine());
    assertEquals(0, ((NumberTreeNode) tree).getTokenStartIndex());
    assertEquals(0, ((NumberTreeNode) tree).getTokenStopIndex());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, tokenStream.index());
    assertEquals(1, ((NumberTreeNode) tree).getLine());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(2, inputStream.size());
    assertEquals(42.0d, ((NumberTreeNode) tree).getValue().doubleValue(), 0.0);
    assertFalse(((NumberTreeNode) tree).isNil());
    assertEquals(EventFilterParser.EOF, ((NumberTreeNode) tree).getChildIndex());
    assertEquals(EventFilterParser.NUMBER, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.NUMBER, ((NumberTreeNode) tree).getType());
    assertSame(start, actualCompariable_value_functionResult.getStop());
    assertSame(start, ((NumberTreeNode) tree).getToken());
  }

  /**
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  public void testCompariable_value_function4() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree");

    // Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_functionResult = createParserResult
        .compariable_value_function();

    // Assert
    Object start = actualCompariable_value_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("or", ((CommonToken) start).getText());
    assertNull(actualCompariable_value_functionResult.getTree());
    assertNull(actualCompariable_value_functionResult.getStop());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  public void testCompariable_value_function5() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    BufferedTokenStream input2 = new BufferedTokenStream(new EventFilterLexer(input));
    EventFilterParser eventFilterParser = new EventFilterParser(input2);

    // Act
    EventFilterParser.compariable_value_function_return actualCompariable_value_functionResult = eventFilterParser
        .compariable_value_function();

    // Assert
    Object start = actualCompariable_value_functionResult.getStart();
    assertTrue(start instanceof CommonToken);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualCompariable_value_functionResult.getTree());
    assertNull(actualCompariable_value_functionResult.getStop());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
    assertSame(input, ((CommonToken) start).getInputStream());
    assertSame(input2, eventFilterParser.getTokenStream());
  }

  /**
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  public void testTime_millis_function() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    EventFilterParser.time_millis_function_return actualTime_millis_functionResult = createParserResult
        .time_millis_function();

    // Assert
    Object start = actualTime_millis_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualTime_millis_functionResult.getTree());
    assertNull(actualTime_millis_functionResult.getStop());
    assertNull(actualTime_millis_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  public void testTime_millis_function2() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("");

    // Act
    EventFilterParser.time_millis_function_return actualTime_millis_functionResult = createParserResult
        .time_millis_function();

    // Assert
    Object start = actualTime_millis_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualTime_millis_functionResult.getTree());
    assertNull(actualTime_millis_functionResult.getStop());
    assertNull(actualTime_millis_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  public void testTime_millis_function3() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").time_millis_function());
  }

  /**
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  public void testTime_millis_function4() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree");

    // Act
    EventFilterParser.time_millis_function_return actualTime_millis_functionResult = createParserResult
        .time_millis_function();

    // Assert
    Object start = actualTime_millis_functionResult.getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("or", ((CommonToken) start).getText());
    assertNull(actualTime_millis_functionResult.getTree());
    assertNull(actualTime_millis_functionResult.getStop());
    assertNull(actualTime_millis_functionResult.getTemplate());
    assertNull(inputStream.getSourceName());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(0, tokenStream.range());
    assertEquals(1, inputStream.getLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  public void testTime_millis_function5() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    BufferedTokenStream input2 = new BufferedTokenStream(new EventFilterLexer(input));
    EventFilterParser eventFilterParser = new EventFilterParser(input2);

    // Act
    EventFilterParser.time_millis_function_return actualTime_millis_functionResult = eventFilterParser
        .time_millis_function();

    // Assert
    Object start = actualTime_millis_functionResult.getStart();
    assertTrue(start instanceof CommonToken);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualTime_millis_functionResult.getTree());
    assertNull(actualTime_millis_functionResult.getStop());
    assertNull(actualTime_millis_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(0, ((CommonToken) start).getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStartIndex());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, ((CommonToken) start).getTokenIndex());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
    assertSame(input, ((CommonToken) start).getInputStream());
    assertSame(input2, eventFilterParser.getTokenStream());
  }

  /**
   * Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  public void testTime_string_function() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").time_string_function());
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").time_string_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .time_string_function());
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .time_string_function());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EventFilterParser#setTreeAdaptor(TreeAdaptor)}
   *   <li>{@link EventFilterParser#getGrammarFileName()}
   *   <li>{@link EventFilterParser#getTokenNames()}
   *   <li>{@link EventFilterParser#getTreeAdaptor()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");
    CommonTreeAdaptor adaptor = new CommonTreeAdaptor();

    // Act
    createParserResult.setTreeAdaptor(adaptor);
    String actualGrammarFileName = createParserResult.getGrammarFileName();
    String[] actualTokenNames = createParserResult.getTokenNames();
    TreeAdaptor actualTreeAdaptor = createParserResult.getTreeAdaptor();

    // Assert that nothing has changed
    assertTrue(actualTreeAdaptor instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualGrammarFileName);
    assertSame(adaptor, actualTreeAdaptor);
    assertSame(createParserResult.tokenNames, actualTokenNames);
  }

  /**
   * Method under test: {@link EventFilterParser#EventFilterParser(TokenStream)}
   */
  @Test
  public void testNewEventFilterParser() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input);

    // Assert
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, actualEventFilterParser.getTokenStream());
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Method under test: {@link EventFilterParser#EventFilterParser(TokenStream)}
   */
  @Test
  public void testNewEventFilterParser2() {
    // Arrange
    UnbufferedTokenStream input = new UnbufferedTokenStream(new EventFilterLexer());
    input.eof = mock(Token.class);

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input);

    // Assert
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, actualEventFilterParser.getTokenStream());
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Method under test:
   * {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}
   */
  @Test
  public void testNewEventFilterParser3() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input, new RecognizerSharedState());

    // Assert
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, actualEventFilterParser.getTokenStream());
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Method under test:
   * {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}
   */
  @Test
  public void testNewEventFilterParser4() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input, null);

    // Assert
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, actualEventFilterParser.getTokenStream());
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link EventFilterParser.value_function_return}
   *   <li>{@link EventFilterParser.value_function_return#getTree()}
   * </ul>
   */
  @Test
  public void testValue_function_returnGettersAndSetters() {
    // Arrange and Act
    EventFilterParser.value_function_return actualValue_function_return = new EventFilterParser.value_function_return();

    // Assert
    assertNull(actualValue_function_return.getTree());
    assertNull(actualValue_function_return.getStart());
    assertNull(actualValue_function_return.getStop());
  }
}
