/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class that represents a control in a dynamic simulation.<br>
 * <br>
 * This class is intended to be the base class for different types of controls,<br>
 * so many of its methods are virtual.<br>
 * <br>
 * In general, a control consists of a set of parameters.  These parameters<br>
 * are used to reconstruct a control curve.  For example, a control may be<br>
 * represented by a constant, a series of step functions, a set of linearly<br>
 * interpolated values, a set of spline control points, coefficients in<br>
 * a Fourier series, etc.<br>
 * <br>
 * Because there is not necessarily a 1-to-1 correspondence between the<br>
 * parameters used to represent a control curve and the value of the<br>
 * control curve, there are two basic ways to access the content of a control:<br>
 * getParameter() gets the value of a parameter, and getValue() gets the<br>
 * value at a particular time.<br>
 * <br>
 * A distinction is also made between controls that control a model and<br>
 * controls that control some other aspect of a simulation.  For example,<br>
 * a control for the excitation level of a muscle is a "model"<br>
 * control.  The value of this type of control is queried during the<br>
 * course of a simulation.  On the other hand, a control for<br>
 * the final time of a simulation is not usually a "model" control.<br>
 * Nor is a control for the initial value of a state variable, even if that<br>
 * state variable is the initial value of a muscle activation.  These<br>
 * "non-model" controls are used to set things before a simulation ever<br>
 * begins and are not queried during the course of a simulation.  The<br>
 * number of model controls can be queried by a call to<br>
 * Model::getNumControls().<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class Control extends OpenSimObject {
  private transient long swigCPtr;

  public Control(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Control_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Control obj) {
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
        opensimSimulationJNI.delete_Control(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Control safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Control_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Control(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Control_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Control_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Control_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Control(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Control_getConcreteClassName(swigCPtr, this);
  }

  /**
   * Sets whether or not this control is a model control.  A model control is<br>
   * a control that is expected by a model. Controls that are not model<br>
   * controls may be, for example, controls that are used to set up a<br>
   * simulation.  Such examples might include an initial state of a model<br>
   * (e.g., joint angle, joint angular velocity, ...) or the final time of<br>
   * a simulation.<br>
   * <br>
   * @param aTrueFalse If true, the control is treated as a model control.<br>
   * If false, the control is not treated as a model control.
   */
  public void setIsModelControl(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setIsModelControl(swigCPtr, this, aTrueFalse);
  }

  /**
   *  @see setIsModelControl()
   */
  public boolean getIsModelControl() {
    return opensimSimulationJNI.Control_getIsModelControl(swigCPtr, this);
  }

  /**
   * Sets whether or not to extrapolate for control curve evaluations that<br>
   * are outside the region of confidence for a control.<br>
   * <br>
   * @param aTrueFalse If true, extrapolate when needed and possible to<br>
   * determine the value of the control curve.
   */
  public void setExtrapolate(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setExtrapolate(swigCPtr, this, aTrueFalse);
  }

  /**
   *  @see setExtrapolate()
   */
  public boolean getExtrapolate() {
    return opensimSimulationJNI.Control_getExtrapolate(swigCPtr, this);
  }

  /**
   * Sets whether or not to apply a PD (proportional-derivative)<br>
   * filter to the control values.<br>
   * <br>
   * @param aTrueFalse If true, will apply a filter to the control<br>
   * values.  If false, a filter will not be used.
   */
  public void setFilterOn(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setFilterOn(swigCPtr, this, aTrueFalse);
  }

  /**
   *  @see setFilterOn()
   */
  public boolean getFilterOn() {
    return opensimSimulationJNI.Control_getFilterOn(swigCPtr, this);
  }

  /**
   * Returns the number of parameters that are used to specify the<br>
   * control curve.
   */
  public int getNumParameters() {
    return opensimSimulationJNI.Control_getNumParameters(swigCPtr, this);
  }

  /**
   * Sets the default minimum value of a control parameter.<br>
   * The default minimum is used when no minimum value is specified.<br>
   * <br>
   * @param aMin Minimum value.
   */
  public void setDefaultParameterMin(double aMin) {
    opensimSimulationJNI.Control_setDefaultParameterMin(swigCPtr, this, aMin);
  }

  /**
   *  @see setDefaultParameterMin()
   */
  public double getDefaultParameterMin() {
    return opensimSimulationJNI.Control_getDefaultParameterMin(swigCPtr, this);
  }

  /**
   * Sets the default maximum value of a control parameter.<br>
   * The default maximum is used when no maximum value is specified.<br>
   * <br>
   * @param aMax Maximum value.
   */
  public void setDefaultParameterMax(double aMax) {
    opensimSimulationJNI.Control_setDefaultParameterMax(swigCPtr, this, aMax);
  }

  /**
   *  @see setDefaultParameterMax()
   */
  public double getDefaultParameterMax() {
    return opensimSimulationJNI.Control_getDefaultParameterMax(swigCPtr, this);
  }

  /**
   * Sets the minimum value that a control parameter  can take on.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @param aMin Minimum value the parameter can have.<br>
   * @throws Exception if aI is invalid.
   */
  public void setParameterMin(int aI, double aMin) {
    opensimSimulationJNI.Control_setParameterMin(swigCPtr, this, aI, aMin);
  }

  /**
   * @see setParameterMin()<br>
   * @param aI Index of the parameter for which the minimum value is desired.<br>
   * @throws Exception if aI is invalid.
   */
  public double getParameterMin(int aI) {
    return opensimSimulationJNI.Control_getParameterMin(swigCPtr, this, aI);
  }

  /**
   * %Set the maximum value that a control parameter can take on.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @param aMax Maximum value the parameter can have.<br>
   * @throws Exception if aI is invalid.
   */
  public void setParameterMax(int aI, double aMax) {
    opensimSimulationJNI.Control_setParameterMax(swigCPtr, this, aI, aMax);
  }

  /**
   * @see setParameterMax()<br>
   * @param aI Index of the parameter.<br>
   * @throws Exception if aI is invalid.
   */
  public double getParameterMax(int aI) {
    return opensimSimulationJNI.Control_getParameterMax(swigCPtr, this, aI);
  }

  /**
   * Gets the time at which a parameter is specified.<br>
   * <br>
   * Parameters for some types of control curves do not have a time at which<br>
   * they are specified.  For example, in a Fourier series the control<br>
   * parameters are the coefficients in the expansion, and each term in<br>
   * the expansion corresponds not to a specific time but to a frequency.<br>
   * Another example is a constant that has the same value for all times.<br>
   * In these cases, this method returns SimTK::NaN.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @throws Exception if aI is invalid.
   */
  public double getParameterTime(int aI) {
    return opensimSimulationJNI.Control_getParameterTime(swigCPtr, this, aI);
  }

  /**
   * Gets the time neighborhood (i.e., the lower and upper bounds of time)<br>
   * in which a control parameter affects the value of the control curve.<br>
   * <br>
   * Changes in the specified parameter are guaranteed not to change the value<br>
   * of the control curve below the lower bound time or above the upper bound<br>
   * time.  If a parameter influences the value of the control curve for all<br>
   * times, -%SimTK::Infinity and %SimTK::Infinity are returned for<br>
   * the upper and lower bound times, respectively.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @param rTLower Time below which the curve is not affected by the<br>
   * specified parameter.<br>
   * @param rTUpper Time above which the curve is not affected by the<br>
   * specified parameter.<br>
   * @throws Exception if aI is invalid.
   */
  public void getParameterNeighborhood(int aI, SWIGTYPE_p_double rTLower, SWIGTYPE_p_double rTUpper) {
    opensimSimulationJNI.Control_getParameterNeighborhood(swigCPtr, this, aI, SWIGTYPE_p_double.getCPtr(rTLower), SWIGTYPE_p_double.getCPtr(rTUpper));
  }

  /**
   * Gets the list of parameters that affect the control curve at a<br>
   * specified time.<br>
   * <br>
   * @param aT Time in question.<br>
   * @param rList The returned list of parameters.<br>
   * @return Length of rList.
   */
  public int getParameterList(double aT, ArrayInt rList) {
    return opensimSimulationJNI.Control_getParameterList__SWIG_0(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  /**
   * Gets the list of parameters that affect the control curve between two<br>
   * specified times and that do NOT affect the control curve below the lower<br>
   * of these two times.<br>
   * <br>
   * This method is useful when solving for a set of controls for a dynamic<br>
   * simulation.  When solving for a set of controls, one always wants to<br>
   * go forward in time.  Therefore, one does not want to change control<br>
   * parameters that affect the control curve at past times.<br>
   * <br>
   * A control parameter is included in the list only if it affects<br>
   * the control curve in the specified time interval AND does NOT<br>
   * affect the control curve below the lower bound of the<br>
   * specified time interval.  So, it is possible that some of the<br>
   * parameters on the returned list could affect the control curve at<br>
   * times greater than the upper bound of the specified time interval.<br>
   * <br>
   * @param aTLower Lower time bound.<br>
   * @param aTUpper Upper time bound.<br>
   * @param rList List of indices of the control parameters that<br>
   * affect the curve between aTLower and aTUpper but not before aTLower.<br>
   * @return Length of rList.
   */
  public int getParameterList(double aTLower, double aTUpper, ArrayInt rList) {
    return opensimSimulationJNI.Control_getParameterList__SWIG_1(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList);
  }

  /**
   *  @see setParameterValue()
   */
  public double getParameterValue(int aI) {
    return opensimSimulationJNI.Control_getParameterValue(swigCPtr, this, aI);
  }

  /**
   * Sets the value of a control parameter.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @param aX Value of the parameter. Meaning depends on the subclass.<br>
   * @throws Exception if aI is invalid.
   */
  public void setParameterValue(int aI, double aX) {
    opensimSimulationJNI.Control_setParameterValue(swigCPtr, this, aI, aX);
  }

  /**
   * Gets the value of this control at time aT.<br>
   * If the value of the curve is not defined,<br>
   * SimTK::NaN is returned.  If the control is set to extrapolate,<br>
   * (see getExtrapolate()), and the time is before that of the first node or<br>
   * after that of the last node, then an extrapolation is performed to<br>
   * determine the value of the control curve.  Otherwise, the value of<br>
   * either the first control node or last control node is returned.<br>
   * <br>
   * @param aT Time at which to get the control.
   */
  public double getControlValue(double aT) {
    return opensimSimulationJNI.Control_getControlValue__SWIG_0(swigCPtr, this, aT);
  }

  /**
   * Gets the value of this control at time aT.<br>
   * If the value of the curve is not defined,<br>
   * SimTK::NaN is returned.  If the control is set to extrapolate,<br>
   * (see getExtrapolate()), and the time is before that of the first node or<br>
   * after that of the last node, then an extrapolation is performed to<br>
   * determine the value of the control curve.  Otherwise, the value of<br>
   * either the first control node or last control node is returned.<br>
   * <br>
   * 
   */
  public double getControlValue() {
    return opensimSimulationJNI.Control_getControlValue__SWIG_1(swigCPtr, this);
  }

  /**
   * Sets the value of this control curve at time aT.<br>
   * <br>
   * @param aT Time at which to set the control.<br>
   * @param aX Control value.
   */
  public void setControlValue(double aT, double aX) {
    opensimSimulationJNI.Control_setControlValue(swigCPtr, this, aT, aX);
  }

  /**
   * Gets the minimum allowed value of this control at time aT.<br>
   * <br>
   * @param aT Time at which to get the control.<br>
   * @return Minimum allowed control value.  If the value of the curve<br>
   * is not defined,<br>
   * _defaultMin is returned.  If the control is set to extrapolate,<br>
   * (see getExtraplate()), and the time is before the first node or<br>
   * after the last node, then an extrapolation is performed to determine<br>
   * the value of the control curve.  Otherwise, the value of either the<br>
   * first control node or last control node is returned.
   */
  public double getControlValueMin(double aT) {
    return opensimSimulationJNI.Control_getControlValueMin__SWIG_0(swigCPtr, this, aT);
  }

  /**
   * Gets the minimum allowed value of this control at time aT.<br>
   * <br>
   * <br>
   * @return Minimum allowed control value.  If the value of the curve<br>
   * is not defined,<br>
   * _defaultMin is returned.  If the control is set to extrapolate,<br>
   * (see getExtraplate()), and the time is before the first node or<br>
   * after the last node, then an extrapolation is performed to determine<br>
   * the value of the control curve.  Otherwise, the value of either the<br>
   * first control node or last control node is returned.
   */
  public double getControlValueMin() {
    return opensimSimulationJNI.Control_getControlValueMin__SWIG_1(swigCPtr, this);
  }

  /**
   * Sets the minimum value of this control curve at time aT.<br>
   * <br>
   * @param aT Time at which to set the control.<br>
   * @param aMin Minimum allowed control value at time aT.
   */
  public void setControlValueMin(double aT, double aMin) {
    opensimSimulationJNI.Control_setControlValueMin(swigCPtr, this, aT, aMin);
  }

  /**
   * Gets the maximum allowed value of this control at time aT.<br>
   * <br>
   * @param aT Time at which to get the control.<br>
   * @return Maximum allowed control value.  If the value of the curve is not defined,<br>
   * _defaultMax is returned.  If the control is set to extrapolate,<br>
   * getExtraplate, and the time is before the first node or<br>
   * after the last node, then an extrapolation is performed to determine<br>
   * the value of the control curve.  Otherwise, the value of either the<br>
   * first control node or last control node is returned.
   */
  public double getControlValueMax(double aT) {
    return opensimSimulationJNI.Control_getControlValueMax__SWIG_0(swigCPtr, this, aT);
  }

  /**
   * Gets the maximum allowed value of this control at time aT.<br>
   * <br>
   * <br>
   * @return Maximum allowed control value.  If the value of the curve is not defined,<br>
   * _defaultMax is returned.  If the control is set to extrapolate,<br>
   * getExtraplate, and the time is before the first node or<br>
   * after the last node, then an extrapolation is performed to determine<br>
   * the value of the control curve.  Otherwise, the value of either the<br>
   * first control node or last control node is returned.
   */
  public double getControlValueMax() {
    return opensimSimulationJNI.Control_getControlValueMax__SWIG_1(swigCPtr, this);
  }

  /**
   * Sets the maximum value of this control curve at time aT.<br>
   * <br>
   * @param aT Time at which to set the control.<br>
   * @param aMax Maximum allowed control value.
   */
  public void setControlValueMax(double aT, double aMax) {
    opensimSimulationJNI.Control_setControlValueMax(swigCPtr, this, aT, aMax);
  }

  /**
   * Gets the first time for which a parameter is specified. Should be<br>
   * overridden by derived classes that have a defined min time.<br>
   * <br>
   * @return 0.
   */
  public double getFirstTime() {
    return opensimSimulationJNI.Control_getFirstTime(swigCPtr, this);
  }

  /**
   * Gets the last time for which a parameter is specified. Should be overridden<br>
   * by derived classes that have a defined max time.<br>
   * <br>
   * @return 0.
   */
  public double getLastTime() {
    return opensimSimulationJNI.Control_getLastTime(swigCPtr, this);
  }

  /**
   * Simplify the control (e.g., reduce the number of points in the control<br>
   * curve) based on a set of specified properties.  Each implementation<br>
   * is free to require whatever properties are needed to perform<br>
   * the simplification.  Refer to the documentation in derived classes<br>
   * to see what properties are required.<br>
   * <br>
   * @param aProperties PropertySet used to perform the simplify<br>
   * operation.<br>
   * @throws Exception This method does nothing.  It must be overridden<br>
   * in derived classes.
   */
  public void simplify(SWIGTYPE_p_PropertySet aProperties) {
    opensimSimulationJNI.Control_simplify(swigCPtr, this, SWIGTYPE_p_PropertySet.getCPtr(aProperties));
  }

  /**
   * Filter the control curve at a particular time.<br>
   * <br>
   * @param aT Time at which to compute a new, filtered control value
   */
  public void filter(double aT) {
    opensimSimulationJNI.Control_filter(swigCPtr, this, aT);
  }

}