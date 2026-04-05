package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbc implements zzbbh {
    final /* synthetic */ Activity zza;

    public zzbbc(zzbbi zzbbiVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
