/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of generalized cross-validated splines.<br>
 * <br>
 * @see GCVSpline<br>
 * @author Frank C. Anderson
 */
public class GCVSplineSet extends FunctionSet {
  private transient long swigCPtr;

  public GCVSplineSet(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.GCVSplineSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GCVSplineSet obj) {
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
        opensimCommonJNI.delete_GCVSplineSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static GCVSplineSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.GCVSplineSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new GCVSplineSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.GCVSplineSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.GCVSplineSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.GCVSplineSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new GCVSplineSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.GCVSplineSet_getConcreteClassName(swigCPtr, this);
  }

  public GCVSplineSet() {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_0(), true);
  }

  /**
   * Construct a set of generalized cross-validated splines from file.<br>
   * <br>
   * @param aFileName Name of the file.
   */
  public GCVSplineSet(String aFileName) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_1(aFileName), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in an Storage object.<br>
   * <br>
   * Each column in the Storage object is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label. Note that<br>
   * column labels in the storage object are assumed to be tab delimited.<br>
   * <br>
   * @param aDegree Degree of the constructed splines (1, 3, 5, or 7).<br>
   * @param aStore Storage object.<br>
   * @param aErrorVariance Estimate of the variance of the error in the data <br>
   * to be fit.  If negative, the variance will be estimated.  If 0.0, the <br>
   * fit will try to fit the data points exactly- no smoothing.  If<br>
   * positive, the fits will be smoothed according to the specified variance.<br>
   * The larger the error variance, the more the smoothing.  Note that this is<br>
   * the error variance assumed for each column in the Storage.  If different<br>
   * variances should be set for the various columns, you will need to<br>
   * construct each GCVSpline individually.<br>
   * @see Storage<br>
   * @see GCVSpline
   */
  public GCVSplineSet(int aDegree, Storage aStore, double aErrorVariance) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_2(aDegree, Storage.getCPtr(aStore), aStore, aErrorVariance), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in an Storage object.<br>
   * <br>
   * Each column in the Storage object is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label. Note that<br>
   * column labels in the storage object are assumed to be tab delimited.<br>
   * <br>
   * @param aDegree Degree of the constructed splines (1, 3, 5, or 7).<br>
   * @param aStore Storage object.<br>
   * <br>
   * @see Storage<br>
   * @see GCVSpline
   */
  public GCVSplineSet(int aDegree, Storage aStore) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_3(aDegree, Storage.getCPtr(aStore), aStore), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in a TimeSeriesTable.<br>
   * <br>
   * Each column in the TimeSeriesTable is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label.  <br>
   * <br>
   * @param table TimeSeriesTable object.<br>
   * @param labels Columns to use from TimeSeriesTable.<br>
   * @param degree Degree of the constructed splines (1, 3, 5, or 7).<br>
   * @param errorVariance Estimate of the variance of the error in the data <br>
   * to be fit.  If negative, the variance will be estimated.  If 0.0, the <br>
   * fit will try to fit the data points exactly- no smoothing.  If<br>
   * positive, the fits will be smoothed according to the specified variance.<br>
   * The larger the error variance, the more the smoothing.  Note that this is<br>
   * the error variance assumed for each column in the TimeSeriesTable.  If <br>
   * different variances should be set for the various columns, you will need <br>
   * to construct each GCVSpline individually.<br>
   * @see TimeSeriesTable.<br>
   * @see GCVSpline
   */
  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels, int degree, double errorVariance) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_4(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels, degree, errorVariance), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in a TimeSeriesTable.<br>
   * <br>
   * Each column in the TimeSeriesTable is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label.  <br>
   * <br>
   * @param table TimeSeriesTable object.<br>
   * @param labels Columns to use from TimeSeriesTable.<br>
   * @param degree Degree of the constructed splines (1, 3, 5, or 7).<br>
   * <br>
   * @see TimeSeriesTable.<br>
   * @see GCVSpline
   */
  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels, int degree) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_5(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels, degree), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in a TimeSeriesTable.<br>
   * <br>
   * Each column in the TimeSeriesTable is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label.  <br>
   * <br>
   * @param table TimeSeriesTable object.<br>
   * @param labels Columns to use from TimeSeriesTable.<br>
   * <br>
   * <br>
   * @see TimeSeriesTable.<br>
   * @see GCVSpline
   */
  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_6(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels), true);
  }

  /**
   * Construct a set of generalized cross-validated splines based on the <br>
   * states stored in a TimeSeriesTable.<br>
   * <br>
   * Each column in the TimeSeriesTable is fit with a spline of the specified<br>
   * degree and is named the name of its corresponding column label.  <br>
   * <br>
   * @param table TimeSeriesTable object.<br>
   * <br>
   * <br>
   * <br>
   * @see TimeSeriesTable.<br>
   * @see GCVSpline
   */
  public GCVSplineSet(TimeSeriesTable table) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_7(TimeSeriesTable.getCPtr(table), table), true);
  }

  /**
   * Get the function at a specified index.<br>
   * <br>
   * @param aIndex Index of the desired function:  0 &lt;= aIndex &lt; getSize().<br>
   * @return Function at index aIndex.  If aIndex is not a valid value NULL is<br>
   *         returned.
   */
  public GCVSpline getGCVSpline(int aIndex) {
    long cPtr = opensimCommonJNI.GCVSplineSet_getGCVSpline(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new GCVSpline(cPtr, false);
  }

  public double getMinX() {
    return opensimCommonJNI.GCVSplineSet_getMinX(swigCPtr, this);
  }

  public double getMaxX() {
    return opensimCommonJNI.GCVSplineSet_getMaxX(swigCPtr, this);
  }

  /**
   * Construct a storage object (see Storage) for this spline set or for <br>
   * some derivative of this spline set.<br>
   * <br>
   * @param aDerivOrder Derivative order.  0 constructs from the spline,<br>
   * 1 constructs from the first derivative of the spline, 2 constructs from<br>
   * the second derivative of the spline, etc.<br>
   * @param aDX Spacing of the data points in the independent variable.  If<br>
   * negative the spacing of the independent variable is taken from the<br>
   * original data, as determined from the first non-NULL spline in the set.<br>
   * aDX has a default value of -1.<br>
   * @return Storage object.  If a valid storage object cannot be constructed<br>
   * NULL is returned.<br>
   * @see Storage
   */
  public Storage constructStorage(int aDerivOrder, double aDX) {
    long cPtr = opensimCommonJNI.GCVSplineSet_constructStorage__SWIG_0(swigCPtr, this, aDerivOrder, aDX);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  /**
   * Construct a storage object (see Storage) for this spline set or for <br>
   * some derivative of this spline set.<br>
   * <br>
   * @param aDerivOrder Derivative order.  0 constructs from the spline,<br>
   * 1 constructs from the first derivative of the spline, 2 constructs from<br>
   * the second derivative of the spline, etc.<br>
   * <br>
   * @return Storage object.  If a valid storage object cannot be constructed<br>
   * NULL is returned.<br>
   * @see Storage
   */
  public Storage constructStorage(int aDerivOrder) {
    long cPtr = opensimCommonJNI.GCVSplineSet_constructStorage__SWIG_1(swigCPtr, this, aDerivOrder);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

}