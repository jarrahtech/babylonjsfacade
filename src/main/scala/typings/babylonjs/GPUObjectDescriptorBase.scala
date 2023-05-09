package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUObjectDescriptorBase extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object GPUObjectDescriptorBase {
  
  inline def apply(): GPUObjectDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUObjectDescriptorBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUObjectDescriptorBase] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
