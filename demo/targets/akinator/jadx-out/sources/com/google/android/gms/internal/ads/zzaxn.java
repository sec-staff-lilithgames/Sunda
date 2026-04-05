package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaxn implements zzaxr {
    final /* synthetic */ Activity zza;

    public zzaxn(zzaxs zzaxsVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzaxsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
