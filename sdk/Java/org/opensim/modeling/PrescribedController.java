/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * PrescribedController is a concrete Controller that specifies functions that <br>
 * prescribe the control values of its actuators as a function of time.<br>
 * <br>
 * @author Ajay Seth
 */
public class PrescribedController extends Controller {
  private transient long swigCPtr;

  public PrescribedController(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PrescribedController_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PrescribedController obj) {
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
        opensimSimulationJNI.delete_PrescribedController(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public void prescribeControlForActuator(int index, Function prescribedFunction) {
       prescribedFunction.markAdopted();
       prescribeControlForActuator_private(index, prescribedFunction);
    }

    public void prescribeControlForActuator(String name, Function prescribedFunction) {
       prescribedFunction.markAdopted();
       prescribeControlForActuator_private(name, prescribedFunction);
    }

  public static PrescribedController safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PrescribedController_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PrescribedController(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PrescribedController_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PrescribedController_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PrescribedController_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PrescribedController(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PrescribedController_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  FunctionSet of prescribed controls associated with each actuator  
   */
  public void copyProperty_ControlFunctions(PrescribedController source) {
    opensimSimulationJNI.PrescribedController_copyProperty_ControlFunctions(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public FunctionSet get_ControlFunctions(int i) {
    return new FunctionSet(opensimSimulationJNI.PrescribedController_get_ControlFunctions__SWIG_0(swigCPtr, this, i), false);
  }

  public FunctionSet upd_ControlFunctions(int i) {
    return new FunctionSet(opensimSimulationJNI.PrescribedController_upd_ControlFunctions__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ControlFunctions(int i, FunctionSet value) {
    opensimSimulationJNI.PrescribedController_set_ControlFunctions__SWIG_0(swigCPtr, this, i, FunctionSet.getCPtr(value), value);
  }

  public int append_ControlFunctions(FunctionSet value) {
    return opensimSimulationJNI.PrescribedController_append_ControlFunctions(swigCPtr, this, FunctionSet.getCPtr(value), value);
  }

  public void constructProperty_ControlFunctions(FunctionSet initValue) {
    opensimSimulationJNI.PrescribedController_constructProperty_ControlFunctions(swigCPtr, this, FunctionSet.getCPtr(initValue), initValue);
  }

  public FunctionSet get_ControlFunctions() {
    return new FunctionSet(opensimSimulationJNI.PrescribedController_get_ControlFunctions__SWIG_1(swigCPtr, this), false);
  }

  public FunctionSet upd_ControlFunctions() {
    return new FunctionSet(opensimSimulationJNI.PrescribedController_upd_ControlFunctions__SWIG_1(swigCPtr, this), false);
  }

  public void set_ControlFunctions(FunctionSet value) {
    opensimSimulationJNI.PrescribedController_set_ControlFunctions__SWIG_1(swigCPtr, this, FunctionSet.getCPtr(value), value);
  }

  /**
   *  (Optional) prescribed controls from a storage file  
   */
  public void copyProperty_controls_file(PrescribedController source) {
    opensimSimulationJNI.PrescribedController_copyProperty_controls_file(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public String get_controls_file(int i) {
    return opensimSimulationJNI.PrescribedController_get_controls_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_controls_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PrescribedController_upd_controls_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_controls_file(int i, String value) {
    opensimSimulationJNI.PrescribedController_set_controls_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_controls_file(String value) {
    return opensimSimulationJNI.PrescribedController_append_controls_file(swigCPtr, this, value);
  }

  public void constructProperty_controls_file() {
    opensimSimulationJNI.PrescribedController_constructProperty_controls_file__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_controls_file(String initValue) {
    opensimSimulationJNI.PrescribedController_constructProperty_controls_file__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_controls_file() {
    return opensimSimulationJNI.PrescribedController_get_controls_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_controls_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PrescribedController_upd_controls_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_controls_file(String value) {
    opensimSimulationJNI.PrescribedController_set_controls_file__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  (Optional) interpolation method for controls in storage.  
   */
  public void copyProperty_interpolation_method(PrescribedController source) {
    opensimSimulationJNI.PrescribedController_copyProperty_interpolation_method(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public int get_interpolation_method(int i) {
    return opensimSimulationJNI.PrescribedController_get_interpolation_method__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_interpolation_method(int i) {
    return new SWIGTYPE_p_int(opensimSimulationJNI.PrescribedController_upd_interpolation_method__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_interpolation_method(int i, int value) {
    opensimSimulationJNI.PrescribedController_set_interpolation_method__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_interpolation_method(int value) {
    return opensimSimulationJNI.PrescribedController_append_interpolation_method(swigCPtr, this, value);
  }

  public void constructProperty_interpolation_method() {
    opensimSimulationJNI.PrescribedController_constructProperty_interpolation_method__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_interpolation_method(int initValue) {
    opensimSimulationJNI.PrescribedController_constructProperty_interpolation_method__SWIG_1(swigCPtr, this, initValue);
  }

  public int get_interpolation_method() {
    return opensimSimulationJNI.PrescribedController_get_interpolation_method__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_interpolation_method() {
    return new SWIGTYPE_p_int(opensimSimulationJNI.PrescribedController_upd_interpolation_method__SWIG_1(swigCPtr, this), false);
  }

  public void set_interpolation_method(int value) {
    opensimSimulationJNI.PrescribedController_set_interpolation_method__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor 
   */
  public PrescribedController() {
    this(opensimSimulationJNI.new_PrescribedController__SWIG_0(), true);
  }

  /**
   *  Convenience constructor get controls from file<br>
   * @param controlsFileName  string containing the controls storage (.sto) <br>
   * @param interpMethodType  int 0-constant, 1-linear, 3-cubic, 5-quintic<br>
   *                          defaults to linear.
   */
  public PrescribedController(String controlsFileName, int interpMethodType) {
    this(opensimSimulationJNI.new_PrescribedController__SWIG_1(controlsFileName, interpMethodType), true);
  }

  /**
   *  Convenience constructor get controls from file<br>
   * @param controlsFileName  string containing the controls storage (.sto) <br>
   * 
   */
  public PrescribedController(String controlsFileName) {
    this(opensimSimulationJNI.new_PrescribedController__SWIG_2(controlsFileName), true);
  }

  /**
   * Compute the control values for all actuators under the control of this<br>
   * Controller.<br>
   * <br>
   * @param s             system state <br>
   * @param controls      model controls  
   */
  public void computeControls(State s, Vector controls) {
    opensimSimulationJNI.PrescribedController_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

  /**
   *  Assign a prescribed control function for the desired actuator identified <br>
   *  by its index. Controller takes ownership of the function.<br>
   *  @param index                the actuator's index in the controller's set<br>
   *  @param prescribedFunction   the actuator's control function
   */
  public void prescribeControlForActuator_private(int index, Function prescribedFunction) {
    opensimSimulationJNI.PrescribedController_prescribeControlForActuator_private__SWIG_0(swigCPtr, this, index, Function.getCPtr(prescribedFunction), prescribedFunction);
  }

  /**
   *  Assign a prescribed control function for the desired actuator identified<br>
   *  by its name. Controller takes ownership of the function.<br>
   *  @param actName                the actuator's name in the controller's set<br>
   *  @param prescribedFunction     the actuator's control function
   */
  public void prescribeControlForActuator_private(String actName, Function prescribedFunction) {
    opensimSimulationJNI.PrescribedController_prescribeControlForActuator_private__SWIG_1(swigCPtr, this, actName, Function.getCPtr(prescribedFunction), prescribedFunction);
  }

}
