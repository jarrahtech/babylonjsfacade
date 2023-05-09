package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.materialsEffectFallbacksMod.EffectFallbacks
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrPbrAnisotropicConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "MaterialAnisotropicDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialAnisotropicDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var ANISOTROPIC: Boolean = js.native
    
    var ANISOTROPIC_TEXTURE: Boolean = js.native
    
    var ANISOTROPIC_TEXTUREDIRECTUV: Double = js.native
    
    var MAINUV1: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "PBRAnisotropicConfiguration")
  @js.native
  open class PBRAnisotropicConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /** @internal */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @internal */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _texture: Any = js.native
    
    def addFallbacks(defines: MaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene): Unit = js.native
    
    /**
      * Defines if the effect is along the tangents, bitangents or in between.
      * By default, the effect is "stretching" the highlights along the tangents.
      */
    var direction: Vector2 = js.native
    
    /**
      * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the anisotropy is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: MaterialAnisotropicDefines, scene: Scene): Boolean = js.native
    
    def prepareDefinesBeforeAttributes(defines: MaterialAnisotropicDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
    
    /**
      * Stores the anisotropy values in a texture.
      * rg is direction (like normal from -1 to 1)
      * b is a intensity
      */
    var texture: Nullable[BaseTexture] = js.native
  }
}
