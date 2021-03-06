package whatisnewin.java.nio;

import java.nio.MappedByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link MappedByteBuffer}
 * that were newly introduced in Java version 13.<br>
 *
 * {@link MappedByteBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see MappedByteBuffer
 */
public final class WhatIsNewInMappedByteBuffer
{
  /**
   * Example call to new method {@link MappedByteBuffer#force(int, int)}.
   * @since 13
   * @see MappedByteBuffer#force(int, int)
   */
  public MappedByteBuffer force(int index, int length)
  {
    MappedByteBuffer testee = $$$();

    MappedByteBuffer result = testee.force(index, length);
    return result;
  }

  private MappedByteBuffer $$$()
  {
    return null;
  }
}
