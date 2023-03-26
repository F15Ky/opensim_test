/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Scale the active fiber force curve width for all DeGrooteFregly2016Muscle%s<br>
 * in the model. 
 */
public class ModOpScaleActiveFiberForceCurveWidthDGF extends ModelOperator {
  private transient long swigCPtr;

  public ModOpScaleActiveFiberForceCurveWidthDGF(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpScaleActiveFiberForceCurveWidthDGF obj) {
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
        opensimMocoJNI.delete_ModOpScaleActiveFiberForceCurveWidthDGF(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpScaleActiveFiberForceCurveWidthDGF safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpScaleActiveFiberForceCurveWidthDGF(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpScaleActiveFiberForceCurveWidthDGF(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_getConcreteClassName(swigCPtr, this);
  }

  public ModOpScaleActiveFiberForceCurveWidthDGF() {
    this(opensimMocoJNI.new_ModOpScaleActiveFiberForceCurveWidthDGF__SWIG_0(), true);
  }

  public ModOpScaleActiveFiberForceCurveWidthDGF(double scaleFactor) {
    this(opensimMocoJNI.new_ModOpScaleActiveFiberForceCurveWidthDGF__SWIG_1(scaleFactor), true);
  }

  public void operate(Model model, String arg1) {
    opensimMocoJNI.ModOpScaleActiveFiberForceCurveWidthDGF_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

}
