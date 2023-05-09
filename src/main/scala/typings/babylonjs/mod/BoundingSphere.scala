package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BoundingSphere")
@js.native
open class BoundingSphere protected ()
  extends typings.babylonjs.legacyLegacyMod.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
}
/* static members */
object BoundingSphere {
  
  @JSImport("babylonjs", "BoundingSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a sphere from a center and a radius
    * @param center The center
    * @param radius radius
    * @param matrix Optional worldMatrix
    * @returns The sphere
    */
  inline def CreateFromCenterAndRadius(center: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], radius: Double): typings.babylonjs.cullingBoundingSphereMod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingBoundingSphereMod.BoundingSphere]
  inline def CreateFromCenterAndRadius(
    center: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    radius: Double,
    matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typings.babylonjs.cullingBoundingSphereMod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cullingBoundingSphereMod.BoundingSphere]
  
  /**
    * Checks if two sphere intersect
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the spheres intersect
    */
  inline def Intersects(
    sphere0: DeepImmutable[typings.babylonjs.cullingBoundingSphereMod.BoundingSphere],
    sphere1: DeepImmutable[typings.babylonjs.cullingBoundingSphereMod.BoundingSphere]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(sphere0.asInstanceOf[js.Any], sphere1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("babylonjs", "BoundingSphere._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
