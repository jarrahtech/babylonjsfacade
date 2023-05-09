package typings.babylonjs.anon

import org.scalajs.dom.Blob
import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofURL extends StObject {
  
  /* standard dom */
  def createObjectURL(obj: Blob): String = js.native
  def createObjectURL(obj: MediaSource): String = js.native
  
  /* standard dom */
  def revokeObjectURL(url: String): Unit = js.native
}
