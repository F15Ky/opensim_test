/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a Mocap marker.<br>
 * <br>
 * @author Ayman Habib, Peter Loan<br>
 * @version 2.0
 */
public class Marker extends Station {
  private transient long swigCPtr;

  public Marker(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Marker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Marker obj) {
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
        opensimSimulationJNI.delete_Marker(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Marker safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Marker_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Marker(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Marker_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Marker_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Marker_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Marker(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Marker_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_fixed(Marker source) {
    opensimSimulationJNI.Marker_copyProperty_fixed(swigCPtr, this, Marker.getCPtr(source), source);
  }

  public boolean get_fixed(int i) {
    return opensimSimulationJNI.Marker_get_fixed__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_fixed(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Marker_upd_fixed__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_fixed(int i, boolean value) {
    opensimSimulationJNI.Marker_set_fixed__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_fixed(boolean value) {
    return opensimSimulationJNI.Marker_append_fixed(swigCPtr, this, value);
  }

  public void constructProperty_fixed(boolean initValue) {
    opensimSimulationJNI.Marker_constructProperty_fixed(swigCPtr, this, initValue);
  }

  public boolean get_fixed() {
    return opensimSimulationJNI.Marker_get_fixed__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_fixed() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Marker_upd_fixed__SWIG_1(swigCPtr, this), false);
  }

  public void set_fixed(boolean value) {
    opensimSimulationJNI.Marker_set_fixed__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor 
   */
  public Marker() {
    this(opensimSimulationJNI.new_Marker__SWIG_0(), true);
  }

  /**
   *  Convenience constructor<br>
   *     @param name      Marker name string.<br>
   *     @param frame     PhysicalFrame in which the Marker is located.<br>
   *     @param location  Vec3 location of the station in its PhysicalFrame 
   */
  public Marker(String name, PhysicalFrame frame, Vec3 location) {
    this(opensimSimulationJNI.new_Marker__SWIG_1(name, PhysicalFrame.getCPtr(frame), frame, Vec3.getCPtr(location), location), true);
  }

  /**
   *  Convenience method to get the 'parent_frame' Socket's connectee_name 
   */
  public String getParentFrameName() {
    return opensimSimulationJNI.Marker_getParentFrameName(swigCPtr, this);
  }

  /**
   *  Convenience method to set the 'parent_frame' Socket's connectee_name.<br>
   *         The the named parent frame is not connected and finalizeConnections()<br>
   *         must be invoked to establish the connection. 
   */
  public void setParentFrameName(String parentFrameName) {
    opensimSimulationJNI.Marker_setParentFrameName(swigCPtr, this, parentFrameName);
  }

  /**
   *  Change the parent PhysicalFrame that this marker is attached to. 
   */
  public void changeFrame(PhysicalFrame parentFrame) {
    opensimSimulationJNI.Marker_changeFrame(swigCPtr, this, PhysicalFrame.getCPtr(parentFrame), parentFrame);
  }

  /**
   *   Change the parent PhysicalFrame that this marker is attached to. In  <br>
   *          addition, preserve the marker location in the inertial (Ground) frame<br>
   *          by using the state to compute the location in the new parent frame and<br>
   *          to set its location property. 
   */
  public void changeFramePreserveLocation(State s, PhysicalFrame newParentFrame) {
    opensimSimulationJNI.Marker_changeFramePreserveLocation(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(newParentFrame), newParentFrame);
  }

  /**
   *  Override of the default implementation to account for versioning. 
   */
  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimSimulationJNI.Marker_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  /**
   *  Override of the default implementation to account for versioning. 
   */
  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimSimulationJNI.Marker_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.Marker_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
