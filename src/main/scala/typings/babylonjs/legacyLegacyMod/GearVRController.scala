package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GearVRController")
@js.native
open class GearVRController protected ()
  extends typings.babylonjs.indexMod.GearVRController {
  /**
    * Creates a new GearVRController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: Any) = this()
}
/* static members */
object GearVRController {
  
  @JSImport("babylonjs/Legacy/legacy", "GearVRController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gamepad Id prefix used to identify this controller.
    */
  @JSImport("babylonjs/Legacy/legacy", "GearVRController.GAMEPAD_ID_PREFIX")
  @js.native
  val GAMEPAD_ID_PREFIX: String = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "GearVRController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "GearVRController.MODEL_FILENAME")
  @js.native
  def MODEL_FILENAME: String = js.native
  inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
}
