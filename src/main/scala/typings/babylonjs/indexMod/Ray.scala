package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Ray")
@js.native
open class Ray protected ()
  extends typings.babylonjs.cullingIndexMod.Ray {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(
    /** origin point */
  origin: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    /** direction */
  direction: typings.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    /** origin point */
  origin: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    /** direction */
  direction: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    /** length of the ray */
  length: Double
  ) = this()
}
/* static members */
object Ray {
  
  @JSImport("babylonjs/index", "Ray")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ray from screen space and viewport
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns new ray
    */
  inline def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    view: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typings.babylonjs.cullingRayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingRayMod.Ray]
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  inline def CreateNewFromTo(
    origin: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    end: typings.babylonjs.mathsMathDotvectorMod.Vector3
  ): typings.babylonjs.cullingRayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingRayMod.Ray]
  inline def CreateNewFromTo(
    origin: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    end: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    world: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typings.babylonjs.cullingRayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], world.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingRayMod.Ray]
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  inline def Transform(
    ray: DeepImmutable[typings.babylonjs.cullingRayMod.Ray],
    matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typings.babylonjs.cullingRayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingRayMod.Ray]
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  inline def TransformToRef(
    ray: DeepImmutable[typings.babylonjs.cullingRayMod.Ray],
    matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typings.babylonjs.cullingRayMod.Ray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  inline def Zero(): typings.babylonjs.cullingRayMod.Ray = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.cullingRayMod.Ray]
  
  @JSImport("babylonjs/index", "Ray._RayDistant")
  @js.native
  def _RayDistant: Any = js.native
  inline def _RayDistant_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RayDistant")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "Ray._Rayl")
  @js.native
  def _Rayl: Any = js.native
  inline def _Rayl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Rayl")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "Ray._Smallnum")
  @js.native
  def _Smallnum: Any = js.native
  inline def _Smallnum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Smallnum")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "Ray._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
