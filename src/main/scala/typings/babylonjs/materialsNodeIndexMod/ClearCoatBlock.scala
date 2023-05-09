package typings.babylonjs.materialsNodeIndexMod

import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/index", "ClearCoatBlock")
@js.native
open class ClearCoatBlock protected ()
  extends typings.babylonjs.materialsNodeBlocksIndexMod.ClearCoatBlock {
  /**
    * Create a new ClearCoatBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
object ClearCoatBlock {
  
  @JSImport("babylonjs/Materials/Node/index", "ClearCoatBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the main code of the block (fragment side)
    * @param state current state of the node material building
    * @param ccBlock instance of a ClearCoatBlock or null if the code must be generated without an active clear coat module
    * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
    * @param worldPosVarName name of the variable holding the world position
    * @param generateTBNSpace if true, the code needed to create the TBN coordinate space is generated
    * @param vTBNAvailable indicate that the vTBN variable is already existing because it has already been generated by another block (PerturbNormal or Anisotropy)
    * @param worldNormalVarName name of the variable holding the world normal
    * @returns the shader code
    */
  inline def GetCode(
    state: NodeMaterialBuildState,
    ccBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrClearCoatBlockMod.ClearCoatBlock],
    reflectionBlock: Nullable[typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock],
    worldPosVarName: String,
    generateTBNSpace: Boolean,
    vTBNAvailable: Boolean,
    worldNormalVarName: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(state.asInstanceOf[js.Any], ccBlock.asInstanceOf[js.Any], reflectionBlock.asInstanceOf[js.Any], worldPosVarName.asInstanceOf[js.Any], generateTBNSpace.asInstanceOf[js.Any], vTBNAvailable.asInstanceOf[js.Any], worldNormalVarName.asInstanceOf[js.Any])).asInstanceOf[String]
}
