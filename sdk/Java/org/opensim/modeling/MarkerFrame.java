/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a frame of marker data from a TRC/TRB file.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class MarkerFrame extends OpenSimObject {
  private transient long swigCPtr;

  public MarkerFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.MarkerFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerFrame obj) {
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
        opensimCommonJNI.delete_MarkerFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerFrame safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.MarkerFrame_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.MarkerFrame_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.MarkerFrame_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.MarkerFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.MarkerFrame_getConcreteClassName(swigCPtr, this);
  }

  public MarkerFrame() {
    this(opensimCommonJNI.new_MarkerFrame__SWIG_0(), true);
  }

  public MarkerFrame(int aNumMarkers, int aFrameNumber, double aTime, Units aUnits) {
    this(opensimCommonJNI.new_MarkerFrame__SWIG_1(aNumMarkers, aFrameNumber, aTime, Units.getCPtr(aUnits), aUnits), true);
  }

  public void addMarker(Vec3 aCoords) {
    opensimCommonJNI.MarkerFrame_addMarker(swigCPtr, this, Vec3.getCPtr(aCoords), aCoords);
  }

  public Vec3 getMarker(int aIndex) {
    return new Vec3(opensimCommonJNI.MarkerFrame_getMarker(swigCPtr, this, aIndex), true);
  }

  public Vec3 updMarker(int aIndex) {
    return new Vec3(opensimCommonJNI.MarkerFrame_updMarker(swigCPtr, this, aIndex), false);
  }

  public int getFrameNumber() {
    return opensimCommonJNI.MarkerFrame_getFrameNumber(swigCPtr, this);
  }

  public void setFrameNumber(int aNumber) {
    opensimCommonJNI.MarkerFrame_setFrameNumber(swigCPtr, this, aNumber);
  }

  public double getFrameTime() {
    return opensimCommonJNI.MarkerFrame_getFrameTime(swigCPtr, this);
  }

  public void scale(double aScaleFactor) {
    opensimCommonJNI.MarkerFrame_scale(swigCPtr, this, aScaleFactor);
  }

  public SimTKArrayVec3 getMarkers() {
    return new SimTKArrayVec3(opensimCommonJNI.MarkerFrame_getMarkers(swigCPtr, this), false);
  }

}