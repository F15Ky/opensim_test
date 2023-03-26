/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a Point On Line Constraint.  The underlying Constraint <br>
 * in Simbody is a SimTK::Constraint::PointOnLine.<br>
 * <br>
 * @author Samuel Hamner
 */
public class PointOnLineConstraint extends Constraint {
  private transient long swigCPtr;

  public PointOnLineConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PointOnLineConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointOnLineConstraint obj) {
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
        opensimSimulationJNI.delete_PointOnLineConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointOnLineConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PointOnLineConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointOnLineConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PointOnLineConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PointOnLineConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PointOnLineConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointOnLineConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PointOnLineConstraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_line_direction_vec(PointOnLineConstraint source) {
    opensimSimulationJNI.PointOnLineConstraint_copyProperty_line_direction_vec(swigCPtr, this, PointOnLineConstraint.getCPtr(source), source);
  }

  public Vec3 get_line_direction_vec(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_line_direction_vec__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_line_direction_vec(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_line_direction_vec__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_line_direction_vec(int i, Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_line_direction_vec__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_line_direction_vec(Vec3 value) {
    return opensimSimulationJNI.PointOnLineConstraint_append_line_direction_vec(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_line_direction_vec(Vec3 initValue) {
    opensimSimulationJNI.PointOnLineConstraint_constructProperty_line_direction_vec(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_line_direction_vec() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_line_direction_vec__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_line_direction_vec() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_line_direction_vec__SWIG_1(swigCPtr, this), false);
  }

  public void set_line_direction_vec(Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_line_direction_vec__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_point_on_line(PointOnLineConstraint source) {
    opensimSimulationJNI.PointOnLineConstraint_copyProperty_point_on_line(swigCPtr, this, PointOnLineConstraint.getCPtr(source), source);
  }

  public Vec3 get_point_on_line(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_point_on_line__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point_on_line(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_point_on_line__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point_on_line(int i, Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_point_on_line__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point_on_line(Vec3 value) {
    return opensimSimulationJNI.PointOnLineConstraint_append_point_on_line(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point_on_line(Vec3 initValue) {
    opensimSimulationJNI.PointOnLineConstraint_constructProperty_point_on_line(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point_on_line() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_point_on_line__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point_on_line() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_point_on_line__SWIG_1(swigCPtr, this), false);
  }

  public void set_point_on_line(Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_point_on_line__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_point_on_follower(PointOnLineConstraint source) {
    opensimSimulationJNI.PointOnLineConstraint_copyProperty_point_on_follower(swigCPtr, this, PointOnLineConstraint.getCPtr(source), source);
  }

  public Vec3 get_point_on_follower(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_point_on_follower__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point_on_follower(int i) {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_point_on_follower__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point_on_follower(int i, Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_point_on_follower__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point_on_follower(Vec3 value) {
    return opensimSimulationJNI.PointOnLineConstraint_append_point_on_follower(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point_on_follower(Vec3 initValue) {
    opensimSimulationJNI.PointOnLineConstraint_constructProperty_point_on_follower(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point_on_follower() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_get_point_on_follower__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point_on_follower() {
    return new Vec3(opensimSimulationJNI.PointOnLineConstraint_upd_point_on_follower__SWIG_1(swigCPtr, this), false);
  }

  public void set_point_on_follower(Vec3 value) {
    opensimSimulationJNI.PointOnLineConstraint_set_point_on_follower__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_line_body(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointOnLineConstraint_PropertyIndex_socket_line_body_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_line_body() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointOnLineConstraint_PropertyIndex_socket_line_body_get(swigCPtr, this), true);
  }

  public void connectSocket_line_body(OpenSimObject object) {
    opensimSimulationJNI.PointOnLineConstraint_connectSocket_line_body(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_follower_body(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointOnLineConstraint_PropertyIndex_socket_follower_body_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_follower_body() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointOnLineConstraint_PropertyIndex_socket_follower_body_get(swigCPtr, this), true);
  }

  public void connectSocket_follower_body(OpenSimObject object) {
    opensimSimulationJNI.PointOnLineConstraint_connectSocket_follower_body(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public PointOnLineConstraint() {
    this(opensimSimulationJNI.new_PointOnLineConstraint__SWIG_0(), true);
  }

  public PointOnLineConstraint(PhysicalFrame lineBody, Vec3 lineDirection, Vec3 pointOnLine, PhysicalFrame followerBody, Vec3 followerPoint) {
    this(opensimSimulationJNI.new_PointOnLineConstraint__SWIG_1(PhysicalFrame.getCPtr(lineBody), lineBody, Vec3.getCPtr(lineDirection), lineDirection, Vec3.getCPtr(pointOnLine), pointOnLine, PhysicalFrame.getCPtr(followerBody), followerBody, Vec3.getCPtr(followerPoint), followerPoint), true);
  }

  public void setLineBodyByName(String aBodyName) {
    opensimSimulationJNI.PointOnLineConstraint_setLineBodyByName(swigCPtr, this, aBodyName);
  }

  public void setFollowerBodyByName(String aBodyName) {
    opensimSimulationJNI.PointOnLineConstraint_setFollowerBodyByName(swigCPtr, this, aBodyName);
  }

  public void setLineDirection(Vec3 direction) {
    opensimSimulationJNI.PointOnLineConstraint_setLineDirection(swigCPtr, this, Vec3.getCPtr(direction), direction);
  }

  public void setPointOnLine(Vec3 point) {
    opensimSimulationJNI.PointOnLineConstraint_setPointOnLine(swigCPtr, this, Vec3.getCPtr(point), point);
  }

  public void setPointOnFollower(Vec3 point) {
    opensimSimulationJNI.PointOnLineConstraint_setPointOnFollower(swigCPtr, this, Vec3.getCPtr(point), point);
  }

}