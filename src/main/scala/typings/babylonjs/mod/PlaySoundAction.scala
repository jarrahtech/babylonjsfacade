package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PlaySoundAction")
@js.native
open class PlaySoundAction protected ()
  extends typings.babylonjs.legacyLegacyMod.PlaySoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, sound: typings.babylonjs.audioSoundMod.Sound) = this()
  def this(
    triggerOptions: Any,
    sound: typings.babylonjs.audioSoundMod.Sound,
    condition: typings.babylonjs.actionsConditionMod.Condition
  ) = this()
}
