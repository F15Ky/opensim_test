/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IncorrectTableType extends InvalidArgument {
  private transient long swigCPtr;

  public IncorrectTableType(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.IncorrectTableType_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IncorrectTableType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_IncorrectTableType(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IncorrectTableType(String file, long line, String func, String message) {
    this(opensimCommonJNI.new_IncorrectTableType__SWIG_0(file, line, func, message), true);
  }

  public IncorrectTableType(String file, long line, String func) {
    this(opensimCommonJNI.new_IncorrectTableType__SWIG_1(file, line, func), true);
  }

}