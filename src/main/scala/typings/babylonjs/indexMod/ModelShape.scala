package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ModelShape")
@js.native
open class ModelShape protected ()
  extends typings.babylonjs.particlesIndexMod.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @internal
    */
  def this(
    id: Double,
    shape: js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.particlesSolidParticleMod.SolidParticle, 
          /* i */ Double, 
          /* s */ Double, 
          Unit
        ]
      ],
    vtxFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.particlesSolidParticleMod.SolidParticle, 
          /* vertex */ typings.babylonjs.mathsMathDotvectorMod.Vector3, 
          /* i */ Double, 
          Unit
        ]
      ],
    material: Nullable[typings.babylonjs.materialsMaterialMod.Material]
  ) = this()
}
