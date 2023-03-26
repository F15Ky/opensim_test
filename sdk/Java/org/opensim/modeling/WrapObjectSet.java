/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of wrap objects.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class WrapObjectSet extends ModelComponentSetWrapObjects {
  private transient long swigCPtr;

  public WrapObjectSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WrapObjectSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapObjectSet obj) {
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
        opensimSimulationJNI.delete_WrapObjectSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapObjectSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WrapObjectSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapObjectSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WrapObjectSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WrapObjectSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WrapObjectSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObjectSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WrapObjectSet_getConcreteClassName(swigCPtr, this);
  }

  public WrapObjectSet() {
    this(opensimSimulationJNI.new_WrapObjectSet__SWIG_0(), true);
  }

  public WrapObjectSet(String file, boolean updateFromXML) throws java.io.IOException {
    this(opensimSimulationJNI.new_WrapObjectSet__SWIG_1(file, updateFromXML), true);
  }

  public WrapObjectSet(String file) throws java.io.IOException {
    this(opensimSimulationJNI.new_WrapObjectSet__SWIG_2(file), true);
  }

}