/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class NoColumnLabels extends OpenSimException {
  private transient long swigCPtr;

  public NoColumnLabels(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.NoColumnLabels_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(NoColumnLabels obj) {
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
        opensimCommonJNI.delete_NoColumnLabels(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NoColumnLabels(String file, long line, String func) {
    this(opensimCommonJNI.new_NoColumnLabels(file, line, func), true);
  }

}