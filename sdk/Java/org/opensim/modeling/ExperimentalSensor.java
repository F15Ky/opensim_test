/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class representing the experimental sensor, such as IMU, and its association<br>
 * to a model (component) in OpenSim.<br>
 * <br>
 * @author Ayman Habib
 */
public class ExperimentalSensor extends OpenSimObject {
  private transient long swigCPtr;

  public ExperimentalSensor(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ExperimentalSensor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ExperimentalSensor obj) {
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
        opensimCommonJNI.delete_ExperimentalSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ExperimentalSensor safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.ExperimentalSensor_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ExperimentalSensor(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.ExperimentalSensor_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.ExperimentalSensor_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ExperimentalSensor_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ExperimentalSensor(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ExperimentalSensor_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_name_in_model(ExperimentalSensor source) {
    opensimCommonJNI.ExperimentalSensor_copyProperty_name_in_model(swigCPtr, this, ExperimentalSensor.getCPtr(source), source);
  }

  public String get_name_in_model(int i) {
    return opensimCommonJNI.ExperimentalSensor_get_name_in_model__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_name_in_model(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.ExperimentalSensor_upd_name_in_model__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_name_in_model(int i, String value) {
    opensimCommonJNI.ExperimentalSensor_set_name_in_model__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_name_in_model(String value) {
    return opensimCommonJNI.ExperimentalSensor_append_name_in_model(swigCPtr, this, value);
  }

  public void constructProperty_name_in_model(String initValue) {
    opensimCommonJNI.ExperimentalSensor_constructProperty_name_in_model(swigCPtr, this, initValue);
  }

  public String get_name_in_model() {
    return opensimCommonJNI.ExperimentalSensor_get_name_in_model__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_name_in_model() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.ExperimentalSensor_upd_name_in_model__SWIG_1(swigCPtr, this), false);
  }

  public void set_name_in_model(String value) {
    opensimCommonJNI.ExperimentalSensor_set_name_in_model__SWIG_1(swigCPtr, this, value);
  }

  public ExperimentalSensor(String sensorName, String nameInModel) {
    this(opensimCommonJNI.new_ExperimentalSensor__SWIG_0(sensorName, nameInModel), true);
  }

  public ExperimentalSensor() {
    this(opensimCommonJNI.new_ExperimentalSensor__SWIG_1(), true);
  }

}
