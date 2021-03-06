package whatisnewin.com.sun.source.util;

import com.sun.source.util.ParameterNameProvider;
import javax.lang.model.element.VariableElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ParameterNameProvider}
 * that were newly introduced in Java version 13.<br>
 *
 * {@link ParameterNameProvider} is a completely new class.
 * @since 13
 * @see ParameterNameProvider
 */
public final class WhatIsNewInParameterNameProvider
{
  /**
   * Example call to new method {@link ParameterNameProvider#getParameterName(VariableElement)}.
   * @since 13
   * @see ParameterNameProvider#getParameterName(VariableElement)
   */
  public CharSequence getParameterName(VariableElement parameter)
  {
    ParameterNameProvider testee = $$$();

    CharSequence result = testee.getParameterName(parameter);
    return result;
  }

  private ParameterNameProvider $$$()
  {
    return null;
  }
}
