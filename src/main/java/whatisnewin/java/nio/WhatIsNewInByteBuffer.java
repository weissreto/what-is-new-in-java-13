package whatisnewin.java.nio;

import java.nio.ByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ByteBuffer}
 * that were newly introduced in Java version 13.<br>
 *
 * {@link ByteBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see ByteBuffer
 */
public final class WhatIsNewInByteBuffer
{
  /**
   * Example call to new method {@link ByteBuffer#slice(int, int)}.
   * @since 13
   * @see ByteBuffer#slice(int, int)
   */
  public ByteBuffer slice(int index, int length)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.slice(index, length);
    return result;
  }

  /**
   * Example call to new method {@link ByteBuffer#get(int, byte[], int, int)}.
   * @since 13
   * @see ByteBuffer#get(int, byte[], int, int)
   */
  public ByteBuffer get(int index, byte[] dst, int offset, int length)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.get(index, dst, offset, length);
    return result;
  }

  /**
   * Example call to new method {@link ByteBuffer#get(int, byte[])}.
   * @since 13
   * @see ByteBuffer#get(int, byte[])
   */
  public ByteBuffer get(int index, byte[] dst)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.get(index, dst);
    return result;
  }

  /**
   * Example call to new method {@link ByteBuffer#put(int, byte[], int, int)}.
   * @since 13
   * @see ByteBuffer#put(int, byte[], int, int)
   */
  public ByteBuffer put(int index, byte[] src, int offset, int length)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.put(index, src, offset, length);
    return result;
  }

  /**
   * Example call to new method {@link ByteBuffer#put(int, byte[])}.
   * @since 13
   * @see ByteBuffer#put(int, byte[])
   */
  public ByteBuffer put(int index, byte[] src)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.put(index, src);
    return result;
  }

  private ByteBuffer $$$()
  {
    return null;
  }
}
