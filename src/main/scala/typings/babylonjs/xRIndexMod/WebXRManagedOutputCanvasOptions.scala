package typings.babylonjs.xRIndexMod

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRManagedOutputCanvasOptions")
@js.native
open class WebXRManagedOutputCanvasOptions ()
  extends typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
/* static members */
object WebXRManagedOutputCanvasOptions {
  
  @JSImport("babylonjs/XR/index", "WebXRManagedOutputCanvasOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default values of the configuration object
    * @param engine defines the engine to use (can be null)
    * @returns default values of this configuration object
    */
  inline def GetDefaults(): typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")().asInstanceOf[typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
  inline def GetDefaults(engine: ThinEngine): typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
}
