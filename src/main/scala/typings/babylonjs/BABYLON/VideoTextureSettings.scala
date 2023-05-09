package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoTextureSettings extends StObject {
  
  /**
    * Applies `autoplay` to video, if specified
    */
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically updates internal texture from video at every frame in the render loop
    */
  var autoUpdateTexture: Boolean
  
  /**
    * Defines the associated texture format.
    */
  var format: js.UndefOr[Double] = js.undefined
  
  /**
    * Notify babylon to not modify any video settings and not control the video's playback.
    * Set this to true if you are controlling the way the video is being played, stopped and paused.
    */
  var independentVideoSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applies `loop` to video, if specified
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applies `muted` to video, if specified
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Image src displayed during the video loading or until the user interacts with the video.
    */
  var poster: js.UndefOr[String] = js.undefined
}
object VideoTextureSettings {
  
  inline def apply(autoUpdateTexture: Boolean): VideoTextureSettings = {
    val __obj = js.Dynamic.literal(autoUpdateTexture = autoUpdateTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoTextureSettings] (val x: Self) extends AnyVal {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setAutoUpdateTexture(value: Boolean): Self = StObject.set(x, "autoUpdateTexture", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndependentVideoSource(value: Boolean): Self = StObject.set(x, "independentVideoSource", value.asInstanceOf[js.Any])
    
    inline def setIndependentVideoSourceUndefined: Self = StObject.set(x, "independentVideoSource", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
  }
}
