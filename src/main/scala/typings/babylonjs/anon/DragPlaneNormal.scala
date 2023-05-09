package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PointerInfo
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragPlaneNormal extends StObject {
  
  var delta: Vector3
  
  var dragDistance: Double
  
  var dragPlaneNormal: Vector3
  
  var dragPlanePoint: Vector3
  
  var pointerId: Double
  
  var pointerInfo: Nullable[PointerInfo]
}
object DragPlaneNormal {
  
  inline def apply(
    delta: Vector3,
    dragDistance: Double,
    dragPlaneNormal: Vector3,
    dragPlanePoint: Vector3,
    pointerId: Double
  ): DragPlaneNormal = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], dragDistance = dragDistance.asInstanceOf[js.Any], dragPlaneNormal = dragPlaneNormal.asInstanceOf[js.Any], dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerInfo = null)
    __obj.asInstanceOf[DragPlaneNormal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragPlaneNormal] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Vector3): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
    
    inline def setDragPlaneNormal(value: Vector3): Self = StObject.set(x, "dragPlaneNormal", value.asInstanceOf[js.Any])
    
    inline def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: Nullable[PointerInfo]): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
    
    inline def setPointerInfoNull: Self = StObject.set(x, "pointerInfo", null)
  }
}
