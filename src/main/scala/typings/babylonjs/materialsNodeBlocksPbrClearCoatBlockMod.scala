package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPbrClearCoatBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/clearCoatBlock", "ClearCoatBlock")
  @js.native
  open class ClearCoatBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ClearCoatBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the TBN input component
      */
    def TBN: NodeMaterialConnectionPoint = js.native
    
    /* private */ var _generateTBNSpace: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _tangentCorrectionFactorName: Any = js.native
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the clear coat object output component
      */
    def clearcoat: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the ior input component
      */
    def indexOfRefraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the intensity input component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the bump texture input component
      */
    def normalMapColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Defines if the F0 value should be remapped to account for the interface change in the material.
      */
    var remapF0OnInterfaceChange: Boolean = js.native
    
    /**
      * Gets the roughness input component
      */
    def roughness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tint "at distance" input component
      */
    def tintAtDistance: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tint color input component
      */
    def tintColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tint thickness input component
      */
    def tintThickness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the uv input component
      */
    def uv: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world normal input component
      */
    def worldNormal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world tangent input component
      */
    def worldTangent: NodeMaterialConnectionPoint = js.native
  }
  /* static members */
  object ClearCoatBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/clearCoatBlock", "ClearCoatBlock")
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
      ccBlock: Nullable[ClearCoatBlock],
      reflectionBlock: Nullable[ReflectionBlock],
      worldPosVarName: String,
      generateTBNSpace: Boolean,
      vTBNAvailable: Boolean,
      worldNormalVarName: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(state.asInstanceOf[js.Any], ccBlock.asInstanceOf[js.Any], reflectionBlock.asInstanceOf[js.Any], worldPosVarName.asInstanceOf[js.Any], generateTBNSpace.asInstanceOf[js.Any], vTBNAvailable.asInstanceOf[js.Any], worldNormalVarName.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
