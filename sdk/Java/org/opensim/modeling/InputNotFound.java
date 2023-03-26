/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InputNotFound extends OpenSimException {
  private transient long swigCPtr;

  public InputNotFound(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.InputNotFound_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InputNotFound obj) {
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
        opensimCommonJNI.delete_InputNotFound(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InputNotFound(String file, long line, String func, OpenSimObject obj, String inputName) {
    this(opensimCommonJNI.new_InputNotFound(file, line, func, OpenSimObject.getCPtr(obj), obj, inputName), true);
  }

}