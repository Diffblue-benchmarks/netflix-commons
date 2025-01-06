package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.netflix.infix.lang.infix.antlr.EventFilterLexer.DFA11;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
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

public class EventFilterLexerDiffblueTest {
  /**
   * Test DFA11 {@link DFA11#getDescription()}.
   * <p>
   * Method under test: {@link EventFilterLexer.DFA11#getDescription()}
   */
  @Test
  public void testDFA11GetDescription() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        (eventFilterLexer.new DFA11(new EventFilterLexer())).getDescription());
  }

  /**
   * Test DFA11 {@link DFA11#DFA11(EventFilterLexer, BaseRecognizer)}.
   * <p>
   * Method under test:
   * {@link EventFilterLexer.DFA11#DFA11(EventFilterLexer, BaseRecognizer)}
   */
  @Test
  public void testDFA11NewDfa11() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        (eventFilterLexer.new DFA11(new EventFilterLexer())).getDescription());
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream())));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link EarlyExitException#EarlyExitException()}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenEarlyExitException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new EarlyExitException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenFailedPredicateException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new FailedPredicateException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedNotSetException#MismatchedNotSetException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenMismatchedNotSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedNotSetException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedRangeException#MismatchedRangeException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenMismatchedRangeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedRangeException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedSetException#MismatchedSetException()}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenMismatchedSetException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedSetException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedTokenException#MismatchedTokenException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenMismatchedTokenException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedTokenException()));
  }

  /**
   * Test {@link EventFilterLexer#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError_whenRecognitionException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new RecognitionException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"},
        new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream())));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link EarlyExitException#EarlyExitException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenEarlyExitException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new EarlyExitException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenFailedPredicateException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new FailedPredicateException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedNotSetException#MismatchedNotSetException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenMismatchedNotSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedNotSetException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedRangeException#MismatchedRangeException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenMismatchedRangeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedRangeException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedSetException#MismatchedSetException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenMismatchedSetException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedSetException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedTokenException#MismatchedTokenException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenMismatchedTokenException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedTokenException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When
   * {@link MismatchedTreeNodeException#MismatchedTreeNodeException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenMismatchedTreeNodeException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedTreeNodeException()));
  }

  /**
   * Test
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}.
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException_whenRecognitionException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new RecognitionException()));
  }

  /**
   * Test {@link EventFilterLexer#getDelegates()}.
   * <p>
   * Method under test: {@link EventFilterLexer#getDelegates()}
   */
  @Test
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, (new EventFilterLexer()).getDelegates().length);
  }

  /**
   * Test {@link EventFilterLexer#EventFilterLexer()}.
   * <p>
   * Method under test: {@link EventFilterLexer#EventFilterLexer()}
   */
  @Test
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
   * <p>
   * Method under test: {@link EventFilterLexer#EventFilterLexer(CharStream)}
   */
  @Test
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
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
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
   * Test
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}
   */
  @Test
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
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
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
   * Test
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}.
   * <ul>
   *   <li>When {@link RecognizerSharedState#RecognizerSharedState()}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}
   */
  @Test
  public void testNewEventFilterLexer_whenRecognizerSharedState() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input, new RecognizerSharedState());

    // Assert
    CharStream charStream = actualEventFilterLexer.getCharStream();
    assertTrue(charStream instanceof ANTLRInputStream);
    assertTrue(actualEventFilterLexer.getEOFToken() instanceof CommonToken);
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
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
   * <p>
   * Method under test: {@link EventFilterLexer#getGrammarFileName()}
   */
  @Test
  public void testGetGrammarFileName() {
    // Arrange, Act and Assert
    assertEquals("EventFilter.g", (new EventFilterLexer()).getGrammarFileName());
  }

  /**
   * Test {@link EventFilterLexer#mAND()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mAND()}
   */
  @Test
  public void testMAND() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("and")));

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
   * Test {@link EventFilterLexer#mBETWEEN()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mBETWEEN()}
   */
  @Test
  public void testMBETWEEN() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("between")));

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
   * Test {@link EventFilterLexer#mEXISTS()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mEXISTS()}
   */
  @Test
  public void testMEXISTS() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("exists")));

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
   * Test {@link EventFilterLexer#mFALSE()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mFALSE()}
   */
  @Test
  public void testMFALSE() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(
        new ANTLRReaderStream(new StringReader(Boolean.FALSE.toString())));

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
   * Test {@link EventFilterLexer#mGE()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mGE()}
   */
  @Test
  public void testMGE() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader(">=")));

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
   * Test {@link EventFilterLexer#mIN()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mIN()}
   */
  @Test
  public void testMIN() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("in")));

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
   * Test {@link EventFilterLexer#mIS()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mIS()}
   */
  @Test
  public void testMIS() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("is")));

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
   * Test {@link EventFilterLexer#mLE()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mLE()}
   */
  @Test
  public void testMLE() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("<=")));

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
   * Test {@link EventFilterLexer#mMATCHES()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mMATCHES()}
   */
  @Test
  public void testMMATCHES() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("=~")));

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
   * Test {@link EventFilterLexer#mNOT()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mNOT()}
   */
  @Test
  public void testMNOT() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("not")));

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
   * Test {@link EventFilterLexer#mNOT_EQUALS()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mNOT_EQUALS()}
   */
  @Test
  public void testMNOT_EQUALS() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("!=")));

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
   * Test {@link EventFilterLexer#mNULL()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mNULL()}
   */
  @Test
  public void testMNULL() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("null")));

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
   * Test {@link EventFilterLexer#mOR()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mOR()}
   */
  @Test
  public void testMOR() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("or")));

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
   * Test {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}
   */
  @Test
  public void testMTIME_MILLIS_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("time-millis")));

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
   * Test {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}
   */
  @Test
  public void testMTIME_STRING_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("time-string")));

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
   * Test {@link EventFilterLexer#mTRUE()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mTRUE()}
   */
  @Test
  public void testMTRUE() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(
        new ANTLRReaderStream(new StringReader(Boolean.TRUE.toString())));

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
   * Test {@link EventFilterLexer#mXPATH_FUN_NAME()}.
   * <p>
   * Method under test: {@link EventFilterLexer#mXPATH_FUN_NAME()}
   */
  @Test
  public void testMXPATH_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRReaderStream(new StringReader("xpath")));

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
   * Test {@link EventFilterLexer#mNUMBER()}.
   * <ul>
   *   <li>Then {@link EventFilterLexer#EventFilterLexer()} CharStream
   * {@link ANTLRReaderStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mNUMBER()}
   */
  @Test
  public void testMNUMBER_thenEventFilterLexerCharStreamANTLRReaderStream() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRReaderStream(new StringReader(
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
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mCOMMENT()}
   */
  @Test
  public void testMCOMMENT_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mCOMMENT());
  }

  /**
   * Test {@link EventFilterLexer#mWS()}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then throw {@link MismatchedSetException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  public void testMWS_givenA_thenThrowMismatchedSetException() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer
        .setCharStream(new ANTLRInputStream(new ByteArrayInputStream(new byte[]{'A', 31, 'A', 31, 'A', 31, 'A', 31})));

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Test {@link EventFilterLexer#mWS()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer()} CharStream is
   * {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  public void testMWS_givenEventFilterLexerCharStreamIsANTLRInputStream() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Test {@link EventFilterLexer#mHEX_DIGIT()}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then {@link EventFilterLexer#EventFilterLexer()} CharStream
   * {@link ANTLRInputStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT_givenA_thenEventFilterLexerCharStreamANTLRInputStream()
      throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer
        .setCharStream(new ANTLRInputStream(new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1})));

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
   * <ul>
   *   <li>Then {@link EventFilterLexer#EventFilterLexer()} CharStream
   * {@link ANTLRReaderStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT_thenEventFilterLexerCharStreamANTLRReaderStream()
      throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
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
   * <ul>
   *   <li>Then throw {@link MismatchedSetException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT_thenThrowMismatchedSetException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mHEX_DIGIT());
  }

  /**
   * Test {@link EventFilterLexer#mESC_SEQ()}.
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mESC_SEQ()}
   */
  @Test
  public void testMESC_SEQ_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mESC_SEQ());
  }

  /**
   * Test {@link EventFilterLexer#mOCTAL_ESC()}.
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mOCTAL_ESC()}
   */
  @Test
  public void testMOCTAL_ESC_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mOCTAL_ESC());
  }

  /**
   * Test {@link EventFilterLexer#mEXPONENT()}.
   * <ul>
   *   <li>Then throw {@link MismatchedSetException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mEXPONENT()}
   */
  @Test
  public void testMEXPONENT_thenThrowMismatchedSetException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mEXPONENT());
  }

  /**
   * Test {@link EventFilterLexer#mTokens()}.
   * <ul>
   *   <li>Then throw {@link NoViableAltException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterLexer#mTokens()}
   */
  @Test
  public void testMTokens_thenThrowNoViableAltException() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mTokens());
  }
}
