/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class to perform an Induced Accelerations analysis using a constraint-<br>
 * method of replacing external (contact) forces in order to determine<br>
 * the contributions of actuators to external reaction forces and thus<br>
 * model accelerations including that of the center-of-mass.<br>
 * The analysis reports the contributions of all forces to user identified<br>
 * accelerations of coordinates, bodies and/or center-of-mass. <br>
 * <br>
 * Induced Accelerations can apply any OpenSim::Constraint that implements<br>
 * setContactPointForInducedAccelerations() to replace external forces, which<br>
 * are precisely the same external forces (ExternalLoads file) applied<br>
 * during the forward dynamics simulation being analyzed.<br>
 * <br>
 * The ConstraintSet supplied must have the same number constraints as<br>
 * external forces AND apply to the same bodies with respect to ground.<br>
 * <br>
 * @author Ajay Seth
 */
public class InducedAccelerations extends Analysis {
  private transient long swigCPtr;

  public InducedAccelerations(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.InducedAccelerations_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InducedAccelerations obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_InducedAccelerations(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InducedAccelerations safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InducedAccelerations_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InducedAccelerations(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.InducedAccelerations_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InducedAccelerations_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InducedAccelerations(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_getConcreteClassName(swigCPtr, this);
  }

  /**
   * Construct an InducedAccelerations instance with a Model.<br>
   * <br>
   * @param aModel Model for which the analysis is to be run.
   */
  public InducedAccelerations(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_InducedAccelerations__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  /**
   * Construct an InducedAccelerations instance with a Model.<br>
   * <br>
   * 
   */
  public InducedAccelerations() {
    this(opensimActuatorsAnalysesToolsJNI.new_InducedAccelerations__SWIG_1(), true);
  }

  /**
   * Construct InducedAccelerations from file.<br>
   * <br>
   * @param aFileName File name of the document.
   */
  public InducedAccelerations(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_InducedAccelerations__SWIG_2(aFileName), true);
  }

  /**
   * Copy constructor.
   */
  public InducedAccelerations(InducedAccelerations aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_InducedAccelerations__SWIG_3(InducedAccelerations.getCPtr(aObject), aObject), true);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.InducedAccelerations_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void initialize(State s) {
    opensimActuatorsAnalysesToolsJNI.InducedAccelerations_initialize(swigCPtr, this, State.getCPtr(s), s);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int stepNumber) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_step(swigCPtr, this, State.getCPtr(s), s, stepNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.InducedAccelerations_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

  public void addContactConstraintFromExternalForce(ExternalForce externalForce) {
    opensimActuatorsAnalysesToolsJNI.InducedAccelerations_addContactConstraintFromExternalForce(swigCPtr, this, ExternalForce.getCPtr(externalForce), externalForce);
  }

  public ArrayBool applyContactConstraintAccordingToExternalForces(State s) {
    return new ArrayBool(opensimActuatorsAnalysesToolsJNI.InducedAccelerations_applyContactConstraintAccordingToExternalForces(swigCPtr, this, State.getCPtr(s), s), true);
  }

}
