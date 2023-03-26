/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class that implements a force actuator acting between two points on two bodies.<br>
 * The direction of the force is along the line between the points, with a positive<br>
 * value acting to expand the distance between them.  This actuator has no states; <br>
 * the control is simply the force to be applied to the model.<br>
 * <br>
 * @author Matt DeMers
 */
public class PointToPointActuator extends ScalarActuator {
  private transient long swigCPtr;

  public PointToPointActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointToPointActuator obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_PointToPointActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointToPointActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.PointToPointActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointToPointActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.PointToPointActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointToPointActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_bodyA(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_bodyA(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public String get_bodyA(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_bodyA__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_bodyA(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_bodyA__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_bodyA(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_bodyA__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_bodyA(String value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_bodyA(swigCPtr, this, value);
  }

  public void constructProperty_bodyA() {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_bodyA__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_bodyA(String initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_bodyA__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_bodyA() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_bodyA__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_bodyA() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_bodyA__SWIG_1(swigCPtr, this), false);
  }

  public void set_bodyA(String value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_bodyA__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_bodyB(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_bodyB(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public String get_bodyB(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_bodyB__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_bodyB(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_bodyB__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_bodyB(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_bodyB__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_bodyB(String value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_bodyB(swigCPtr, this, value);
  }

  public void constructProperty_bodyB() {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_bodyB__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_bodyB(String initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_bodyB__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_bodyB() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_bodyB__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_bodyB() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_bodyB__SWIG_1(swigCPtr, this), false);
  }

  public void set_bodyB(String value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_bodyB__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  The default is points_are_global=false. *
   */
  public void copyProperty_points_are_global(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_points_are_global(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public boolean get_points_are_global(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_points_are_global__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_points_are_global(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_points_are_global__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_points_are_global(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_points_are_global__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_points_are_global(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_points_are_global(swigCPtr, this, value);
  }

  public void constructProperty_points_are_global(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_points_are_global(swigCPtr, this, initValue);
  }

  public boolean get_points_are_global() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_points_are_global__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_points_are_global() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_points_are_global__SWIG_1(swigCPtr, this), false);
  }

  public void set_points_are_global(boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_points_are_global__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  The default location for pointA is bodyA's origin. *
   */
  public void copyProperty_pointA(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_pointA(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public Vec3 get_pointA(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_pointA__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_pointA(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_pointA__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pointA(int i, Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_pointA__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_pointA(Vec3 value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_pointA(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_pointA(Vec3 initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_pointA(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_pointA() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_pointA__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_pointA() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_pointA__SWIG_1(swigCPtr, this), false);
  }

  public void set_pointA(Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_pointA__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  /**
   *  The default location for pointB is bodyB's origin. *
   */
  public void copyProperty_pointB(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_pointB(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public Vec3 get_pointB(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_pointB__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_pointB(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_pointB__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pointB(int i, Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_pointB__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_pointB(Vec3 value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_pointB(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_pointB(Vec3 initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_pointB(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_pointB() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_pointB__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_pointB() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_pointB__SWIG_1(swigCPtr, this), false);
  }

  public void set_pointB(Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_pointB__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  /**
   *  The default for optimal force is 1. *
   */
  public void copyProperty_optimal_force(PointToPointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_copyProperty_optimal_force(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor leaves body names unspecified. *
   */
  public PointToPointActuator() {
    this(opensimActuatorsAnalysesToolsJNI.new_PointToPointActuator__SWIG_0(), true);
  }

  /**
   *  Construct with specified body names. *
   */
  public PointToPointActuator(String bodyNameA, String bodyNameB) {
    this(opensimActuatorsAnalysesToolsJNI.new_PointToPointActuator__SWIG_1(bodyNameA, bodyNameB), true);
  }

  /**
   *  %Set the 'pointA' property to the supplied value; frame is interpreted<br>
   *     according to the 'points_are_global' property. *
   */
  public void setPointA(Vec3 pointAPos) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_setPointA(swigCPtr, this, Vec3.getCPtr(pointAPos), pointAPos);
  }

  /**
   *  Return the current value of the 'pointA' property. *
   */
  public Vec3 getPointA() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getPointA(swigCPtr, this), false);
  }

  /**
   *  %Set the 'pointB' property to the supplied value; frame is interpreted<br>
   *     according to the 'points_are_global' property. *
   */
  public void setPointB(Vec3 pointBPos) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_setPointB(swigCPtr, this, Vec3.getCPtr(pointBPos), pointBPos);
  }

  /**
   *  Return the current value of the 'pointB' property. *
   */
  public Vec3 getPointB() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getPointB(swigCPtr, this), false);
  }

  /**
   *  %Set the 'points_are_global' property that determines how to interpret<br>
   *     the 'pointA' and 'pointB' location vectors: if not global (Ground frame) <br>
   *     then they are in the local frame of 'bodyA' and 'bodyB' respectively. *
   */
  public void setPointsAreGlobal(boolean isGlobal) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_setPointsAreGlobal(swigCPtr, this, isGlobal);
  }

  /**
   *  Return the current value of the 'points_are_global' property. *
   */
  public boolean getPointsAreGlobal() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getPointsAreGlobal(swigCPtr, this);
  }

  /**
   *  %Set the 'optimal_force' property. *
   */
  public void setOptimalForce(double optimalForce) {
    opensimActuatorsAnalysesToolsJNI.PointToPointActuator_setOptimalForce(swigCPtr, this, optimalForce);
  }

  /**
   *  Get the current value of the 'optimal_force' property. *
   */
  public double getOptimalForce() {
    return opensimActuatorsAnalysesToolsJNI.PointToPointActuator_getOptimalForce(swigCPtr, this);
  }

}