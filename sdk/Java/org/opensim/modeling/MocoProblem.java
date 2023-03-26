/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A description of an optimal control problem, backed by %OpenSim Model%s.<br>
 * A MocoProblem is a series of phases, each of which contains the following:<br>
 *   - OpenSim Model<br>
 *   - state and control variable info (e.g., bounds)<br>
 *   - parameter variables (model properties)<br>
 *   - goals (costs and endpoint constraints)<br>
 *   - path constraints<br>
 * <br>
 * Currently, only single-phase problems are supported.<br>
 * This class has convenience methods to configure the first (0-th) phase.<br>
 * <br>
 * This class allows you to define your problem, but does not let you do<br>
 * anything with your problem (this class only contains user input).<br>
 * Use createRep() to create an instance of MocoProblemRep,<br>
 * which provides additional functionality. 
 */
public class MocoProblem extends OpenSimObject {
  private transient long swigCPtr;

  public MocoProblem(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoProblem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoProblem obj) {
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
        opensimMocoJNI.delete_MocoProblem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public void setModel(Model model) {
        private_setModel(model);
        model.markAdopted();
    }
    public void addParameter(MocoParameter obj) {
        private_addParameter(obj);
        obj.markAdopted();
    }
    public void addGoal(MocoGoal obj) {
        private_addGoal(obj);
        obj.markAdopted();
    }
    public void addPathConstraint(MocoPathConstraint obj) {
        private_addPathConstraint(obj);
        obj.markAdopted();
    }
    public void setTimeBounds(double[] ib, double[] fb) throws Exception {
        setTimeBounds(MocoPhase.convertArrayToMIB(ib),
            MocoPhase.convertArrayToMFB(fb));
    }
    public void setStateInfo(String name, double[] b)
        throws Exception {
        setStateInfo(name, MocoPhase.convertArrayToMB(b));
    }
    public void setStateInfo(String name, double[] b, double[] ib)
        throws Exception {
        setStateInfo(name, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib));
    }
    public void setStateInfo(String name, double[] b, double[] ib, double[] fb)
        throws Exception {
        setStateInfo(name, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib), 
                MocoPhase.convertArrayToMFB(fb));
    }
    public void setStateInfoPattern(String pattern, double[] b)
        throws Exception {
        setStateInfoPattern(pattern, MocoPhase.convertArrayToMB(b));
    }
    public void setStateInfoPattern(String pattern, double[] b, double[] ib)
        throws Exception {
        setStateInfoPattern(pattern, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib));
    }
    public void 
    setStateInfoPattern(String pattern, double[] b, double[] ib, double[] fb) 
        throws Exception {
        setStateInfoPattern(pattern, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib), 
                MocoPhase.convertArrayToMFB(fb));
    }

    public void setControlInfo(String name, double[] b)
        throws Exception {
        setControlInfo(name, MocoPhase.convertArrayToMB(b));
    }
    public void setControlInfo(String name, double[] b, double[] ib)
        throws Exception {
        setControlInfo(name, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib));
    }
    public void setControlInfo(String name, double[] b, double[] ib,
            double[] fb)
        throws Exception {
        setControlInfo(name, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib), 
                MocoPhase.convertArrayToMFB(fb));
    }
    public void setControlInfoPattern(String pattern, double[] b)
        throws Exception {
        setControlInfoPattern(pattern, MocoPhase.convertArrayToMB(b));
    }
    public void setControlInfoPattern(String pattern, double[] b, double[] ib)
        throws Exception {
        setControlInfoPattern(pattern, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib));
    }
    public void 
    setControlInfoPattern(String pattern, double[] b, double[] ib, double[] fb)
        throws Exception {
        setControlInfoPattern(pattern, MocoPhase.convertArrayToMB(b),
                MocoPhase.convertArrayToMIB(ib), 
                MocoPhase.convertArrayToMFB(fb));
    }

  public static MocoProblem safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoProblem_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoProblem(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoProblem_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoProblem_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoProblem_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoProblem(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoProblem_getConcreteClassName(swigCPtr, this);
  }

  public MocoProblem() {
    this(opensimMocoJNI.new_MocoProblem(), true);
  }

  /**
   *  Set the model to use for phase 0.<br>
   *  @see MocoPhase#setModelAsCopy().
   */
  public Model setModelAsCopy(Model model) {
    long cPtr = opensimMocoJNI.MocoProblem_setModelAsCopy(swigCPtr, this, Model.getCPtr(model), model);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  /**
   *  Update the model in phase 0.
   */
  public Model updModel() {
    return new Model(opensimMocoJNI.MocoProblem_updModel(swigCPtr, this), false);
  }

  /**
   *  Set a model processor for phase 0.<br>
   *  @see MocoPhase#setModelProcessor().
   */
  public void setModelProcessor(ModelProcessor model) {
    opensimMocoJNI.MocoProblem_setModelProcessor(swigCPtr, this, ModelProcessor.getCPtr(model), model);
  }

  /**
   *  Set time bounds for phase 0.
   */
  public void setTimeBounds(MocoInitialBounds arg0, MocoFinalBounds arg1) {
    opensimMocoJNI.MocoProblem_setTimeBounds(swigCPtr, this, MocoInitialBounds.getCPtr(arg0), arg0, MocoFinalBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Find and print the names of all state variables containing a substring.
   */
  public void printStateNamesWithSubstring(String name) {
    opensimMocoJNI.MocoProblem_printStateNamesWithSubstring(swigCPtr, this, name);
  }

  /**
   *  Set bounds for a state variable for phase 0.
   */
  public void setStateInfo(String name, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoProblem_setStateInfo__SWIG_0(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set bounds for a state variable for phase 0.
   */
  public void setStateInfo(String name, MocoBounds arg1, MocoInitialBounds arg2) {
    opensimMocoJNI.MocoProblem_setStateInfo__SWIG_1(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2);
  }

  /**
   *  Set bounds for a state variable for phase 0.
   */
  public void setStateInfo(String name, MocoBounds arg1) {
    opensimMocoJNI.MocoProblem_setStateInfo__SWIG_2(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Set bounds for all state variables for phase 0 whose path matches<br>
   *  the provided pattern.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds, MocoInitialBounds init, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoProblem_setStateInfoPattern__SWIG_0(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set bounds for all state variables for phase 0 whose path matches<br>
   *  the provided pattern.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds, MocoInitialBounds init) {
    opensimMocoJNI.MocoProblem_setStateInfoPattern__SWIG_1(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init);
  }

  /**
   *  Set bounds for all state variables for phase 0 whose path matches<br>
   *  the provided pattern.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds) {
    opensimMocoJNI.MocoProblem_setStateInfoPattern__SWIG_2(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Find and print the names of all state variables containing a substring.
   */
  public void printControlNamesWithSubstring(String name) {
    opensimMocoJNI.MocoProblem_printControlNamesWithSubstring(swigCPtr, this, name);
  }

  /**
   *  Set bounds for a control variable for phase 0.
   */
  public void setControlInfo(String name, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoProblem_setControlInfo__SWIG_0(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set bounds for a control variable for phase 0.
   */
  public void setControlInfo(String name, MocoBounds arg1, MocoInitialBounds arg2) {
    opensimMocoJNI.MocoProblem_setControlInfo__SWIG_1(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2);
  }

  /**
   *  Set bounds for a control variable for phase 0.
   */
  public void setControlInfo(String name, MocoBounds arg1) {
    opensimMocoJNI.MocoProblem_setControlInfo__SWIG_2(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Set bounds for a control variable using a regular expression.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoProblem_setControlInfoPattern__SWIG_0(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set bounds for a control variable using a regular expression.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1, MocoInitialBounds arg2) {
    opensimMocoJNI.MocoProblem_setControlInfoPattern__SWIG_1(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2);
  }

  /**
   *  Set bounds for a control variable using a regular expression.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1) {
    opensimMocoJNI.MocoProblem_setControlInfoPattern__SWIG_2(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Set bounds for the kinematic constraints in phase 0.
   */
  public void setKinematicConstraintBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoProblem_setKinematicConstraintBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Set bounds for the Lagrange multipliers in phase 0.
   */
  public void setMultiplierBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoProblem_setMultiplierBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Returns a reference to the goal with name "name" in phase 0.
   */
  public MocoGoal updGoal(String name) {
    return new MocoGoal(opensimMocoJNI.MocoProblem_updGoal(swigCPtr, this, name), false);
  }

  /**
   *  <br>
   *  Get a modifiable phase of the problem by index (starting index of 0).<br>
   *  This accesses the internal phases property.
   */
  public MocoPhase updPhase(int index) {
    return new MocoPhase(opensimMocoJNI.MocoProblem_updPhase__SWIG_0(swigCPtr, this, index), false);
  }

  /**
   *  <br>
   *  Get a modifiable phase of the problem by index (starting index of 0).<br>
   *  This accesses the internal phases property.
   */
  public MocoPhase updPhase() {
    return new MocoPhase(opensimMocoJNI.MocoProblem_updPhase__SWIG_1(swigCPtr, this), false);
  }

  /**
   *  Get a modifiable phase of the problem by index (starting index of 0).<br>
   *  This accesses the internal phases property.
   */
  public MocoPhase getPhase(int index) {
    return new MocoPhase(opensimMocoJNI.MocoProblem_getPhase__SWIG_0(swigCPtr, this, index), false);
  }

  /**
   *  Get a modifiable phase of the problem by index (starting index of 0).<br>
   *  This accesses the internal phases property.
   */
  public MocoPhase getPhase() {
    return new MocoPhase(opensimMocoJNI.MocoProblem_getPhase__SWIG_1(swigCPtr, this), false);
  }

  /**
   *  Use this variant of createRep() if you require the MocoProblemRep to be<br>
   *  dynamically-allocated MocoProblemRep.
   */
  public MocoProblemRep createRep() {
long cPtr = opensimMocoJNI.MocoProblem_createRep(swigCPtr, this);
return (cPtr == 0) ? null : new MocoProblemRep(cPtr, true);
}

  private void private_setModel(Model model) {
    opensimMocoJNI.MocoProblem_private_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  private void private_addParameter(MocoParameter ptr) {
    opensimMocoJNI.MocoProblem_private_addParameter(swigCPtr, this, MocoParameter.getCPtr(ptr), ptr);
  }

  private void private_addGoal(MocoGoal ptr) {
    opensimMocoJNI.MocoProblem_private_addGoal(swigCPtr, this, MocoGoal.getCPtr(ptr), ptr);
  }

  private void private_addPathConstraint(MocoPathConstraint ptr) {
    opensimMocoJNI.MocoProblem_private_addPathConstraint(swigCPtr, this, MocoPathConstraint.getCPtr(ptr), ptr);
  }

}