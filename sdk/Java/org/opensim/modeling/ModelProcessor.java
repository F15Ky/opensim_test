/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class describes a workflow for processing a Model using<br>
 * ModelOperator%s. The user must provide a source model via either the model<br>
 * property or the filepath property. In C++, one can easily chain together<br>
 * the operators in a processor using the C++ pipe operator:<br>
 * {@code 
ModelProcessor proc = ModelProcessor("model.osim") | ModOpAddReserves();
} 
 */
public class ModelProcessor extends OpenSimObject {
  private transient long swigCPtr;

  public ModelProcessor(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ModelProcessor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelProcessor obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_ModelProcessor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelProcessor safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModelProcessor_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelProcessor(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModelProcessor_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelProcessor(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filepath(ModelProcessor source) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_copyProperty_filepath(swigCPtr, this, ModelProcessor.getCPtr(source), source);
  }

  public String get_filepath(int i) {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_get_filepath__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filepath(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.ModelProcessor_upd_filepath__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filepath(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_set_filepath__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filepath(String value) {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_append_filepath(swigCPtr, this, value);
  }

  public void constructProperty_filepath(String initValue) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_constructProperty_filepath(swigCPtr, this, initValue);
  }

  public String get_filepath() {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_get_filepath__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filepath() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.ModelProcessor_upd_filepath__SWIG_1(swigCPtr, this), false);
  }

  public void set_filepath(String value) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_set_filepath__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_operators(ModelProcessor source) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_copyProperty_operators(swigCPtr, this, ModelProcessor.getCPtr(source), source);
  }

  public ModelOperator get_operators(int i) {
    return new ModelOperator(opensimActuatorsAnalysesToolsJNI.ModelProcessor_get_operators(swigCPtr, this, i), false);
  }

  public ModelOperator upd_operators(int i) {
    return new ModelOperator(opensimActuatorsAnalysesToolsJNI.ModelProcessor_upd_operators(swigCPtr, this, i), false);
  }

  public void set_operators(int i, ModelOperator value) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_set_operators(swigCPtr, this, i, ModelOperator.getCPtr(value), value);
  }

  public int append_operators(ModelOperator value) {
    return opensimActuatorsAnalysesToolsJNI.ModelProcessor_append_operators(swigCPtr, this, ModelOperator.getCPtr(value), value);
  }

  public void constructProperty_operators() {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_constructProperty_operators(swigCPtr, this);
  }

  /**
   *  This constructor is only for use when reading (deserializing) from an<br>
   *     XML file. 
   */
  public ModelProcessor() {
    this(opensimActuatorsAnalysesToolsJNI.new_ModelProcessor__SWIG_0(), true);
  }

  /**
   *  Use a Model object as the source model.<br>
   *     Since this constructor is not explicit, you can provide a Model to<br>
   *     any function that takes a ModelProcessor (in C++). 
   */
  public ModelProcessor(Model model) {
    this(opensimActuatorsAnalysesToolsJNI.new_ModelProcessor__SWIG_1(Model.getCPtr(model), model), true);
  }

  /**
   *  Use the filepath of a .osim file to obtain the source model.<br>
   *     Since this constructor is not explicit, you can provide a string<br>
   *     filepath any function that takes a ModelProcessor (in C++). 
   */
  public ModelProcessor(String filepath) {
    this(opensimActuatorsAnalysesToolsJNI.new_ModelProcessor__SWIG_2(filepath), true);
  }

  /**
   *  Obtain the base model, if one was provided via the model property or<br>
   *     setModel(). This ignores base models specified via the filepath<br>
   *     property. 
   */
  public Model getModel() {
    return new Model(opensimActuatorsAnalysesToolsJNI.ModelProcessor_getModel(swigCPtr, this), false);
  }

  /**
   *  Obtain a mutable reference to the base model, if one was provided via<br>
   *     the model property or setModel(). This ignores base models specified<br>
   *     via the filepath property. 
   */
  public Model updModel() {
    return new Model(opensimActuatorsAnalysesToolsJNI.ModelProcessor_updModel(swigCPtr, this), false);
  }

  /**
   *  Process and obtain the model. If the base model is specified via the<br>
   *     filepath property, the filepath will be evaluated relative to<br>
   *     `relativeToDirectory`, if provided. 
   */
  public Model process(String relativeToDirectory) {
    return new Model(opensimActuatorsAnalysesToolsJNI.ModelProcessor_process__SWIG_0(swigCPtr, this, relativeToDirectory), true);
  }

  /**
   *  Process and obtain the model. If the base model is specified via the<br>
   *     filepath property, the filepath will be evaluated relative to<br>
   *     `relativeToDirectory`, if provided. 
   */
  public Model process() {
    return new Model(opensimActuatorsAnalysesToolsJNI.ModelProcessor_process__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Append an operation to the end of the operations in this processor. 
   */
  public ModelProcessor append(ModelOperator op) {
    return new ModelProcessor(opensimActuatorsAnalysesToolsJNI.ModelProcessor_append(swigCPtr, this, ModelOperator.getCPtr(op), op), false);
  }

  public void setModel(Model model) {
    opensimActuatorsAnalysesToolsJNI.ModelProcessor_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

}
