package typings.babylonjs

import typings.babylonjs.lightsLightMod.Light
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsHemisphericLightMod {
  
  @JSImport("babylonjs/Lights/hemisphericLight", "HemisphericLight")
  @js.native
  open class HemisphericLight protected () extends Light {
    /**
      * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
      * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
      * The HemisphericLight can't cast shadows.
      * Documentation : https://doc.babylonjs.com/features/featuresDeepDive/lights/lights_introduction
      * @param name The friendly name of the light
      * @param direction The direction of the light reflection
      * @param scene The scene the light belongs to
      */
    def this(name: String, direction: Vector3, scene: Scene) = this()
    
    /**
      * The light reflection direction, not the incoming direction.
      */
    var direction: Vector3 = js.native
    
    /**
      * The groundColor is the light in the opposite direction to the one specified during creation.
      * You can think of the diffuse and specular light as coming from the centre of the object in the given direction and the groundColor light in the opposite direction.
      */
    var groundColor: Color3 = js.native
    
    /**
      * Sets the HemisphericLight direction towards the passed target (Vector3).
      * Returns the updated direction.
      * @param target The target the direction should point to
      * @returns The computed direction
      */
    def setDirectionToTarget(target: Vector3): Vector3 = js.native
  }
}
