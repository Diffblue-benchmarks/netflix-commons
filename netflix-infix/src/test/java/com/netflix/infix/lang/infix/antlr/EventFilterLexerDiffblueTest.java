package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.infix.lang.infix.antlr.EventFilterLexer.DFA11;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EventFilterLexerDiffblueTest {
  /**
   * Test DFA11 {@link DFA11#getDescription()}.
   *
   * <p>Method under test: {@link DFA11#getDescription()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String DFA11.getDescription()"})
  public void testDFA11GetDescription() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        eventFilterLexer.new DFA11(new EventFilterLexer()).getDescription());
  }

  /**
   * Test DFA11 {@link DFA11#DFA11(EventFilterLexer, BaseRecognizer)}.
   *
   * <p>Method under test: {@link DFA11#DFA11(EventFilterLexer, BaseRecognizer)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void DFA11.<init>(EventFilterLexer, BaseRecognizer)"})
  public void testDFA11NewDfa11() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        eventFilterLexer.new DFA11(new EventFilterLexer()).getDescription());
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    EarlyExitException e =
        new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(e));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link EarlyExitException#EarlyExitException()}.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenEarlyExitException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new EarlyExitException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenFailedPredicateException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new FailedPredicateException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedNotSetException#MismatchedNotSetException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedNotSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedNotSetException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedRangeException#MismatchedRangeException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedRangeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedRangeException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedSetException#MismatchedSetException()}.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedSetException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedSetException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedTokenException#MismatchedTokenException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedTokenException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedTokenException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.reportError(RecognitionException)"})
  public void testReportError_whenRecognitionException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new RecognitionException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    EarlyExitException e =
        new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[] {"ABC123"}, e));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link EarlyExitException#EarlyExitException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenEarlyExitException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new EarlyExitException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenFailedPredicateException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new FailedPredicateException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedNotSetException#MismatchedNotSetException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenMismatchedNotSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new MismatchedNotSetException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedRangeException#MismatchedRangeException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenMismatchedRangeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new MismatchedRangeException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedSetException#MismatchedSetException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenMismatchedSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new MismatchedSetException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedTokenException#MismatchedTokenException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenMismatchedTokenException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new MismatchedTokenException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedTreeNodeException#MismatchedTreeNodeException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenMismatchedTreeNodeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new MismatchedTreeNodeException()));
  }

  /**
   * Test {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#throwLexerException(String[],
   * RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.throwLexerException(String[], RecognitionException)"})
  public void testThrowLexerException_whenRecognitionException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () ->
            eventFilterLexer.throwLexerException(
                new String[] {"ABC123"}, new RecognitionException()));
  }

  /**
   * Test {@link EventFilterLexer#getDelegates()}.
   *
   * <p>Method under test: {@link EventFilterLexer#getDelegates()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"org.antlr.runtime.Lexer[] EventFilterLexer.getDelegates()"})
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, new EventFilterLexer().getDelegates().length);
  }

  /**
   * Test {@link EventFilterLexer#EventFilterLexer()}.
   *
   * <p>Method under test: {@link EventFilterLexer#EventFilterLexer()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.<init>()"})
  public void testNewEventFilterLexer() {
    // Arrange and Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer();

    // Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        actualEventFilterLexer.dfa11.getDescription());
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getCharStream());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
  }

  /**
   * Test {@link EventFilterLexer#EventFilterLexer(CharStream)}.
   *
   * <p>Method under test: {@link EventFilterLexer#EventFilterLexer(CharStream)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.<init>(CharStream)"})
  public void testNewEventFilterLexer2() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input);

    // Assert
    CharStream charStream = actualEventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRInputStream);
    assertTrue(actualEventFilterLexer.getEOFToken() instanceof CommonToken);
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getSourceName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertSame(input, charStream);
  }

  /**
   * Test {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#EventFilterLexer(CharStream,
   * RecognizerSharedState)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.<init>(CharStream, RecognizerSharedState)"})
  public void testNewEventFilterLexer_whenNull() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input, null);

    // Assert
    CharStream charStream = actualEventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRInputStream);
    assertTrue(actualEventFilterLexer.getEOFToken() instanceof CommonToken);
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getSourceName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertSame(input, charStream);
  }

  /**
   * Test {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}.
   *
   * <ul>
   *   <li>When {@link RecognizerSharedState#RecognizerSharedState()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#EventFilterLexer(CharStream,
   * RecognizerSharedState)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.<init>(CharStream, RecognizerSharedState)"})
  public void testNewEventFilterLexer_whenRecognizerSharedState() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer =
        new EventFilterLexer(input, new RecognizerSharedState());

    // Assert
    CharStream charStream = actualEventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRInputStream);
    assertTrue(actualEventFilterLexer.getEOFToken() instanceof CommonToken);
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getSourceName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertSame(input, charStream);
  }

  /**
   * Test {@link EventFilterLexer#getGrammarFileName()}.
   *
   * <p>Method under test: {@link EventFilterLexer#getGrammarFileName()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"String EventFilterLexer.getGrammarFileName()"})
  public void testGetGrammarFileName() {
    // Arrange, Act and Assert
    assertEquals("EventFilter.g", new EventFilterLexer().getGrammarFileName());
  }

  /**
   * Test {@link EventFilterLexer#mAND()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mAND()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mAND()"})
  public void testMAND() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("and"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mAND();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(3, charStream.getCharPositionInLine());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, charStream.index());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mAND()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mAND()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mAND()"})
  public void testMAND_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mAND());
  }

  /**
   * Test {@link EventFilterLexer#mBETWEEN()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mBETWEEN()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mBETWEEN()"})
  public void testMBETWEEN() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("between"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mBETWEEN();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(7, charStream.getCharPositionInLine());
    assertEquals(7, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(7, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(7, charStream.index());
    assertEquals(7, eventFilterLexer.getCharIndex());
    assertEquals(7, eventFilterLexer.getCharPositionInLine());
    assertEquals(7, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mBETWEEN()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mBETWEEN()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mBETWEEN()"})
  public void testMBETWEEN_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mBETWEEN());
  }

  /**
   * Test {@link EventFilterLexer#mEQUALS()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mEQUALS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mEQUALS()"})
  public void testMEQUALS_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mEQUALS());
  }

  /**
   * Test {@link EventFilterLexer#mEXISTS()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mEXISTS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mEXISTS()"})
  public void testMEXISTS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("exists"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mEXISTS();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(6, charStream.getCharPositionInLine());
    assertEquals(6, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(6, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(6, charStream.index());
    assertEquals(6, eventFilterLexer.getCharIndex());
    assertEquals(6, eventFilterLexer.getCharPositionInLine());
    assertEquals(6, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mEXISTS()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mEXISTS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mEXISTS()"})
  public void testMEXISTS_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mEXISTS());
  }

  /**
   * Test {@link EventFilterLexer#mFALSE()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mFALSE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mFALSE()"})
  public void testMFALSE() throws IOException, RecognitionException {
    // Arrange
    StringReader r = new StringReader(Boolean.FALSE.toString());
    ANTLRReaderStream input = new ANTLRReaderStream(r);
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mFALSE();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(5, charStream.getCharPositionInLine());
    assertEquals(5, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(5, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(5, charStream.index());
    assertEquals(5, eventFilterLexer.getCharIndex());
    assertEquals(5, eventFilterLexer.getCharPositionInLine());
    assertEquals(5, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mFALSE()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mFALSE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mFALSE()"})
  public void testMFALSE_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mFALSE());
  }

  /**
   * Test {@link EventFilterLexer#mGE()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mGE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mGE()"})
  public void testMGE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader(">="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mGE();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mGE()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mGE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mGE()"})
  public void testMGE_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mGE());
  }

  /**
   * Test {@link EventFilterLexer#mGT()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mGT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mGT()"})
  public void testMGT_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mGT());
  }

  /**
   * Test {@link EventFilterLexer#mIN()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mIN()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mIN()"})
  public void testMIN() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("in"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mIN();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mIN()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mIN()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mIN()"})
  public void testMIN_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mIN());
  }

  /**
   * Test {@link EventFilterLexer#mIS()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mIS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mIS()"})
  public void testMIS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("is"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mIS();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mIS()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mIS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mIS()"})
  public void testMIS_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mIS());
  }

  /**
   * Test {@link EventFilterLexer#mLE()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mLE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mLE()"})
  public void testMLE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("<="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mLE();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mLE()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mLE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mLE()"})
  public void testMLE_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mLE());
  }

  /**
   * Test {@link EventFilterLexer#mLT()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mLT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mLT()"})
  public void testMLT_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mLT());
  }

  /**
   * Test {@link EventFilterLexer#mMATCHES()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mMATCHES()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mMATCHES()"})
  public void testMMATCHES() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("=~"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mMATCHES();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mMATCHES()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mMATCHES()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mMATCHES()"})
  public void testMMATCHES_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mMATCHES());
  }

  /**
   * Test {@link EventFilterLexer#mNOT()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mNOT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNOT()"})
  public void testMNOT() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("not"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNOT();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(3, charStream.getCharPositionInLine());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, charStream.index());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mNOT()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mNOT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNOT()"})
  public void testMNOT_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mNOT());
  }

  /**
   * Test {@link EventFilterLexer#mNOT_EQUALS()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mNOT_EQUALS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNOT_EQUALS()"})
  public void testMNOT_EQUALS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("!="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNOT_EQUALS();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mNOT_EQUALS()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mNOT_EQUALS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNOT_EQUALS()"})
  public void testMNOT_EQUALS_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mNOT_EQUALS());
  }

  /**
   * Test {@link EventFilterLexer#mNULL()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mNULL()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNULL()"})
  public void testMNULL() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("null"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNULL();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(4, charStream.getCharPositionInLine());
    assertEquals(4, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(4, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(4, charStream.index());
    assertEquals(4, eventFilterLexer.getCharIndex());
    assertEquals(4, eventFilterLexer.getCharPositionInLine());
    assertEquals(4, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mNULL()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mNULL()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNULL()"})
  public void testMNULL_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mNULL());
  }

  /**
   * Test {@link EventFilterLexer#mOR()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mOR()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mOR()"})
  public void testMOR() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("or"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mOR();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, charStream.getCharPositionInLine());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, charStream.index());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mOR()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mOR()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mOR()"})
  public void testMOR_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mOR());
  }

  /**
   * Test {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTIME_MILLIS_FUN_NAME()"})
  public void testMTIME_MILLIS_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("time-millis"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTIME_MILLIS_FUN_NAME();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(EventFilterLexer.FALSE, charStream.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(EventFilterLexer.FALSE, charStream.index());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTIME_MILLIS_FUN_NAME()"})
  public void testMTIME_MILLIS_FUN_NAME_thenThrowMismatchedTokenException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mTIME_MILLIS_FUN_NAME());
  }

  /**
   * Test {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTIME_STRING_FUN_NAME()"})
  public void testMTIME_STRING_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("time-string"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTIME_STRING_FUN_NAME();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(EventFilterLexer.FALSE, charStream.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(EventFilterLexer.FALSE, charStream.index());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTIME_STRING_FUN_NAME()"})
  public void testMTIME_STRING_FUN_NAME_thenThrowMismatchedTokenException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mTIME_STRING_FUN_NAME());
  }

  /**
   * Test {@link EventFilterLexer#mTRUE()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mTRUE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTRUE()"})
  public void testMTRUE() throws IOException, RecognitionException {
    // Arrange
    StringReader r = new StringReader(Boolean.TRUE.toString());
    ANTLRReaderStream input = new ANTLRReaderStream(r);
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTRUE();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(4, charStream.getCharPositionInLine());
    assertEquals(4, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(4, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(4, charStream.index());
    assertEquals(4, eventFilterLexer.getCharIndex());
    assertEquals(4, eventFilterLexer.getCharPositionInLine());
    assertEquals(4, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mTRUE()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mTRUE()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTRUE()"})
  public void testMTRUE_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class, () -> new EventFilterLexer(new ANTLRInputStream()).mTRUE());
  }

  /**
   * Test {@link EventFilterLexer#mXPATH_FUN_NAME()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mXPATH_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mXPATH_FUN_NAME()"})
  public void testMXPATH_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("xpath"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mXPATH_FUN_NAME();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(5, charStream.getCharPositionInLine());
    assertEquals(5, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(5, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(5, charStream.index());
    assertEquals(5, eventFilterLexer.getCharIndex());
    assertEquals(5, eventFilterLexer.getCharPositionInLine());
    assertEquals(5, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mXPATH_FUN_NAME()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mXPATH_FUN_NAME()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mXPATH_FUN_NAME()"})
  public void testMXPATH_FUN_NAME_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mXPATH_FUN_NAME());
  }

  /**
   * Test {@link EventFilterLexer#mT__33()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mT__33()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mT__33()"})
  public void testMT__33_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mT__33());
  }

  /**
   * Test {@link EventFilterLexer#mT__34()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mT__34()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mT__34()"})
  public void testMT__34_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mT__34());
  }

  /**
   * Test {@link EventFilterLexer#mT__35()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mT__35()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mT__35()"})
  public void testMT__35_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        MismatchedTokenException.class,
        () -> new EventFilterLexer(new ANTLRInputStream()).mT__35());
  }

  /**
   * Test {@link EventFilterLexer#mNUMBER()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mNUMBER()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mNUMBER()"})
  public void testMNUMBER() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(
        new ANTLRReaderStream(
            new StringReader(
                "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
                    + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );")));

    // Act
    eventFilterLexer.mNUMBER();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals(":", eOFToken.getText());
    assertEquals(3, charStream.getCharPositionInLine());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, charStream.index());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mCOMMENT()}.
   *
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mCOMMENT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mCOMMENT()"})
  public void testMCOMMENT_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mCOMMENT());
  }

  /**
   * Test {@link EventFilterLexer#mWS()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mWS()"})
  public void testMWS() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Test {@link EventFilterLexer#mWS()}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then throw {@link MismatchedSetException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mWS()"})
  public void testMWS_givenA_thenThrowMismatchedSetException()
      throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    ByteArrayInputStream input =
        new ByteArrayInputStream(new byte[] {'A', 31, 'A', 31, 'A', 31, 'A', 31});
    eventFilterLexer.setCharStream(new ANTLRInputStream(input));

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Test {@link EventFilterLexer#mSTRING()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mSTRING()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mSTRING()"})
  public void testMSTRING_thenThrowMismatchedTokenException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedTokenException.class, () -> eventFilterLexer.mSTRING());
  }

  /**
   * Test {@link EventFilterLexer#mHEX_DIGIT()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mHEX_DIGIT()"})
  public void testMHEX_DIGIT() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    ByteArrayInputStream input =
        new ByteArrayInputStream(new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1});
    eventFilterLexer.setCharStream(new ANTLRInputStream(input));

    // Act
    eventFilterLexer.mHEX_DIGIT();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRInputStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("\u0001", eOFToken.getText());
    assertEquals(1, charStream.getCharPositionInLine());
    assertEquals(1, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(1, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(1, charStream.index());
    assertEquals(1, eventFilterLexer.getCharIndex());
    assertEquals(1, eventFilterLexer.getCharPositionInLine());
    assertEquals(1, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mHEX_DIGIT()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mHEX_DIGIT()"})
  public void testMHEX_DIGIT2() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRReaderStream(new StringReader("foo")));

    // Act
    eventFilterLexer.mHEX_DIGIT();

    // Assert
    CharStream charStream = eventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRReaderStream);
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("o", eOFToken.getText());
    assertEquals(1, charStream.getCharPositionInLine());
    assertEquals(1, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(1, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(1, charStream.index());
    assertEquals(1, eventFilterLexer.getCharIndex());
    assertEquals(1, eventFilterLexer.getCharPositionInLine());
    assertEquals(1, eOFToken.getCharPositionInLine());
  }

  /**
   * Test {@link EventFilterLexer#mHEX_DIGIT()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedSetException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mHEX_DIGIT()"})
  public void testMHEX_DIGIT_thenThrowMismatchedSetException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mHEX_DIGIT());
  }

  /**
   * Test {@link EventFilterLexer#mESC_SEQ()}.
   *
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mESC_SEQ()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mESC_SEQ()"})
  public void testMESC_SEQ_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mESC_SEQ());
  }

  /**
   * Test {@link EventFilterLexer#mOCTAL_ESC()}.
   *
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mOCTAL_ESC()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mOCTAL_ESC()"})
  public void testMOCTAL_ESC_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mOCTAL_ESC());
  }

  /**
   * Test {@link EventFilterLexer#mUNICODE_ESC()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mUNICODE_ESC()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mUNICODE_ESC()"})
  public void testMUNICODE_ESC() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedTokenException.class, () -> eventFilterLexer.mUNICODE_ESC());
  }

  /**
   * Test {@link EventFilterLexer#mUNICODE_ESC()}.
   *
   * <p>Method under test: {@link EventFilterLexer#mUNICODE_ESC()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mUNICODE_ESC()"})
  public void testMUNICODE_ESC2() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(
        new ANTLRStringStream("\\A\\A".toCharArray(), EventFilterLexer.EXPONENT));

    // Act and Assert
    assertThrows(MismatchedTokenException.class, () -> eventFilterLexer.mUNICODE_ESC());
  }

  /**
   * Test {@link EventFilterLexer#mEXPONENT()}.
   *
   * <ul>
   *   <li>Then throw {@link MismatchedSetException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mEXPONENT()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mEXPONENT()"})
  public void testMEXPONENT_thenThrowMismatchedSetException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mEXPONENT());
  }

  /**
   * Test {@link EventFilterLexer#mTokens()}.
   *
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then throw {@link MismatchedTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mTokens()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTokens()"})
  public void testMTokens_givenStringReaderWithFoo_thenThrowMismatchedTokenException()
      throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRReaderStream(new StringReader("foo")));

    // Act and Assert
    assertThrows(MismatchedTokenException.class, () -> eventFilterLexer.mTokens());
  }

  /**
   * Test {@link EventFilterLexer#mTokens()}.
   *
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterLexer#mTokens()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterLexer.mTokens()"})
  public void testMTokens_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mTokens());
  }
}
