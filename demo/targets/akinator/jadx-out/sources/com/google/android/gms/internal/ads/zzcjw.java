package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcjw implements zzifh {
    private final zzcjp zza;

    private zzcjw(zzcjp zzcjpVar) {
        this.zza = zzcjpVar;
    }

    public static zzcjw zzc(zzcjp zzcjpVar) {
        return new zzcjw(zzcjpVar);
    }

    public static WeakReference zzd(zzcjp zzcjpVar) {
        WeakReference weakReferenceZzc = zzcjpVar.zzc();
        zzifp.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
