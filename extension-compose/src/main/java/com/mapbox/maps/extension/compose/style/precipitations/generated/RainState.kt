// This file is generated.

package com.mapbox.maps.extension.compose.style.precipitations.generated

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.ColorValue
import com.mapbox.maps.extension.compose.style.DoubleListValue
import com.mapbox.maps.extension.compose.style.DoubleValue
import com.mapbox.maps.extension.compose.style.StringValue
import com.mapbox.maps.extension.compose.style.Transition
import com.mapbox.maps.extension.compose.style.internal.ValueParceler
import com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import java.util.Objects

/**
 * Create and [rememberSaveable] a [RainState] using [RainState.Saver].
 * [init] will be called when the [RainState] is first created to configure its
 * initial state.
 *
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param init A function initialise this [RainState].
 */
@Composable
@MapboxExperimental
public inline fun rememberRainState(
  key: String? = null,
  crossinline init: RainState.() -> Unit = {}
): RainState = rememberSaveable(key = key, saver = RainState.Saver) {
  RainState().apply(init)
}

/**
 * The Rain effects applied to the style.
 */
@Stable
@MapboxExperimental
public class RainState private constructor(
  internal val applier: RainStateApplier,
  centerThinning: DoubleValue,
  centerThinningTransition: Transition,
  color: ColorValue,
  colorTransition: Transition,
  colorUseTheme: StringValue,
  density: DoubleValue,
  densityTransition: Transition,
  direction: DoubleListValue,
  directionTransition: Transition,
  distortionStrength: DoubleValue,
  distortionStrengthTransition: Transition,
  dropletSize: DoubleListValue,
  dropletSizeTransition: Transition,
  intensity: DoubleValue,
  intensityTransition: Transition,
  opacity: DoubleValue,
  opacityTransition: Transition,
  vignette: DoubleValue,
  vignetteColor: ColorValue,
  vignetteColorTransition: Transition,
  vignetteColorUseTheme: StringValue,
  vignetteTransition: Transition,
) {
  public constructor() : this(enabled = true)

  private constructor(enabled: Boolean) : this(
    RainStateApplier(emptyMap(), enabled = enabled),
    DoubleValue.INITIAL,
    Transition.INITIAL,
    ColorValue.INITIAL,
    Transition.INITIAL,
    StringValue.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleListValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleListValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    ColorValue.INITIAL,
    Transition.INITIAL,
    StringValue.INITIAL,
    Transition.INITIAL,
  )

  private val centerThinningState: MutableState<DoubleValue> = mutableStateOf(centerThinning)

  /**
   * Thinning factor of rain particles from center. 0 - no thinning. 1 - maximal central area
   * thinning.
   * Default value: 0.57. Value range: [0, 1]
   */
  @MapboxExperimental
  public var centerThinning: DoubleValue by centerThinningState

  @Composable
  private fun UpdateCenterThinning() {
    centerThinningState.value.apply {
      if (notInitial) {
        applier.setProperty("center-thinning", value)
      }
    }
  }
  private val centerThinningTransitionState: MutableState<Transition> = mutableStateOf(centerThinningTransition)

  /**
   * Defines the transition of [centerThinning].
   * Default value: 0.57. Value range: [0, 1]
   */
  @MapboxExperimental
  public var centerThinningTransition: Transition by centerThinningTransitionState

  @Composable
  private fun UpdateCenterThinningTransition() {
    centerThinningTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("center-thinning-transition", value)
      }
    }
  }
  private val colorState: MutableState<ColorValue> = mutableStateOf(color)

  /**
   * Individual rain particle dorplets color.
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,"#03113d",0.3,"#a8adbc"]".
   */
  @MapboxExperimental
  public var color: ColorValue by colorState

  @Composable
  private fun UpdateColor() {
    colorState.value.apply {
      if (notInitial) {
        applier.setProperty("color", value)
      }
    }
  }
  private val colorTransitionState: MutableState<Transition> = mutableStateOf(colorTransition)

  /**
   * Defines the transition of [color].
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,"#03113d",0.3,"#a8adbc"]".
   */
  @MapboxExperimental
  public var colorTransition: Transition by colorTransitionState

  @Composable
  private fun UpdateColorTransition() {
    colorTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("color-transition", value)
      }
    }
  }
  private val colorUseThemeState: MutableState<StringValue> = mutableStateOf(colorUseTheme)

  /**
   * Overrides applying of color theme for [color] if "none" is set. To follow default theme "default"
   * should be set.
   * Default value: "default".
   */
  @MapboxExperimental
  public var colorUseTheme: StringValue by colorUseThemeState

  @Composable
  private fun UpdateColorUseTheme() {
    colorUseThemeState.value.apply {
      if (notInitial) {
        applier.setProperty("color-use-theme", value)
      }
    }
  }
  private val densityState: MutableState<DoubleValue> = mutableStateOf(density)

  /**
   * Rain particles density. Controls the overall screen density of the rain.
   * Default value: "["interpolate",["linear"],["zoom"],11,0,13,0.5]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var density: DoubleValue by densityState

  @Composable
  private fun UpdateDensity() {
    densityState.value.apply {
      if (notInitial) {
        applier.setProperty("density", value)
      }
    }
  }
  private val densityTransitionState: MutableState<Transition> = mutableStateOf(densityTransition)

  /**
   * Defines the transition of [density].
   * Default value: "["interpolate",["linear"],["zoom"],11,0,13,0.5]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var densityTransition: Transition by densityTransitionState

  @Composable
  private fun UpdateDensityTransition() {
    densityTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("density-transition", value)
      }
    }
  }
  private val directionState: MutableState<DoubleListValue> = mutableStateOf(direction)

  /**
   * Main rain particles direction. Azimuth and polar angles.
   * Default value: [0,80]. Value range: [0, 360]
   */
  @MapboxExperimental
  public var direction: DoubleListValue by directionState

  @Composable
  private fun UpdateDirection() {
    directionState.value.apply {
      if (notInitial) {
        applier.setProperty("direction", value)
      }
    }
  }
  private val directionTransitionState: MutableState<Transition> = mutableStateOf(directionTransition)

  /**
   * Defines the transition of [direction].
   * Default value: [0,80]. Value range: [0, 360]
   */
  @MapboxExperimental
  public var directionTransition: Transition by directionTransitionState

  @Composable
  private fun UpdateDirectionTransition() {
    directionTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("direction-transition", value)
      }
    }
  }
  private val distortionStrengthState: MutableState<DoubleValue> = mutableStateOf(distortionStrength)

  /**
   * Rain particles screen-space distortion strength.
   * Default value: 0.7. Value range: [0, 1]
   */
  @MapboxExperimental
  public var distortionStrength: DoubleValue by distortionStrengthState

  @Composable
  private fun UpdateDistortionStrength() {
    distortionStrengthState.value.apply {
      if (notInitial) {
        applier.setProperty("distortion-strength", value)
      }
    }
  }
  private val distortionStrengthTransitionState: MutableState<Transition> = mutableStateOf(distortionStrengthTransition)

  /**
   * Defines the transition of [distortionStrength].
   * Default value: 0.7. Value range: [0, 1]
   */
  @MapboxExperimental
  public var distortionStrengthTransition: Transition by distortionStrengthTransitionState

  @Composable
  private fun UpdateDistortionStrengthTransition() {
    distortionStrengthTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("distortion-strength-transition", value)
      }
    }
  }
  private val dropletSizeState: MutableState<DoubleListValue> = mutableStateOf(dropletSize)

  /**
   * Rain droplet size. x - normal to direction, y - along direction
   * Default value: [2.6,18.2]. Value range: [0, 50]
   */
  @MapboxExperimental
  public var dropletSize: DoubleListValue by dropletSizeState

  @Composable
  private fun UpdateDropletSize() {
    dropletSizeState.value.apply {
      if (notInitial) {
        applier.setProperty("droplet-size", value)
      }
    }
  }
  private val dropletSizeTransitionState: MutableState<Transition> = mutableStateOf(dropletSizeTransition)

  /**
   * Defines the transition of [dropletSize].
   * Default value: [2.6,18.2]. Value range: [0, 50]
   */
  @MapboxExperimental
  public var dropletSizeTransition: Transition by dropletSizeTransitionState

  @Composable
  private fun UpdateDropletSizeTransition() {
    dropletSizeTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("droplet-size-transition", value)
      }
    }
  }
  private val intensityState: MutableState<DoubleValue> = mutableStateOf(intensity)

  /**
   * Rain particles movement factor. Controls the overall rain particles speed
   * Default value: 1. Value range: [0, 1]
   */
  @MapboxExperimental
  public var intensity: DoubleValue by intensityState

  @Composable
  private fun UpdateIntensity() {
    intensityState.value.apply {
      if (notInitial) {
        applier.setProperty("intensity", value)
      }
    }
  }
  private val intensityTransitionState: MutableState<Transition> = mutableStateOf(intensityTransition)

  /**
   * Defines the transition of [intensity].
   * Default value: 1. Value range: [0, 1]
   */
  @MapboxExperimental
  public var intensityTransition: Transition by intensityTransitionState

  @Composable
  private fun UpdateIntensityTransition() {
    intensityTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("intensity-transition", value)
      }
    }
  }
  private val opacityState: MutableState<DoubleValue> = mutableStateOf(opacity)

  /**
   * Rain particles opacity.
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,0.88,1,0.7]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var opacity: DoubleValue by opacityState

  @Composable
  private fun UpdateOpacity() {
    opacityState.value.apply {
      if (notInitial) {
        applier.setProperty("opacity", value)
      }
    }
  }
  private val opacityTransitionState: MutableState<Transition> = mutableStateOf(opacityTransition)

  /**
   * Defines the transition of [opacity].
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,0.88,1,0.7]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var opacityTransition: Transition by opacityTransitionState

  @Composable
  private fun UpdateOpacityTransition() {
    opacityTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("opacity-transition", value)
      }
    }
  }
  private val vignetteState: MutableState<DoubleValue> = mutableStateOf(vignette)

  /**
   * Screen-space vignette rain tinting effect intensity.
   * Default value: "["interpolate",["linear"],["zoom"],11,0,13,1]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var vignette: DoubleValue by vignetteState

  @Composable
  private fun UpdateVignette() {
    vignetteState.value.apply {
      if (notInitial) {
        applier.setProperty("vignette", value)
      }
    }
  }
  private val vignetteColorState: MutableState<ColorValue> = mutableStateOf(vignetteColor)

  /**
   * Rain vignette screen-space corners tint color.
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,"#001736",0.3,"#464646"]".
   */
  @MapboxExperimental
  public var vignetteColor: ColorValue by vignetteColorState

  @Composable
  private fun UpdateVignetteColor() {
    vignetteColorState.value.apply {
      if (notInitial) {
        applier.setProperty("vignette-color", value)
      }
    }
  }
  private val vignetteColorTransitionState: MutableState<Transition> = mutableStateOf(vignetteColorTransition)

  /**
   * Defines the transition of [vignetteColor].
   * Default value: "["interpolate",["linear"],["measure-light","brightness"],0,"#001736",0.3,"#464646"]".
   */
  @MapboxExperimental
  public var vignetteColorTransition: Transition by vignetteColorTransitionState

  @Composable
  private fun UpdateVignetteColorTransition() {
    vignetteColorTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("vignette-color-transition", value)
      }
    }
  }
  private val vignetteColorUseThemeState: MutableState<StringValue> = mutableStateOf(vignetteColorUseTheme)

  /**
   * Overrides applying of color theme for [vignetteColor] if "none" is set. To follow default theme "default"
   * should be set.
   * Default value: "default".
   */
  @MapboxExperimental
  public var vignetteColorUseTheme: StringValue by vignetteColorUseThemeState

  @Composable
  private fun UpdateVignetteColorUseTheme() {
    vignetteColorUseThemeState.value.apply {
      if (notInitial) {
        applier.setProperty("vignette-color-use-theme", value)
      }
    }
  }
  private val vignetteTransitionState: MutableState<Transition> = mutableStateOf(vignetteTransition)

  /**
   * Defines the transition of [vignette].
   * Default value: "["interpolate",["linear"],["zoom"],11,0,13,1]". Value range: [0, 1]
   */
  @MapboxExperimental
  public var vignetteTransition: Transition by vignetteTransitionState

  @Composable
  private fun UpdateVignetteTransition() {
    vignetteTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("vignette-transition", value)
      }
    }
  }

  @Composable
  internal fun UpdateProperties() {
    UpdateCenterThinning()
    UpdateCenterThinningTransition()
    UpdateColor()
    UpdateColorTransition()
    UpdateColorUseTheme()
    UpdateDensity()
    UpdateDensityTransition()
    UpdateDirection()
    UpdateDirectionTransition()
    UpdateDistortionStrength()
    UpdateDistortionStrengthTransition()
    UpdateDropletSize()
    UpdateDropletSizeTransition()
    UpdateIntensity()
    UpdateIntensityTransition()
    UpdateOpacity()
    UpdateOpacityTransition()
    UpdateVignette()
    UpdateVignetteColor()
    UpdateVignetteColorTransition()
    UpdateVignetteColorUseTheme()
    UpdateVignetteTransition()
  }

  private fun getProperties(): Map<String, Value> =
    listOfNotNull(
      ("center-thinning" to centerThinning.value).takeIf { centerThinning.notInitial },
      ("center-thinning-transition" to centerThinningTransition.value).takeIf { centerThinningTransition.notInitial },
      ("color" to color.value).takeIf { color.notInitial },
      ("color-transition" to colorTransition.value).takeIf { colorTransition.notInitial },
      ("color-use-theme" to colorUseTheme.value).takeIf { colorUseTheme.notInitial },
      ("density" to density.value).takeIf { density.notInitial },
      ("density-transition" to densityTransition.value).takeIf { densityTransition.notInitial },
      ("direction" to direction.value).takeIf { direction.notInitial },
      ("direction-transition" to directionTransition.value).takeIf { directionTransition.notInitial },
      ("distortion-strength" to distortionStrength.value).takeIf { distortionStrength.notInitial },
      ("distortion-strength-transition" to distortionStrengthTransition.value).takeIf { distortionStrengthTransition.notInitial },
      ("droplet-size" to dropletSize.value).takeIf { dropletSize.notInitial },
      ("droplet-size-transition" to dropletSizeTransition.value).takeIf { dropletSizeTransition.notInitial },
      ("intensity" to intensity.value).takeIf { intensity.notInitial },
      ("intensity-transition" to intensityTransition.value).takeIf { intensityTransition.notInitial },
      ("opacity" to opacity.value).takeIf { opacity.notInitial },
      ("opacity-transition" to opacityTransition.value).takeIf { opacityTransition.notInitial },
      ("vignette" to vignette.value).takeIf { vignette.notInitial },
      ("vignette-color" to vignetteColor.value).takeIf { vignetteColor.notInitial },
      ("vignette-color-transition" to vignetteColorTransition.value).takeIf { vignetteColorTransition.notInitial },
      ("vignette-color-use-theme" to vignetteColorUseTheme.value).takeIf { vignetteColorUseTheme.notInitial },
      ("vignette-transition" to vignetteTransition.value).takeIf { vignetteTransition.notInitial },
    ).toMap()

  /**
   * See [Any.equals]
   */
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as RainState

    if (applier != other.applier) return false
    if (centerThinning != other.centerThinning) return false
    if (centerThinningTransition != other.centerThinningTransition) return false
    if (color != other.color) return false
    if (colorTransition != other.colorTransition) return false
    if (colorUseTheme != other.colorUseTheme) return false
    if (density != other.density) return false
    if (densityTransition != other.densityTransition) return false
    if (direction != other.direction) return false
    if (directionTransition != other.directionTransition) return false
    if (distortionStrength != other.distortionStrength) return false
    if (distortionStrengthTransition != other.distortionStrengthTransition) return false
    if (dropletSize != other.dropletSize) return false
    if (dropletSizeTransition != other.dropletSizeTransition) return false
    if (intensity != other.intensity) return false
    if (intensityTransition != other.intensityTransition) return false
    if (opacity != other.opacity) return false
    if (opacityTransition != other.opacityTransition) return false
    if (vignette != other.vignette) return false
    if (vignetteColor != other.vignetteColor) return false
    if (vignetteColorTransition != other.vignetteColorTransition) return false
    if (vignetteColorUseTheme != other.vignetteColorUseTheme) return false
    if (vignetteTransition != other.vignetteTransition) return false

    return true
  }

  /**
   * See [Any.hashCode]
   */
  override fun hashCode(): Int = Objects.hash(
    applier,
    centerThinning,
    centerThinningTransition,
    color,
    colorTransition,
    colorUseTheme,
    density,
    densityTransition,
    direction,
    directionTransition,
    distortionStrength,
    distortionStrengthTransition,
    dropletSize,
    dropletSizeTransition,
    intensity,
    intensityTransition,
    opacity,
    opacityTransition,
    vignette,
    vignetteColor,
    vignetteColorTransition,
    vignetteColorUseTheme,
    vignetteTransition,
  )

  /**
   * Returns a string representation of the object.
   */
  override fun toString(): String =
    "RainState(centerThinning=$centerThinning, centerThinningTransition=$centerThinningTransition, color=$color, colorTransition=$colorTransition, colorUseTheme=$colorUseTheme, density=$density, densityTransition=$densityTransition, direction=$direction, directionTransition=$directionTransition, distortionStrength=$distortionStrength, distortionStrengthTransition=$distortionStrengthTransition, dropletSize=$dropletSize, dropletSizeTransition=$dropletSizeTransition, intensity=$intensity, intensityTransition=$intensityTransition, opacity=$opacity, opacityTransition=$opacityTransition, vignette=$vignette, vignetteColor=$vignetteColor, vignetteColorTransition=$vignetteColorTransition, vignetteColorUseTheme=$vignetteColorUseTheme, vignetteTransition=$vignetteTransition)"

  /**
   * Rain Holder class to be used within [Saver].
   */
  @Parcelize
  @TypeParceler<Value, ValueParceler>
  public data class Holder internal constructor(
    /**
     * Saved properties.
     * Note that we use a generic [Map] to be able to evolve this class without breaking changes.
     */
    val savedProperties: Map<String, Value>,
    /**
     * Indicating if the RainState is enabled.
     */
    val enabled: Boolean
  ) : Parcelable

  /**
   * Public companion object.
   */
  public companion object {
    /**
     * The default saver implementation for [RainState]
     */
    public val Saver: Saver<RainState, Holder> = Saver(
      save = { Holder(it.getProperties(), it.applier.enabled) },
      restore = { holder ->
        RainState(
          RainStateApplier(holder.savedProperties, enabled = holder.enabled),
          centerThinning = holder.savedProperties["center-thinning"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          centerThinningTransition = holder.savedProperties["center-thinning-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          color = holder.savedProperties["color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          colorTransition = holder.savedProperties["color-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          colorUseTheme = holder.savedProperties["color-use-theme"]?.let { StringValue(it) } ?: StringValue.INITIAL,
          density = holder.savedProperties["density"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          densityTransition = holder.savedProperties["density-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          direction = holder.savedProperties["direction"]?.let { DoubleListValue(it) } ?: DoubleListValue.INITIAL,
          directionTransition = holder.savedProperties["direction-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          distortionStrength = holder.savedProperties["distortion-strength"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          distortionStrengthTransition = holder.savedProperties["distortion-strength-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          dropletSize = holder.savedProperties["droplet-size"]?.let { DoubleListValue(it) } ?: DoubleListValue.INITIAL,
          dropletSizeTransition = holder.savedProperties["droplet-size-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          intensity = holder.savedProperties["intensity"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          intensityTransition = holder.savedProperties["intensity-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          opacity = holder.savedProperties["opacity"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          opacityTransition = holder.savedProperties["opacity-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          vignette = holder.savedProperties["vignette"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          vignetteColor = holder.savedProperties["vignette-color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          vignetteColorTransition = holder.savedProperties["vignette-color-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          vignetteColorUseTheme = holder.savedProperties["vignette-color-use-theme"]?.let { StringValue(it) } ?: StringValue.INITIAL,
          vignetteTransition = holder.savedProperties["vignette-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
        )
      }
    )

    /**
     * Disabled value for [RainState], setting disabled will result in removing rain effect.
     */
    @JvmField
    public val DISABLED: RainState = RainState(enabled = false)
  }
}
// End of generated file.