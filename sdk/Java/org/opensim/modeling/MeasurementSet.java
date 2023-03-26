/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of measurements.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class MeasurementSet extends SetMeasurements {
  private transient long swigCPtr;

  public MeasurementSet(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.MeasurementSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MeasurementSet obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_MeasurementSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MeasurementSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MeasurementSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MeasurementSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.MeasurementSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.MeasurementSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MeasurementSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MeasurementSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.MeasurementSet_getConcreteClassName(swigCPtr, this);
  }

  public MeasurementSet() {
    this(opensimActuatorsAnalysesToolsJNI.new_MeasurementSet__SWIG_0(), true);
  }

  public MeasurementSet(MeasurementSet aSimmMeasurementSet) {
    this(opensimActuatorsAnalysesToolsJNI.new_MeasurementSet__SWIG_1(MeasurementSet.getCPtr(aSimmMeasurementSet), aSimmMeasurementSet), true);
  }

}
