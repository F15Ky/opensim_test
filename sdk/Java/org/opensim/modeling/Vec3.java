/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a fixed length column vector designed for no-overhead inline <br>
 * computation.<br>
 * <br>
 * 
 */
public class Vec3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Vec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vec3 obj) {
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
        opensimSimbodyJNI.delete_Vec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public static Vec3 createFromMat(double[] data) throws Exception {
        if (data.length != 3) {
            throw new Exception("data size != 3");
        }
        return new Vec3(data[0], data[1], data[2]);
    }
    public double[] getAsMat() {
        return new double[]{get(0), get(1), get(2)};
    }

  /**
   *  The number of elements in this Vec (note that stride does not <br>
   *     affect this number.) *
   */
  public static int size() {
    return opensimSimbodyJNI.Vec3_size();
  }

  /**
   *  The number of rows in a Vec is the number of elements. *
   */
  public static int nrow() {
    return opensimSimbodyJNI.Vec3_nrow();
  }

  /**
   *  The number of columns in a Vec is always 1. *
   */
  public static int ncol() {
    return opensimSimbodyJNI.Vec3_ncol();
  }

  /**
   *  Default construction initializes %Vec's elements to NaN when debugging <br>
   *     but leaves them uninitialized garbage otherwise, so declarations have zero<br>
   *     cost in Release builds. *
   */
  public Vec3() {
    this(opensimSimbodyJNI.new_Vec3__SWIG_0(), true);
  }

  /**
   *  Copy constructor copies the logically-included elements from the<br>
   *     source %Vec; gaps due to stride are not accessed in either source or<br>
   *     destination. *
   */
  public Vec3(Vec3 src) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_1(Vec3.getCPtr(src), src), true);
  }

  /**
   *  Construction from a single value of this %Vec's element type assigns<br>
   *     that value to each element. *
   */
  public Vec3(double e) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_2(e), true);
  }

  /**
   *  Given an int value, turn it into a suitable floating point number,<br>
   *     convert that to element type E and then feed that to the above <br>
   *     single-element constructor. <br>
   *     @see Vec#Vec(SWIGTYPE_p_E). *
   */
  public Vec3(int i) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_3(i), true);
  }

  /**
   *  Construct a Vec&lt;2,E&gt; from two elements of type E, etc. *
   */
  public Vec3(double e0, double e1) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_4(e0, e1), true);
  }

  public Vec3(double e0, double e1, double e2) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_5(e0, e1, e2), true);
  }

  public Vec3(double e0, double e1, double e2, double e3) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_6(e0, e1, e2, e3), true);
  }

  public Vec3(double e0, double e1, double e2, double e3, double e4) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_7(e0, e1, e2, e3, e4), true);
  }

  public Vec3(double e0, double e1, double e2, double e3, double e4, double e5) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_8(e0, e1, e2, e3, e4, e5), true);
  }

  public Vec3(double e0, double e1, double e2, double e3, double e4, double e5, double e6) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_9(e0, e1, e2, e3, e4, e5, e6), true);
  }

  public Vec3(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_10(e0, e1, e2, e3, e4, e5, e6, e7), true);
  }

  public Vec3(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8) {
    this(opensimSimbodyJNI.new_Vec3__SWIG_11(e0, e1, e2, e3, e4, e5, e6, e7, e8), true);
  }

  /**
   *  Set every scalar in this %Vec to NaN; this is the default initial<br>
   *     value in Debug builds, but not in Release. *
   */
  public void setToNaN() {
    opensimSimbodyJNI.Vec3_setToNaN(swigCPtr, this);
  }

  /**
   *  Set every scalar in this %Vec to zero. *
   */
  public void setToZero() {
    opensimSimbodyJNI.Vec3_setToZero(swigCPtr, this);
  }

  /**
   *  Return true if any element of this Vec contains a NaN anywhere. *
   */
  public boolean isNaN() {
    return opensimSimbodyJNI.Vec3_isNaN(swigCPtr, this);
  }

  /**
   *  Return true if any element of this Vec contains a +Infinity<br>
   *     or -Infinity somewhere but no element contains a NaN anywhere. *
   */
  public boolean isInf() {
    return opensimSimbodyJNI.Vec3_isInf(swigCPtr, this);
  }

  /**
   *  Return true if no element of this %Vec contains an Infinity or a NaN <br>
   *     anywhere. *
   */
  public boolean isFinite() {
    return opensimSimbodyJNI.Vec3_isFinite(swigCPtr, this);
  }

  /**
   *  For approximate comparisions, the default tolerance to use for a vector is<br>
   *     the same as its elements' default tolerance. *
   */
  public static double getDefaultTolerance() {
    return opensimSimbodyJNI.Vec3_getDefaultTolerance();
  }

  /**
   *  %Test whether every element of this vector is numerically equal to the given<br>
   *     element, using either a specified tolerance or the vector's <br>
   *     default tolerance (which is always the same or looser than the default<br>
   *     tolerance for one of its elements). *
   */
  public boolean isNumericallyEqual(double e, double tol) {
    return opensimSimbodyJNI.Vec3_isNumericallyEqual__SWIG_2(swigCPtr, this, e, tol);
  }

  /**
   *  %Test whether every element of this vector is numerically equal to the given<br>
   *     element, using either a specified tolerance or the vector's <br>
   *     default tolerance (which is always the same or looser than the default<br>
   *     tolerance for one of its elements). *
   */
  public boolean isNumericallyEqual(double e) {
    return opensimSimbodyJNI.Vec3_isNumericallyEqual__SWIG_3(swigCPtr, this, e);
  }

  /**
   *  Print Vec into a string and return it.  Please refer to operator&lt;< for details. *
   */
  public String toString() {
    return opensimSimbodyJNI.Vec3_toString(swigCPtr, this);
  }

  /**
   *  Variant of operator[] that's scripting friendly to set ith entry *
   */
  public void set(int i, double value) {
    opensimSimbodyJNI.Vec3_set(swigCPtr, this, i, value);
  }

  /**
   *  Variant of operator[] that's scripting friendly to get const reference to ith entry *
   */
  public double get(int i) {
    return opensimSimbodyJNI.Vec3_get(swigCPtr, this, i);
  }

  public Vec3 scalarEq(double ee) {
    return new Vec3(opensimSimbodyJNI.Vec3_scalarEq(swigCPtr, this, ee), false);
  }

  public Vec3 scalarPlusEq(double ee) {
    return new Vec3(opensimSimbodyJNI.Vec3_scalarPlusEq(swigCPtr, this, ee), false);
  }

  public Vec3 scalarMinusEq(double ee) {
    return new Vec3(opensimSimbodyJNI.Vec3_scalarMinusEq(swigCPtr, this, ee), false);
  }

  public Vec3 scalarTimesEq(double ee) {
    return new Vec3(opensimSimbodyJNI.Vec3_scalarTimesEq(swigCPtr, this, ee), false);
  }

  public Vec3 scalarDivideEq(double ee) {
    return new Vec3(opensimSimbodyJNI.Vec3_scalarDivideEq(swigCPtr, this, ee), false);
  }

}