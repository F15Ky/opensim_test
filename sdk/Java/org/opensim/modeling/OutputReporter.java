/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * The OutputReporter Analysis is a wrapper for a TableReporter. It generates<br>
 * and writes TimeSeriesTables of Output values according to the names listed<br>
 * as properties of the Analysis. OutputReporter enables the AnalyzeTool to<br>
 * report on Outputs via the Analysis interface but backed by a TableReporter.<br>
 * The OutputReporter currently only supports Outputs of type: double, Vec3<br>
 * and SpatialVec. The OutputReporter will automatically write multiple files-<br>
 * a file for each supported Output type: <br>
 *   - `&lt;results-file-name&gt;.sto` (as doubles), <br>
 *   - `&lt;results-file-name&gt;Vec3.sto`, and<br>
 *   - `&lt;results-file-name&gt;SpatialVec.sto`.<br>
 * <br>
 * Output paths can be absolute (e.g., `/joint/slider/tx|value`) or relative<br>
 * to the model (by leaving off the first slash; `joint/slider/tx|value`).<br>
 * For outputs on the model itself, you can use `|com_position`, etc. As<br>
 * explained for AbstractInput, the vertical bar denotes the output name.<br>
 * <br>
 * Note that the internal tables are reset at the beginning of a simulation or<br>
 * AnalyzeTool::run() and does not append results to previous tables.
 */
public class OutputReporter extends Analysis {
  private transient long swigCPtr;

  public OutputReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.OutputReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OutputReporter obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_OutputReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static OutputReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.OutputReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new OutputReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.OutputReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.OutputReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.OutputReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OutputReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.OutputReporter_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_output_paths(OutputReporter source) {
    opensimActuatorsAnalysesToolsJNI.OutputReporter_copyProperty_output_paths(swigCPtr, this, OutputReporter.getCPtr(source), source);
  }

  public String get_output_paths(int i) {
    return opensimActuatorsAnalysesToolsJNI.OutputReporter_get_output_paths(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_output_paths(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.OutputReporter_upd_output_paths(swigCPtr, this, i), false);
  }

  public void set_output_paths(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.OutputReporter_set_output_paths(swigCPtr, this, i, value);
  }

  public int append_output_paths(String value) {
    return opensimActuatorsAnalysesToolsJNI.OutputReporter_append_output_paths(swigCPtr, this, value);
  }

  public void constructProperty_output_paths() {
    opensimActuatorsAnalysesToolsJNI.OutputReporter_constructProperty_output_paths(swigCPtr, this);
  }

  public OutputReporter(Model model) {
    this(opensimActuatorsAnalysesToolsJNI.new_OutputReporter__SWIG_0(Model.getCPtr(model), model), true);
  }

  public OutputReporter() {
    this(opensimActuatorsAnalysesToolsJNI.new_OutputReporter__SWIG_1(), true);
  }

  public OutputReporter(String fileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_OutputReporter__SWIG_2(fileName), true);
  }

}