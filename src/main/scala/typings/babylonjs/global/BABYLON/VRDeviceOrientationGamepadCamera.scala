package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRDeviceOrientationGamepadCamera")
@js.native
open class VRDeviceOrientationGamepadCamera protected ()
  extends StObject
     with typings.babylonjs.BABYLON.VRDeviceOrientationGamepadCamera {
  /**
    * Creates a new VRDeviceOrientationGamepadCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distortion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    compensateDistortion: Boolean,
    vrCameraMetrics: typings.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typings.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
