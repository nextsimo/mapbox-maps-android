// This file is generated.

package com.mapbox.maps.extension.compose.annotation.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.mapbox.maps.plugin.annotation.generated.OnPolylineAnnotationClickListener
import com.mapbox.maps.plugin.annotation.generated.OnPolylineAnnotationLongClickListener
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager

/**
 * The state holder for Interactions of [PolylineAnnotationGroup].
 */
@Stable
public class PolylineAnnotationGroupInteractionsState {

  private var onClickedListener: OnPolylineAnnotationClickListener? by mutableStateOf(null)

  private var onLongClickedListener: OnPolylineAnnotationLongClickListener? by mutableStateOf(null)

  /**
   * Set onClick Callback to be invoked when the [PolylineAnnotation] is clicked. The clicked [PolylineAnnotation] will be passed as parameter.
   * Returns reference to [PolylineAnnotationGroupInteractionsState] for making chained calls.
   */
  public fun onClicked(onClick: (PolylineAnnotation) -> Boolean): PolylineAnnotationGroupInteractionsState =
    apply {
      onClickedListener = OnPolylineAnnotationClickListener {
        onClick.invoke(it)
      }
    }

  /**
   * Set onLongClick Callback to be invoked when one of the [PolylineAnnotation] is long clicked. The long clicked [PolylineAnnotation] will be passed as parameter.
   * Returns reference to [PolylineAnnotationGroupInteractionsState] for making chained calls.
   */
  public fun onLongClicked(onLongClick: (PolylineAnnotation) -> Boolean): PolylineAnnotationGroupInteractionsState =
    apply {
      onLongClickedListener = OnPolylineAnnotationLongClickListener {
        onLongClick.invoke(it)
      }
    }

  @Composable
  internal fun BindTo(annotationManager: PolylineAnnotationManager) {
    with(onClickedListener) {
      DisposableEffect(key1 = this) {
        this@with?.let {
          annotationManager.addClickListener(it)
        }
        onDispose {
          this@with?.let {
            annotationManager.removeClickListener(it)
          }
        }
      }
    }
    with(onLongClickedListener) {
      DisposableEffect(key1 = this) {
        this@with?.let {
          annotationManager.addLongClickListener(it)
        }
        onDispose {
          this@with?.let {
            annotationManager.removeLongClickListener(it)
          }
        }
      }
     }
  }
}

/**
 * Create and remember a [PolylineAnnotationGroupInteractionsState] with init block.
 *
 * @param init the initialization block to be applied to the [PolylineAnnotationGroupInteractionsState] after created and remembered.
 *
 * @return a [PolylineAnnotationGroupInteractionsState]
 */
@Composable
public inline fun rememberPolylineAnnotationGroupInteractionsState(crossinline init: PolylineAnnotationGroupInteractionsState.() -> Unit = {}): PolylineAnnotationGroupInteractionsState {
  return remember {
    PolylineAnnotationGroupInteractionsState()
  }.apply(init)
}

// End of generated file