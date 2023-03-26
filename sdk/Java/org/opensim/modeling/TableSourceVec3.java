/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Component representing a source of data from a TimeSeriesTable_.<br>
 * <br>
 * This Component has two outputs:<br>
 * - A list output with one channel per column of the TimeSeriesTable_.<br>
 * - A non-list output for a row of the TimeSeriesTable_.<br>
 * <br>
 * Construct this Component by giving it a TimeSeriesTable_. Then use it by <br>
 * connecting its output to the Input of another Component that accepts compatible<br>
 * type of Input. Make sure to populate the column-labels of the TimeSeriesTable_ <br>
 * before connecting this Component to the input of another Component.    <br>
 * <br>
 * 
 */
public class TableSourceVec3 extends Component {
  private transient long swigCPtr;

  public TableSourceVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TableSourceVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableSourceVec3 obj) {
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
        opensimCommonJNI.delete_TableSourceVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableSourceVec3 safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableSourceVec3_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableSourceVec3(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableSourceVec3_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableSourceVec3_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.TableSourceVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableSourceVec3(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableSourceVec3_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filename(TableSourceVec3 source) {
    opensimCommonJNI.TableSourceVec3_copyProperty_filename(swigCPtr, this, TableSourceVec3.getCPtr(source), source);
  }

  public String get_filename(int i) {
    return opensimCommonJNI.TableSourceVec3_get_filename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_filename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filename(int i, String value) {
    opensimCommonJNI.TableSourceVec3_set_filename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filename(String value) {
    return opensimCommonJNI.TableSourceVec3_append_filename(swigCPtr, this, value);
  }

  public void constructProperty_filename(String initValue) {
    opensimCommonJNI.TableSourceVec3_constructProperty_filename(swigCPtr, this, initValue);
  }

  public String get_filename() {
    return opensimCommonJNI.TableSourceVec3_get_filename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_filename__SWIG_1(swigCPtr, this), false);
  }

  public void set_filename(String value) {
    opensimCommonJNI.TableSourceVec3_set_filename__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_tablename(TableSourceVec3 source) {
    opensimCommonJNI.TableSourceVec3_copyProperty_tablename(swigCPtr, this, TableSourceVec3.getCPtr(source), source);
  }

  public String get_tablename(int i) {
    return opensimCommonJNI.TableSourceVec3_get_tablename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_tablename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_tablename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tablename(int i, String value) {
    opensimCommonJNI.TableSourceVec3_set_tablename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tablename(String value) {
    return opensimCommonJNI.TableSourceVec3_append_tablename(swigCPtr, this, value);
  }

  public void constructProperty_tablename(String initValue) {
    opensimCommonJNI.TableSourceVec3_constructProperty_tablename(swigCPtr, this, initValue);
  }

  public String get_tablename() {
    return opensimCommonJNI.TableSourceVec3_get_tablename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_tablename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_tablename__SWIG_1(swigCPtr, this), false);
  }

  public void set_tablename(String value) {
    opensimCommonJNI.TableSourceVec3_set_tablename__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_all_columns(boolean value) {
    opensimCommonJNI.TableSourceVec3__has_output_all_columns_set(swigCPtr, this, value);
  }

  public boolean get_has_output_all_columns() {
    return opensimCommonJNI.TableSourceVec3__has_output_all_columns_get(swigCPtr, this);
  }

  public void set_has_output_column(boolean value) {
    opensimCommonJNI.TableSourceVec3__has_output_column_set(swigCPtr, this, value);
  }

  public boolean get_has_output_column() {
    return opensimCommonJNI.TableSourceVec3__has_output_column_get(swigCPtr, this);
  }

  public TableSourceVec3() {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_0(), true);
  }

  public TableSourceVec3(TableSourceVec3 arg0) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_1(TableSourceVec3.getCPtr(arg0), arg0), true);
  }

  /**
   *  Construct the TableSource_ by giving it a TimeSeriesTable_ to hold.   
   */
  public TableSourceVec3(TimeSeriesTableVec3 table) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_2(TimeSeriesTableVec3.getCPtr(table), table), true);
  }

  /**
   *  Construct the TableSource_ from a file.<br>
   * <br>
   *     @param filename Name of the file.<br>
   * <br>
   *     @throws KeyNotFound If table provided does not have column-labels.        
   */
  public TableSourceVec3(String filename) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_3(filename), true);
  }

  /**
   *  Construct the TableSource_ from a file.<br>
   * <br>
   *     @param filename Name of the file.<br>
   *     @param tablename Name of the table in the file to populate the TableSource<br>
   *                      with. Ex. 'markers', 'forces'.<br>
   * <br>
   *     @throws KeyNotFound If table provided does not have column-labels.        
   */
  public TableSourceVec3(String filename, String tablename) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_4(filename, tablename), true);
  }

  /**
   *  Get a read-only reference to the TimeSeriesTable_ this TableSource_ <br>
   *     currently holds.                                                          
   */
  public TimeSeriesTableVec3 getTable() {
    return new TimeSeriesTableVec3(opensimCommonJNI.TableSourceVec3_getTable(swigCPtr, this), true);
  }

  /**
   *  Replace the existing TimeSeriesTable_ that this TableSource_ currently <br>
   *     holds. The properties 'filename' and 'tablename' are reset to empty strings<br>
   *     as a result of this operation.<br>
   * <br>
   *     @throws KeyNotFound If table provided does not have column labels.        
   */
  public void setTable(TimeSeriesTableVec3 table) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_0(swigCPtr, this, TimeSeriesTableVec3.getCPtr(table), table);
  }

  /**
   *  Replace the TimeSeriesTable_ that this TableSource_ currently holds. <br>
   *     Property 'filename' is reset to the value provided. Property 'tablename' is<br>
   *     reset to the empty string as a result of this operation.<br>
   * <br>
   *     @throws InvalidCall If property `filename` is set. This call is not allowed<br>
   *                         if `filename` property is set.                        <br>
   *     @throws KeyNotFound If table provided does not have column labels.        
   */
  public void setTable(String filename) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_1(swigCPtr, this, filename);
  }

  /**
   *  Replace the TimeSeriesTable_ that this TableSource_ currently holds. <br>
   *     Properties 'filename' and 'tablename' are reset to the values provided.<br>
   * <br>
   *     @param filename Name of the file.<br>
   *     @param tablename Name of the table in the file to construct the <br>
   *                      TimeSeriesTable_ from. For example, a c3d file contains <br>
   *                      tables named 'markers' and 'forces'.<br>
   * <br>
   *     @throws InvalidCall If property `filename` is set. This call is not allowed<br>
   *                         if `filename` property is set.                        <br>
   *     @throws KeyNotFound If table provided does not have column labels.        
   */
  public void setTable(String filename, String tablename) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_2(swigCPtr, this, filename, tablename);
  }

}