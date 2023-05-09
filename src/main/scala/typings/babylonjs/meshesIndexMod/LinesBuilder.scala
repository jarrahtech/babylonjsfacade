package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.DashSize
import typings.babylonjs.anon.Instance
import typings.babylonjs.anon.Material
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinesBuilder {
  
  @JSImport("babylonjs/Meshes/index", "LinesBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "LinesBuilder.CreateDashedLines")
  @js.native
  def CreateDashedLines: js.Function3[
    /* name */ String, 
    /* options */ DashSize, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateDashedLines(name: String, options: DashSize): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines(name: String, options: DashSize, scene: Nullable[Scene]): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ DashSize, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Meshes/index", "LinesBuilder.CreateLineSystem")
  @js.native
  def CreateLineSystem: js.Function3[
    /* name */ String, 
    /* options */ Instance, 
    /* scene */ Nullable[Scene], 
    typings.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLineSystem(name: String, options: Instance, scene: Nullable[Scene]): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLineSystem_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Instance, 
      /* scene */ Nullable[Scene], 
      typings.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Meshes/index", "LinesBuilder.CreateLines")
  @js.native
  def CreateLines: js.Function3[
    /* name */ String, 
    /* options */ Material, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLines(name: String, options: Material): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines(name: String, options: Material, scene: Nullable[Scene]): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Material, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
}
