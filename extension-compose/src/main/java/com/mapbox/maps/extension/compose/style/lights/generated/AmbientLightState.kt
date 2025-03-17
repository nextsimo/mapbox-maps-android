// This file is generated.

package com.mapbox.maps.extension.compose.style.lights.generated

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.MapboxMap
import com.mapbox.maps.MapboxStyleManager
import com.mapbox.maps.extension.compose.style.ColorValue
import com.mapbox.maps.extension.compose.style.DoubleValue
import com.mapbox.maps.extension.compose.style.IdGenerator.generateRandomLightId
import com.mapbox.maps.extension.compose.style.StringValue
import com.mapbox.maps.extension.compose.style.Transition
import com.mapbox.maps.extension.compose.style.internal.ValueParceler
import com.mapbox.maps.logD
import com.mapbox.maps.logE
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import java.util.Objects

/**
 * Create and [rememberSaveable] a [AmbientLightState] using [Saver].
 * [init] will be called when the [AmbientLightState] is first created to configure its
 * initial state.
 *
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param init A function initialise this [AmbientLightState].
 */
@Composable
public inline fun rememberAmbientLightState(
  id: String = remember {
    generateRandomLightId("ambient")
  },
  key: String? = null,
  crossinline init: AmbientLightState.() -> Unit = {}
): AmbientLightState = rememberSaveable(key = key, saver = AmbientLightState.Saver) {
  AmbientLightState(id).apply(init)
}

/**
 * An indirect light affecting all objects in the map adding a constant amount of light on them. It has no explicit direction and cannot cast shadows.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/light)
 */
