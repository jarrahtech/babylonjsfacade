package typings.babylonjs.BABYLON

import typings.babylonjs.anon.CustomMeshes
import typings.babylonjs.anon.Invisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRHandTrackingOptions extends StObject {
  
  /**
    * Configuration object for the hand meshes.
    */
  var handMeshes: js.UndefOr[CustomMeshes] = js.undefined
  
  /**
    * Configuration object for the joint meshes.
    */
  var jointMeshes: js.UndefOr[Invisible] = js.undefined
  
  /**
    * The xrInput that will be used as source for new hands
    */
  var xrInput: WebXRInput
}
object IWebXRHandTrackingOptions {
  
  inline def apply(xrInput: WebXRInput): IWebXRHandTrackingOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHandTrackingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRHandTrackingOptions] (val x: Self) extends AnyVal {
    
    inline def setHandMeshes(value: CustomMeshes): Self = StObject.set(x, "handMeshes", value.asInstanceOf[js.Any])
    
    inline def setHandMeshesUndefined: Self = StObject.set(x, "handMeshes", js.undefined)
    
    inline def setJointMeshes(value: Invisible): Self = StObject.set(x, "jointMeshes", value.asInstanceOf[js.Any])
    
    inline def setJointMeshesUndefined: Self = StObject.set(x, "jointMeshes", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
