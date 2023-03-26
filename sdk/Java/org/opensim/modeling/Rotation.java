/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * The Rotation class is a Mat33 that guarantees that the matrix is a legitimate<br>
 * 3x3 array associated with the relative orientation of two right-handed,<br>
 * orthogonal, unit vector bases. The Rotation class takes advantage of<br>
 * known properties of orthogonal matrices. For example, multiplication by a<br>
 * rotation matrix preserves a vector's length so unit vectors are still unit<br>
 * vectors afterwards and don't need to be re-normalized.<br>
 * <br>
 * A rotation is an orthogonal matrix whose columns and rows are directions<br>
 * (that is, unit vectors) that are mutually orthogonal. Furthermore, if the<br>
 * columns (or rows) are labeled x,y,z it always holds that z = x X y (rather<br>
 * than -(x X y)) ensuring that this is a right-handed rotation matrix and not<br>
 * a reflection. This is equivalent to saying that the determinant of a rotation<br>
 * matrix is 1, not -1.<br>
 * <br>
 * Suppose there is a vector v_F expressed in terms of the right-handed,<br>
 * orthogonal unit vectors Fx, Fy, Fz and one would like to express v instead<br>
 * as v_G, in terms of a right-handed, orthogonal unit vectors Gx, Gy, Gz. To<br>
 * calculate it, we form a rotation matrix R_GF whose columns are the F unit<br>
 * vectors re-expressed in G:<br>
 * <pre><br>
 *             G F   (      |      |      )<br>
 *      R_GF =  R  = ( Fx_G | Fy_G | Fz_G )<br>
 *                   (      |      |      )<br>
 * where<br>
 *      Fx_G = ~( ~Fx*Gx, ~Fx*Gy, ~Fx*Gz ), etc.<br>
 * </pre><br>
 * (~Fx*Gx means dot(Fx,Gx)). Note that we use "monogram" notation R_GF in<br>
 * code to represent the more typographically demanding superscripted notation<br>
 * for rotation matrices. Now we can re-express the vector v from frame F to<br>
 * frame G via<br>
 * <pre><br>
 *      v_G = R_GF * v_F.<br>
 * </pre><br>
 * Because a rotation is orthogonal, its transpose is its inverse. Hence<br>
 * R_FG = ~R_GF (where ~ is the SimTK "transpose" operator). This transpose<br>
 * matrix can be used to expressed v_G in terms of Fx, Fy, Fz as<br>
 * <pre><br>
 *      v_F = R_FG * v_G  or  v_F = ~R_GF * v_G<br>
 * </pre><br>
 * In either direction, correct behavior can be obtained by using the<br>
 * recommended notation and then matching up the frame labels (after<br>
 * interpreting the "~" operator as reversing the labels).
 */
public class Rotation extends Mat33 {
  private transient long swigCPtr;

  public Rotation(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.Rotation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Rotation obj) {
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
        opensimSimbodyJNI.delete_Rotation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Rotation() {
    this(opensimSimbodyJNI.new_Rotation__SWIG_0(), true);
  }

  public Rotation setRotationToIdentityMatrix() {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationToIdentityMatrix(swigCPtr, this), false);
  }

