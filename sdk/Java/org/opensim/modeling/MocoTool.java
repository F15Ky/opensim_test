/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a base class for solving problems that depend on an observed motion<br>
 * using Moco's optimal control methods.<br>
 * MocoTool Properties<br>
 * ===================<br>
 * Mesh interval<br>
 * -------------<br>
 * A smaller mesh interval increases the convergence time, but is necessary<br>
 * for fast motions or problems with stiff differential equations (e.g.,<br>
 * stiff tendons).<br>
 * For gait, consider using a mesh interval between 0.01 and 0.05 seconds.<br>
 * Try solving your problem with decreasing mesh intervals and choose a mesh<br>
 * interval at which the solution stops changing noticeably.<br>
 * <br>
 * Reserve actuators<br>
 * -----------------<br>
 * Sometimes it is not possible to achieve the desired motion using<br>
 * muscles alone. There are multiple possible causes for this:<br>
 *   - the muscles are not strong enough to achieve the required<br>
 *     net joint moments,<br>
 *   - the net joint moments change more rapidly than activation and<br>
 *     deactivation time constants allow,<br>
 *   - the filtering of the data causes unrealistic desired net joint moments.<br>
 * You may want to add "reserve" actuators to your model.<br>
 * This can be done with the ModOpAddReserves model operator. 
 */
public class MocoTool extends OpenSimObject {
  private transient long swigCPtr;

  public MocoTool(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoTool obj) {
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
        opensimMocoJNI.delete_MocoTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoTool_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_initial_time(MocoTool source) {
    opensimMocoJNI.MocoTool_copyProperty_initial_time(swigCPtr, this, MocoTool.getCPtr(source), source);
  }

  public double get_initial_time(int i) {
    return opensimMocoJNI.MocoTool_get_initial_time__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_initial_time(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_initial_time__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_initial_time(int i, double value) {
    opensimMocoJNI.MocoTool_set_initial_time__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_initial_time(double value) {
    return opensimMocoJNI.MocoTool_append_initial_time(swigCPtr, this, value);
  }

  public void constructProperty_initial_time() {
    opensimMocoJNI.MocoTool_constructProperty_initial_time__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_initial_time(double initValue) {
    opensimMocoJNI.MocoTool_constructProperty_initial_time__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_initial_time() {
    return opensimMocoJNI.MocoTool_get_initial_time__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_initial_time() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_initial_time__SWIG_1(swigCPtr, this), false);
  }

  public void set_initial_time(double value) {
    opensimMocoJNI.MocoTool_set_initial_time__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_final_time(MocoTool source) {
    opensimMocoJNI.MocoTool_copyProperty_final_time(swigCPtr, this, MocoTool.getCPtr(source), source);
  }

  public double get_final_time(int i) {
    return opensimMocoJNI.MocoTool_get_final_time__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_final_time(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_final_time__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_final_time(int i, double value) {
    opensimMocoJNI.MocoTool_set_final_time__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_final_time(double value) {
    return opensimMocoJNI.MocoTool_append_final_time(swigCPtr, this, value);
  }

  public void constructProperty_final_time() {
    opensimMocoJNI.MocoTool_constructProperty_final_time__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_final_time(double initValue) {
    opensimMocoJNI.MocoTool_constructProperty_final_time__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_final_time() {
    return opensimMocoJNI.MocoTool_get_final_time__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_final_time() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_final_time__SWIG_1(swigCPtr, this), false);
  }

  public void set_final_time(double value) {
    opensimMocoJNI.MocoTool_set_final_time__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_mesh_interval(MocoTool source) {
    opensimMocoJNI.MocoTool_copyProperty_mesh_interval(swigCPtr, this, MocoTool.getCPtr(source), source);
  }

  public double get_mesh_interval(int i) {
    return opensimMocoJNI.MocoTool_get_mesh_interval__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_mesh_interval(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_mesh_interval__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_mesh_interval(int i, double value) {
    opensimMocoJNI.MocoTool_set_mesh_interval__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_mesh_interval(double value) {
    return opensimMocoJNI.MocoTool_append_mesh_interval(swigCPtr, this, value);
  }

  public void constructProperty_mesh_interval(double initValue) {
    opensimMocoJNI.MocoTool_constructProperty_mesh_interval(swigCPtr, this, initValue);
  }

  public double get_mesh_interval() {
    return opensimMocoJNI.MocoTool_get_mesh_interval__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_mesh_interval() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoTool_upd_mesh_interval__SWIG_1(swigCPtr, this), false);
  }

  public void set_mesh_interval(double value) {
    opensimMocoJNI.MocoTool_set_mesh_interval__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_clip_time_range(MocoTool source) {
    opensimMocoJNI.MocoTool_copyProperty_clip_time_range(swigCPtr, this, MocoTool.getCPtr(source), source);
  }

  public boolean get_clip_time_range(int i) {
    return opensimMocoJNI.MocoTool_get_clip_time_range__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_clip_time_range(int i) {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoTool_upd_clip_time_range__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_clip_time_range(int i, boolean value) {
    opensimMocoJNI.MocoTool_set_clip_time_range__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_clip_time_range(boolean value) {
    return opensimMocoJNI.MocoTool_append_clip_time_range(swigCPtr, this, value);
  }

  public void constructProperty_clip_time_range(boolean initValue) {
    opensimMocoJNI.MocoTool_constructProperty_clip_time_range(swigCPtr, this, initValue);
  }

  public boolean get_clip_time_range() {
    return opensimMocoJNI.MocoTool_get_clip_time_range__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_clip_time_range() {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoTool_upd_clip_time_range__SWIG_1(swigCPtr, this), false);
  }

  public void set_clip_time_range(boolean value) {
    opensimMocoJNI.MocoTool_set_clip_time_range__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_model(MocoTool source) {
    opensimMocoJNI.MocoTool_copyProperty_model(swigCPtr, this, MocoTool.getCPtr(source), source);
  }

  public ModelProcessor get_model(int i) {
    return new ModelProcessor(opensimMocoJNI.MocoTool_get_model__SWIG_0(swigCPtr, this, i), false);
  }

  public ModelProcessor upd_model(int i) {
    return new ModelProcessor(opensimMocoJNI.MocoTool_upd_model__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_model(int i, ModelProcessor value) {
    opensimMocoJNI.MocoTool_set_model__SWIG_0(swigCPtr, this, i, ModelProcessor.getCPtr(value), value);
  }

  public int append_model(ModelProcessor value) {
    return opensimMocoJNI.MocoTool_append_model(swigCPtr, this, ModelProcessor.getCPtr(value), value);
  }

  public void constructProperty_model(ModelProcessor initValue) {
    opensimMocoJNI.MocoTool_constructProperty_model(swigCPtr, this, ModelProcessor.getCPtr(initValue), initValue);
  }

  public ModelProcessor get_model() {
    return new ModelProcessor(opensimMocoJNI.MocoTool_get_model__SWIG_1(swigCPtr, this), false);
  }

  public ModelProcessor upd_model() {
    return new ModelProcessor(opensimMocoJNI.MocoTool_upd_model__SWIG_1(swigCPtr, this), false);
  }

  public void set_model(ModelProcessor value) {
    opensimMocoJNI.MocoTool_set_model__SWIG_1(swigCPtr, this, ModelProcessor.getCPtr(value), value);
  }

  public void setModel(ModelProcessor model) {
    opensimMocoJNI.MocoTool_setModel(swigCPtr, this, ModelProcessor.getCPtr(model), model);
  }

}