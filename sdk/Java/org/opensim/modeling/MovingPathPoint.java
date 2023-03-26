/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a moving muscle point, which is a muscle point that<br>
 * moves in a body's reference frame as a function of a coordinate.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class MovingPathPoint extends AbstractPathPoint {
  private transient long swigCPtr;

  public MovingPathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MovingPathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MovingPathPoint obj) {
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
        opensimSimulationJNI.delete_MovingPathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MovingPathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MovingPathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MovingPathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MovingPathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MovingPathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MovingPathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MovingPathPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MovingPathPoint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_x_location(MovingPathPoint source) {
    opensimSimulationJNI.MovingPathPoint_copyProperty_x_location(swigCPtr, this, MovingPathPoint.getCPtr(source), source);
  }

  public Function get_x_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_x_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_x_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_x_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_x_location(int i, Function value) {
    opensimSimulationJNI.MovingPathPoint_set_x_location__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_x_location(Function value) {
    return opensimSimulationJNI.MovingPathPoint_append_x_location(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_x_location() {
    opensimSimulationJNI.MovingPathPoint_constructProperty_x_location__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_x_location(Function initValue) {
    opensimSimulationJNI.MovingPathPoint_constructProperty_x_location__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_x_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_x_location__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_x_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_x_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_x_location(Function value) {
    opensimSimulationJNI.MovingPathPoint_set_x_location__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_y_location(MovingPathPoint source) {
    opensimSimulationJNI.MovingPathPoint_copyProperty_y_location(swigCPtr, this, MovingPathPoint.getCPtr(source), source);
  }

  public Function get_y_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_y_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_y_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_y_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_y_location(int i, Function value) {
    opensimSimulationJNI.MovingPathPoint_set_y_location__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_y_location(Function value) {
    return opensimSimulationJNI.MovingPathPoint_append_y_location(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_y_location() {
    opensimSimulationJNI.MovingPathPoint_constructProperty_y_location__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_y_location(Function initValue) {
    opensimSimulationJNI.MovingPathPoint_constructProperty_y_location__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_y_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_y_location__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_y_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_y_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_y_location(Function value) {
    opensimSimulationJNI.MovingPathPoint_set_y_location__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_z_location(MovingPathPoint source) {
    opensimSimulationJNI.MovingPathPoint_copyProperty_z_location(swigCPtr, this, MovingPathPoint.getCPtr(source), source);
  }

  public Function get_z_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_z_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_z_location(int i) {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_z_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_z_location(int i, Function value) {
    opensimSimulationJNI.MovingPathPoint_set_z_location__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_z_location(Function value) {
    return opensimSimulationJNI.MovingPathPoint_append_z_location(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_z_location() {
    opensimSimulationJNI.MovingPathPoint_constructProperty_z_location__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_z_location(Function initValue) {
    opensimSimulationJNI.MovingPathPoint_constructProperty_z_location__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_z_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_get_z_location__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_z_location() {
    return new Function(opensimSimulationJNI.MovingPathPoint_upd_z_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_z_location(Function value) {
    opensimSimulationJNI.MovingPathPoint_set_z_location__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_x_coordinate(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_x_coordinate_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_x_coordinate() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_x_coordinate_get(swigCPtr, this), true);
  }

  public void connectSocket_x_coordinate(OpenSimObject object) {
    opensimSimulationJNI.MovingPathPoint_connectSocket_x_coordinate(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_y_coordinate(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_y_coordinate_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_y_coordinate() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_y_coordinate_get(swigCPtr, this), true);
  }

  public void connectSocket_y_coordinate(OpenSimObject object) {
    opensimSimulationJNI.MovingPathPoint_connectSocket_y_coordinate(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_z_coordinate(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_z_coordinate_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_z_coordinate() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.MovingPathPoint_PropertyIndex_socket_z_coordinate_get(swigCPtr, this), true);
  }

  public void connectSocket_z_coordinate(OpenSimObject object) {
    opensimSimulationJNI.MovingPathPoint_connectSocket_z_coordinate(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public MovingPathPoint() {
    this(opensimSimulationJNI.new_MovingPathPoint(), true);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimSimulationJNI.MovingPathPoint_updateFromXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public boolean hasXCoordinate() {
    return opensimSimulationJNI.MovingPathPoint_hasXCoordinate(swigCPtr, this);
  }

  public boolean hasYCoordinate() {
    return opensimSimulationJNI.MovingPathPoint_hasYCoordinate(swigCPtr, this);
  }

  public boolean hasZCoordinate() {
    return opensimSimulationJNI.MovingPathPoint_hasZCoordinate(swigCPtr, this);
  }

  public Coordinate getXCoordinate() {
    return new Coordinate(opensimSimulationJNI.MovingPathPoint_getXCoordinate(swigCPtr, this), false);
  }

  public Coordinate getYCoordinate() {
    return new Coordinate(opensimSimulationJNI.MovingPathPoint_getYCoordinate(swigCPtr, this), false);
  }

  public Coordinate getZCoordinate() {
    return new Coordinate(opensimSimulationJNI.MovingPathPoint_getZCoordinate(swigCPtr, this), false);
  }

  public void setXCoordinate(Coordinate coordinate) {
    opensimSimulationJNI.MovingPathPoint_setXCoordinate(swigCPtr, this, Coordinate.getCPtr(coordinate), coordinate);
  }

  public void setYCoordinate(Coordinate coordinate) {
    opensimSimulationJNI.MovingPathPoint_setYCoordinate(swigCPtr, this, Coordinate.getCPtr(coordinate), coordinate);
  }

  public void setZCoordinate(Coordinate coordinate) {
    opensimSimulationJNI.MovingPathPoint_setZCoordinate(swigCPtr, this, Coordinate.getCPtr(coordinate), coordinate);
  }

  public boolean isActive(State s) {
    return opensimSimulationJNI.MovingPathPoint_isActive(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  Get the local location of the MovingPathPoint in its Frame 
   */
  public Vec3 getLocation(State s) {
    return new Vec3(opensimSimulationJNI.MovingPathPoint_getLocation(swigCPtr, this, State.getCPtr(s), s), true);
  }

  /**
   *  Get the local velocity of the MovingPathPoint w.r.t to and <br>
   *         expressed in its Frame. To get the velocity of the point w.r.t.<br>
   *         and expressed in Ground, call getVelocityInGround(). 
   */
  public Vec3 getVelocity(State s) {
    return new Vec3(opensimSimulationJNI.MovingPathPoint_getVelocity(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public Vec3 getdPointdQ(State s) {
    return new Vec3(opensimSimulationJNI.MovingPathPoint_getdPointdQ(swigCPtr, this, State.getCPtr(s), s), true);
  }

  /**
   *  Scale the underlying MultiplierFunctions associated with the<br>
   *         MovingPathPoint. 
   */
  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.MovingPathPoint_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}