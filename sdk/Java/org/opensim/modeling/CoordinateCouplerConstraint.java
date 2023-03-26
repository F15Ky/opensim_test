/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateCouplerConstraint extends Constraint {
  private transient long swigCPtr;

  public CoordinateCouplerConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.CoordinateCouplerConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateCouplerConstraint obj) {
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
        opensimSimulationJNI.delete_CoordinateCouplerConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateCouplerConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.CoordinateCouplerConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateCouplerConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.CoordinateCouplerConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.CoordinateCouplerConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.CoordinateCouplerConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateCouplerConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.CoordinateCouplerConstraint_getConcreteClassName(swigCPtr, this);
  }

  public CoordinateCouplerConstraint() {
    this(opensimSimulationJNI.new_CoordinateCouplerConstraint(), true);
  }

  /**
   *  Access the list of names of the right hand side (independent) coordinates. <br>
   *         Note the constraint function, must be able to handle multiple <br>
   *         coordinate values if more than one coordinate name is provided. 
   */
  public void setIndependentCoordinateNames(ArrayStr aCoordNames) {
    opensimSimulationJNI.CoordinateCouplerConstraint_setIndependentCoordinateNames(swigCPtr, this, ArrayStr.getCPtr(aCoordNames), aCoordNames);
  }

  public ArrayStr getIndependentCoordinateNames() {
    return new ArrayStr(opensimSimulationJNI.CoordinateCouplerConstraint_getIndependentCoordinateNames(swigCPtr, this), true);
  }

  public void setDependentCoordinateName(String aCoordName) {
    opensimSimulationJNI.CoordinateCouplerConstraint_setDependentCoordinateName(swigCPtr, this, aCoordName);
  }

  public String getDependentCoordinateName() {
    return opensimSimulationJNI.CoordinateCouplerConstraint_getDependentCoordinateName(swigCPtr, this);
  }

  public Function getFunction() {
    return new Function(opensimSimulationJNI.CoordinateCouplerConstraint_getFunction(swigCPtr, this), false);
  }

  public void setFunction(Function aFunction) {
    opensimSimulationJNI.CoordinateCouplerConstraint_setFunction__SWIG_0(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  /**
   *  Scale the CoordinateCouplerConstraint using the scale factors assigned<br>
   *         to the Body associated with the CoordinateCouplerConstraint's dependent<br>
   *         coordinate. Scaling is performed only if the dependent coordinate is a<br>
   *         translation. 
   */
  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.CoordinateCouplerConstraint_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}