/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a set of parameters describing how to place markers<br>
 * on a model (presumably after it has been scaled to fit a subject).<br>
 * <br>
 * MarkerPlacer is bundled with ModelScaler and GenericModelMaker to <br>
 * form the ScaleTool<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class MarkerPlacer extends OpenSimObject {
  private transient long swigCPtr;

  public MarkerPlacer(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.MarkerPlacer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerPlacer obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_MarkerPlacer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerPlacer safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MarkerPlacer_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerPlacer(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MarkerPlacer_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerPlacer(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getConcreteClassName(swigCPtr, this);
  }

  public MarkerPlacer() {
    this(opensimActuatorsAnalysesToolsJNI.new_MarkerPlacer__SWIG_0(), true);
  }

  public MarkerPlacer(MarkerPlacer aMarkerPlacementParams) {
    this(opensimActuatorsAnalysesToolsJNI.new_MarkerPlacer__SWIG_1(MarkerPlacer.getCPtr(aMarkerPlacementParams), aMarkerPlacementParams), true);
  }

  public void copyData(MarkerPlacer aMarkerPlacementParams) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_copyData(swigCPtr, this, MarkerPlacer.getCPtr(aMarkerPlacementParams), aMarkerPlacementParams);
  }

  public boolean processModel(Model aModel, String aPathToSubject) {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_processModel__SWIG_0(swigCPtr, this, Model.getCPtr(aModel), aModel, aPathToSubject);
  }

  public boolean processModel(Model aModel) {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_processModel__SWIG_1(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public boolean getApply() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getApply(swigCPtr, this);
  }

  public void setApply(boolean aApply) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setApply(swigCPtr, this, aApply);
  }

  public String getStaticPoseFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getStaticPoseFileName(swigCPtr, this);
  }

  public void setStaticPoseFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setStaticPoseFileName(swigCPtr, this, aFileName);
  }

  public ArrayDouble getTimeRange() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getTimeRange(swigCPtr, this), false);
  }

  public void setTimeRange(ArrayDouble timeRange) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setTimeRange(swigCPtr, this, ArrayDouble.getCPtr(timeRange), timeRange);
  }

  public IKTaskSet getIKTaskSet() {
    return new IKTaskSet(opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getIKTaskSet(swigCPtr, this), false);
  }

  public String getCoordinateFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getCoordinateFileName(swigCPtr, this);
  }

  public void setCoordinateFileName(String aCoordinateFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setCoordinateFileName(swigCPtr, this, aCoordinateFileName);
  }

  public String getMarkerFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getMarkerFileName(swigCPtr, this);
  }

  public void setMarkerFileName(String aMarkerFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setMarkerFileName(swigCPtr, this, aMarkerFileName);
  }

  public double getMaxMarkerMovement() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getMaxMarkerMovement(swigCPtr, this);
  }

  public void setMaxMarkerMovement(double aMaxMarkerMovement) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setMaxMarkerMovement(swigCPtr, this, aMaxMarkerMovement);
  }

  public String getOutputModelFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getOutputModelFileName(swigCPtr, this);
  }

  public void setOutputModelFileName(String aOutputModelFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setOutputModelFileName(swigCPtr, this, aOutputModelFileName);
  }

  public String getOutputMarkerFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getOutputMarkerFileName(swigCPtr, this);
  }

  public void setOutputMarkerFileName(String outputMarkerFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setOutputMarkerFileName(swigCPtr, this, outputMarkerFileName);
  }

  public String getOutputMotionFileName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getOutputMotionFileName(swigCPtr, this);
  }

  public void setOutputMotionFileName(String outputMotionFileName) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setOutputMotionFileName(swigCPtr, this, outputMotionFileName);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

  public boolean getMoveModelMarkers() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getMoveModelMarkers(swigCPtr, this);
  }

  public void setMoveModelMarkers(boolean aMove) {
    opensimActuatorsAnalysesToolsJNI.MarkerPlacer_setMoveModelMarkers(swigCPtr, this, aMove);
  }

  public Storage getOutputStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MarkerPlacer_getOutputStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

}
