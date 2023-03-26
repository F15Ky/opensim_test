/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for recording the states of a model<br>
 * during a simulation.<br>
 * <br>
 * @author Ayman Habib<br>
 * @version 1.0
 */
public class StatesReporter extends Analysis {
  private transient long swigCPtr;

  public StatesReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.StatesReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(StatesReporter obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_StatesReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StatesReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.StatesReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new StatesReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.StatesReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.StatesReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new StatesReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_getConcreteClassName(swigCPtr, this);
  }

  public StatesReporter(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_StatesReporter__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public StatesReporter() {
    this(opensimActuatorsAnalysesToolsJNI.new_StatesReporter__SWIG_1(), true);
  }

  public StatesReporter(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_StatesReporter__SWIG_2(aFileName), true);
  }

  public StatesReporter(StatesReporter aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_StatesReporter__SWIG_3(StatesReporter.getCPtr(aObject), aObject), true);
  }

  public Storage getStatesStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.StatesReporter_getStatesStorage(swigCPtr, this), false);
  }

  public Storage updStatesStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.StatesReporter_updStatesStorage(swigCPtr, this), false);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.StatesReporter_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
