package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Arc2")
@js.native
open class Arc2 protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Arc2 {
  /**
    * Creates an Arc object from the three given points : start, middle and end.
    * @param startPoint Defines the start point of the arc
    * @param midPoint Defines the middle point of the arc
    * @param endPoint Defines the end point of the arc
    */
  def this(
    /** Defines the start point of the arc */
  startPoint: typings.babylonjs.BABYLON.Vector2,
    /** Defines the mid point of the arc */
  midPoint: typings.babylonjs.BABYLON.Vector2,
    /** Defines the end point of the arc */
  endPoint: typings.babylonjs.BABYLON.Vector2
  ) = this()
  
  /**
    * Defines the angle of the arc (from mid point to end point).
    */
  /* CompleteClass */
  var angle: typings.babylonjs.BABYLON.Angle = js.native
  
  /**
    * Defines the center point of the arc.
    */
  /* CompleteClass */
  var centerPoint: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /** Defines the end point of the arc */
  /* CompleteClass */
  var endPoint: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /** Defines the mid point of the arc */
  /* CompleteClass */
  var midPoint: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * Defines the orientation of the arc (clock wise/counter clock wise).
    */
  /* CompleteClass */
  var orientation: typings.babylonjs.BABYLON.Orientation = js.native
  
  /**
    * Defines the radius of the arc.
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * Defines the start angle of the arc (from start point to middle point).
    */
  /* CompleteClass */
  var startAngle: typings.babylonjs.BABYLON.Angle = js.native
  
  /** Defines the start point of the arc */
  /* CompleteClass */
  var startPoint: typings.babylonjs.BABYLON.Vector2 = js.native
}
