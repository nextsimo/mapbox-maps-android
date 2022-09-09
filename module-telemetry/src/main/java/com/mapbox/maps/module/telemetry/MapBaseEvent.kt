package com.mapbox.maps.module.telemetry

import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import com.mapbox.bindgen.Value
import com.mapbox.common.Event

/**
 * Base event class for telemetry events.
 */
@SuppressLint("ParcelCreator")
internal abstract class MapBaseEvent(phoneState: PhoneState) :
  Event(Value.nullValue()) {
  @SerializedName("event")
  val event: String

  @SerializedName("created")
  val created: String

  init {
    event = this.getEventName()
    created = phoneState.created
  }

  abstract fun getEventName(): String
}