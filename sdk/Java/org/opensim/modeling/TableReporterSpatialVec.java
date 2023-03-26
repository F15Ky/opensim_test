/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This concrete Reporter class collects and reports Output&lt;InputT&gt;s within a<br>
 * TimeSeriesTable_. The column labels in the resulting table come from the<br>
 * names of the outputs connected to this reporter. The contents of the table are<br>
 * the Output values with each row being the value of all outputs at subsequent<br>
 * times determined by the reporting interval.<br>
 * <br>
 * <br>
 * <br>
 * <br>
 * <br>
 * <br>
 * @author Ajay Seth
 */
public class TableReporterSpatialVec {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public TableReporterSpatialVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableReporterSpatialVec obj) {
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
        opensimCommonJNI.delete_TableReporterSpatialVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static TableReporterSpatialVec safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableReporterSpatialVec_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableReporterSpatialVec(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableReporterSpatialVec_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableReporterSpatialVec_getClassName();
  }

  public TableReporterSpatialVec clone() {
    long cPtr = opensimCommonJNI.TableReporterSpatialVec_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableReporterSpatialVec(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableReporterSpatialVec_getConcreteClassName(swigCPtr, this);
  }

  public TableReporterSpatialVec() {
    this(opensimCommonJNI.new_TableReporterSpatialVec(), true);
  }

  /**
   *  Retrieve the report as a TimeSeriesTable.                             
   */
  public TimeSeriesTableSpatialVec getTable() {
    return new TimeSeriesTableSpatialVec(opensimCommonJNI.TableReporterSpatialVec_getTable(swigCPtr, this), true);
  }

  /**
   *  Clear the report. This can be used for example in loops performing <br>
   *     simulation. Each new iteration should start with an empty report and so this<br>
   *     function can be used to clear the report at the end of each iteration.    
   */
  public void clearTable() {
    opensimCommonJNI.TableReporterSpatialVec_clearTable(swigCPtr, this);
  }

}