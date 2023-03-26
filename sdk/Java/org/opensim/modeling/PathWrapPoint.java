/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a path wrapping point, which is a path point that<br>
 * is produced by a PathWrap.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class PathWrapPoint extends AbstractPathPoint {
  private transient long swigCPtr;

  public PathWrapPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PathWrapPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathWrapPoint obj) {
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
        opensimSimulationJNI.delete_PathWrapPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathWrapPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PathWrapPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathWrapPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PathWrapPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PathWrapPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PathWrapPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathWrapPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PathWrapPoint_getConcreteClassName(swigCPtr, this);
  }

  public void extendAddToSystem(SWIGTYPE_p_SimTK__MultibodySystem arg0) {
    opensimSimulationJNI.PathWrapPoint_extendAddToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(arg0));
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimSimulationJNI.PathWrapPoint_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public void setWrapObject(WrapObject arg0) {
    opensimSimulationJNI.PathWrapPoint_setWrapObject(swigCPtr, this, WrapObject.getCPtr(arg0), arg0);
  }

  public ArrayVec3 getWrapPath(State arg0) {
    return new ArrayVec3(opensimSimulationJNI.PathWrapPoint_getWrapPath(swigCPtr, this, State.getCPtr(arg0), arg0), false);
  }

  public void setWrapPath(State arg0, ArrayVec3 arg1) {
    opensimSimulationJNI.PathWrapPoint_setWrapPath(swigCPtr, this, State.getCPtr(arg0), arg0, ArrayVec3.getCPtr(arg1), arg1);
  }

  public void clearWrapPath(State arg0) {
    opensimSimulationJNI.PathWrapPoint_clearWrapPath(swigCPtr, this, State.getCPtr(arg0), arg0);
  }

  public double getWrapLength(State arg0) {
    return opensimSimulationJNI.PathWrapPoint_getWrapLength(swigCPtr, this, State.getCPtr(arg0), arg0);
  }

  public void setWrapLength(State arg0, double newLength) {
    opensimSimulationJNI.PathWrapPoint_setWrapLength(swigCPtr, this, State.getCPtr(arg0), arg0, newLength);
  }

  public Vec3 getLocation(State arg0) {
    return new Vec3(opensimSimulationJNI.PathWrapPoint_getLocation(swigCPtr, this, State.getCPtr(arg0), arg0), true);
  }

  public void setLocation(State arg0, Vec3 arg1) {
    opensimSimulationJNI.PathWrapPoint_setLocation(swigCPtr, this, State.getCPtr(arg0), arg0, Vec3.getCPtr(arg1), arg1);
  }

  public Vec3 getdPointdQ(State arg0) {
    return new Vec3(opensimSimulationJNI.PathWrapPoint_getdPointdQ(swigCPtr, this, State.getCPtr(arg0), arg0), true);
  }

  public PathWrapPoint() {
    this(opensimSimulationJNI.new_PathWrapPoint(), true);
  }

}