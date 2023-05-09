package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRMeshDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRMeshDetector")
@js.native
open class WebXRMeshDetector protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRMeshDetector {
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRMeshDetectorOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRMeshDetector {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRMeshDetector.Name")
  @js.native
  val Name: /* "xr-mesh-detection" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRMeshDetector.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
