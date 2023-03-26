/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This goal requires the average speed of the system to match a desired<br>
 * average speed. The average speed of the system is the displacement of the<br>
 * system's center of mass divided by the duration of the phase.<br>
 * <br>
 * In endpoint constraint mode, the goal is computed as follows:<br>
 * <br>
 *  
 v_\mathrm{des} - \frac{r_\mathrm{com}(t_f) - r_\mathrm{com}(t_i)}{t_f - t_i}
<br>
 * <br>
 * We use the following notation:<br>
 * -   v_\mathrm{des} : desired average speed.<br>
 * -   r_\mathrm{com}(t) : mass center position.<br>
 * -   t_i : initial time.<br>
 * -   t_f : final time.<br>
 * <br>
 * In cost mode, the value of the goal is the above quantity squared.<br>
 * 
 */
public class MocoAverageSpeedGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoAverageSpeedGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoAverageSpeedGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoAverageSpeedGoal obj) {
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
        opensimMocoJNI.delete_MocoAverageSpeedGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoAverageSpeedGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoAverageSpeedGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoAverageSpeedGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoAverageSpeedGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoAverageSpeedGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoAverageSpeedGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoAverageSpeedGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoAverageSpeedGoal_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_desired_average_speed(MocoAverageSpeedGoal source) {
    opensimMocoJNI.MocoAverageSpeedGoal_copyProperty_desired_average_speed(swigCPtr, this, MocoAverageSpeedGoal.getCPtr(source), source);
  }

  public double get_desired_average_speed(int i) {
    return opensimMocoJNI.MocoAverageSpeedGoal_get_desired_average_speed__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_desired_average_speed(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoAverageSpeedGoal_upd_desired_average_speed__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_desired_average_speed(int i, double value) {
    opensimMocoJNI.MocoAverageSpeedGoal_set_desired_average_speed__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_desired_average_speed(double value) {
    return opensimMocoJNI.MocoAverageSpeedGoal_append_desired_average_speed(swigCPtr, this, value);
  }

  public void constructProperty_desired_average_speed(double initValue) {
    opensimMocoJNI.MocoAverageSpeedGoal_constructProperty_desired_average_speed(swigCPtr, this, initValue);
  }

  public double get_desired_average_speed() {
    return opensimMocoJNI.MocoAverageSpeedGoal_get_desired_average_speed__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_desired_average_speed() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoAverageSpeedGoal_upd_desired_average_speed__SWIG_1(swigCPtr, this), false);
  }

  public void set_desired_average_speed(double value) {
    opensimMocoJNI.MocoAverageSpeedGoal_set_desired_average_speed__SWIG_1(swigCPtr, this, value);
  }

  public MocoAverageSpeedGoal() {
    this(opensimMocoJNI.new_MocoAverageSpeedGoal__SWIG_0(), true);
  }

  public MocoAverageSpeedGoal(String name) {
    this(opensimMocoJNI.new_MocoAverageSpeedGoal__SWIG_1(name), true);
  }

}