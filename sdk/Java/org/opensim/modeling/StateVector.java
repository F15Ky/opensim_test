/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class which stores a vector of states or data at a specified time.<br>
 * Generally, it is used to store the time histories of the states during<br>
 * an integration.<br>
 * <br>
 * The format of the numerical output for this class is specified by the<br>
 * settings in IO.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0<br>
 * @see IO
 */
public class StateVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StateVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StateVector obj) {
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
        opensimCommonJNI.delete_StateVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StateVector() {
    this(opensimCommonJNI.new_StateVector__SWIG_0(), true);
  }

  public StateVector(StateVector arg0) {
    this(opensimCommonJNI.new_StateVector__SWIG_1(StateVector.getCPtr(arg0), arg0), true);
  }

  public StateVector(double aT) {
    this(opensimCommonJNI.new_StateVector__SWIG_2(aT), true);
  }

  public StateVector(double aT, Vector data) {
    this(opensimCommonJNI.new_StateVector__SWIG_3(aT, Vector.getCPtr(data), data), true);
  }

  public void setStates(double aT, Vector data) {
    opensimCommonJNI.StateVector_setStates(swigCPtr, this, aT, Vector.getCPtr(data), data);
  }

  public int getSize() {
    return opensimCommonJNI.StateVector_getSize(swigCPtr, this);
  }

  public void setTime(double aT) {
    opensimCommonJNI.StateVector_setTime(swigCPtr, this, aT);
  }

  public double getTime() {
    return opensimCommonJNI.StateVector_getTime(swigCPtr, this);
  }

  public int getDataValue(int aIndex, SWIGTYPE_p_double rValue) {
    return opensimCommonJNI.StateVector_getDataValue(swigCPtr, this, aIndex, SWIGTYPE_p_double.getCPtr(rValue));
  }

  public void setDataValue(int aIndex, SWIGTYPE_p_double aValue) {
    opensimCommonJNI.StateVector_setDataValue(swigCPtr, this, aIndex, SWIGTYPE_p_double.getCPtr(aValue));
  }

  public ArrayDouble getData() {
    return new ArrayDouble(opensimCommonJNI.StateVector_getData(swigCPtr, this), false);
  }

  public void shiftTime(double aValue) {
    opensimCommonJNI.StateVector_shiftTime(swigCPtr, this, aValue);
  }

  public void scaleTime(double aValue) {
    opensimCommonJNI.StateVector_scaleTime(swigCPtr, this, aValue);
  }

  public void add(double aValue) {
    opensimCommonJNI.StateVector_add__SWIG_0(swigCPtr, this, aValue);
  }

  public void add(Vector values) {
    opensimCommonJNI.StateVector_add__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void add(int aN, double aValue) {
    opensimCommonJNI.StateVector_add__SWIG_2(swigCPtr, this, aN, aValue);
  }

  public void add(StateVector aStateVector) {
    opensimCommonJNI.StateVector_add__SWIG_3(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void subtract(double aValue) {
    opensimCommonJNI.StateVector_subtract__SWIG_0(swigCPtr, this, aValue);
  }

  public void subtract(Vector values) {
    opensimCommonJNI.StateVector_subtract__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void subtract(StateVector aStateVector) {
    opensimCommonJNI.StateVector_subtract__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void multiply(double aValue) {
    opensimCommonJNI.StateVector_multiply__SWIG_0(swigCPtr, this, aValue);
  }

  public void multiply(Vector values) {
    opensimCommonJNI.StateVector_multiply__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void multiply(StateVector aStateVector) {
    opensimCommonJNI.StateVector_multiply__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void divide(double aValue) {
    opensimCommonJNI.StateVector_divide__SWIG_0(swigCPtr, this, aValue);
  }

  public void divide(Vector values) {
    opensimCommonJNI.StateVector_divide__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void divide(StateVector aStateVector) {
    opensimCommonJNI.StateVector_divide__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

}