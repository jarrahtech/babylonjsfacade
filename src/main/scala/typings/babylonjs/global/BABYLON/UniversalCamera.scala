package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.UniversalCamera")
@js.native
open class UniversalCamera protected ()
  extends StObject
     with typings.babylonjs.BABYLON.UniversalCamera {
  /**
    * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
    * which still works and will still be found in many Playgrounds.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/camera_introduction#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  
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
