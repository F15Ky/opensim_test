/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This defines the abstract ModelComponent class, which is used to specify <br>
 * components of a musculoskeletal model and the elements they add to the <br>
 * underlying computational SimTK::System (MultibodySystem). A ModelComponent is <br>
 * an OpenSim::Component and therefore has the capabilities to add necessary<br>
 * system resources to the System and to manage access to those resources (@see Component)<br>
 * <br>
 * Bodies, Joints, Coordinates, Constraints, Forces, Actuators, Controllers, <br>
 * and even Model itself, are ModelComponents. Each component is "connected" to<br>
 * a model and an underlying SimTK::Subsystem, which by default is the <br>
 * System's DefaultSubsystem.<br>
 * <br>
 * The primary responsibility of a ModelComponent is to add its computational <br>
 * representation(s) of physical musculoskeletal structures to the underlying<br>
 * SimTK::System by implementing extendAddToSystem().<br>
 * <br>
 * Additional methods provide support for adding modeling options, state and<br>
 * cache variables (@see Component).<br>
 * <br>
 * Public methods enable access to component variables via their names.<br>
 * <br>
 * @author Ajay Seth, Michael Sherman
 */
public class ModelComponent extends Component {
  private transient long swigCPtr;

  public ModelComponent(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponent obj) {
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
        opensimSimulationJNI.delete_ModelComponent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponent safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponent_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponent_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponent_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponent_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponent_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Connect this ModelComponent to its aggregate- a  Model 
   */
  public void connectToModel(Model model) {
    opensimSimulationJNI.ModelComponent_connectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  /**
   *  Get a const reference to the Model this component is part of. 
   */
  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponent_getModel(swigCPtr, this), false);
  }

  /**
   *  Get a modifiable reference to the Model this component is part of. 
   */
  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponent_updModel(swigCPtr, this), false);
  }

  /**
   *  Does this ModelComponent have a Model associated with it? 
   */
  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponent_hasModel(swigCPtr, this);
  }

  /**
   *  Perform any computations that must occur before ModelComponent::scale()<br>
   *         is invoked on all ModelComponents in the Model. For example, a<br>
   *         GeometryPath must calculate and store its path length in the original<br>
   *         model before scaling so that an owning Muscle can use this information<br>
   *         to update the properties of the muscle after scaling. This method calls<br>
   *         the virtual extendPreScale() method, which may be implemented by any<br>
   *         subclass of ModelComponent.<br>
   *         @see extendPreScale()        @see scale()        @see postScale() 
   */
  public void preScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_preScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

  /**
   *  Scale the ModelComponent. This method calls the virtual extendScale()<br>
   *         method, which may be implemented by any subclass of ModelComponent.<br>
   *         @see preScale()        @see extendScale()        @see postScale() 
   */
  public void scale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_scale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

  /**
   *  Perform any computations that must occur after ModelComponent::scale()<br>
   *         has been invoked on all ModelComponents in the Model. This method calls<br>
   *         the virtual extendPostScale() method, which may be implemented by any<br>
   *         subclass of ModelComponent.<br>
   *         @see preScale()        @see scale()        @see extendPostScale() 
   */
  public void postScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_postScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}