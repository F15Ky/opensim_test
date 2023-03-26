/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of markers.<br>
 * <br>
 * @author Ayman Habib, Peter Loan
 */
public class MarkerSet extends ModelComponentSetMarkers {
  private transient long swigCPtr;

  public MarkerSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MarkerSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerSet obj) {
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
        opensimSimulationJNI.delete_MarkerSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MarkerSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MarkerSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MarkerSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MarkerSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MarkerSet_getConcreteClassName(swigCPtr, this);
  }

  public void getMarkerNames(ArrayStr aMarkerNamesArray) {
    opensimSimulationJNI.MarkerSet_getMarkerNames(swigCPtr, this, ArrayStr.getCPtr(aMarkerNamesArray), aMarkerNamesArray);
  }

  /**
   *  Add a prefix to marker names for all markers in the set*
   */
  public void addNamePrefix(String prefix) {
    opensimSimulationJNI.MarkerSet_addNamePrefix(swigCPtr, this, prefix);
  }

  public MarkerSet() {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_0(), true);
  }

  public MarkerSet(String file, boolean updateFromXML) throws java.io.IOException {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_1(file, updateFromXML), true);
  }

  public MarkerSet(String file) throws java.io.IOException {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_2(file), true);
  }

}