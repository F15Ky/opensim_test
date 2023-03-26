/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a Ellipsoid joint. The underlying implementation<br>
 * in Simbody is a SimTK::MobilizedBody::Ellipsoid. An Ellipsoid joint provides three<br>
 * mobilities – coordinated rotation and translation along the surface of an ellipsoid<br>
 *  fixed to the parent body. The ellipsoid surface is determined by an input Vec3 which<br>
 * describes the ellipsoid radius. Generalized speeds are equal to the computed angular<br>
 * velocities ( \vec{u} = \vec{\omega}), not a differentiation of<br>
 * position ( \vec{u} \neq \dot{\vec{q}})<br>
 * <br>
 * <img src=ellipsoid.gif/><br>
 * <br>
 * @author Ajay Seth
 */
public class EllipsoidJoint extends Joint {
  private transient long swigCPtr;

  public EllipsoidJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.EllipsoidJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(EllipsoidJoint obj) {
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
        opensimSimulationJNI.delete_EllipsoidJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static EllipsoidJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.EllipsoidJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new EllipsoidJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.EllipsoidJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.EllipsoidJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.EllipsoidJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new EllipsoidJoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.EllipsoidJoint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_radii_x_y_z(EllipsoidJoint source) {
    opensimSimulationJNI.EllipsoidJoint_copyProperty_radii_x_y_z(swigCPtr, this, EllipsoidJoint.getCPtr(source), source);
  }

  public Vec3 get_radii_x_y_z(int i) {
    return new Vec3(opensimSimulationJNI.EllipsoidJoint_get_radii_x_y_z__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_radii_x_y_z(int i) {
    return new Vec3(opensimSimulationJNI.EllipsoidJoint_upd_radii_x_y_z__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_radii_x_y_z(int i, Vec3 value) {
    opensimSimulationJNI.EllipsoidJoint_set_radii_x_y_z__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_radii_x_y_z(Vec3 value) {
    return opensimSimulationJNI.EllipsoidJoint_append_radii_x_y_z(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_radii_x_y_z(Vec3 initValue) {
    opensimSimulationJNI.EllipsoidJoint_constructProperty_radii_x_y_z(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_radii_x_y_z() {
    return new Vec3(opensimSimulationJNI.EllipsoidJoint_get_radii_x_y_z__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_radii_x_y_z() {
    return new Vec3(opensimSimulationJNI.EllipsoidJoint_upd_radii_x_y_z__SWIG_1(swigCPtr, this), false);
  }

  public void set_radii_x_y_z(Vec3 value) {
    opensimSimulationJNI.EllipsoidJoint_set_radii_x_y_z__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public EllipsoidJoint() {
    this(opensimSimulationJNI.new_EllipsoidJoint__SWIG_0(), true);
  }

  /**
   *  Convenience Joint like Constructor 
   */
  public EllipsoidJoint(String name, PhysicalFrame parent, PhysicalFrame child, Vec3 ellipsoidRadii) {
    this(opensimSimulationJNI.new_EllipsoidJoint__SWIG_1(name, PhysicalFrame.getCPtr(parent), parent, PhysicalFrame.getCPtr(child), child, Vec3.getCPtr(ellipsoidRadii), ellipsoidRadii), true);
  }

  /**
   *  Deprecated Joint Constructor
   */
  public EllipsoidJoint(String name, PhysicalFrame parent, Vec3 locationInParent, Vec3 orientationInParent, PhysicalFrame child, Vec3 locationInChild, Vec3 orientationInChild, Vec3 ellipsoidRadii) {
    this(opensimSimulationJNI.new_EllipsoidJoint__SWIG_2(name, PhysicalFrame.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, PhysicalFrame.getCPtr(child), child, Vec3.getCPtr(locationInChild), locationInChild, Vec3.getCPtr(orientationInChild), orientationInChild, Vec3.getCPtr(ellipsoidRadii), ellipsoidRadii), true);
  }

  public void setEllipsoidRadii(Vec3 radii) {
    opensimSimulationJNI.EllipsoidJoint_setEllipsoidRadii(swigCPtr, this, Vec3.getCPtr(radii), radii);
  }

  /**
   *  Convenience method to get a const reference to the Coordinate associated<br>
   *         with a single-degree-of-freedom Joint. If the Joint has more than one<br>
   *         Coordinate, you must use get_coordinates() or provide the appropriate<br>
   *         argument to the getCoordinate() method defined in the derived class. 
   */
  public Coordinate getCoordinate() {
    return new Coordinate(opensimSimulationJNI.EllipsoidJoint_getCoordinate__SWIG_0_0(swigCPtr, this), false);
  }

  /**
   *  Convenience method to get a writable reference to the Coordinate<br>
   *         associated with a single-degree-of-freedom Joint. If the Joint has more<br>
   *         than one Coordinate, you must use upd_coordinates() or provide the<br>
   *         appropriate argument to the updCoordinate() method defined in the<br>
   *         derived class. 
   */
  public Coordinate updCoordinate() {
    return new Coordinate(opensimSimulationJNI.EllipsoidJoint_updCoordinate__SWIG_0_0(swigCPtr, this), false);
  }

  /**
   *  Get a const reference to a Coordinate associated with this Joint.<br>
   *         @see Coord 
   */
  public Coordinate getCoordinate(EllipsoidJoint.Coord idx) {
    return new Coordinate(opensimSimulationJNI.EllipsoidJoint_getCoordinate__SWIG_1(swigCPtr, this, idx.swigValue()), false);
  }

  /**
   *  Get a writable reference to a Coordinate associated with this Joint.<br>
   *         @see Coord 
   */
  public Coordinate updCoordinate(EllipsoidJoint.Coord idx) {
    return new Coordinate(opensimSimulationJNI.EllipsoidJoint_updCoordinate__SWIG_1(swigCPtr, this, idx.swigValue()), false);
  }

  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.EllipsoidJoint_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

  /**
   *  Indices of Coordinates for use as arguments to getCoordinate() and<br>
   *         updCoordinate().<br>
   * <br>
   *         <b>C++ example</b><br>
   *         {@code 
          const auto& rx = myEllipsoidJoint.
                           getCoordinate(EllipsoidJoint::Coord::Rotation1X);
          }<br>
   * <br>
   *         <b>Python example</b><br>
   *         {@code 
          import opensim
          rx = myEllipsoidJoint.getCoordinate(opensim.EllipsoidJoint.Coord_Rotation1X)
          }<br>
   * <br>
   *         <b>Java example</b><br>
   *         {@code 
          rx = myEllipsoidJoint.getCoordinate(EllipsoidJoint.Coord.Rotation1X);
          }<br>
   * <br>
   *         <b>MATLAB example</b><br>
   *         {@code 
          rx = myEllipsoidJoint.get_coordinates(0);
          }
   */
  public final static class Coord {
    /**
     *  0
     */
    public final static EllipsoidJoint.Coord Rotation1X = new EllipsoidJoint.Coord("Rotation1X", opensimSimulationJNI.EllipsoidJoint_Coord_Rotation1X_get());
    /**
     *  1
     */
    public final static EllipsoidJoint.Coord Rotation2Y = new EllipsoidJoint.Coord("Rotation2Y", opensimSimulationJNI.EllipsoidJoint_Coord_Rotation2Y_get());
    /**
     *  2
     */
    public final static EllipsoidJoint.Coord Rotation3Z = new EllipsoidJoint.Coord("Rotation3Z", opensimSimulationJNI.EllipsoidJoint_Coord_Rotation3Z_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Coord swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Coord.class + " with value " + swigValue);
    }

    private Coord(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Coord(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Coord(String swigName, Coord swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Coord[] swigValues = { Rotation1X, Rotation2Y, Rotation3Z };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}