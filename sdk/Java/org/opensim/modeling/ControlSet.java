/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding and managing a set of controls for a dynamic<br>
 * simulation.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class ControlSet extends SetControls {
  private transient long swigCPtr;

  public ControlSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ControlSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControlSet obj) {
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
        opensimSimulationJNI.delete_ControlSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControlSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ControlSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControlSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ControlSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ControlSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ControlSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ControlSet_getConcreteClassName(swigCPtr, this);
  }

  public ControlSet() {
    this(opensimSimulationJNI.new_ControlSet__SWIG_0(), true);
  }

  public ControlSet(String aFileName) {
    this(opensimSimulationJNI.new_ControlSet__SWIG_1(aFileName), true);
  }

  public ControlSet(ControlSet aSet) {
    this(opensimSimulationJNI.new_ControlSet__SWIG_2(ControlSet.getCPtr(aSet), aSet), true);
  }

  public ControlSet(Storage aStorage, int nControlsToConvert, int aStartIndex) {
    this(opensimSimulationJNI.new_ControlSet__SWIG_3(Storage.getCPtr(aStorage), aStorage, nControlsToConvert, aStartIndex), true);
  }

  public ControlSet(Storage aStorage, int nControlsToConvert) {
    this(opensimSimulationJNI.new_ControlSet__SWIG_4(Storage.getCPtr(aStorage), aStorage, nControlsToConvert), true);
  }

  public ControlSet(Storage aStorage) {
    this(opensimSimulationJNI.new_ControlSet__SWIG_5(Storage.getCPtr(aStorage), aStorage), true);
  }

  public int getSize(boolean aForModelControls) {
    return opensimSimulationJNI.ControlSet_getSize__SWIG_0(swigCPtr, this, aForModelControls);
  }

  public int getSize() {
    return opensimSimulationJNI.ControlSet_getSize__SWIG_1(swigCPtr, this);
  }

  public void getControlList(String aType, ArrayInt rList, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_getControlList__SWIG_0(swigCPtr, this, aType, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getControlList(String aType, ArrayInt rList) {
    opensimSimulationJNI.ControlSet_getControlList__SWIG_1(swigCPtr, this, aType, ArrayInt.getCPtr(rList), rList);
  }

  public void getControlValues(double aT, ArrayDouble rX, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_getControlValues__SWIG_0(swigCPtr, this, aT, ArrayDouble.getCPtr(rX), rX, aForModelControls);
  }

  public void getControlValues(double aT, ArrayDouble rX) {
    opensimSimulationJNI.ControlSet_getControlValues__SWIG_1(swigCPtr, this, aT, ArrayDouble.getCPtr(rX), rX);
  }

  public void setControlValues(double aT, ArrayDouble aX, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_setControlValues__SWIG_0(swigCPtr, this, aT, ArrayDouble.getCPtr(aX), aX, aForModelControls);
  }

  public void setControlValues(double aT, ArrayDouble aX) {
    opensimSimulationJNI.ControlSet_setControlValues__SWIG_1(swigCPtr, this, aT, ArrayDouble.getCPtr(aX), aX);
  }

  public int getNumParameters(boolean aForModelControls) {
    return opensimSimulationJNI.ControlSet_getNumParameters__SWIG_0(swigCPtr, this, aForModelControls);
  }

  public int getNumParameters() {
    return opensimSimulationJNI.ControlSet_getNumParameters__SWIG_1(swigCPtr, this);
  }

  public void getParameterList(ArrayInt rList, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_0(swigCPtr, this, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(ArrayInt rList) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_1(swigCPtr, this, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterList(double aT, ArrayInt rList, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_2(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(double aT, ArrayInt rList) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_3(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterList(double aTLower, double aTUpper, ArrayInt rList, boolean aForModelControls) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_4(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(double aTLower, double aTUpper, ArrayInt rList) {
    opensimSimulationJNI.ControlSet_getParameterList__SWIG_5(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterMins(ArrayDouble rMins, ArrayInt aList) {
    opensimSimulationJNI.ControlSet_getParameterMins__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rMins), rMins, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterMins(ArrayDouble rMins) {
    opensimSimulationJNI.ControlSet_getParameterMins__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rMins), rMins);
  }

  public void getParameterMaxs(ArrayDouble rMaxs, ArrayInt aList) {
    opensimSimulationJNI.ControlSet_getParameterMaxs__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rMaxs), rMaxs, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterMaxs(ArrayDouble rMaxs) {
    opensimSimulationJNI.ControlSet_getParameterMaxs__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rMaxs), rMaxs);
  }

  public void getParameterValues(ArrayDouble rP, ArrayInt aList) {
    opensimSimulationJNI.ControlSet_getParameterValues__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rP), rP, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterValues(ArrayDouble rP) {
    opensimSimulationJNI.ControlSet_getParameterValues__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rP), rP);
  }

  public void setParameterValues(ArrayDouble aP, ArrayInt aList) {
    opensimSimulationJNI.ControlSet_setParameterValues__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(aP), aP, ArrayInt.getCPtr(aList), aList);
  }

  public void setParameterValues(ArrayDouble aP) {
    opensimSimulationJNI.ControlSet_setParameterValues__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(aP), aP);
  }

  public void simplify(SWIGTYPE_p_PropertySet aProperties) {
    opensimSimulationJNI.ControlSet_simplify(swigCPtr, this, SWIGTYPE_p_PropertySet.getCPtr(aProperties));
  }

  public void filter(double aT) {
    opensimSimulationJNI.ControlSet_filter(swigCPtr, this, aT);
  }

  public Storage constructStorage(int aN, double aT1, double aT2, boolean aForModelControls) {
    long cPtr = opensimSimulationJNI.ControlSet_constructStorage(swigCPtr, this, aN, aT1, aT2, aForModelControls);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int mapParameterToControl(int aIndex) {
    return opensimSimulationJNI.ControlSet_mapParameterToControl(swigCPtr, this, aIndex);
  }

  public int mapParameterToParameter(int aIndex) {
    return opensimSimulationJNI.ControlSet_mapParameterToParameter(swigCPtr, this, aIndex);
  }

  public void generateParameterMaps() {
    opensimSimulationJNI.ControlSet_generateParameterMaps(swigCPtr, this);
  }

}