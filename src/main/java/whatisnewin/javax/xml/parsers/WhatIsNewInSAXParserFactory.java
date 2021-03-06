package whatisnewin.javax.xml.parsers;

import javax.xml.parsers.SAXParserFactory;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SAXParserFactory}
 * that were newly introduced in Java version 13.<br>
 *
 * {@link SAXParserFactory} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see SAXParserFactory
 */
public final class WhatIsNewInSAXParserFactory
{
  /**
   * Example call to new method {@link SAXParserFactory#newDefaultNSInstance()}.
   * @since 13
   * @see SAXParserFactory#newDefaultNSInstance()
   */
  public static SAXParserFactory newDefaultNSInstance()
  {
    SAXParserFactory result = SAXParserFactory.newDefaultNSInstance();
    return result;
  }

  /**
   * Example call to new method {@link SAXParserFactory#newNSInstance()}.
   * @since 13
   * @see SAXParserFactory#newNSInstance()
   */
  public static SAXParserFactory newNSInstance()
  {
    SAXParserFactory result = SAXParserFactory.newNSInstance();
    return result;
  }

  /**
   * Example call to new method {@link SAXParserFactory#newNSInstance(String, ClassLoader)}.
   * @since 13
   * @see SAXParserFactory#newNSInstance(String, ClassLoader)
   */
  public static SAXParserFactory newNSInstance(String factoryClassName, ClassLoader classLoader)
  {
    SAXParserFactory result = SAXParserFactory.newNSInstance(factoryClassName, classLoader);
    return result;
  }

}