@Stable
public class AmbientLightState internal constructor(
  /**
   * The id of the [AmbientLightState].
   */
  public val id: String,
  initialColor: ColorValue = ColorValue.INITIAL,
  initialColorTransition: Transition = Transition.INITIAL,
  initialColorUseTheme: StringValue = StringValue.INITIAL,
  initialIntensity: DoubleValue = DoubleValue.INITIAL,
  initialIntensityTransition: Transition = Transition.INITIAL,
) {
  public constructor(id: String = generateRandomLightId("ambient")) : this(
    id = id,
    initialColor = ColorValue.INITIAL,
    initialColorTransition = Transition.INITIAL,
    initialColorUseTheme = StringValue.INITIAL,
    initialIntensity = DoubleValue.INITIAL,
    initialIntensityTransition = Transition.INITIAL,
  )

  private val colorState: MutableState<ColorValue> = mutableStateOf(initialColor)
  private val colorTransitionState: MutableState<Transition> = mutableStateOf(initialColorTransition)
  private val colorUseThemeState: MutableState<StringValue> = mutableStateOf(initialColorUseTheme)
  private val intensityState: MutableState<DoubleValue> = mutableStateOf(initialIntensity)
  private val intensityTransitionState: MutableState<Transition> = mutableStateOf(initialIntensityTransition)

  /**
   * Color of the ambient light.
   * Default value: "#ffffff".
   */
  public var color: ColorValue by colorState

  /**
   * Defines the transition of [color].
   * Default value: "#ffffff".
   */
  public var colorTransition: Transition by colorTransitionState

  /**
   * Overrides applying of color theme for [color] if "none" is set. To follow default theme "default"
   * should be set.
   * Default value: "default".
   */
  @MapboxExperimental
  public var colorUseTheme: StringValue by colorUseThemeState

  /**
   * A multiplier for the color of the ambient light.
   * Default value: 0.5. Value range: [0, 1]
   */
  public var intensity: DoubleValue by intensityState

  /**
   * Defines the transition of [intensity].
   * Default value: 0.5. Value range: [0, 1]
   */
  public var intensityTransition: Transition by intensityTransitionState

  @Composable
  private fun UpdateColor(mapboxMap: MapboxStyleManager) {
    if (color.notInitial) {
      mapboxMap.updateLightProperty("color", color.value)
    }
  }

  @Composable
  private fun UpdateColorTransition(mapboxMap: MapboxStyleManager) {
    if (colorTransition.notInitial) {
      mapboxMap.updateLightProperty("color-transition", colorTransition.value)
    }
  }

  @Composable
  private fun UpdateColorUseTheme(mapboxMap: MapboxStyleManager) {
    if (colorUseTheme.notInitial) {
      mapboxMap.updateLightProperty("color-use-theme", colorUseTheme.value)
    }
  }

  @Composable
  private fun UpdateIntensity(mapboxMap: MapboxStyleManager) {
    if (intensity.notInitial) {
      mapboxMap.updateLightProperty("intensity", intensity.value)
    }
  }

  @Composable
  private fun UpdateIntensityTransition(mapboxMap: MapboxStyleManager) {
    if (intensityTransition.notInitial) {
      mapboxMap.updateLightProperty("intensity-transition", intensityTransition.value)
    }
  }

  private fun MapboxStyleManager.updateLightProperty(name: String, value: Value) {
    logD(TAG, "update light property: $id, $name, $value")
    setStyleLightProperty(id, name, value)
      .onError {
        logE(TAG, it)
      }
  }

  internal fun getProperties(): HashMap<String, Value> {
    return hashMapOf(
      "id" to Value(id),
      "type" to Value("ambient"),
      "properties" to Value(
        hashMapOf<String, Value>().apply {
          if (color.notInitial) {
            this["color"] = color.value
          }
          if (colorTransition.notInitial) {
            this["color-transition"] = colorTransition.value
          }
          if (colorUseTheme.notInitial) {
            this["color-use-theme"] = colorUseTheme.value
          }
          if (intensity.notInitial) {
            this["intensity"] = intensity.value
          }
          if (intensityTransition.notInitial) {
            this["intensity-transition"] = intensityTransition.value
          }
        }
      )
    )
  }

  @Composable
  internal fun UpdateProperties(mapboxMap: MapboxMap) {
    UpdateColor(mapboxMap)
    UpdateColorTransition(mapboxMap)
    UpdateColorUseTheme(mapboxMap)
    UpdateIntensity(mapboxMap)
    UpdateIntensityTransition(mapboxMap)
  }

  /**
   * Overwrite the hashcode for [AmbientLightState].
   */
  override fun hashCode(): Int {
    return Objects.hash(
      color,
      colorTransition,
      colorUseTheme,
      intensity,
      intensityTransition,
    )
  }

  /**
   * Overwrite the equals for [AmbientLightState].
   */
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    other as AmbientLightState
    if (id != other.id) return false
    if (color != other.color) return false
    if (colorTransition != other.colorTransition) return false
    if (colorUseTheme != other.colorUseTheme) return false
    if (intensity != other.intensity) return false
    if (intensityTransition != other.intensityTransition) return false
    return true
  }

  /**
   * Overwrite the toString for [AmbientLightState].
   */
  override fun toString(): String {
    return "AmbientLightState(color=$color, colorTransition=$colorTransition, colorUseTheme=$colorUseTheme, intensity=$intensity, intensityTransition=$intensityTransition)"
  }

  /**
   * [AmbientLightState] Holder class to be used within [Saver].
   *
   * @param savedProperties properties to be saved.
   */
  @Parcelize
  @TypeParceler<Value, ValueParceler>
  public data class Holder(
    val savedProperties: Map<String, Value>,
  ) : Parcelable

  /**
   * Public companion object.
   */
  public companion object {
    private const val TAG = "AmbientLightState"

    /**
     * The default saver implementation for [AmbientLightState].
     */
    public val Saver: Saver<AmbientLightState, Holder> = Saver(
      save = { ambientLightState ->
        Holder(ambientLightState.getProperties()).also {
          logD(TAG, "save: $it")
        }
      },
      restore = { holder ->
        logD(TAG, "restore: $holder")
        val id: String = holder.savedProperties["id"]!!.contents as String
        @Suppress("UNCHECKED_CAST")
        val properties: Map<String, Value> = holder.savedProperties["properties"]!!.contents as HashMap<String, Value>
        AmbientLightState(
          id = id,
          initialColor = properties["color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          initialColorTransition = properties["color-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
          initialColorUseTheme = properties["color-use-theme"]?.let { StringValue(it) } ?: StringValue.INITIAL,
          initialIntensity = properties["intensity"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          initialIntensityTransition = properties["intensity-transition"]?.let { Transition(it) } ?: Transition.INITIAL,
        )
      }
    )
  }
}
// End of generated file.