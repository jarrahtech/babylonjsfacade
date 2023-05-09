package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraTouchInput
  extends StObject
     with ICameraInput[FreeCamera] {
  
  /* private */ var _isSafari: Any = js.native
  
  /* private */ var _observer: Any = js.native
  
  /* private */ var _offsetX: Any = js.native
  
  /* private */ var _offsetY: Any = js.native
  
  /* private */ var _onLostFocus: Any = js.native
  
  /* private */ var _pointerInput: Any = js.native
  
  /* private */ var _pointerPressed: Any = js.native
  
  /**
    * Define if mouse events can be treated as touch events
    */
  var allowMouse: Boolean = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraTouchInput: FreeCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraTouchInput(): Unit = js.native
  
  /**
    * Swap touch actions so that one touch is used for rotation and multiple for movement
    */
  var singleFingerRotate: Boolean = js.native
  
  /**
    * Defines the touch sensibility for rotation.
    * The lower the faster.
    */
  var touchAngularSensibility: Double = js.native
  
  /**
    * Defines the touch sensibility for move.
    * The lower the faster.
    */
  var touchMoveSensibility: Double = js.native
}