package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InstantiatedEntries")
@js.native
open class InstantiatedEntries ()
  extends StObject
     with typings.babylonjs.BABYLON.InstantiatedEntries {
  
  /**
    * List of new animation groups
    */
  /* CompleteClass */
  var animationGroups: js.Array[typings.babylonjs.BABYLON.AnimationGroup] = js.native
  
  /**
    * Disposes the instantiated entries from the scene
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * List of new root nodes (eg. nodes with no parent)
    */
  /* CompleteClass */
  var rootNodes: js.Array[typings.babylonjs.BABYLON.TransformNode] = js.native
  
  /**
    * List of new skeletons
    */
  /* CompleteClass */
  var skeletons: js.Array[typings.babylonjs.BABYLON.Skeleton] = js.native
}
