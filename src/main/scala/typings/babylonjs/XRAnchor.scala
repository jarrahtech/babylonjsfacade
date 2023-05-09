package typings.babylonjs

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRAnchor extends StObject {
  
  var anchorSpace: EventTarget
  
  def delete(): Unit
}
object XRAnchor {
  
  inline def apply(anchorSpace: EventTarget, delete: () => Unit): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[XRAnchor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRAnchor] (val x: Self) extends AnyVal {
    
    inline def setAnchorSpace(value: EventTarget): Self = StObject.set(x, "anchorSpace", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
  }
}
