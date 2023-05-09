package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3
  
  /**
    * Maximum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  var maxEmitBox: Vector3
  
  /**
    * Minimum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  var minEmitBox: Vector3
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object BoxParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Unit,
    buildUniformLayout: UniformBuffer => Unit,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: () => String,
    getEffectDefines: () => String,
    maxEmitBox: Vector3,
    minEmitBox: Vector3,
    parse: Any => Unit,
    serialize: () => Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): BoxParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), buildUniformLayout = js.Any.fromFunction1(buildUniformLayout), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), maxEmitBox = maxEmitBox.asInstanceOf[js.Any], minEmitBox = minEmitBox.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[BoxParticleEmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxParticleEmitter] (val x: Self) extends AnyVal {
    
    inline def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    inline def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    inline def setMaxEmitBox(value: Vector3): Self = StObject.set(x, "maxEmitBox", value.asInstanceOf[js.Any])
    
    inline def setMinEmitBox(value: Vector3): Self = StObject.set(x, "minEmitBox", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Unit): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction4(value))
  }
}
