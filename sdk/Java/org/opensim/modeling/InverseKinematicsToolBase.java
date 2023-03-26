/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A Tool that performs an Inverse Kinematics analysis with a given model.<br>
 * Inverse kinematics is the solution of internal coordinates that poses<br>
 * the model such that the landmark locations (markers), or orientations of<br>
 * Sensor (IMUs) affixed to the model, minimize the weighted least-squares <br>
 * error with observations of markers in spatial coordinates, or Sensor <br>
 * (IMU) orientations. <br>
 * <br>
 * @author Ayman Habib<br>
 * @version 1.0
 */
public class InverseKinematicsToolBase extends Tool {
  private transient long swigCPtr;

  public InverseKinematicsToolBase(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseKinematicsToolBase obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_InverseKinematicsToolBase(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseKinematicsToolBase safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseKinematicsToolBase(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseKinematicsToolBase(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_model_file(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_model_file(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public String get_model_file(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_model_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_model_file(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_model_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_model_file(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_model_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_model_file(String value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_model_file(swigCPtr, this, value);
  }

  public void constructProperty_model_file(String initValue) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_constructProperty_model_file(swigCPtr, this, initValue);
  }

  public String get_model_file() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_model_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_model_file() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_model_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_model_file(String value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_model_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_constraint_weight(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_constraint_weight(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public double get_constraint_weight(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_constraint_weight__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_constraint_weight(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_constraint_weight__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_constraint_weight(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_constraint_weight__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_constraint_weight(double value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_constraint_weight(swigCPtr, this, value);
  }

  public void constructProperty_constraint_weight(double initValue) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_constructProperty_constraint_weight(swigCPtr, this, initValue);
  }

  public double get_constraint_weight() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_constraint_weight__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_constraint_weight() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_constraint_weight__SWIG_1(swigCPtr, this), false);
  }

  public void set_constraint_weight(double value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_constraint_weight__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_accuracy(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_accuracy(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public double get_accuracy(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_accuracy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_accuracy(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_accuracy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_accuracy(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_accuracy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_accuracy(double value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_accuracy(swigCPtr, this, value);
  }

  public void constructProperty_accuracy(double initValue) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_constructProperty_accuracy(swigCPtr, this, initValue);
  }

  public double get_accuracy() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_accuracy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_accuracy() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_accuracy__SWIG_1(swigCPtr, this), false);
  }

  public void set_accuracy(double value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_accuracy__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_time_range(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_time_range(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public double get_time_range(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_time_range(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_time_range(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_time_range(swigCPtr, this, i), false);
  }

  public void set_time_range(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_time_range(swigCPtr, this, i, value);
  }

  public int append_time_range(double value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_time_range(swigCPtr, this, value);
  }

  public void copyProperty_report_errors(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_report_errors(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public boolean get_report_errors(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_report_errors__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_errors(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_report_errors__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_errors(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_report_errors__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_errors(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_report_errors(swigCPtr, this, value);
  }

  public void constructProperty_report_errors(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_constructProperty_report_errors(swigCPtr, this, initValue);
  }

  public boolean get_report_errors() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_report_errors__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_errors() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_report_errors__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_errors(boolean value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_report_errors__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_output_motion_file(InverseKinematicsToolBase source) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_copyProperty_output_motion_file(swigCPtr, this, InverseKinematicsToolBase.getCPtr(source), source);
  }

  public String get_output_motion_file(int i) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_output_motion_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_output_motion_file(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_output_motion_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_output_motion_file(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_output_motion_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_output_motion_file(String value) {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_append_output_motion_file(swigCPtr, this, value);
  }

  public void constructProperty_output_motion_file(String initValue) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_constructProperty_output_motion_file(swigCPtr, this, initValue);
  }

  public String get_output_motion_file() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_get_output_motion_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_output_motion_file() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_upd_output_motion_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_output_motion_file(String value) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_set_output_motion_file__SWIG_1(swigCPtr, this, value);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStartTime(double d) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_setStartTime(swigCPtr, this, d);
  }

  public double getStartTime() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_getStartTime(swigCPtr, this);
  }

  public void setEndTime(double d) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_setEndTime(swigCPtr, this, d);
  }

  public double getEndTime() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_getEndTime(swigCPtr, this);
  }

  public void setOutputMotionFileName(String aOutputMotionFileName) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_setOutputMotionFileName(swigCPtr, this, aOutputMotionFileName);
  }

  public String getOutputMotionFileName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsToolBase_getOutputMotionFileName(swigCPtr, this);
  }

}