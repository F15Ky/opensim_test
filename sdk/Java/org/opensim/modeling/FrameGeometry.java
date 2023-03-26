/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class to represent Frame geometry. Knobs that can be changed<br>
 * are in Appearance::Representation, size, thickness.
 */
public class FrameGeometry extends Geometry {
  private transient long swigCPtr;

  public FrameGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.FrameGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FrameGeometry obj) {
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
        opensimSimulationJNI.delete_FrameGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FrameGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.FrameGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FrameGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.FrameGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.FrameGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.FrameGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FrameGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.FrameGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_display_radius(FrameGeometry source) {
    opensimSimulationJNI.FrameGeometry_copyProperty_display_radius(swigCPtr, this, FrameGeometry.getCPtr(source), source);
  }

  public double get_display_radius(int i) {
    return opensimSimulationJNI.FrameGeometry_get_display_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_display_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FrameGeometry_upd_display_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_display_radius(int i, double value) {
    opensimSimulationJNI.FrameGeometry_set_display_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_display_radius(double value) {
    return opensimSimulationJNI.FrameGeometry_append_display_radius(swigCPtr, this, value);
  }

  public void constructProperty_display_radius(double initValue) {
    opensimSimulationJNI.FrameGeometry_constructProperty_display_radius(swigCPtr, this, initValue);
  }

  public double get_display_radius() {
    return opensimSimulationJNI.FrameGeometry_get_display_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_display_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FrameGeometry_upd_display_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_display_radius(double value) {
    opensimSimulationJNI.FrameGeometry_set_display_radius__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor
   */
  public FrameGeometry(double scale) {
    this(opensimSimulationJNI.new_FrameGeometry__SWIG_0(scale), true);
  }

  /**
   *  Default constructor
   */
  public FrameGeometry() {
    this(opensimSimulationJNI.new_FrameGeometry__SWIG_1(), true);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.FrameGeometry_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}