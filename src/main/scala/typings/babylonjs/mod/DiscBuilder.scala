package typings.babylonjs.mod

import typings.babylonjs.anon.Tessellation
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiscBuilder {
  
  @JSImport("babylonjs", "DiscBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "DiscBuilder.CreateDisc")
  @js.native
  def CreateDisc: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Tessellation], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateDisc(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateDisc(name: String, options: Tessellation): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateDisc(name: String, options: Tessellation, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateDisc_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Tessellation], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
}
