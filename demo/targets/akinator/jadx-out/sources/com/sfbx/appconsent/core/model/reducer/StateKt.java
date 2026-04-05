package com.sfbx.appconsent.core.model.reducer;

import com.google.android.gms.ads.AdError;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StateKt {
    public static final String toJson(State state, Json json) {
        e0.checkNotNullParameter(json, "json");
        return state == null ? AdError.UNDEFINED_DOMAIN : json.encodeToString(State.Companion.serializer(), state);
    }
}
