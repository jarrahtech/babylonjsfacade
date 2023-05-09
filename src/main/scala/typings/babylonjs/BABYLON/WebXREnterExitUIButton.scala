package typings.babylonjs.BABYLON

import org.scalajs.dom.HTMLElement
import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXREnterExitUIButton extends StObject {
  
  /** button element */
  var element: HTMLElement
  
  /** Reference space type */
  var referenceSpaceType: XRReferenceSpaceType
  
  /** XR initialization options for the button */
  var sessionMode: XRSessionMode
  
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit
}
object WebXREnterExitUIButton {
  
  inline def apply(
    element: HTMLElement,
    referenceSpaceType: XRReferenceSpaceType,
    sessionMode: XRSessionMode,
    update: Nullable[WebXREnterExitUIButton] => Unit
  ): WebXREnterExitUIButton = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], referenceSpaceType = referenceSpaceType.asInstanceOf[js.Any], sessionMode = sessionMode.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebXREnterExitUIButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXREnterExitUIButton] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setReferenceSpaceType(value: XRReferenceSpaceType): Self = StObject.set(x, "referenceSpaceType", value.asInstanceOf[js.Any])
    
    inline def setSessionMode(value: XRSessionMode): Self = StObject.set(x, "sessionMode", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Nullable[WebXREnterExitUIButton] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
