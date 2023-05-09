package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.IMotionControllerLayout
import typings.babylonjs.BABYLON.MotionControllerHandedness
import typings.babylonjs.anon.Meshes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.WebXRAbstractMotionController")
@js.native
open class WebXRAbstractMotionController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRAbstractMotionController {
  /**
    * constructs a new abstract motion controller
    * @param scene the scene to which the model of the controller will be added
    * @param layout The profile layout to load
    * @param gamepadObject The gamepad object correlating to this controller
    * @param handedness handedness (left/right/none) of this controller
    * @param _doNotLoadControllerMesh set this flag to ignore the mesh loading
    * @param _controllerCache a cache holding controller models already loaded in this session
    */
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness,
    /**
    * @internal
    */
  _doNotLoadControllerMesh: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness,
    /**
    * @internal
    */
  _doNotLoadControllerMesh: Boolean,
    _controllerCache: js.Array[Meshes]
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness,
    /**
    * @internal
    */
  _doNotLoadControllerMesh: Unit,
    _controllerCache: js.Array[Meshes]
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
