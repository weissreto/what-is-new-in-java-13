package whatisnewin.java.nio;

import java.nio.DoubleBuffer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DoubleBuffer}
 * that were newly introduced in Java versions 13.<br>
 *
 * {@link DoubleBuffer} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see DoubleBuffer
 */
public final class WhatIsNewInDoubleBuffer
{
  /**
   * Example call to new method {@link DoubleBuffer#get}
   * @since 13
   * @see DoubleBuffer#get
   */
  public DoubleBuffer get(int index, double[] dst, int offset, int length)
  {
    DoubleBuffer testee = $$$();

    DoubleBuffer result = testee.get(index, dst, offset, length);
    return result;
  }

  /**
   * Example call to new method {@link DoubleBuffer#get}
   * @since 13
   * @see DoubleBuffer#get
   */
  public DoubleBuffer get(int index, double[] dst)
  {
    DoubleBuffer testee = $$$();

    DoubleBuffer result = testee.get(index, dst);
    return result;
  }

  /**
   * Example call to new method {@link DoubleBuffer#put}
   * @since 13
   * @see DoubleBuffer#put
   */
  public DoubleBuffer put(int index, double[] src, int offset, int length)
  {
    DoubleBuffer testee = $$$();

    DoubleBuffer result = testee.put(index, src, offset, length);
    return result;
  }

  /**
   * Example call to new method {@link DoubleBuffer#put}
   * @since 13
   * @see DoubleBuffer#put
   */
  public DoubleBuffer put(int index, double[] src)
  {
    DoubleBuffer testee = $$$();

    DoubleBuffer result = testee.put(index, src);
    return result;
  }

  /**
   * Example call to new method {@link DoubleBuffer#slice}
   * @since 13
   * @see DoubleBuffer#slice
   */
  public DoubleBuffer slice(int index, int length)
  {
    DoubleBuffer testee = $$$();

    DoubleBuffer result = testee.slice(index, length);
    return result;
  }

  private DoubleBuffer $$$()
  {
    return null;
  }
}