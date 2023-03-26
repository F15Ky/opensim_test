/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Use this abstract class to connect your implementation of decorative <br>
 * geometry to the implementation-independent classes above. *
 */
public class DecorativeGeometryImplementation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public DecorativeGeometryImplementation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeGeometryImplementation obj) {
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
        opensimSimbodyJNI.delete_DecorativeGeometryImplementation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    opensimSimbodyJNI.DecorativeGeometryImplementation_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    opensimSimbodyJNI.DecorativeGeometryImplementation_change_ownership(this, swigCPtr, true);
  }

  public void implementPointGeometry(DecorativePoint arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementPointGeometry(swigCPtr, this, DecorativePoint.getCPtr(arg0), arg0);
  }

  public void implementLineGeometry(DecorativeLine arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementLineGeometry(swigCPtr, this, DecorativeLine.getCPtr(arg0), arg0);
  }

  public void implementBrickGeometry(DecorativeBrick arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementBrickGeometry(swigCPtr, this, DecorativeBrick.getCPtr(arg0), arg0);
  }

  public void implementCylinderGeometry(DecorativeCylinder arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementCylinderGeometry(swigCPtr, this, DecorativeCylinder.getCPtr(arg0), arg0);
  }

  public void implementCircleGeometry(DecorativeCircle arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementCircleGeometry(swigCPtr, this, DecorativeCircle.getCPtr(arg0), arg0);
  }

  public void implementSphereGeometry(DecorativeSphere arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementSphereGeometry(swigCPtr, this, DecorativeSphere.getCPtr(arg0), arg0);
  }

  public void implementEllipsoidGeometry(DecorativeEllipsoid arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementEllipsoidGeometry(swigCPtr, this, DecorativeEllipsoid.getCPtr(arg0), arg0);
  }

  public void implementFrameGeometry(DecorativeFrame arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementFrameGeometry(swigCPtr, this, DecorativeFrame.getCPtr(arg0), arg0);
  }

  public void implementTextGeometry(DecorativeText arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementTextGeometry(swigCPtr, this, DecorativeText.getCPtr(arg0), arg0);
  }

  public void implementMeshGeometry(DecorativeMesh arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementMeshGeometry(swigCPtr, this, DecorativeMesh.getCPtr(arg0), arg0);
  }

  public void implementMeshFileGeometry(DecorativeMeshFile arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementMeshFileGeometry(swigCPtr, this, DecorativeMeshFile.getCPtr(arg0), arg0);
  }

  public void implementTorusGeometry(DecorativeTorus arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementTorusGeometry(swigCPtr, this, DecorativeTorus.getCPtr(arg0), arg0);
  }

  public void implementArrowGeometry(DecorativeArrow arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementArrowGeometry(swigCPtr, this, DecorativeArrow.getCPtr(arg0), arg0);
  }

  public void implementConeGeometry(DecorativeCone arg0) {
    opensimSimbodyJNI.DecorativeGeometryImplementation_implementConeGeometry(swigCPtr, this, DecorativeCone.getCPtr(arg0), arg0);
  }

  public DecorativeGeometryImplementation() {
    this(opensimSimbodyJNI.new_DecorativeGeometryImplementation(), true);
    opensimSimbodyJNI.DecorativeGeometryImplementation_director_connect(this, swigCPtr, true, true);
  }

}