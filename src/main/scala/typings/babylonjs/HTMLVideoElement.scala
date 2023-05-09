package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLVideoElement extends StObject {
  
  var mozSrcObject: Any
}
object HTMLVideoElement {
  
  inline def apply(mozSrcObject: Any): HTMLVideoElement = {
    val __obj = js.Dynamic.literal(mozSrcObject = mozSrcObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLVideoElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLVideoElement] (val x: Self) extends AnyVal {
    
    inline def setMozSrcObject(value: Any): Self = StObject.set(x, "mozSrcObject", value.asInstanceOf[js.Any])
  }
}
