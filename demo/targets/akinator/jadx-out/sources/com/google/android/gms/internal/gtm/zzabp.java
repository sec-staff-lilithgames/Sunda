package com.google.android.gms.internal.gtm;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzabp {
    private final Object zza;
    private final int zzb;

    public zzabp(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzabp)) {
            return false;
        }
        zzabp zzabpVar = (zzabp) obj;
        return this.zza == zzabpVar.zza && this.zzb == zzabpVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
