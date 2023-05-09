package typings.babylonjs.BABYLON

import typings.babylonjs.GPUSamplerBindingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUSamplerDescription extends StObject {
  
  var binding: WebGPUBindingInfo
  
  var `type`: GPUSamplerBindingType
}
object WebGPUSamplerDescription {
  
  inline def apply(binding: WebGPUBindingInfo, `type`: GPUSamplerBindingType): WebGPUSamplerDescription = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPUSamplerDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPUSamplerDescription] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: WebGPUBindingInfo): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setType(value: GPUSamplerBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
