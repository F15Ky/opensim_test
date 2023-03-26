/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * Solve for the generalized coordinate forces (1 per degree-of-<br>
 * freedom) that satisfy the unconstrained equations of motion given kinematics:<br>
 * q, u, u_dot<br>
 * <br>
 * The InverseDynamics equation: Tau = M*u_dot-G(q)-C(q,u)-A(q,u,t,x)<br>
 * <br>
 * The InverseDynamicsSolver utilizes efficient methods in Simbody(TM) to<br>
 * compute the generalized forces, Tau, without explicitly forming the Mass<br>
 * matrix, M. System gravity, G, centrifugal and Coriolis, C, forces are <br>
 * computed internally.<br>
 * Caller provides q,u,t (supplied by the State), the desired u_dot and the <br>
 * applied loads, A. If applied loads are due to forces in the model, these <br>
 * loads are automatically computed and applied unless explicitly disabled in<br>
 * the model.<br>
 * <br>
 * @author Ajay Seth<br>
 * @version 1.0
 */
public class InverseDynamicsSolver extends Solver {
  private transient long swigCPtr;

  public InverseDynamicsSolver(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.InverseDynamicsSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseDynamicsSolver obj) {
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
        opensimSimulationJNI.delete_InverseDynamicsSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseDynamicsSolver safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.InverseDynamicsSolver_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseDynamicsSolver(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.InverseDynamicsSolver_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.InverseDynamicsSolver_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.InverseDynamicsSolver_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseDynamicsSolver(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.InverseDynamicsSolver_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Construct an InverseDynamics solver applied to the provided model 
   */
  public InverseDynamicsSolver(Model model) {
    this(opensimSimulationJNI.new_InverseDynamicsSolver(Model.getCPtr(model), model), true);
  }

  /**
   *  Solve the inverse dynamics system of equations for generalized <br>
   *         coordinate forces, Tau. Applied loads are computed by the model  <br>
   *         according to the state.<br>
   *         @param s    the system state specifying time, coordinates and speeds<br>
   *         @param udot the vector of generalized accelerations in the order
   */
  public Vector solve(State s, Vector udot) {
    return new Vector(opensimSimulationJNI.InverseDynamicsSolver_solve__SWIG_0(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(udot), udot), true);
  }

  /**
   *  Solve the inverse dynamics system of equations for generalized <br>
   *         coordinate forces, Tau. Applied loads are computed by the model  <br>
   *         according to the state.<br>
   *         @param s    the system state specifying time, coordinates and speeds<br>
   *         
   */
  public Vector solve(State s) {
    return new Vector(opensimSimulationJNI.InverseDynamicsSolver_solve__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

  /**
   *  Solve the inverse dynamics system of equations for generalized coordinate forces, Tau. <br>
   *         Applied loads are explicitly provided as generalized coordinate forces (MobilityForces)<br>
   *         and/or a Vector of Spatial-body forces 
   */
  public Vector solve(State s, Vector udot, Vector appliedMobilityForces, VectorOfSpatialVec appliedBodyForces) {
    return new Vector(opensimSimulationJNI.InverseDynamicsSolver_solve__SWIG_2(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(udot), udot, Vector.getCPtr(appliedMobilityForces), appliedMobilityForces, VectorOfSpatialVec.getCPtr(appliedBodyForces), appliedBodyForces), true);
  }

  /**
   *  Solve the inverse dynamics system of equations for generalized coordinate <br>
   *         forces, Tau. Now the state is updated from known coordinates, q, as <br>
   *         functions of time. Coordinate functions must be twice differentiable and <br>
   *         are used to supply the coordinate speed and acceleration. Coordinate<br>
   *         functions must be in the same order as the order of q's, u's, and udot's<br>
   *         in the provided SimTK::State.<br>
   *         NOTE: forces with internal states should be removed/disabled prior to  <br>
   *               solving if default state is inappropriate 
   */
  public Vector solve(State s, FunctionSet Qs, double time) {
    return new Vector(opensimSimulationJNI.InverseDynamicsSolver_solve__SWIG_3(swigCPtr, this, State.getCPtr(s), s, FunctionSet.getCPtr(Qs), Qs, time), true);
  }

  /**
   *  This is the same as above, but can be used when qdot != u. This adds an<br>
   *         extra vector, coordinatesToSpeedsIndexMap, which is the length of number of u's in<br>
   *         the SimTK::State, and whose i'th index is the index of the FunctionSet<br>
   *         Qs from which each 'u' and 'udot' will be calculated. 
   */
  public Vector solve(State s, FunctionSet Qs, StdVectorInt coordinatesToSpeedsIndexMap, double time) {
    return new Vector(opensimSimulationJNI.InverseDynamicsSolver_solve__SWIG_4(swigCPtr, this, State.getCPtr(s), s, FunctionSet.getCPtr(Qs), Qs, StdVectorInt.getCPtr(coordinatesToSpeedsIndexMap), coordinatesToSpeedsIndexMap, time), true);
  }

}