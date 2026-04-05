package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzxv implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyi zza;

    public zzxv(zzxx zzxxVar, zzyi zzyiVar) {
        this.zza = zzyiVar;
        Objects.requireNonNull(zzxxVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzl();
    }
}