  public Rotation setRotationToNaN() {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationToNaN(swigCPtr, this), false);
  }

  public Rotation(Rotation R) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_1(Rotation.getCPtr(R), R), true);
  }

  /**
   *  Constructor for right-handed rotation by an angle (in radians) about a coordinate axis.
   */
  public Rotation(double angle, CoordinateAxis axis) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_2(angle, CoordinateAxis.getCPtr(axis), axis), true);
  }

  /**
   *  Set this Rotation_ object to a right-handed rotation by an angle (in radians) about a coordinate axis.
   */
  public Rotation setRotationFromAngleAboutAxis(double angle, CoordinateAxis axis) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutAxis(swigCPtr, this, angle, CoordinateAxis.getCPtr(axis), axis), false);
  }

  public Rotation setRotationFromAngleAboutX(double angle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutX__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutY(double angle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutY__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutZ(double angle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutZ__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutX(double cosAngle, double sinAngle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutX__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  public Rotation setRotationFromAngleAboutY(double cosAngle, double sinAngle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutY__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  public Rotation setRotationFromAngleAboutZ(double cosAngle, double sinAngle) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutZ__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  /**
   *  Constructor for right-handed rotation by an angle (in radians) about an arbitrary vector.
   */
  public Rotation(double angle, Vec3 nonUnitVector) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_3(angle, Vec3.getCPtr(nonUnitVector), nonUnitVector), true);
  }

  /**
   *  Set this Rotation_ object to a right-handed rotation of an angle (in radians) about an arbitrary vector.
   */
  public Rotation setRotationFromAngleAboutNonUnitVector(double angle, Vec3 nonUnitVector) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromAngleAboutNonUnitVector(swigCPtr, this, angle, Vec3.getCPtr(nonUnitVector), nonUnitVector), false);
  }

  /**
   *  Constructor for two-angle, two-axes, Body-fixed or Space-fixed rotation sequences (angles are in radians)
   */
  public Rotation(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_4(bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  /**
   *  Constructor for three-angle Body-fixed or Space-fixed rotation sequences (angles are in radians)
   */
  public Rotation(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2, double angle3, CoordinateAxis axis3) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_5(bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2, angle3, CoordinateAxis.getCPtr(axis3), axis3), true);
  }

  /**
   *  Set this Rotation_ object to a two-angle, two-axes, Body-fixed or Space-fixed rotation sequences (angles are in radians)
   */
  public Rotation setRotationFromTwoAnglesTwoAxes(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromTwoAnglesTwoAxes(swigCPtr, this, bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2), false);
  }

  /**
   *  Set this Rotation_ object to a three-angle Body-fixed or Space-fixed rotation sequences (angles are in radians)
   */
  public Rotation setRotationFromThreeAnglesThreeAxes(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2, double angle3, CoordinateAxis axis3) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromThreeAnglesThreeAxes(swigCPtr, this, bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2, angle3, CoordinateAxis.getCPtr(axis3), axis3), false);
  }

  /**
   *  Set this Rotation_ to represent a rotation characterized by subsequent rotations of:<br>
   *  +v[0] about the body frame's X axis,      followed by a rotation of<br>
   *  +v[1] about the body frame's NEW Y axis.  See Kane, Spacecraft Dynamics, pg. 423, body-three: 1-2-3.
   */
  public void setRotationToBodyFixedXY(Vec2 v) {
    opensimSimbodyJNI.Rotation_setRotationToBodyFixedXY(swigCPtr, this, Vec2.getCPtr(v), v);
  }

  /**
   *  Set this Rotation_ to represent a rotation characterized by subsequent rotations of:<br>
   *  +v[0] about the body frame's X axis,      followed by a rotation of<br>
   *  +v[1] about the body frame's NEW Y axis,  followed by a rotation of<br>
   *  +v[2] about the body frame's NEW Z axis.  See Kane, Spacecraft Dynamics, pg. 423, body-three: 1-2-3.
   */
  public void setRotationToBodyFixedXYZ(Vec3 v) {
    opensimSimbodyJNI.Rotation_setRotationToBodyFixedXYZ__SWIG_0(swigCPtr, this, Vec3.getCPtr(v), v);
  }

  /**
   *  Constructor for creating a rotation matrix from a quaternion.
   */
  public Rotation(Quaternion q) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_6(Quaternion.getCPtr(q), q), true);
  }

  /**
   *  Method for creating a rotation matrix from a quaternion.
   */
  public Rotation setRotationFromQuaternion(Quaternion q) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromQuaternion(swigCPtr, this, Quaternion.getCPtr(q), q), false);
  }

  /**
   *  Construct a Rotation_ directly from a Mat33 (we trust that m is a valid Rotation_!)
   */
  public Rotation(Mat33 m, boolean arg1) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_7(Mat33.getCPtr(m), m, arg1), true);
  }

  /**
   *  Constructs an (hopefully nearby) orthogonal rotation matrix from a generic Mat33.
   */
  public Rotation(Mat33 m) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_8(Mat33.getCPtr(m), m), true);
  }

  /**
   *  Set this Rotation_ object to an (hopefully nearby) orthogonal rotation matrix from a generic Mat33.
   */
  public Rotation setRotationFromApproximateMat33(Mat33 m) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromApproximateMat33(swigCPtr, this, Mat33.getCPtr(m), m), false);
  }

  /**
   *  Calculate R_AB by knowing one of B's unit vector expressed in A.<br>
   *  Note: The other vectors are perpendicular (but somewhat arbitrarily so).
   */
  public Rotation(UnitVec3 uvec, CoordinateAxis axis) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_9(UnitVec3.getCPtr(uvec), uvec, CoordinateAxis.getCPtr(axis), axis), true);
  }

  public Rotation setRotationFromOneAxis(UnitVec3 uvec, CoordinateAxis axis) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromOneAxis(swigCPtr, this, UnitVec3.getCPtr(uvec), uvec, CoordinateAxis.getCPtr(axis), axis), false);
  }

  /**
   *  Calculate R_AB by knowing one of B's unit vectors u1 (could be Bx, By, or Bz)<br>
   *  expressed in A and a vector v (also expressed in A) that is approximately in<br>
   *  the desired direction for a second one of B's unit vectors, u2 (!= u1).<br>
   *  If v is not perpendicular to u1, no worries - we'll find a direction for u2<br>
   *  that is perpendicular to u1 and comes closest to v. The third vector u3<br>
   *  is +/- u1 X u2, as appropriate for a right-handed rotation matrix.
   */
  public Rotation(UnitVec3 uveci, CoordinateAxis axisi, Vec3 vecjApprox, CoordinateAxis axisjApprox) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_10(UnitVec3.getCPtr(uveci), uveci, CoordinateAxis.getCPtr(axisi), axisi, Vec3.getCPtr(vecjApprox), vecjApprox, CoordinateAxis.getCPtr(axisjApprox), axisjApprox), true);
  }

  public Rotation setRotationFromTwoAxes(UnitVec3 uveci, CoordinateAxis axisi, Vec3 vecjApprox, CoordinateAxis axisjApprox) {
    return new Rotation(opensimSimbodyJNI.Rotation_setRotationFromTwoAxes(swigCPtr, this, UnitVec3.getCPtr(uveci), uveci, CoordinateAxis.getCPtr(axisi), axisi, Vec3.getCPtr(vecjApprox), vecjApprox, CoordinateAxis.getCPtr(axisjApprox), axisjApprox), false);
  }

  /**
   *  Converts rotation matrix to a single orientation angle.<br>
   *  Note:  The result is most meaningful if the Rotation_ matrix is one that can be produced by such a sequence.
   */
  public double convertOneAxisRotationToOneAngle(CoordinateAxis axis1) {
    return opensimSimbodyJNI.Rotation_convertOneAxisRotationToOneAngle(swigCPtr, this, CoordinateAxis.getCPtr(axis1), axis1);
  }

  /**
   *  Converts rotation matrix to two orientation angles.<br>
   *  Note:  The result is most meaningful if the Rotation_ matrix is one that can be produced by such a sequence.
   */
  public Vec2 convertTwoAxesRotationToTwoAngles(BodyOrSpaceType bodyOrSpace, CoordinateAxis axis1, CoordinateAxis axis2) {
    return new Vec2(opensimSimbodyJNI.Rotation_convertTwoAxesRotationToTwoAngles(swigCPtr, this, bodyOrSpace.swigValue(), CoordinateAxis.getCPtr(axis1), axis1, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  /**
   *  Converts rotation matrix to three orientation angles.<br>
   *  Note:  The result is most meaningful if the Rotation_ matrix is one that can be produced by such a sequence.
   */
  public Vec3 convertThreeAxesRotationToThreeAngles(BodyOrSpaceType bodyOrSpace, CoordinateAxis axis1, CoordinateAxis axis2, CoordinateAxis axis3) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertThreeAxesRotationToThreeAngles(swigCPtr, this, bodyOrSpace.swigValue(), CoordinateAxis.getCPtr(axis1), axis1, CoordinateAxis.getCPtr(axis2), axis2, CoordinateAxis.getCPtr(axis3), axis3), true);
  }

  /**
   *  Converts rotation matrix to a quaternion.
   */
  public Quaternion convertRotationToQuaternion() {
    return new Quaternion(opensimSimbodyJNI.Rotation_convertRotationToQuaternion(swigCPtr, this), true);
  }

  /**
   *  Converts rotation matrix to angle-axis form.
   */
  public Vec4 convertRotationToAngleAxis() {
    return new Vec4(opensimSimbodyJNI.Rotation_convertRotationToAngleAxis(swigCPtr, this), true);
  }

  /**
   *  A convenient special case of convertTwoAxesRotationToTwoAngles().
   */
  public Vec2 convertRotationToBodyFixedXY() {
    return new Vec2(opensimSimbodyJNI.Rotation_convertRotationToBodyFixedXY(swigCPtr, this), true);
  }

  /**
   *  A convenient special case of convertThreeAxesRotationToThreeAngles().
   */
  public Vec3 convertRotationToBodyFixedXYZ() {
    return new Vec3(opensimSimbodyJNI.Rotation_convertRotationToBodyFixedXYZ(swigCPtr, this), true);
  }

  /**
   *  Perform an efficient transform of a symmetric matrix that must be re-expressed with<br>
   *  a multiply from both left and right, such as an inertia matrix. Details: assuming<br>
   *  this Rotation is R_AB, and given a symmetric dyadic matrix S_BB expressed in B,<br>
   *  we can reexpress it in A using S_AA=R_AB*S_BB*R_BA. The matrix should be one that<br>
   *  is formed as products of vectors expressed in A, such as inertia, gyration or<br>
   *  covariance matrices. This can be done efficiently exploiting properties of R<br>
   *  (orthogonal) and S (symmetric). Total cost is 57 flops.<br>
   *  Return true if "this" Rotation is nearly identical to "R" within a specified pointing angle error
   */
  public boolean isSameRotationToWithinAngle(Rotation R, double okPointingAngleErrorRads) {
    return opensimSimbodyJNI.Rotation_isSameRotationToWithinAngle(swigCPtr, this, Rotation.getCPtr(R), R, okPointingAngleErrorRads);
  }

  public boolean isSameRotationToWithinAngleOfMachinePrecision(Rotation R) {
    return opensimSimbodyJNI.Rotation_isSameRotationToWithinAngleOfMachinePrecision(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  public double getMaxAbsDifferenceInRotationElements(Rotation R) {
    return opensimSimbodyJNI.Rotation_getMaxAbsDifferenceInRotationElements(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  public boolean areAllRotationElementsSameToEpsilon(Rotation R, double epsilon) {
    return opensimSimbodyJNI.Rotation_areAllRotationElementsSameToEpsilon(swigCPtr, this, Rotation.getCPtr(R), R, epsilon);
  }

  public boolean areAllRotationElementsSameToMachinePrecision(Rotation R) {
    return opensimSimbodyJNI.Rotation_areAllRotationElementsSameToMachinePrecision(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  /**
   *  Like copy constructor but for inverse rotation.  This allows implicit conversion from InverseRotation_ to Rotation_.
   */
  public Rotation(InverseRotation arg0) {
    this(opensimSimbodyJNI.new_Rotation__SWIG_11(InverseRotation.getCPtr(arg0), arg0), true);
  }

  /**
   *  Convert from Rotation_ to InverseRotation_ (no cost). Overrides base class invert().
   */
  public InverseRotation invert() {
    return new InverseRotation(opensimSimbodyJNI.Rotation_invert(swigCPtr, this), false);
  }

  /**
   *  Convert from Rotation_ to writable InverseRotation_ (no cost).<br>
   *  Transpose, and transpose operators. For an orthogonal matrix like this one, transpose<br>
   *  is the same thing as inversion. These override the base class transpose methods.
   */
  public InverseRotation transpose() {
    return new InverseRotation(opensimSimbodyJNI.Rotation_transpose(swigCPtr, this), false);
  }

  /**
   *  Conversion from Rotation to its base class Mat33.<br>
   *  Note: asMat33 is more efficient than toMat33() (no copy), but you have to know the internal layout.
   */
  public Mat33 asMat33() {
    return new Mat33(opensimSimbodyJNI.Rotation_asMat33(swigCPtr, this), false);
  }

  public Mat33 toMat33() {
    return new Mat33(opensimSimbodyJNI.Rotation_toMat33(swigCPtr, this), true);
  }

  /**
   *  Given cosines and sines (in that order) of three angles, set this<br>
   *  Rotation matrix to the body-fixed 1-2-3 sequence of those angles.<br>
   *  Cost is 18 flops.
   */
  public void setRotationToBodyFixedXYZ(Vec3 c, Vec3 s) {
    opensimSimbodyJNI.Rotation_setRotationToBodyFixedXYZ__SWIG_1(swigCPtr, this, Vec3.getCPtr(c), c, Vec3.getCPtr(s), s);
  }

  /**
   *  Given Euler angles forming a body-fixed 3-2-1 sequence, and the relative<br>
   *  angular velocity vector of B in the parent frame, *BUT EXPRESSED IN<br>
   *  THE BODY FRAME*, return the Euler angle<br>
   *  derivatives. You are dead if q[1] gets near 90 degrees!<br>
   *  See Kane's Spacecraft Dynamics, page 428, body-three: 3-2-1.
   */
  public static Vec3 convertAngVelToBodyFixed321Dot(Vec3 q, Vec3 w_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelToBodyFixed321Dot(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  /**
   *  Inverse of the above routine. Returned angular velocity is B in P,<br>
   *  expressed in *B*: w_PB_B.
   */
  public static Vec3 convertBodyFixed321DotToAngVel(Vec3 q, Vec3 qd) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertBodyFixed321DotToAngVel(Vec3.getCPtr(q), q, Vec3.getCPtr(qd), qd), true);
  }

  public static Vec3 convertAngVelDotToBodyFixed321DotDot(Vec3 q, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelDotToBodyFixed321DotDot(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  /**
   *  Given Euler angles q forming a body-fixed X-Y-Z sequence return the<br>
   *  block N_B of the system N matrix such that qdot=N_B(q)*w_PB_B where<br>
   *  w_PB_B is the angular velocity of B in P EXPRESSED IN *B*!!! Note that<br>
   *  N_B=N_P*R_PB. This matrix will be singular if Y (q[1]) gets near 90<br>
   *  degrees!<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.<br>
   * <br>
   *  Cost: about 100 flops for sin/cos plus 12 to calculate N_B.<br>
   *  @see Kane's Spacecraft Dynamics, page 427, body-three: 1-2-3.
   */
  public static Mat33 calcNForBodyXYZInBodyFrame(Vec3 q) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  /**
   *  This faster version of calcNForBodyXYZInBodyFrame() assumes you have<br>
   *  already calculated the cosine and sine of the three q's. Note that we<br>
   *  only look at the cosines and sines of q[1] and q[2]; q[0] does not<br>
   *  matter so you don't have to fill in the 0'th element of cq and sq.<br>
   *  Cost is one divide plus 6 flops, say 12 flops.
   */
  public static Mat33 calcNForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  /**
   *  Given Euler angles q forming a body-fixed X-Y-Z (123) sequence return<br>
   *  the block N_P of the system N matrix such that qdot=N_P(q)*w_PB where<br>
   *  w_PB is the angular velocity of B in P expressed in P (not the<br>
   *  convention that Kane uses, where angular velocities are expressed in<br>
   *  the outboard body B). Note that N_P = N_B*~R_PB. This matrix will be<br>
   *  singular if Y (q[1]) gets near 90 degrees!<br>
   * <br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.<br>
   * <br>
   *  Cost: about 100 flops for sin/cos plus 12 to calculate N_P.
   */
  public static Mat33 calcNForBodyXYZInParentFrame(Vec3 q) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  /**
   *  This faster version of calcNForBodyXYZInParentFrame() assumes you have<br>
   *  already calculated the cosine and sine of the three q's. Note that we<br>
   *  only look at the cosines and sines of q[0] and q[1]; q[2] does not<br>
   *  matter so you don't have to fill in the 3rd element of cq and sq.<br>
   *  Cost is one divide plus 6 flops, say 12 flops.<br>
   *  @see Paul Mitiguy
   */
  public static Mat33 calcNForBodyXYZInParentFrame(Vec3 cq, Vec3 sq) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNForBodyXYZInParentFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  /**
   *  This is the fastest way to form the product qdot=N_P*w_PB for a<br>
   *  body-fixed XYZ sequence where angular velocity of child in parent is<br>
   *  expected to be expressed in the parent. Here we assume you have<br>
   *  previously calculated sincos(qx), sincos(qy), and 1/cos(qy).<br>
   *  Cost is 10 flops, faster even than the 15 it would take if you had saved<br>
   *  N_P and then formed the N_P*w_PB product explicitly.
   */
  public static Vec3 multiplyByBodyXYZ_N_P(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 w_PB) {
    return new Vec3(opensimSimbodyJNI.Rotation_multiplyByBodyXYZ_N_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(w_PB), w_PB), true);
  }

  /**
   *  This is the fastest way to form the product v_P=~N_P*q=~(~q*N_P);<br>
   *  see the untransposed method multiplyByBodyXYZ_N_P() for information.<br>
   *  Cost is 9 flops.
   */
  public static Vec3 multiplyByBodyXYZ_NT_P(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 q) {
    return new Vec3(opensimSimbodyJNI.Rotation_multiplyByBodyXYZ_NT_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(q), q), true);
  }

  /**
   *  Calculate first time derivative qdot of body-fixed XYZ Euler angles q<br>
   *  given sines and cosines of the Euler angles and the angular velocity<br>
   *  w_PB of child B in parent P, expressed in P. Cost is 10 flops.<br>
   * <br>
   *  Theory: calculate qdot=N_P(q)*w_PB using multiplyByBodyXYZ_N_P().<br>
   *  @see multiplyByBodyXYZ_N_P()
   */
  public static Vec3 convertAngVelInParentToBodyXYZDot(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 w_PB) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelInParentToBodyXYZDot(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(w_PB), w_PB), true);
  }

  /**
   *  Calculate second time derivative qdotdot of body-fixed XYZ Euler<br>
   *  angles q given sines and cosines of the Euler angles, the first<br>
   *  derivative qdot and the angular acceleration b_PB of child B in<br>
   *  parent P, expressed in P. Cost is 22 flops.<br>
   * <br>
   *  Theory: we have qdot=N_P*w_PB, which we differentiate in P to<br>
   *  get qdotdot=N_P*b_PB + NDot_P*w_PB. Note that NDot_P=NDot_P(q,qdot)<br>
   *  and w_PB=NInv_P*qdot (because N_P is invertible). We can then rewrite<br>
   *  qdotdot=N_P*b_PB + NDot_P*(NInv_P*qdot) which can be calculated very<br>
   *  efficiently. The second term is just an acceleration remainder term<br>
   *  quadratic in qdot.
   */
  public static Vec3 convertAngAccInParentToBodyXYZDotDot(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 qdot, Vec3 b_PB) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngAccInParentToBodyXYZDotDot(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(qdot), qdot, Vec3.getCPtr(b_PB), b_PB), true);
  }

  /**
   *  Fastest way to form the product w_PB=NInv_P*qdot. This is never<br>
   *  singular. Cost is 9 flops.
   */
  public static Vec3 multiplyByBodyXYZ_NInv_P(Vec2 cosxy, Vec2 sinxy, Vec3 qdot) {
    return new Vec3(opensimSimbodyJNI.Rotation_multiplyByBodyXYZ_NInv_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  Fastest way to form the product q=~NInv_P*v_P=~(~v_P*NInv_P).<br>
   *  This is never singular. Cost is 10 flops.
   */
  public static Vec3 multiplyByBodyXYZ_NInvT_P(Vec2 cosxy, Vec2 sinxy, Vec3 v_P) {
    return new Vec3(opensimSimbodyJNI.Rotation_multiplyByBodyXYZ_NInvT_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, Vec3.getCPtr(v_P), v_P), true);
  }

  /**
   *  Given Euler angles forming a body-fixed X-Y-Z (123) sequence q, and<br>
   *  their time derivatives qdot, return the block of the NDot matrix such<br>
   *  that qdotdot=N(q)*wdot + NDot(q,u)*w where w is the angular velocity<br>
   *  of B in P EXPRESSED IN *B*!!! This matrix will be singular if Y (q[1])<br>
   *  gets near 90 degrees! See calcNForBodyXYZInBodyFrame() for the matrix<br>
   *  we're differentiating here.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Mat33 calcNDotForBodyXYZInBodyFrame(Vec3 q, Vec3 qdot) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNDotForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  This faster version of calcNDotForBodyXYZInBodyFrame() assumes you<br>
   *  have already calculated the cosine and sine of the three q's. Note<br>
   *  that we only look at the cosines and sines of q[1] and q[2]; q[0] does<br>
   *  not matter so you don't have to fill in the 0'th element of cq and sq.<br>
   *  Cost is one divide plus 21 flops.
   */
  public static Mat33 calcNDotForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq, Vec3 qdot) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNDotForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  Given Euler angles forming a body-fixed X-Y-Z (123) sequence q, and<br>
   *  their time derivatives qdot, return the block of the NDot matrix such<br>
   *  that qdotdot=N(q)*wdot + NDot(q,u)*w where w is the angular velocity of<br>
   *  B in P expressed in P. This matrix will be singular if Y (q[1]) gets<br>
   *  near 90 degrees! See calcNForBodyXYZInParentFrame() for the matrix<br>
   *  we're differentiating here.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Mat33 calcNDotForBodyXYZInParentFrame(Vec3 q, Vec3 qdot) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNDotForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  This faster version of calcNDotForBodyXYZInParentFrame() assumes you<br>
   *  have already calculated the cosine and sine of the three q's. Note that<br>
   *  we only look at the cosines and sines of q[0] and q[1].<br>
   *  Cost is 21 flops.
   */
  public static Mat33 calcNDotForBodyXYZInParentFrame(Vec2 cq, Vec2 sq, double ooc1, Vec3 qdot) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNDotForBodyXYZInParentFrame__SWIG_1(Vec2.getCPtr(cq), cq, Vec2.getCPtr(sq), sq, ooc1, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  Inverse of routine calcNForBodyXYZInBodyFrame(). Return the inverse<br>
   *  NInv_B of the N_B block computed above, such that w_PB_B=NInv_B(q)*qdot<br>
   *  where w_PB_B is the angular velocity of B in P EXPRESSED IN *B*!!!<br>
   *  (Kane's convention.) Note that NInv_B=~R_PB*NInv_P. This matrix is<br>
   *  never singular.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Mat33 calcNInvForBodyXYZInBodyFrame(Vec3 q) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNInvForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  /**
   *  This faster version of calcNInvForBodyXYZInBodyFrame() assumes you have<br>
   *  already calculated the cosine and sine of the three q's. Note that we<br>
   *  only look at the cosines and sines of q[1] and q[2]; q[0] does not<br>
   *  matter so you don't have to fill in the 0'th element of cq and sq.<br>
   *  Cost is 3 flops.
   */
  public static Mat33 calcNInvForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNInvForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  /**
   *  Inverse of the above routine. Return the inverse NInv_P of the N_P<br>
   *  block computed above, such that w_PB=NInv_P(q)*qdot where w_PB is the<br>
   *  angular velocity of B in P (expressed in P). Note that<br>
   *  NInv_P=R_PB*NInv_B. This matrix is never singular.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Mat33 calcNInvForBodyXYZInParentFrame(Vec3 q) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNInvForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  /**
   *  This faster version of calcNInvForBodyXYZInParentFrame() assumes you<br>
   *  have already calculated the cosine and sine of the three q's. Note that<br>
   *  we only look at the cosines and sines of q[0] and q[1]; q[2] does not<br>
   *  matter so you don't have to fill in the 3rd element of cq and sq.<br>
   *  Cost is 3 flops.
   */
  public static Mat33 calcNInvForBodyXYZInParentFrame(Vec3 cq, Vec3 sq) {
    return new Mat33(opensimSimbodyJNI.Rotation_calcNInvForBodyXYZInParentFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  /**
   *  Given Euler angles forming a body-fixed X-Y-Z (123) sequence, and the<br>
   *  relative angular velocity vector w_PB_B of B in the parent frame,<br>
   *  <em>BUT EXPRESSED IN THE BODY FRAME</em>, return the Euler angle<br>
   *  derivatives. You are dead if q[1] gets near 90 degrees!<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.<br>
   *  @see Kane's Spacecraft Dynamics, page 427, body-three: 1-2-3.
   */
  public static Vec3 convertAngVelInBodyFrameToBodyXYZDot(Vec3 q, Vec3 w_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelInBodyFrameToBodyXYZDot__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  /**
   *  This faster version of convertAngVelInBodyFrameToBodyXYZDot() assumes<br>
   *  you have already calculated the cosine and sine of the three q's. Note<br>
   *  that we only look at the cosines and sines of q[1] and q[2]; q[0] does<br>
   *  not matter so you don't have to fill in the 0'th element of cq and sq.<br>
   *  Cost is XXX.
   */
  public static Vec3 convertAngVelInBodyFrameToBodyXYZDot(Vec3 cq, Vec3 sq, Vec3 w_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelInBodyFrameToBodyXYZDot__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  /**
   *  Inverse of the above routine. Returned angular velocity is B in P,<br>
   *  expressed in *B*: w_PB_B.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Vec3 convertBodyXYZDotToAngVelInBodyFrame(Vec3 q, Vec3 qdot) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertBodyXYZDotToAngVelInBodyFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  This faster version of convertBodyXYZDotToAngVelInBodyFrame() assumes<br>
   *  you have already calculated the cosine and sine of the three q's. Note<br>
   *  that we only look at the cosines and sines of q[1] and q[2]; q[0] does<br>
   *  not matter so you don't have to fill in the 0'th element of cq and sq.<br>
   *  Cost is XXX flops.
   */
  public static Vec3 convertBodyXYZDotToAngVelInBodyFrame(Vec3 cq, Vec3 sq, Vec3 qdot) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertBodyXYZDotToAngVelInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(qdot), qdot), true);
  }

  /**
   *  TODO: sherm: is this right? Warning: everything is measured in the<br>
   * PARENT* frame, but has to be expressed in the *BODY* frame.<br>
   *  Note: This version is very expensive because it has to calculate sines<br>
   *        and cosines. If you already have those, use the alternate form<br>
   *        of this method.
   */
  public static Vec3 convertAngVelDotInBodyFrameToBodyXYZDotDot(Vec3 q, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelDotInBodyFrameToBodyXYZDotDot__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  /**
   *  This faster version of convertAngVelDotInBodyFrameToBodyXYZDotDot()<br>
   *  assumes you have already calculated the cosine and sine of the three<br>
   *  q's. Note that we only look at the cosines and sines of q[1] and q[2];<br>
   *  q[0] does not matter so you don't have to fill in the 0'th element of<br>
   *  cq and sq.<br>
   *  Cost is XXX flops.
   */
  public static Vec3 convertAngVelDotInBodyFrameToBodyXYZDotDot(Vec3 cq, Vec3 sq, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertAngVelDotInBodyFrameToBodyXYZDotDot__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  /**
   *  Given a possibly unnormalized quaternion (0th element is the scalar) and the<br>
   *  relative angular velocity vector of B in its parent, expressed<br>
   *  in the *PARENT*, return the quaternion derivatives. This is never singular.<br>
   *  Cost is 27 flops.
   */
  public static Vec4 convertAngVelToQuaternionDot(Vec4 q, Vec3 w_PB_P) {
    return new Vec4(opensimSimbodyJNI.Rotation_convertAngVelToQuaternionDot(Vec4.getCPtr(q), q, Vec3.getCPtr(w_PB_P), w_PB_P), true);
  }

  /**
   *  Inverse of the above routine. Returned AngVel is expressed in<br>
   *  the *PARENT* frame: w_PB_P.<br>
   *  Cost is 28 flops.
   */
  public static Vec3 convertQuaternionDotToAngVel(Vec4 q, Vec4 qdot) {
    return new Vec3(opensimSimbodyJNI.Rotation_convertQuaternionDotToAngVel(Vec4.getCPtr(q), q, Vec4.getCPtr(qdot), qdot), true);
  }

  /**
   *  We want to differentiate qdot=N(q)*w to get qdotdot=N*b+NDot*w where<br>
   *  b is angular acceleration wdot. Note that NDot=NDot(qdot), but it is<br>
   *  far better to calculate the matrix-vector product NDot(N*w)*w directly<br>
   *  rather than calculate NDot separately. That gives<br>
   *  <pre>NDot*w = -(w^2)/4 * q</pre><br>
   *  Cost is 41 flops.
   */
  public static Vec4 convertAngVelDotToQuaternionDotDot(Vec4 q, Vec3 w_PB, Vec3 b_PB) {
    return new Vec4(opensimSimbodyJNI.Rotation_convertAngVelDotToQuaternionDotDot(Vec4.getCPtr(q), q, Vec3.getCPtr(w_PB), w_PB, Vec3.getCPtr(b_PB), b_PB), true);
  }

  public Vec3 multiply(Vec3 v) {
    return new Vec3(opensimSimbodyJNI.Rotation_multiply__SWIG_0(swigCPtr, this, Vec3.getCPtr(v), v), true);
  }

  public Rotation multiply(Rotation r) {
    return new Rotation(opensimSimbodyJNI.Rotation_multiply__SWIG_1(swigCPtr, this, Rotation.getCPtr(r), r), true);
  }

  public Rotation multiply(InverseRotation r) {
    return new Rotation(opensimSimbodyJNI.Rotation_multiply__SWIG_2(swigCPtr, this, InverseRotation.getCPtr(r), r), true);
  }

  public RowVectorVec3 multiply(RowVectorVec3 row) {
    return new RowVectorVec3(opensimSimbodyJNI.Rotation_multiply__SWIG_3(swigCPtr, this, RowVectorVec3.getCPtr(row), row), true);
  }

  public RowVectorVec3 multiply(RowVectorViewVec3 row) {
    return new RowVectorVec3(opensimSimbodyJNI.Rotation_multiply__SWIG_4(swigCPtr, this, RowVectorViewVec3.getCPtr(row), row), true);
  }

}