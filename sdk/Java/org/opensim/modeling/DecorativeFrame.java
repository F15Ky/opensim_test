/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This defines geometry to represent a coordinate frame. The default <br>
 * constructor makes three perpendicular lines beginning at the origin and <br>
 * extending in the +x, +y, and +z directions by 1 unit. *
 */
public class DecorativeFrame extends DecorativeGeometry {
  private transient long swigCPtr;

  public DecorativeFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.DecorativeFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeFrame obj) {
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
        opensimSimbodyJNI.delete_DecorativeFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeFrame(double axisLength) {
    this(opensimSimbodyJNI.new_DecorativeFrame__SWIG_0(axisLength), true);
  }

  public DecorativeFrame() {
    this(opensimSimbodyJNI.new_DecorativeFrame__SWIG_1(), true);
  }

  public DecorativeFrame setAxisLength(double arg0) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setAxisLength(swigCPtr, this, arg0), false);
  }

  public double getAxisLength() {
    return opensimSimbodyJNI.DecorativeFrame_getAxisLength(swigCPtr, this);
  }

  public DecorativeFrame setBodyId(int b) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeFrame setIndexOnBody(int x) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeFrame setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeFrame setTransform(Transform X_BD) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeFrame setResolution(double r) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeFrame setScaleFactors(Vec3 s) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeFrame setColor(Vec3 rgb) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeFrame setOpacity(double o) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeFrame setLineThickness(double t) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeFrame setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeFrame(opensimSimbodyJNI.DecorativeFrame_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

  public DecorativeFrame clone() {
    long cPtr = opensimSimbodyJNI.DecorativeFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeFrame(cPtr, false);
  }

}