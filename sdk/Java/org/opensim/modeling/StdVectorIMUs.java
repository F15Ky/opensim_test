/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdVectorIMUs extends java.util.AbstractList<IMU> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StdVectorIMUs(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StdVectorIMUs obj) {
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
        opensimSimulationJNI.delete_StdVectorIMUs(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdVectorIMUs(IMU[] initialElements) {
    this();
    reserve(initialElements.length);

    for (IMU element : initialElements) {
      add(element);
    }
  }

  public StdVectorIMUs(Iterable<IMU> initialElements) {
    this();
    for (IMU element : initialElements) {
      add(element);
    }
  }

  public IMU get(int index) {
    return doGet(index);
  }

  public IMU set(int index, IMU e) {
    return doSet(index, e);
  }

  public boolean add(IMU e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, IMU e) {
    modCount++;
    doAdd(index, e);
  }

  public IMU remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public StdVectorIMUs() {
    this(opensimSimulationJNI.new_StdVectorIMUs__SWIG_0(), true);
  }

  public StdVectorIMUs(StdVectorIMUs other) {
    this(opensimSimulationJNI.new_StdVectorIMUs__SWIG_1(StdVectorIMUs.getCPtr(other), other), true);
  }

  public long capacity() {
    return opensimSimulationJNI.StdVectorIMUs_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opensimSimulationJNI.StdVectorIMUs_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opensimSimulationJNI.StdVectorIMUs_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opensimSimulationJNI.StdVectorIMUs_clear(swigCPtr, this);
  }

  public StdVectorIMUs(int count, IMU value) {
    this(opensimSimulationJNI.new_StdVectorIMUs__SWIG_2(count, IMU.getCPtr(value), value), true);
  }

  private int doSize() {
    return opensimSimulationJNI.StdVectorIMUs_doSize(swigCPtr, this);
  }

  private void doAdd(IMU x) {
    opensimSimulationJNI.StdVectorIMUs_doAdd__SWIG_0(swigCPtr, this, IMU.getCPtr(x), x);
  }

  private void doAdd(int index, IMU x) {
    opensimSimulationJNI.StdVectorIMUs_doAdd__SWIG_1(swigCPtr, this, index, IMU.getCPtr(x), x);
  }

  private IMU doRemove(int index) {
    long cPtr = opensimSimulationJNI.StdVectorIMUs_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IMU(cPtr, false);
  }

  private IMU doGet(int index) {
    long cPtr = opensimSimulationJNI.StdVectorIMUs_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IMU(cPtr, false);
  }

  private IMU doSet(int index, IMU val) {
    long cPtr = opensimSimulationJNI.StdVectorIMUs_doSet(swigCPtr, this, index, IMU.getCPtr(val), val);
    return (cPtr == 0) ? null : new IMU(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    opensimSimulationJNI.StdVectorIMUs_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
