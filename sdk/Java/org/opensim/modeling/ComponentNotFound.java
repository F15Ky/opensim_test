/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentNotFound extends OpenSimException {
  private transient long swigCPtr;

  public ComponentNotFound(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ComponentNotFound_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentNotFound obj) {
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
        opensimCommonJNI.delete_ComponentNotFound(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ComponentNotFound(String file, long line, String func, String toFindName, String toFindClassName, String thisName) {
    this(opensimCommonJNI.new_ComponentNotFound(file, line, func, toFindName, toFindClassName, thisName), true);
  }

}
