package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "EngineStore")
@js.native
open class EngineStore ()
  extends typings.babylonjs.indexMod.EngineStore
/* static members */
object EngineStore {
  
  @JSImport("babylonjs/Legacy/legacy", "EngineStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  @JSImport("babylonjs/Legacy/legacy", "EngineStore.FallbackTexture")
  @js.native
  def FallbackTexture: String = js.native
  inline def FallbackTexture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackTexture")(x.asInstanceOf[js.Any])
  
  /** Gets the list of created engines */
  @JSImport("babylonjs/Legacy/legacy", "EngineStore.Instances")
  @js.native
  def Instances: js.Array[typings.babylonjs.enginesEngineMod.Engine] = js.native
  inline def Instances_=(x: js.Array[typings.babylonjs.enginesEngineMod.Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
  
  /**
    * Notifies when an engine was disposed.
    * Mainly used for static/cache cleanup
    */
  @JSImport("babylonjs/Legacy/legacy", "EngineStore.OnEnginesDisposedObservable")
  @js.native
  def OnEnginesDisposedObservable: typings.babylonjs.miscObservableMod.Observable[typings.babylonjs.enginesEngineMod.Engine] = js.native
  inline def OnEnginesDisposedObservable_=(x: typings.babylonjs.miscObservableMod.Observable[typings.babylonjs.enginesEngineMod.Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnEnginesDisposedObservable")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  @JSImport("babylonjs/Legacy/legacy", "EngineStore.UseFallbackTexture")
  @js.native
  def UseFallbackTexture: Boolean = js.native
  inline def UseFallbackTexture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseFallbackTexture")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/Legacy/legacy", "EngineStore._LastCreatedScene")
  @js.native
  def _LastCreatedScene: Nullable[typings.babylonjs.sceneMod.Scene] = js.native
  inline def _LastCreatedScene_=(x: Nullable[typings.babylonjs.sceneMod.Scene]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LastCreatedScene")(x.asInstanceOf[js.Any])
}
